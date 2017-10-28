import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.*;

/**
 * Created by suneth on 9/11/2017.
 */
public class readInputData extends AREMLBaseListener {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException, TransformerException {

        LinkedHashMap All = new LinkedHashMap();
        String Recognition;
        LinkedHashMap PropertyPart;
        LinkedHashMap Action;
        LinkedHashMap Object;
        LinkedHashMap Person;
        LinkedHashMap Connection;
        LinkedHashMap Property;

        String file = "./template/eat_meat.xml";

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;

        builder = factory.newDocumentBuilder();
        doc = builder.parse(file);

        // Create XPathFactory object
        XPathFactory xpathFactory = XPathFactory.newInstance();

        // Create XPath object
        XPath xpath = xpathFactory.newXPath();

        Recognition = getRecognition(doc, xpath, "Recognition");
        All.put("Recognition", Recognition);

        XPathExpression propPart = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='PropertyPart']");
        String propertyPart = String.valueOf(propPart.evaluate(doc, XPathConstants.STRING));
        if(!propertyPart.isEmpty()) {
            PropertyPart = getPropertyPart(doc, xpath, "PropertyPart", "TimeStamp");
            All.put("Property Part", PropertyPart);
           // System.out.println(All);
        }else{
            System.out.println("Property part is missing.");
        }

        XPathExpression act = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Action']");
        String action = String.valueOf(act.evaluate(doc, XPathConstants.STRING));
        if(!action.isEmpty()) {
            Action = getAction(doc, xpath, "Action", "TimeStamp");
            All.put("ActionPart", Action);
        }

        XPathExpression obj = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']");
        String object = (String)obj.evaluate(doc, XPathConstants.STRING);
        if(!object.isEmpty()) {
            Object = getObject(doc, xpath, "Object", "Location");
            All.put("ThingPart", Object);
        }

        XPathExpression per = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Person']");
        String person = (String)per.evaluate(doc, XPathConstants.STRING);
        if(!person.isEmpty()) {
            Person = getPerson(doc, xpath, "Person", "Location");
            All.put("ThingPart Person", Person);
        }

        XPathExpression conn = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Connection']");
        String connection = (String)conn.evaluate(doc, XPathConstants.STRING);
        if(!connection.isEmpty()) {
            Connection = getConnection(doc, xpath, "Connection");
            All.put("ConnectionPart", Connection);
        }

//        XPathExpression prop = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Property']");
//        String property = (String)prop.evaluate(doc, XPathConstants.STRING);
//        if(!property.isEmpty()) {
//            Property = getProperty(doc, xpath, "Property", "TimeStamp", "Location", "Value");
//            All.put("Property", Property);
//        }

