import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.*;

/**
 * Created by suneth on 12/5/2017.
 */
public class videoData {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, XPathExpressionException, TransformerException, IOException, InterruptedException {

        BufferedReader br = null,holdBr = null;
        FileReader fr = null,holdFr = null;

        while(true) {
            try {
                fr = new FileReader("D:\\shared\\vis.json");
                br = new BufferedReader(fr);

                String sCurrentLine;
//                while ((sCurrentLine = br.readLine())!= null) {
//                    String[] myStrings = sCurrentLine.split("\"");
//                    String noSpace1 = myStrings[0].replaceAll("\\s+", "");
//                    holdFr = new FileReader("workDir/temp.txt");
//                    holdBr = new BufferedReader(holdFr);
//                    String currentLine;
//                    currentLine = holdBr.readLine();
//                    System.out.println(myStrings);
//                    String noSpace2 = currentLine.replaceAll("\\s+", "");
//                    if (!(noSpace2.equals(noSpace1))) {
//                        System.out.println(myStrings[0]);
//                        FileWriter fw = new FileWriter("workDir/temp.txt");
//                        BufferedWriter bw = new BufferedWriter(fw);
//                        bw.write(myStrings[0]);
//                        bw.close();
//                      //  System.out.println("done");
//                    }
//                }
                while ((sCurrentLine = br.readLine())!= null) {
                    String myStrings = sCurrentLine.replaceAll("\"", "");
                    String noSpace1 = myStrings.replaceAll("\\s+", "");
                    holdFr = new FileReader("workDir/temp.txt");
                    holdBr = new BufferedReader(holdFr);
                    String currentLine;
                    currentLine = holdBr.readLine();
                    //System.out.println(myStrings);
                    String noSpace2 = currentLine;
                 //   System.out.println(noSpace2);
                    if (!(noSpace2.equals(noSpace1))) {
                      //  System.out.println(myStrings);
                        FileWriter fw = new FileWriter("workDir/temp.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(myStrings);
                        bw.close();
                          System.out.println("done");
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
                    if (holdBr != null)
                        br.close();
                    if (holdFr != null)
                        fr.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Thread.sleep(400);
            }
        }
    }
}
