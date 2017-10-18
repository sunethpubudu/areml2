import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedHashMap;

/**
 * Created by suneth on 9/16/2017.
 */
public class sentToGrammar {

    public void sentToGrammar(LinkedHashMap<String, String> sentence){
        // Get our lexer
        AREMLLexer lexer = new AREMLLexer(new ANTLRInputStream(String.valueOf(sentence)));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.reset();

            // Pass the tokens to the parser
            AREMLParser parser = new AREMLParser(tokens);

            // Specify our entry point
            AREMLParser.AremlContext ActivitySentenceContext = parser.areml();

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            MainListener listener = new MainListener();
            walker.walk(listener, ActivitySentenceContext);
            System.out.println(listener.current);

    }

}
