package edu.uiowa.chart.state;

import edu.uiowa.chart.state.util.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

public class StateActionParser
{
    public static HashMap<String, String> parse(String stateLabel)
    {
        CharStream charStream = CharStreams.fromString(stateLabel);
        StateLabelLexer lexer = new StateLabelLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        StateLabelParser parser = new StateLabelParser(tokenStream);

        ParseTree tree =  parser.stateLabel();
        System.out.println(tree.toStringTree(parser));
        ActionsVisitor visitor = new ActionsVisitor();
        HashMap<String, String> actions =  visitor.visit(tree);

        return actions;
    }
}
