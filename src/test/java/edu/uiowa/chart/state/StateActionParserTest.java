package edu.uiowa.chart.state;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class StateActionParserTest {

    @Test
    void parseEntry()
    {
        String stateLabel = "increasing\n" +
                "entry:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=y;y=x*2.0;",
                actions.get("entry"));
    }

    @Test
    void parseDuring()
    {
        String stateLabel = "increasing\n" +
                "during:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=y;y=x*2.0;",
                actions.get("during"));
    }

    @Test
    void parseExit()
    {
        String stateLabel = "increasing\n" +
                "exit:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=y;y=x*2.0;",
                actions.get("exit"));
    }

    @Test
    void parseEntryDuring()
    {
        String stateLabel = "increasing\n" +
                "entry, during:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=y;y=x*2.0;",
                actions.get("entry"));
        assertEquals("x=y;y=x*2.0;",
                actions.get("during"));
    }

    @Test
    void parseEntryDuringExit()
    {
        String stateLabel = "increasing\n" +
                "entry, during, exit:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=y;y=x*2.0;",
                actions.get("entry"));
        assertEquals("x=y;y=x*2.0;",
                actions.get("during"));
        assertEquals("x=y;y=x*2.0;",
                actions.get("exit"));
    }

    @Test
    void parseEntryActionDuringAction()
    {
        String stateLabel = "increasing\n" +
                "entry:\n" +
                "x = x;\n" +
                "during:\n" +
                "y = y;\n" ;


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=x;",
                actions.get("entry"));
        assertEquals("y=y;",
                actions.get("during"));
    }

    @Test
    void parseEntryExitActionExitAction()
    {
        String stateLabel = "increasing\n" +
                "entry, exit:\n" +
                "x = x;\n" +
                "exit:\n" +
                "y = y;\n" ;


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=x;",
                actions.get("entry"));
        assertEquals("x=x;\ny=y;",
                actions.get("exit"));
    }
}