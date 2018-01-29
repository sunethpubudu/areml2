import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.*;

/**
 * Created by suneth on 12/9/2017.
 */
public class test {
    public static void main(String[] args) throws IOException, InterruptedException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {

    //   public test() throws IOException, InterruptedException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {
        String videoRead=null;
        String readOutside=null;
        BufferedReader br = null;
        FileReader fr = null;

        while(true) {
            try {
                fr = new FileReader("D:\\shared\\vis.json");
                br = new BufferedReader(fr);
                readOutside = br.readLine();
                if(readOutside!=null) {
                    String readSentence = readOutside.replaceAll("\"", "");
                    String noSpaceReadOutside = readSentence.replaceAll("\\s+", "_");

                    String inside = new test().readTempdata();
                    String noSpaceReadInside = inside.replaceAll("\\s+", "_");

                    if (!(noSpaceReadOutside.equals(noSpaceReadInside))) {
                        new test().testPerson(readSentence);
                        System.out.println();
                        new addRecognition(readSentence);
                        FileWriter fw = new FileWriter("workDir/temp.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(readSentence);
                        bw.close();
                        //System.out.println("done");
                    }
                }
            } catch (FileNotFoundException e) {
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
            } Thread.sleep(1000);
        }
    }

    private String readTempdata() throws InterruptedException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("workDir/temp.txt"));
        String readSentence = in.readLine();
        return readSentence;
    }

    private void testPerson(String recognition) throws ParserConfigurationException, TransformerException, SAXException, XPathExpressionException, IOException {

        // Get our lexer
        AREMLVIDLexer lexer = new AREMLVIDLexer(new ANTLRInputStream(recognition));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        AREMLVIDParser parser = new AREMLVIDParser(tokens);

        // Specify our entry point
        AREMLVIDParser.AremlvidContext ActivitySentenceContext = parser.aremlvid();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        testAREMLVIDBaseListener listener = new testAREMLVIDBaseListener();
        walker.walk(listener, ActivitySentenceContext);
    }
}