        System.out.println(All);
       // new sentToGrammar().sentToGrammar(All);
    }

    private static String getRecognition(Document doc, XPath xpath, String value1) {
        String recognition = null;
        try {

            XPathExpression exprInfo1 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            recognition = (String) exprInfo1.evaluate(doc, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return recognition;
    }


    private static LinkedHashMap<String, String> getPropertyPart(Document doc, XPath xpath, String value1, String value2) {
        LinkedHashMap property = new LinkedHashMap();
        try {
            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/ATTRIBUTE[@name='"+value2+"']/text()");
            String recognition = (String) exprInfo2.evaluate(doc, XPathConstants.STRING);
            property.put("TimeStamp", recognition);

            XPathExpression Get_property = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Property']");
            String getProperty = (String) Get_property.evaluate(doc, XPathConstants.STRING);

            if(getProperty!=null){
                XPathExpression status = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Property']/ATTRIBUTE[@name='Status or Unit']/text()");
                NodeList nodes1 = (NodeList) status.evaluate(doc, XPathConstants.NODESET);

                String Status = (String) status.evaluate(doc, XPathConstants.STRING);

                if(nodes1.getLength()>0){
                    LinkedHashMap<String, String> propertyValues = new LinkedHashMap<String, String>();
                    XPathExpression object = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']/@name");
                    NodeList owner = (NodeList) object.evaluate(doc, XPathConstants.NODESET);
                  //  System.out.println(owner.getLength());
                    if(owner.getLength()>0) {
                        String Object = (String) object.evaluate(doc, XPathConstants.STRING);
                        propertyValues.put("Owner", Object);
                    }

                    XPathExpression value = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Property']/ATTRIBUTE[@name='Value']/text()");
                    String Value = (String) value.evaluate(doc, XPathConstants.STRING);
                    propertyValues.put("value", Value);

                    property.put("Status " + Status, propertyValues);
                }
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return property;
    }


    private static LinkedHashMap<String, LinkedHashMap<String, String>> getAction(Document doc, XPath xpath, String value1, String value2) {
        LinkedHashMap actions = new LinkedHashMap();
        try {
            XPathExpression exprInfo1 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/ATTRIBUTE[@name='"+value2+"']/text()");

            NodeList nodes2 = (NodeList) exprInfo2.evaluate(doc, XPathConstants.NODESET);

            LinkedHashMap<String, String> action = new LinkedHashMap<String, String>();
            String n1 = (String) exprInfo1.evaluate(doc, XPathConstants.STRING);
            actions.put("Action", n1);

            if(nodes2.getLength() != 0){
                String n2 = (String) exprInfo2.evaluate(doc, XPathConstants.STRING);
                actions.put("TimeStamp", n2);
            }

            XPathExpression subConn = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='SubAction-Connection']");
            NodeList subConnNode = (NodeList) subConn.evaluate(doc, XPathConstants.NODESET);

            XPathExpression expr = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/@name");
            NodeList subConnValue = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

            XPathExpression timeStamp = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Action']/ATTRIBUTE[@name='TimeStamp']/text()");
            NodeList TimeStamp = (NodeList) timeStamp.evaluate(doc, XPathConstants.NODESET);

            if(subConnNode.getLength()!=0) {
                int i = 1;
                for(int j=0; j<subConnNode.getLength(); j++) {
                    String subAction = subConnValue.item(i).getNodeValue();
                    action.put("Action "+i, subAction);

                    String TStamp = TimeStamp.item(i).getNodeValue();
                    action.put("TimeStamp " + i, TStamp);
                    i++;
                }
                actions.put("partOf " + n1, action);

            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return actions;
    }

    private static LinkedHashMap<String, LinkedHashMap<String, String>> getObject(Document doc, XPath xpath, String value1, String value2) throws TransformerException {
        LinkedHashMap<String, LinkedHashMap<String,String>> Objects = new LinkedHashMap();
        try {
            XPathExpression expr = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/ATTRIBUTE[@name='" + value2 + "']/text()");
            XPathExpression exprInfo3 = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']");

            NodeList nodes1 = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes2 = (NodeList) exprInfo2.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes3 = (NodeList) exprInfo3.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes1.getLength(); i++) {
                LinkedHashMap<String, String> Object = new LinkedHashMap<String, String>();
                String n1 =  nodes1.item(i).getNodeValue();
                Object.put("Name", n1);

                if(nodes2.item(i) != null && nodes2.item(i).getNodeValue()!= null) {
                    String n2 = nodes2.item(i).getNodeValue();
                    Object.put("Location", n2);
                }

                if(nodes3.getLength()>0){
                    XPathExpression exprInfo4 = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']/FROM/@instance");
                    NodeList nodes4 = (NodeList) exprInfo4.evaluate(doc, XPathConstants.NODESET);
                    if(nodes4.getLength()>0) {
                        XPathExpression to = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']/TO/@instance");
                        String To = (String) to.evaluate(doc, XPathConstants.STRING);
                        Object.put("ParticipatesIn", To);
                    }
                }
                Objects.put("Thing: " + n1 + "", Object);
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return Objects;
    }

    private static LinkedHashMap getPerson(Document doc, XPath xpath, String value1, String value2) {
        LinkedHashMap recognition = new LinkedHashMap();
        try {

            XPathExpression exprInfo1 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            String expr1 = (String) exprInfo1.evaluate(doc, XPathConstants.STRING);
            recognition.put("Person", expr1);

            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/ATTRIBUTE[@name='" + value2 + "']/text()");
            String expr2 = (String) exprInfo2.evaluate(doc, XPathConstants.STRING);

            recognition.put("Location", expr2);

            XPathExpression executing = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='Executing']/TO/@instance");
            String Executing = (String) executing.evaluate(doc, XPathConstants.STRING);
            recognition.put("Executes", Executing);


        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return recognition;
    }

    private static LinkedHashMap getConnection(Document doc, XPath xpath, String value1) {
        LinkedHashMap<String, LinkedHashMap<String,String>> Objects = new LinkedHashMap();
        try {
            XPathExpression expr = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            String expr1 = (String) expr.evaluate(doc, XPathConstants.STRING);

            LinkedHashMap<String, String> Object = new LinkedHashMap<String, String>();

            XPathExpression from = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='from']/FROM/@instance");
            String From = (String) from.evaluate(doc, XPathConstants.STRING);
            Object.put("From", From);

            XPathExpression to = xpath.compile("/ADOXML/MODELS/MODEL/CONNECTOR[@class='to']/TO/@instance");
            String To = (String) to.evaluate(doc, XPathConstants.STRING);
            Object.put("To", To);

            Objects.put("Connection " + expr1 + "", Object);

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return Objects;
    }

    private static LinkedHashMap<String, LinkedHashMap<String, String>> getProperty(Document doc, XPath xpath, String value1, String value2, String value3, String value4) throws TransformerException {
        LinkedHashMap<String, LinkedHashMap<String,String>> Objects = new LinkedHashMap();
        try {
            XPathExpression expr = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/ATTRIBUTE[@name='" + value2 + "']/text()");
            XPathExpression exprInfo3 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/ATTRIBUTE[@name='" + value3 + "']/text()");
            XPathExpression exprInfo4 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/ATTRIBUTE[@name='" + value4 + "']/text()");

            NodeList nodes1 = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes2 = (NodeList) exprInfo2.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes3 = (NodeList) exprInfo3.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes4 = (NodeList) exprInfo4.evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < nodes1.getLength(); i++) {
                LinkedHashMap<String, String> Object = new LinkedHashMap<String, String>();
                String n1 =  nodes1.item(i).getNodeValue();
                Object.put("Object", n1);

                if(nodes2.item(i) != null && nodes2.item(i).getNodeValue()!= null) {
                    String n2 = nodes2.item(i).getNodeValue();
                    Object.put("TimeStamp", n2);
                }

                if(nodes3.item(i) != null && nodes3.item(i).getNodeValue()!= null) {
                    String n3 = nodes3.item(i).getNodeValue();
                    Object.put("Location", n3);
                }

                if(nodes4.item(i) != null && nodes4.item(i).getNodeValue()!= null) {
                    String n4 = nodes4.item(i).getNodeValue();
                    Object.put("Value", n4);
                }

                Objects.put("Property" + (i + 1) + "", Object);
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return Objects;
    }

}