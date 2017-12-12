import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by suneth on 12/11/2017.
 */
public class addRecognition {

    String newRecogFile;
    String filepath ="./template/template.xml";

    public addRecognition() {

    }

    public void editConnection(String connectionType, String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ATTRIBUTES
        String xPathConnection = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Connection']/@name";
        XPathExpression exprConnection = xpath.compile(xPathConnection);
        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);
        ConnectionValue.item(0).setTextContent(context);

        // change ConnectionPart-Connection
        String xPathConnectionPart = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ConnectionPart-Connection']/TO/@instance";
        XPathExpression exprConnectionPart = xpath.compile(xPathConnectionPart);
        NodeList ConnectionPartValue = (NodeList) exprConnectionPart.evaluate(doc, XPathConstants.NODESET);
        ConnectionPartValue.item(0).setTextContent(context);

        // change from
        String xPathObjConnection = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='from']/TO/@instance";
        XPathExpression exprObjConnection = xpath.compile(xPathObjConnection);
        NodeList ObjConnectionValue = (NodeList) exprObjConnection.evaluate(doc, XPathConstants.NODESET);
        ObjConnectionValue.item(0).setTextContent(context);

        // change to
        String xPathTo = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='to']/FROM/@instance";
        XPathExpression exprTo = xpath.compile(xPathTo);
        NodeList ObjTo = (NodeList) exprTo.evaluate(doc, XPathConstants.NODESET);
        ObjTo.item(0).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written "+connectionType+" to the model");
    }

    public void editAction(String actionType, String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ATTRIBUTES
        String xPathAction = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Action']/@name";
        XPathExpression exprAction = xpath.compile(xPathAction);
        NodeList ActionValue = (NodeList) exprAction.evaluate(doc, XPathConstants.NODESET);
        ActionValue.item(0).setTextContent(context);

        // change ActionPart-Connection
        String xPathActionPart = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ActionPart-Connection']/TO/@instance";
        XPathExpression exprActionPart = xpath.compile(xPathActionPart);
        NodeList ActionPartValue = (NodeList) exprActionPart.evaluate(doc, XPathConstants.NODESET);
        ActionPartValue.item(0).setTextContent(context);

        // change Executing
        String xPathExecuting = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Executing']/TO/@instance";
        XPathExpression exprExecuting = xpath.compile(xPathExecuting);
        NodeList ExecutingValue = (NodeList) exprExecuting.evaluate(doc, XPathConstants.NODESET);
        ExecutingValue.item(0).setTextContent(context);

        // change Participating
        String xPathParticipating = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']/TO/@instance";
        XPathExpression exprParticipating = xpath.compile(xPathParticipating);
        NodeList ParticipatingValue = (NodeList) exprParticipating.evaluate(doc, XPathConstants.NODESET);
        ParticipatingValue.item(0).setTextContent(context);
        ParticipatingValue.item(1).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written "+actionType+" to the model");
    }

    public void editPerson(String person, String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ATTRIBUTES
        String xPathPerson = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Person']/@name";
        XPathExpression exprPerson = xpath.compile(xPathPerson);
        NodeList PersonValue = (NodeList) exprPerson.evaluate(doc, XPathConstants.NODESET);
        PersonValue.item(0).setTextContent(context);

        // change ThingPart-Connection
        String xPathThingPartConn = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ThingPart-Connection']/TO[@class='Person']/@instance";
        XPathExpression exprThingPartConn = xpath.compile(xPathThingPartConn);
        NodeList ThingPartConnValue = (NodeList) exprThingPartConn.evaluate(doc, XPathConstants.NODESET);
        ThingPartConnValue.item(0).setTextContent(context);

        // change Executing
        String xPathExecuting = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Executing']/FROM[@class='Person']/@instance";
        XPathExpression exprExecuting = xpath.compile(xPathExecuting);
        NodeList ExecutingValue = (NodeList) exprExecuting.evaluate(doc, XPathConstants.NODESET);
        ExecutingValue.item(0).setTextContent(context);

//        // change Calling
        String xPathCalling = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Calling']/FROM[@class='Person']/@instance";
        XPathExpression exprCalling = xpath.compile(xPathCalling);
        NodeList CallingValue = (NodeList) exprCalling.evaluate(doc, XPathConstants.NODESET);
        CallingValue.item(0).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written "+person+" to the model");
    }

    public void editObject(String object, String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ATTRIBUTES
        String xPathConnection = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']/@name";
        XPathExpression exprConnection = xpath.compile(xPathConnection);
        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);
        ConnectionValue.item(0).setTextContent(context);

        // change ThingPart-Connection
        String xPathThingPartConn = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ThingPart-Connection']/TO/@instance";
        XPathExpression exprThingPartConn = xpath.compile(xPathThingPartConn);
        NodeList ThingPartConnValue = (NodeList) exprThingPartConn.evaluate(doc, XPathConstants.NODESET);
        ThingPartConnValue.item(0).setTextContent(context);

        // change Participating
        String xPathExecuting = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']/FROM/@instance";
        XPathExpression exprExecuting = xpath.compile(xPathExecuting);
        NodeList ExecutingValue = (NodeList) exprExecuting.evaluate(doc, XPathConstants.NODESET);
        ExecutingValue.item(0).setTextContent(context);

        // change Calling
        String xPathCalling = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Calling']/TO/@instance";
        XPathExpression exprCalling = xpath.compile(xPathCalling);
        NodeList CallingValue = (NodeList) exprCalling.evaluate(doc, XPathConstants.NODESET);
        CallingValue.item(0).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written "+object+" to the model");
    }

    public void editSecondObject(String object, String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ATTRIBUTES
        String xPathConnection = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']/@name";
        XPathExpression exprConnection = xpath.compile(xPathConnection);
        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);
        ConnectionValue.item(1).setTextContent(context);

        // change ThingPart-Connection
        String xPathThingPartConn = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ThingPart-Connection']/TO/@instance";
        XPathExpression exprThingPartConn = xpath.compile(xPathThingPartConn);
        NodeList ThingPartConnValue = (NodeList) exprThingPartConn.evaluate(doc, XPathConstants.NODESET);
        ThingPartConnValue.item(1).setTextContent(context);

        // change Calling
        String xPathCalling = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Calling']/TO/@instance";
        XPathExpression exprCalling = xpath.compile(xPathCalling);
        NodeList CallingValue = (NodeList) exprCalling.evaluate(doc, XPathConstants.NODESET);
        CallingValue.item(0).setTextContent(context);

        // change Participating
        String xPathParticipating = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']/FROM/@instance";
        XPathExpression exprParticipating = xpath.compile(xPathParticipating);
        NodeList ParticipatingValue = (NodeList) exprParticipating.evaluate(doc, XPathConstants.NODESET);
        ParticipatingValue.item(0).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
      //  System.out.println("written "+object+" to the model");
    }


    public addRecognition(String recognition) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {
        filepath ="./template/template.xml";

        this.newRecogFile = recognition.replaceAll("\\s+", "_");

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ATTRIBUTES
        String xPathRecognition = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Recognition']/@name";
        XPathExpression exprRecognition = xpath.compile(xPathRecognition);
        NodeList recognitionValue = (NodeList) exprRecognition.evaluate(doc, XPathConstants.NODESET);
        recognitionValue.item(0).setTextContent(recognition);

        // write the content into xml file
     //   TransformerFactory transformerFactory = TransformerFactory.newInstance();
     //   Transformer transformer = transformerFactory.newTransformer();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "adoxml31.dtd");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written recognition to the model");

        File dest = new File(filepath);
        File newdest = new File("./template/"+newRecogFile+".xml");
        copyFile(dest, newdest);
        System.out.println("copied");

        String oldTemp ="./template/template1.xml";
        File oldTemplate = new File(oldTemp);
        File newTemp = new File("./template/template.xml");
        copyFile(oldTemplate, newTemp);
        System.out.println("new template set.");

    }

    private static void copyFile(File dest, File newdest) throws IOException {
        if(!newdest.exists()) {
            Files.copy(dest.toPath(), newdest.toPath());
        }
    }
}
