import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
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
import java.io.StringReader;
import java.nio.file.Files;
import java.util.Random;

/**
 * Created by suneth on 12/11/2017.
 */
public class addRecognition {

    String newRecogFile;
    String filepath ="./template/template.xml";

//    Random id = new Random();
//    public int  n = id.nextInt(50)*1000 + 1;

    int id = idSequence.getNextValueAsString();

    public addRecognition() {

    }

    public void editConnection(String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

        //add connectionPart
        String xPathConnectionPt = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprConnectionPt = xpath.compile(xPathConnectionPt);
        NodeList ConnectionValue = (NodeList) exprConnectionPt.evaluate(doc, XPathConstants.NODESET);


      //  String id = idSequence.getNextValueAsString();

        String connectionPart ="<INSTANCE id=\"obj."+(id+4)+"\" class=\"ConnectionPart\" name=\"ConnectionPart-"+(id+4)+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:14.5cm y:5cm w:3cm h:1cm index:5</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(connectionPart)))
                .getDocumentElement();
        fragmentNode = doc.importNode(fragmentNode, true);

        ConnectionValue.item(0).getParentNode().insertBefore(fragmentNode, ConnectionValue.item(0));

        //add connection
//        String xPathConnection = "/ADOXML/MODELS/MODEL/CONNECTOR";
//        XPathExpression exprConnection = xpath.compile(xPathConnection);
//        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);

        String xmlConnection ="<INSTANCE id=\"obj."+(id+20)+"\" class=\"Connection\" name=\""+context+"\"> \n" +
        "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:17cm y:12cm index:16</ATTRIBUTE> \n" +
        "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
        "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
        "</INSTANCE>";

        Node fragmentNodeConn = docBuilder.parse(new InputSource(new StringReader(xmlConnection)))
                .getDocumentElement();
        fragmentNodeConn = doc.importNode(fragmentNodeConn, true);

        ConnectionValue.item(0).getParentNode().insertBefore(fragmentNodeConn, ConnectionValue.item(0));

