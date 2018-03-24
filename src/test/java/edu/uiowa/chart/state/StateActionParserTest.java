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
                "prePopulation = population;\n" +
                "population = prePopulation * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("entry"));
    }

    @Test
    void parseDuring()
    {
        String stateLabel = "increasing\n" +
                "during:\n" +
                "prePopulation = population;\n" +
                "population = prePopulation * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("during"));
    }

    @Test
    void parseExit()
    {
        String stateLabel = "increasing\n" +
                "exit:\n" +
                "prePopulation = population;\n" +
                "population = prePopulation * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("exit"));
    }

    @Test
    void parseEntryDuring()
    {
        String stateLabel = "increasing\n" +
                "entry, during:\n" +
                "prePopulation = population;\n" +
                "population = prePopulation * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("entry"));
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("during"));
    }

    @Test
    void parseEntryDuringExit()
    {
        String stateLabel = "increasing\n" +
                "entry, during, exit:\n" +
                "prePopulation = population;\n" +
                "population = prePopulation * 2.0;";

        Map<String, String> actions = StateActionParser.parse(stateLabel);
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("entry"));
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
                actions.get("during"));
        assertEquals("prePopulation=population;population=prePopulation*2.0;",
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
}