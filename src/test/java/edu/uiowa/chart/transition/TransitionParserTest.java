package edu.uiowa.chart.transition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransitionParserTest {

    @Test
    void parseCondition()
    {
        String transitionLabel = "[x<0]";
        Transition transition = TransitionParser.parse(transitionLabel);
        assertEquals("x<0", transition.condition);
    }

    @Test
    void parseConditionBoolean()
    {
        String transitionLabel = "[p]";
        Transition transition = TransitionParser.parse(transitionLabel);
        assertEquals("p", transition.condition);
    }

    @Test
    void parseConditionAction()
    {
        String transitionLabel = "[x<0] {x =1;}";
        Transition transition = TransitionParser.parse(transitionLabel);
        assertEquals("x<0", transition.condition);
        assertEquals("x=1", transition.conditionActions[0]);
    }

    @Test
    void parseConditionActions()
    {
        String transitionLabel = "[x<0] {x =1; y = 2;}";
        Transition transition = TransitionParser.parse(transitionLabel);
        assertEquals("x<0", transition.condition);
        assertEquals("x=1", transition.conditionActions[0]);
        assertEquals("y=2", transition.conditionActions[1]);
    }
}