//        // change ATTRIBUTES
//        String xPathConnection = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Connection']/@name";
//        XPathExpression exprConnection = xpath.compile(xPathConnection);
//        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);
//        ConnectionValue.item(0).setTextContent(context);

        // change ConnectionPart-Connection
        String xPathConnPartConnID = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ConnectionPart-Connection']/FROM/@instance";
        XPathExpression exprConnPartConnID = xpath.compile(xPathConnPartConnID);
        NodeList ConnPartConnIDValue = (NodeList) exprConnPartConnID.evaluate(doc, XPathConstants.NODESET);
        ConnPartConnIDValue.item(0).setTextContent("ConnectionPart-"+(id+4));

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

    public void editAction(String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

//        // change ATTRIBUTES
//        String xPathAction = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Action']/@name";
//        XPathExpression exprAction = xpath.compile(xPathAction);
//        NodeList ActionValue = (NodeList) exprAction.evaluate(doc, XPathConstants.NODESET);
//        ActionValue.item(0).setTextContent(context);


        //add ActionPart
        String xPathActionPart = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprActionPart = xpath.compile(xPathActionPart);
        NodeList ActionPartValue = (NodeList) exprActionPart.evaluate(doc, XPathConstants.NODESET);


        String xmlActionPart ="<INSTANCE id=\"obj."+(id+1)+"\" class=\"ActionPart\" name=\"ActionPart-"+(id+1)+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:4cm y:5cm w:3cm h:1cm index:2</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(xmlActionPart)))
                .getDocumentElement();
        fragmentNode = doc.importNode(fragmentNode, true);

        ActionPartValue.item(0).getParentNode().insertBefore(fragmentNode, ActionPartValue.item(0));


        //add Action
        String xmlAction ="<INSTANCE id=\"obj."+(id+5)+"\" class=\"Action\" name=\""+context+"\"> \n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:4cm y:9.5cm w:4cm h:2.8cm index:6</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"TimeStamp\" type=\"STRING\"></ATTRIBUTE> \n" +
                "</INSTANCE>";

        Node fragmentNodeAc = docBuilder.parse(new InputSource(new StringReader(xmlAction)))
                .getDocumentElement();
        fragmentNodeAc = doc.importNode(fragmentNodeAc, true);

        ActionPartValue.item(0).getParentNode().insertBefore(fragmentNodeAc, ActionPartValue.item(0));


        // change ActionPart-Connection
        String xPathActionPartConnID = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ActionPart-Connection']/FROM/@instance";
        XPathExpression exprActionPartConnID = xpath.compile(xPathActionPartConnID);
        NodeList ActionPartConnIDValue = (NodeList) exprActionPartConnID.evaluate(doc, XPathConstants.NODESET);
        ActionPartConnIDValue.item(0).setTextContent("ActionPart-"+(id+1));

        // change ActionPart-Connection
        String xPathActionPartConn = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ActionPart-Connection']/TO/@instance";
        XPathExpression exprActionPartConn = xpath.compile(xPathActionPartConn);
        NodeList ActionPartConnValue = (NodeList) exprActionPartConn.evaluate(doc, XPathConstants.NODESET);
        ActionPartConnValue.item(0).setTextContent(context);

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

    public void editPerson(String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

//        // change ATTRIBUTES
//        String xPathPerson = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Person']/@name";
//        XPathExpression exprPerson = xpath.compile(xPathPerson);
//        NodeList PersonValue = (NodeList) exprPerson.evaluate(doc, XPathConstants.NODESET);
//        PersonValue.item(0).setTextContent(context);

        //add ActionPart
        String xPathPerson = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprPerson = xpath.compile(xPathPerson);
        NodeList PersonValue = (NodeList) exprPerson.evaluate(doc, XPathConstants.NODESET);

        //add Person
        String xmlPerson ="<INSTANCE id=\"obj."+(id+6)+"\" class=\"Person\" name=\""+context+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:11.04cm y:14.68cm w:5.4cm h:2.9cm index:7</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Age\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Location\" type=\"STRING\"></ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(xmlPerson)))
                .getDocumentElement();
        fragmentNode = doc.importNode(fragmentNode, true);

        PersonValue.item(0).getParentNode().insertBefore(fragmentNode, PersonValue.item(0));


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

        // change from
        String xPathFrom = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='from']/FROM/@instance";
        XPathExpression exprFrom = xpath.compile(xPathFrom);
        NodeList fromValue = (NodeList) exprFrom.evaluate(doc, XPathConstants.NODESET);
        fromValue.item(0).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written "+person+" to the model");
    }

    public void editObject(String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

//        // change ATTRIBUTES
//        String xPathConnection = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']/@name";
//        XPathExpression exprConnection = xpath.compile(xPathConnection);
//        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);
//        ConnectionValue.item(0).setTextContent(context);

        //add ThingPart
        String xPathThingPart = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprThingPart = xpath.compile(xPathThingPart);
        NodeList ThingPartValue = (NodeList) exprThingPart.evaluate(doc, XPathConstants.NODESET);

        String xmlThingPart ="<INSTANCE id=\"obj."+(id+2)+"\" class=\"ThingPart\" name=\"ThingPart-"+(id+2)+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:7.5cm y:5cm w:3cm h:1cm index:3</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNodeThingPart = docBuilder.parse(new InputSource(new StringReader(xmlThingPart)))
                .getDocumentElement();
        fragmentNodeThingPart = doc.importNode(fragmentNodeThingPart, true);

        ThingPartValue.item(0).getParentNode().insertBefore(fragmentNodeThingPart, ThingPartValue.item(0));

        // change ThingPart-Connection ID
        String xPathThingPartConnID = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ThingPart-Connection']/FROM/@instance";
        XPathExpression exprThingPartConnID = xpath.compile(xPathThingPartConnID);
        NodeList ThingPartConnIDValue = (NodeList) exprThingPartConnID.evaluate(doc, XPathConstants.NODESET);

        for(int i=0; i<ThingPartConnIDValue.getLength(); i++) {
            ThingPartConnIDValue.item(i).setTextContent("ThingPart-" + (id + 2));
        }

        //add Thing
        String xmlThing ="<INSTANCE id=\"obj."+(id+7)+"\" class=\"Object\" name=\""+context+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:11cm y:9.5cm w:4.4cm h:2.6cm index:8</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Location\" type=\"STRING\"></ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNodeThing = docBuilder.parse(new InputSource(new StringReader(xmlThing)))
                .getDocumentElement();
        fragmentNodeThing = doc.importNode(fragmentNodeThing, true);

        ThingPartValue.item(0).getParentNode().insertBefore(fragmentNodeThing, ThingPartValue.item(0));


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

        // change to
        String xPathTo = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='to']/TO/@instance";
        XPathExpression exprTo = xpath.compile(xPathTo);
        NodeList toValue = (NodeList) exprTo.evaluate(doc, XPathConstants.NODESET);
        toValue.item(0).setTextContent(context);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
       // System.out.println("written "+object+" to the model");
    }

    public void editSecondObject(String context) throws ParserConfigurationException, XPathExpressionException, TransformerException, IOException, SAXException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        XPath xpath = XPathFactory.newInstance().newXPath();

