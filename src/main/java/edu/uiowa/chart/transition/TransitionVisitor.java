package edu.uiowa.chart.transition;
import edu.uiowa.chart.transition.antlr.TransitionLabelBaseVisitor;
import edu.uiowa.chart.transition.antlr.TransitionLabelParser;
import java.util.Arrays;
import java.util.List;


public class TransitionVisitor extends TransitionLabelBaseVisitor<Transition>
{
    Transition transition = new Transition();

    @Override
    public Transition visitTransitionLabel(TransitionLabelParser.TransitionLabelContext ctx)
    {
        super.visitTransitionLabel(ctx);
        return this.transition;
    }

    @Override
    public Transition visitEventOrMessage(TransitionLabelParser.EventOrMessageContext ctx)
    {
        this.transition.eventOrMessage = ctx.getText();
        return this.transition;
    }

    @Override
    public Transition visitCondition(TransitionLabelParser.ConditionContext ctx) {
        this.transition.condition = ctx.getText();
        return this.transition;
    }

    @Override
    public Transition visitConditionAction(TransitionLabelParser.ConditionActionContext ctx) {
        List<String> actions = Arrays.asList(ctx.getText().split("(;|\n)"));
        this.transition.conditionActions.addAll(actions);
        return this.transition;
    }

    @Override
    public Transition visitTransitionAction(TransitionLabelParser.TransitionActionContext ctx) {
        List<String> actions = Arrays.asList(ctx.getText().split("(;|\n)"));
        this.transition.conditionActions.addAll(actions);
        return this.transition;
    }
}
