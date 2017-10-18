import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suneth on 9/16/2017.
 */
public class MainListener extends AREMLBaseListener {
    private final String setText = "\033[31m";
    private final String setPlainText = "\033[0m";
    List<String> current = new ArrayList<String>();;

    @Override public void enterRecognition(AREMLParser.RecognitionContext ctx) {

    }

    @Override public void exitAreml(AREMLParser.AremlContext ctx) {
            String string = new String(ctx.getText());
            String string1 = string.replace('=', ':');
            current.add(string1);
    }

    @Override public void exitValue(AREMLParser.ValueContext ctx) {
    }


    @Override public void exitPair(AREMLParser.PairContext ctx) {
    }

    @Override public void enterAction(AREMLParser.ActionContext ctx) {

    }

    @Override public void enterThing(AREMLParser.ThingContext ctx) {

    }

    @Override public void enterPerson(AREMLParser.PersonContext ctx) {

    }

    @Override public void enterConnection(AREMLParser.ConnectionContext ctx) {

    }

    @Override public void enterProperty(AREMLParser.PropertyContext ctx) {

    }


}
