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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by suneth on 11/14/2017.
 */
public class uciData implements Areml {
   // public static void main(String[] args) throws ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {

    public void uciDataFeed(String currentTime) throws ParserConfigurationException, SAXException, XPathExpressionException, TransformerException{
        BufferedReader br = null;
        FileReader fr = null;
        final String setText = "\033[31m";

        try {
            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader("./UCI/OrdonezA_ADLs.txt");
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] data = sCurrentLine.split("\\s+");
                String time = data[0]+":"+data[1];
                time=time.replaceAll("-", ":");

                String filename = data[4];

                if(currentTime.equals(data[1])) {

                    File templateFolder = new File("./template");
                    File[] actionFiles = templateFolder.listFiles();

                    String filepath = null;
                    for (File fil : actionFiles) {
                        String fileWithExt = fil.getName();
                        int lastPeriodPos = fileWithExt.lastIndexOf('.');

                        String fileWithoutExt = fileWithExt.substring(0, lastPeriodPos);

                        if (filename.equals(fileWithoutExt)) {
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
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
