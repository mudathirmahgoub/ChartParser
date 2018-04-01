package edu.uiowa.chart.state;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class StateParserTest {

    @Test
    void parseState()
    {
        String stateLabel = "increasing";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals(0, actions.size());
    }


    @Test
    void parseEntry()
    {
        String stateLabel = "increasing\n" +
                "entry:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("entry")[0]);
        assertEquals("y=x*2.0", actions.get("entry")[1]);
    }

    @Test
    void parseEn()
    {
        String stateLabel = "increasing\n" +
                "en:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("entry")[0]);
        assertEquals("y=x*2.0", actions.get("entry")[1]);
    }

    @Test
    void parseDuring()
    {
        String stateLabel = "increasing\n" +
                "during:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("during")[0]);
        assertEquals("y=x*2.0", actions.get("during")[1]);
    }

    @Test
    void parseDu()
    {
        String stateLabel = "increasing\n" +
                "du:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("during")[0]);
        assertEquals("y=x*2.0", actions.get("during")[1]);
    }

    @Test
    void parseExit()
    {
        String stateLabel = "increasing\n" +
                "exit:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("exit")[0]);
        assertEquals("y=x*2.0", actions.get("exit")[1]);
    }

    @Test
    void parseEx()
    {
        String stateLabel = "increasing\n" +
                "ex:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("exit")[0]);
        assertEquals("y=x*2.0", actions.get("exit")[1]);
    }

    @Test
    void parseEntryDuring()
    {
        String stateLabel = "increasing\n" +
                "entry, during:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=y", actions.get("entry")[0]);
        assertEquals("y=x*2.0", actions.get("entry")[1]);
        assertEquals("x=y", actions.get("during")[0]);
        assertEquals("y=x*2.0", actions.get("during")[1]);
    }

    @Test
    void parseEntryDuringExit()
    {
        String stateLabel = "increasing\n" +
                "entry, during, exit:\n" +
                "x = y;\n" +
                "y = x * 2.0;";

        Map<String, String []> actions = StateParser.parse(stateLabel);

        assertEquals("x=y", actions.get("entry")[0]);
        assertEquals("y=x*2.0", actions.get("entry")[1]);
        assertEquals("x=y", actions.get("during")[0]);
        assertEquals("y=x*2.0", actions.get("during")[1]);
        assertEquals("x=y", actions.get("exit")[0]);
        assertEquals("y=x*2.0", actions.get("exit")[1]);
    }

    @Test
    void parseEntryActionDuringAction()
    {
        String stateLabel = "increasing\n" +
                "entry:\n" +
                "x = x;\n" +
                "during:\n" +
                "y = y;" ;


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("entry")[0]);
        assertEquals("y=y", actions.get("during")[0]);
    }

    @Test
    void parseEntryExitActionExitAction()
    {
        String stateLabel = "increasing\n" +
                "entry, exit:\n" +
                "x = x;\n" +
                "exit:\n" +
                "y = y;" ;


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("entry")[0]);
        assertEquals("x=x", actions.get("exit")[0]);
        assertEquals("y=y", actions.get("exit")[1]);
    }

    @Test
    void parseEnExActionExAction()
    {
        String stateLabel = "increasing\n" +
                "en, ex:\n" +
                "x = x;\n" +
                "ex:\n" +
                "y = y;" ;


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("entry")[0]);
        assertEquals("x=x",  actions.get("exit")[0]);
        assertEquals("y=y",  actions.get("exit")[1]);
    }

    @Test
    void parseBind()
    {
        String stateLabel = "increasing\n" +
                "bind: event_name";


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("event_name", actions.get("bind")[0]);
    }

    @Test
    void parseOn()
    {
        String stateLabel = "increasing\n" +
                "on event_name: x = x;";


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("on event_name")[0]);
    }

    @Test
    void parseAfter()
    {
        String stateLabel = "increasing\n" +
                "on after(5, event_name): x = x;";


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("on after(5,event_name)")[0]);
    }

    @Test
    void parseBefore()
    {
        String stateLabel = "increasing\n" +
                "on before(5.0, event_name): x = x;";


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("on before(5.0,event_name)")[0]);
    }

    @Test
    void parseAt()
    {
        String stateLabel = "increasing\n" +
                "on at(5, event_name): x = x;";


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("on at(5,event_name)")[0]);
    }

    @Test
    void parseEvery()
    {
        String stateLabel = "increasing\n" +
                "on every(5, event_name): x = x;";


        Map<String, String []> actions = StateParser.parse(stateLabel);
        assertEquals("x=x", actions.get("on every(5,event_name)")[0]);
    }
}