//        // change ATTRIBUTES
//        String xPathConnection = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Object']/@name";
//        XPathExpression exprConnection = xpath.compile(xPathConnection);
//        NodeList ConnectionValue = (NodeList) exprConnection.evaluate(doc, XPathConstants.NODESET);
//        ConnectionValue.item(1).setTextContent(context);

        //add ThingPart
        String xPathThingPart = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprThingPart = xpath.compile(xPathThingPart);
        NodeList ThingPartValue = (NodeList) exprThingPart.evaluate(doc, XPathConstants.NODESET);

        //add Thing
        String xmlThing ="<INSTANCE id=\"obj."+(id+8)+"\" class=\"Object\" name=\""+context+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:11cm y:9.5cm w:4.4cm h:2.6cm index:8</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Location\" type=\"STRING\"></ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNodeThing = docBuilder.parse(new InputSource(new StringReader(xmlThing)))
                .getDocumentElement();
        fragmentNodeThing = doc.importNode(fragmentNodeThing, true);

        ThingPartValue.item(0).getParentNode().insertBefore(fragmentNodeThing, ThingPartValue.item(0));


        // change ThingPart-Connection
        String xPathThingPartConn = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='ThingPart-Connection']/TO/@instance";
        XPathExpression exprThingPartConn = xpath.compile(xPathThingPartConn);
        NodeList ThingPartConnValue = (NodeList) exprThingPartConn.evaluate(doc, XPathConstants.NODESET);
        ThingPartConnValue.item(1).setTextContent(context);

        // change Calling
//        String xPathCalling = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Calling']/TO/@instance";
//        XPathExpression exprCalling = xpath.compile(xPathCalling);
//        NodeList CallingValue = (NodeList) exprCalling.evaluate(doc, XPathConstants.NODESET);
//        CallingValue.item(0).setTextContent(context);

        // change Participating
        String xPathParticipating = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='Participating']/FROM/@instance";
        XPathExpression exprParticipating = xpath.compile(xPathParticipating);
        NodeList ParticipatingValue = (NodeList) exprParticipating.evaluate(doc, XPathConstants.NODESET);
        ParticipatingValue.item(1).setTextContent(context);

        // change to
//        String xPathTo = "/ADOXML/MODELS/MODEL/CONNECTOR[@class='to']/TO/@instance";
//        XPathExpression exprTo = xpath.compile(xPathTo);
//        NodeList toValue = (NodeList) exprTo.evaluate(doc, XPathConstants.NODESET);
//        toValue.item(0).setTextContent(context);

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


        //add PropertyPart
        String xPathPropertyPart = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprPropertyPart = xpath.compile(xPathPropertyPart);
        NodeList PropertyPartValue = (NodeList) exprPropertyPart.evaluate(doc, XPathConstants.NODESET);

        String xmlPropertyPart ="<INSTANCE id=\"obj."+(id+3)+"\" class=\"PropertyPart\" name=\"PropertyPart-"+(id+3)+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:11cm y:5cm w:3cm h:1cm index:4</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"TimeStamp\" type=\"STRING\"></ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNodePropertyPart = docBuilder.parse(new InputSource(new StringReader(xmlPropertyPart)))
                .getDocumentElement();
        fragmentNodePropertyPart = doc.importNode(fragmentNodePropertyPart, true);

        PropertyPartValue.item(0).getParentNode().insertBefore(fragmentNodePropertyPart, PropertyPartValue.item(0));

        //add Recognition
        String xPathRecognition = "/ADOXML/MODELS/MODEL/CONNECTOR";
        XPathExpression exprRecognition = xpath.compile(xPathRecognition);
        NodeList RecognitionValue = (NodeList) exprRecognition.evaluate(doc, XPathConstants.NODESET);

        String xmlRecognition ="<INSTANCE id=\"obj."+id+"\" class=\"Recognition\" name=\""+recognition+"\">\n" +
                "<ATTRIBUTE name=\"Position\" type=\"STRING\">NODE x:9.25cm y:4.5cm w:14cm h:3cm index:1</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"External tool coupling\" type=\"STRING\"></ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"Description\" type=\"INTEGER\">0</ATTRIBUTE>\n" +
                "<ATTRIBUTE name=\"TimeStamp\" type=\"STRING\"></ATTRIBUTE>\n" +
                "</INSTANCE>";

        Node fragmentNodeRecognition = docBuilder.parse(new InputSource(new StringReader(xmlRecognition)))
                .getDocumentElement();
        fragmentNodeRecognition = doc.importNode(fragmentNodeRecognition, true);

        RecognitionValue.item(0).getParentNode().insertBefore(fragmentNodeRecognition, RecognitionValue.item(0));



        // change ATTRIBUTES
//        String xPathRecognition = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Recognition']/@name";
//        XPathExpression exprRecognition = xpath.compile(xPathRecognition);
//        NodeList recognitionValue = (NodeList) exprRecognition.evaluate(doc, XPathConstants.NODESET);
//        recognitionValue.item(0).setTextContent(recognition);

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

        dest.delete();

        String oldTemp ="./template/tempCopy.xml";
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
