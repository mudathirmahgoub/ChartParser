package edu.uiowa.chart.state;
import edu.uiowa.chart.state.antlr.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;


public class ActionsVisitor extends StateLabelBaseVisitor<HashMap<String, String>>
{
    private HashMap<String, String> actions = new HashMap<>();

    @Override
    public HashMap<String, String> visitAction(StateLabelParser.ActionContext ctx)
    {
        if(ctx.children.size() > 0)
        {
            ParseTree child = ctx.children.get(0);
            // if it is a bind action
            if(child instanceof TerminalNode &&
                (((TerminalNode) child).getSymbol().getType() == StateLabelLexer.Bind))
            {
                StringBuilder builder = new StringBuilder();
                // skip tokens 'bind' and ':' and get the list of identifiers
                for (int i = 2 ; i < ctx.getChildCount(); i++)
                {
                    builder.append(ctx.getChild(i).getText());
                }

                if (actions.containsKey("bind"))
                {
                    actions.put("bind", actions.get("bind") + "," + builder.toString());
                }
                else
                {
                    actions.put("bind", builder.toString());
                }
            }
            else // action type
            {
                for (StateLabelParser.ActionTypeContext actionType : ctx.actionType()) {
                    String key = getKey(actionType);

                    if (actions.containsKey(key))
                    {
                        actions.put(key, actions.get(key) + "\n" + ctx.actionBody().getText());
                    }
                    else
                    {
                        actions.put(key, ctx.actionBody().getText());
                    }
                }
            }
        }
        return actions;
    }


    private String getKey(StateLabelParser.ActionTypeContext ctx) {
        // add the action to the map
        if ( ctx.getChildCount() > 0 )
        {
            ParseTree child = ctx.getChild(0);

            if (child instanceof TerminalNode)
            {
                Token token = ((TerminalNode) child).getSymbol();
                switch (token.getType())
                {
                    case StateLabelLexer.Entry: return "entry";
                    case StateLabelLexer.During: return "during";
                    case StateLabelLexer.Exit: return "exit";
                    case StateLabelLexer.On:
                    {
                        StringBuilder builder = new StringBuilder();
                        builder.append("on ");
                        for (int i = 1 ; i < ctx.getChildCount(); i++)
                        {
                            builder.append(ctx.getChild(i).getText());
                        }
                        return builder.toString();
                    }
                }
            }
            else
            {
                System.out.println("Expected action type here: " + ctx.getText());
            }
        }
        return "";
    }
}
