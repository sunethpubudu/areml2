/**
 * Created by suneth on 12/9/2017.
 */
public class testAREMLVIDBaseListener extends AREMLVIDBaseListener  {

    private final String setText = "\033[31m";
    private final String setPlainText = "\033[0m";
    @Override
    public void enterConnectionType(AREMLVIDParser.ConnectionTypeContext ctx) {
        System.out.print(setText+"<Connection type>"+setPlainText + ctx.getText() + " ");
    }

    @Override
    public void enterPerson(AREMLVIDParser.PersonContext ctx) {
        System.out.print(setText + "<Person>"+setPlainText+ctx.getText()+" ");
    }

    @Override
    public void enterAction(AREMLVIDParser.ActionContext ctx) {
        System.out.print(setText + "<Action>"+setPlainText + ctx.getText() + " ");
    }

    @Override public void enterObject(AREMLVIDParser.ObjectContext ctx) {
        System.out.print(setText + "<Object>" +setPlainText+ ctx.getText() + " ");
    }

}
