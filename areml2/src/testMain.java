import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

/**
 * Created by suneth on 1/20/2018.
 */
public class testMain {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {
       //

        int hrs;
        int min;
        int sec;

        for(hrs=0; hrs<24; hrs++){
            for(min=0; min<60; min++){
                for(sec=0; sec<60; sec++){
                    String hr;
                    String mn;
                    String se;

                    hr = (hrs <10) ?  "0"+hrs : String.valueOf(hrs);
                    mn = (min <10) ?  "0"+min : String.valueOf(min);
                    se = (sec <10) ?  "0"+sec : String.valueOf(sec);

                    String time = (hr + ":" + mn + ":" + se);
                    new uciData().uciDataFeed(time);
                }
            }
        }
    }
}
