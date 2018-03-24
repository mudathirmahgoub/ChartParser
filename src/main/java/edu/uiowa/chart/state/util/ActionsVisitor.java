package edu.uiowa.chart.state.util;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;


public class ActionsVisitor extends StateLabelBaseVisitor<Map<String, String>>
{
    public Map<String, String> actions = new HashMap<String, String>();

    @Override
    public Map<String, String> visitAction(StateLabelParser.ActionContext ctx) {
        for (TerminalNode actionType : ctx.ActionType())
        {
            String key = actionType.getText();
            if(actions.containsKey(key))
            {
                actions.put(key, actions.get(key) + ctx.actionBody().getText());
            }
            else
            {
                actions.put(key, ctx.actionBody().getText());
            }
        }
        return actions;
    }

    @Override
    public Map<String, String> visitActionBody(StateLabelParser.ActionBodyContext ctx) {
        return actions;
    }
}
