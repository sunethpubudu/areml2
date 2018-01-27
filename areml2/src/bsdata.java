import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;


/**
 * Created by suneth on 10/27/2017.
 */
public class bsdata {

    //public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException, XPathExpressionException {

    public void bsdataFeed(String currentTime) throws ParserConfigurationException, IOException, SAXException, TransformerException, XPathExpressionException {
        File folder = new File("./bsdata");
        File[] listOfFiles = folder.listFiles();
        final String setText = "\033[43m";


        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String name = listOfFiles[i].getName();
                String[] output = name.split("\\-");

                String filename = output[7];
                String fileTime = output[4]+":"+output[5]+":"+output[6];

                if(currentTime.equals(fileTime)) {

                    File templateFolder = new File("./template");
                    File[] actionFiles = templateFolder.listFiles();

                    String filepath = null;
                    for (File fil : actionFiles) {
                        String fileWithExt = fil.getName();
                        int lastPeriodPos = fileWithExt.lastIndexOf('.');

                        String fileWithoutExt = fileWithExt.substring(0, lastPeriodPos);

                        if (filename.equals(fileWithoutExt)) {
                            filepath = "./template/" + fileWithExt;
                        }
                    }

                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                    org.w3c.dom.Document doc = docBuilder.parse(filepath);
                    String time = output[1] + ":" + output[2] + ":" + output[3] + ":" + output[4] + ":" + output[5] + ":" + output[6];
                    String p = output[8];
                    String[] person = p.split("\\.");

                    XPath xpath = XPathFactory.newInstance().newXPath();

                    // change ELEMENTS
                    String xPathExpression = "/ADOXML/MODELS/MODEL/INSTANCE[@class='PropertyPart']/ATTRIBUTE[@name='TimeStamp']/text()";
                    NodeList nodes = (NodeList) xpath.evaluate(xPathExpression, doc, XPathConstants.NODESET);
                    for (int idx = 0; idx < nodes.getLength(); idx++) {
                        nodes.item(idx).setTextContent(time);
                    }

                    // change ATTRIBUTES
                    String xPathExpressionAttr = "/ADOXML/MODELS/MODEL/INSTANCE[@class='Person']/@name";
                    NodeList nodesAttr = (NodeList) xpath.evaluate(xPathExpressionAttr, doc, XPathConstants.NODESET);
                    for (int j = 0; j < nodesAttr.getLength(); j++) {
                        nodesAttr.item(j).setTextContent(person[0]);
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
        }
     //   System.out.println("Everything replaced.");

    }
}
