package edu.uiowa.chart.transition;

import java.util.ArrayList;
import java.util.List;

public class Transition
{
    public String eventOrMessage = "";
    public String condition = "";
    public List<String> conditionActions = new ArrayList<>();
    public List<String> transitionActions = new ArrayList<>();
}
