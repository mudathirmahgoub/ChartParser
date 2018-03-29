package edu.uiowa.chart.state;

import edu.uiowa.chart.state.antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StateParser
{
    public static HashMap<String, String[]> parse(String stateLabel)
    {
        CharStream charStream = CharStreams.fromString(stateLabel);
        StateLabelLexer lexer = new StateLabelLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        StateLabelParser parser = new StateLabelParser(tokenStream);

        ParseTree tree =  parser.stateLabel();
        StateVisitor visitor = new StateVisitor();
        HashMap<String, List<String>> map =  visitor.visit(tree);

        HashMap<String, String[]> actions = new HashMap<>();
        // convert List<String> to arrays
        for (HashMap.Entry<String, List<String>> entry : map.entrySet())
        {
            List<String> list = entry.getValue();
            list.removeAll(Arrays.asList(""));
            actions.put(entry.getKey(), entry.getValue().toArray(new String[0]));
        }
        return actions;
    }
}
