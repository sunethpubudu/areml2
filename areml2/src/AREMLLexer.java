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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, Attributes=8, 
		NUMBER=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STRING", "Attributes", 
		"ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'={'", "','", "'},'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "STRING", "Attributes", "NUMBER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fx\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b\63\n\b\f\b\16\b\66"+
		"\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n?\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\5\rJ\n\r\3\r\3\r\3\r\6\rO\n\r\r\r\16\rP\3\r\5\rT\n\r\3"+
		"\r\5\rW\n\r\3\r\3\r\3\r\3\r\5\r]\n\r\3\r\5\r`\n\r\3\16\3\16\3\16\7\16"+
		"e\n\16\f\16\16\16h\13\16\5\16j\n\16\3\17\3\17\5\17n\n\17\3\17\3\17\3\20"+
		"\6\20s\n\20\r\20\16\20t\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\2\25\2\27\2\31\13\33\2\35\2\37\f\3\2\n\4\2$$^^\n\2$$\61\61^^"+
		"ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17"+
		"\"\"\2\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\3"+
		"!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r-\3\2\2\2\17/"+
		"\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25@\3\2\2\2\27F\3\2\2\2\31_\3\2\2\2\33"+
		"i\3\2\2\2\35k\3\2\2\2\37r\3\2\2\2!\"\7}\2\2\"\4\3\2\2\2#$\7\177\2\2$\6"+
		"\3\2\2\2%&\7?\2\2&\'\7}\2\2\'\b\3\2\2\2()\7.\2\2)\n\3\2\2\2*+\7\177\2"+
		"\2+,\7.\2\2,\f\3\2\2\2-.\7<\2\2.\16\3\2\2\2/\64\7$\2\2\60\63\5\23\n\2"+
		"\61\63\n\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7$\2\28\20\3\2\2\29:\5"+
		"\17\b\2:\22\3\2\2\2;>\7^\2\2<?\t\3\2\2=?\5\25\13\2><\3\2\2\2>=\3\2\2\2"+
		"?\24\3\2\2\2@A\7w\2\2AB\5\27\f\2BC\5\27\f\2CD\5\27\f\2DE\5\27\f\2E\26"+
		"\3\2\2\2FG\t\4\2\2G\30\3\2\2\2HJ\7/\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2"+
		"KL\5\33\16\2LN\7\60\2\2MO\t\5\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2QS\3\2\2\2RT\5\35\17\2SR\3\2\2\2ST\3\2\2\2T`\3\2\2\2UW\7/\2\2VU\3"+
		"\2\2\2VW\3\2\2\2WX\3\2\2\2XY\5\33\16\2YZ\5\35\17\2Z`\3\2\2\2[]\7/\2\2"+
		"\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\33\16\2_I\3\2\2\2_V\3\2\2\2_\\\3"+
		"\2\2\2`\32\3\2\2\2aj\7\62\2\2bf\t\6\2\2ce\t\5\2\2dc\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2ib\3\2\2\2j\34\3\2\2"+
		"\2km\t\7\2\2ln\t\b\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\33\16\2p\36\3"+
		"\2\2\2qs\t\t\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b"+
		"\20\2\2w \3\2\2\2\20\2\62\64>IPSV\\_fimt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}