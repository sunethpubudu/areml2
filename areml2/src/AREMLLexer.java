// Generated from AREML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AREMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		NUMBER=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "STRING", 
		"ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'={'", "'('", "')'", "'='", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "STRING", "NUMBER", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AREMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AREML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rz\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\66"+
		"\n\n\r\n\16\n\67\3\n\3\n\5\n<\n\n\3\13\3\13\3\13\5\13A\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\5\16L\n\16\3\16\3\16\3\16\6\16Q\n\16\r\16"+
		"\16\16R\3\16\5\16V\n\16\3\16\5\16Y\n\16\3\16\3\16\3\16\3\16\5\16_\n\16"+
		"\3\16\5\16b\n\16\3\17\3\17\3\17\7\17g\n\17\f\17\16\17j\13\17\5\17l\n\17"+
		"\3\20\3\20\5\20p\n\20\3\20\3\20\3\21\6\21u\n\21\r\21\16\21v\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\f\35"+
		"\2\37\2!\r\3\2\n\4\2C\\c|\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;"+
		"\3\2\63;\4\2GGgg\4\2--//\5\2\f\f\17\17\"\"\2\u0082\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7"+
		"\'\3\2\2\2\t)\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\62\3\2\2"+
		"\2\23;\3\2\2\2\25=\3\2\2\2\27B\3\2\2\2\31H\3\2\2\2\33a\3\2\2\2\35k\3\2"+
		"\2\2\37m\3\2\2\2!t\3\2\2\2#$\7}\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\'("+
		"\7\177\2\2(\b\3\2\2\2)*\7?\2\2*+\7}\2\2+\n\3\2\2\2,-\7*\2\2-\f\3\2\2\2"+
		"./\7+\2\2/\16\3\2\2\2\60\61\7?\2\2\61\20\3\2\2\2\62\63\7<\2\2\63\22\3"+
		"\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28<\3\2\2\29:\7^\2\2:<\t\3\2\2;\65\3\2\2\2;9\3\2\2\2<\24\3\2\2\2=@"+
		"\7^\2\2>A\t\3\2\2?A\5\27\f\2@>\3\2\2\2@?\3\2\2\2A\26\3\2\2\2BC\7w\2\2"+
		"CD\5\31\r\2DE\5\31\r\2EF\5\31\r\2FG\5\31\r\2G\30\3\2\2\2HI\t\4\2\2I\32"+
		"\3\2\2\2JL\7/\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\35\17\2NP\7\60\2\2"+
		"OQ\t\5\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\37\20"+
		"\2UT\3\2\2\2UV\3\2\2\2Vb\3\2\2\2WY\7/\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2"+
		"\2Z[\5\35\17\2[\\\5\37\20\2\\b\3\2\2\2]_\7/\2\2^]\3\2\2\2^_\3\2\2\2_`"+
		"\3\2\2\2`b\5\35\17\2aK\3\2\2\2aX\3\2\2\2a^\3\2\2\2b\34\3\2\2\2cl\7\62"+
		"\2\2dh\t\6\2\2eg\t\5\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2kc\3\2\2\2kd\3\2\2\2l\36\3\2\2\2mo\t\7\2\2np\t\b\2\2on\3"+
		"\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\35\17\2r \3\2\2\2su\t\t\2\2ts\3\2\2\2u"+
		"v\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\21\2\2y\"\3\2\2\2\20\2\67"+
		";@KRUX^ahkov\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}