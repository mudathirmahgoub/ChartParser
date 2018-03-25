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
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("entry"));
    }

    @Test
    void parseEn()
    {
        String stateLabel = "increasing\n" +
                "en:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("\nx=y;\ny=x*2.0;",
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
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("during"));
    }

    @Test
    void parseDu()
    {
        String stateLabel = "increasing\n" +
                "du:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("\nx=y;\ny=x*2.0;",
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
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("exit"));
    }

    @Test
    void parseEx()
    {
        String stateLabel = "increasing\n" +
                "ex:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("\nx=y;\ny=x*2.0;",
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
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("entry"));
        assertEquals("\nx=y;\ny=x*2.0;",
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
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("entry"));
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("during"));
        assertEquals("\nx=y;\ny=x*2.0;",
                actions.get("exit"));
    }

    @Test
    void parseEntryActionDuringAction()
    {
        String stateLabel = "increasing\n" +
                "entry:\n" +
                "x = x;\n" +
                "during:\n" +
                "y = y;" ;


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("\nx=x;\n",
                actions.get("entry"));
        assertEquals("\ny=y;",
                actions.get("during"));
    }

    @Test
    void parseEntryExitActionExitAction()
    {
        String stateLabel = "increasing\n" +
                "entry, exit:\n" +
                "x = x;\n" +
                "exit:\n" +
                "y = y;" ;


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("\nx=x;\n",
                actions.get("entry"));
        assertEquals("\nx=x;\n\n\ny=y;",
                actions.get("exit"));
    }

    @Test
    void parseEnExActionExAction()
    {
        String stateLabel = "increasing\n" +
                "en, ex:\n" +
                "x = x;\n" +
                "ex:\n" +
                "y = y;" ;


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("\nx=x;\n",
                actions.get("entry"));
        assertEquals("\nx=x;\n\n\ny=y;",
                actions.get("exit"));
    }

    @Test
    void parseBind()
    {
        String stateLabel = "increasing\n" +
                "bind: event_name";


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("event_name",
                actions.get("bind"));
    }

    @Test
    void parseOn()
    {
        String stateLabel = "increasing\n" +
                "on event_name: x = x;";


        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("x=x;",
                actions.get("on event_name"));
    }
}