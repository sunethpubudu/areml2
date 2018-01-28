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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by suneth on 1/27/2018.
 */
public class thingSpeakModel {


public thingSpeakModel(String action, String time) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {
        final String setText = "\033[31m";
        File templateFolder = new File("./template");
        File[] actionFiles = templateFolder.listFiles();

        String filepath = null;
        for (File fil : actionFiles) {
            String fileWithExt = fil.getName();
            int lastPeriodPos = fileWithExt.lastIndexOf('.');

            String fileWithoutExt = fileWithExt.substring(0, lastPeriodPos);

            if (action.equals(fileWithoutExt)) {
                filepath = "./template/" + fileWithExt;
                // new addRecognition(sCurrentLine);
            }
        }

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.parse(filepath);
        String timeStamp = time;
        XPath xpath = XPathFactory.newInstance().newXPath();

        // change ELEMENTS
        String xPathExpression = "/ADOXML/MODELS/MODEL/INSTANCE[@class='PropertyPart']/ATTRIBUTE[@name='TimeStamp']/text()";
        NodeList nodes = (NodeList) xpath.evaluate(xPathExpression, doc, XPathConstants.NODESET);
        for (int idx = 0; idx < nodes.getLength(); idx++) {
            nodes.item(idx).setTextContent(timeStamp);
        }

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);

        System.out.print(setText);
        new readInputData().readdata(filepath);
    }
}
