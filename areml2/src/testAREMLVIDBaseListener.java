import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

/**
 * Created by suneth on 12/9/2017.
 */
public class testAREMLVIDBaseListener extends AREMLVIDBaseListener  {

    private final String setText = "\033[31m";
    private final String setPlainText = "\033[0m";

    @Override
    public void enterPerson(AREMLVIDParser.PersonContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException
    {
        System.out.print(setText + "<Person>" + setPlainText + ctx.getText() + " ");
        if(ctx.getText()!=null) {
            new addRecognition().editPerson(ctx.getText());
        }
    }

    @Override
    public void enterAction(AREMLVIDParser.ActionContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException
    {
        System.out.print(setText + "<Action>"+setPlainText + ctx.getText() + " ");
        if(ctx.getText()!=null) {
            new addRecognition().editAction(ctx.getText());
        }
    }

    @Override public void enterObject(AREMLVIDParser.ObjectContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException
    {
        System.out.print(setText + "<Object>" +setPlainText+ ctx.getText() + " ");
        if(ctx.getText()!=null) {
            new addRecognition().editObject(ctx.getText());
        }
    }

    @Override public void enterSecondobject(AREMLVIDParser.SecondobjectContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {
        System.out.print(setText + "<SecondObject>" +setPlainText+ ctx.getText() + " ");
        if(ctx.getText()!=null) {
            new addRecognition().editSecondObject(ctx.getText());
        }
    }

    @Override
    public void enterConnectionType(AREMLVIDParser.ConnectionTypeContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {
        System.out.print(setText+"<Connection type>"+setPlainText + ctx.getText() + " ");
        if(ctx.getText()!=null) {
            new addRecognition().editConnection(ctx.getText());
        }
    }

    @Override public void enterPersonProperty(AREMLVIDParser.PersonPropertyContext ctx) throws ParserConfigurationException, SAXException, XPathExpressionException, IOException, TransformerException {
        System.out.println(setText + "<propertyObject>" + setPlainText + ctx.getText());
        if(ctx.getText() != null){
            new addRecognition().editProperty(ctx.getText());
        }
    }
}
