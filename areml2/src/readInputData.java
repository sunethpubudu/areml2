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
        LinkedHashMap Recognition;
        LinkedHashMap Action;
        LinkedHashMap Object;
        LinkedHashMap Person;
        LinkedHashMap Connection;
        LinkedHashMap Property;

        String file = "5.xml";

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

        Recognition = getRecognition(doc, xpath, "Recognition", "TimeStamp");
        All.put("Recognition", Recognition);

        XPathExpression act = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Action']");
        String action = String.valueOf(act.evaluate(doc, XPathConstants.STRING));
        if(!action.isEmpty()) {
            Action = getAction(doc, xpath, "Action", "TimeStamp");
            All.put("Action-Part", Action);
        }

        XPathExpression obj = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']");
        String object = (String)obj.evaluate(doc, XPathConstants.STRING);
        if(!object.isEmpty()) {
            Object = getObject(doc, xpath, "Object", "Location");
            All.put("Thing-Part", Object);
        }

        XPathExpression per = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Person']");
        String person = (String)per.evaluate(doc, XPathConstants.STRING);
        if(!person.isEmpty()) {
            Person = getPerson(doc, xpath, "Person", "Location");
            All.put("Thing-Part(Person)", Person);
        }

        XPathExpression conn = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Connection']");
        String connection = (String)conn.evaluate(doc, XPathConstants.STRING);
        if(!connection.isEmpty()) {
            Connection = getConnection(doc, xpath, "Connection");
            All.put("Connection-Part", Connection);
        }

        XPathExpression prop = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='Property']");
        String property = (String)prop.evaluate(doc, XPathConstants.STRING);
        if(!property.isEmpty()) {
            Property = getProperty(doc, xpath, "Property", "TimeStamp", "Location", "Value");
            All.put("Property", Property);
        }

        System.out.println(All);
//        final Iterator cursor = All.values().iterator();
//        while (cursor.hasNext()) {
//            final String value = String.valueOf(cursor.next());
//            System.out.print(value);
//        }
    }


    private static LinkedHashMap getRecognition(Document doc, XPath xpath, String value1, String value2) {
        LinkedHashMap recognition = new LinkedHashMap();
        try {

            XPathExpression exprInfo1 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            String expr1 = (String) exprInfo1.evaluate(doc, XPathConstants.STRING);
            recognition.put("Name", expr1);

            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='" + value1 + "']/ATTRIBUTE[@name='" + value2 + "']/text()");
            String expr2 = (String) exprInfo2.evaluate(doc, XPathConstants.STRING);

            recognition.put("TimeStamp", expr2);

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return recognition;
    }

    private static LinkedHashMap<String, LinkedHashMap<String, String>> getAction(Document doc, XPath xpath, String value1, String value2) {
        LinkedHashMap<String, LinkedHashMap<String, String>> actions = new LinkedHashMap();
        try {
            XPathExpression exprInfo1 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            XPathExpression exprInfo2 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/ATTRIBUTE[@name='"+value2+"']/text()");

            NodeList nodes1 = (NodeList) exprInfo1.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes2 = (NodeList) exprInfo2.evaluate(doc, XPathConstants.NODESET);

            for(int i = 0; i<nodes1.getLength(); i++) {
                LinkedHashMap<String, String> action = new LinkedHashMap<String, String>();
                String n1 = nodes1.item(i).getNodeValue();
                action.put("Name", n1);

                if(nodes2.item(i) != null && nodes2.item(i).getNodeValue()!= null){
                    String n2 = nodes2.item(i).getNodeValue();
                    action.put("TimeStamp", n2);
                }
                actions.put("Action "+(i+1)+"", action);
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

            NodeList nodes1 = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes2 = (NodeList) exprInfo2.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes1.getLength(); i++) {
                LinkedHashMap<String, String> Object = new LinkedHashMap<String, String>();
                String n1 =  nodes1.item(i).getNodeValue();
                Object.put("Name", n1);

                if(nodes2.item(i) != null && nodes2.item(i).getNodeValue()!= null) {
                    String n2 = nodes2.item(i).getNodeValue();
                    Object.put("Location", n2);
                }

                Objects.put("Thing " + (i + 1) + "", Object);
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

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return recognition;
    }

    private static LinkedHashMap getConnection(Document doc, XPath xpath, String value1) {
        LinkedHashMap recognition = new LinkedHashMap();
        try {

            XPathExpression exprInfo1 = xpath.compile("/ADOXML/MODELS/MODEL/INSTANCE[@class='"+value1+"']/@name");
            String expr1 = (String) exprInfo1.evaluate(doc, XPathConstants.STRING);
            recognition.put("Connection", expr1);

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return recognition;
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

                Objects.put("Property " + (i + 1) + "", Object);
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return Objects;
    }

}