package edu.uiowa.chart.state.util;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ActionsVisitor extends StateLabelBaseVisitor<HashMap<String, String>>
{
    private HashMap<String, String> actions = new HashMap<>();

    @Override
    public HashMap<String, String> visitAction(StateLabelParser.ActionContext ctx) {

        // visit bind actions

        List<TerminalNode> identifiers = ctx.Identifier();
        if(identifiers.size() > 0 )
        {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < identifiers.size() -1; i ++)
            {
                builder.append(identifiers.get(i).getText() + ",");
            }
            builder.append(identifiers.get(identifiers.size() - 1));
            actions.put("bind", builder.toString());
        }

        for (StateLabelParser.ActionTypeContext actionType : ctx.actionType())
        {
            String key = actionType.getText();

            // we need the space for 'on' actions
            if(key.startsWith("on"))
            {
                key = "on " +  key.substring(2,key.length() );
            }
            // handle the cases of abbreviated actions
            if(key.equals("en"))
            {
                key = "entry";
            }

            if(key.equals("du"))
            {
                key = "during";
            }

            if(key.equals("ex"))
            {
                key = "exit";
            }

            if(actions.containsKey(key))
            {
                actions.put(key, actions.get(key) + "\n" + ctx.actionBody().getText());
            }
            else
            {
                actions.put(key, ctx.actionBody().getText());
            }
        }
        return actions;
    }
}
