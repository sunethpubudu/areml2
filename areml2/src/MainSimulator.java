import org.json.JSONException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

/**
 * Created by suneth on 1/28/2018.
 */
public class MainSimulator {
    public static void main(String[] args) throws SAXException, XPathExpressionException, IOException, JSONException, ParserConfigurationException, TransformerException, InterruptedException {
        while(true) {
          //  new thingSpeak();
            new test();
            Thread.sleep(100);
        }
    }
}
