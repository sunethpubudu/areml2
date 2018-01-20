import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

/**
 * Created by suneth on 1/20/2018.
 */
public interface Areml {

    public void uciDataFeed(String areml) throws ParserConfigurationException, SAXException, XPathExpressionException, TransformerException;
}
