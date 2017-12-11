import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
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

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
        System.out.println("written "+connectionType+" to the model");
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
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(String.valueOf(filepath)));
        transformer.transform(source, result);
        System.out.println("written recognition to the model");

        File dest = new File(filepath);
        File newdest = new File("./template/"+newRecogFile+".xml");
        copyFile(dest, newdest);
        System.out.println("copied");
    }

    private static void copyFile(File dest, File newdest) throws IOException {
        if(!newdest.exists()) {
            Files.copy(dest.toPath(), newdest.toPath());
        }
    }
}
