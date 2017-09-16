// Generated from AREML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AREMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, Attributes=8, 
		NUMBER=9, WS=10;
	public static final int
		RULE_areml = 0, RULE_recognition = 1, RULE_action = 2, RULE_thing = 3, 
		RULE_person = 4, RULE_connection = 5, RULE_property = 6, RULE_pair = 7, 
		RULE_value = 8;
	public static final String[] ruleNames = {
		"areml", "recognition", "action", "thing", "person", "connection", "property", 
		"pair", "value"
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

	@Override
	public String getGrammarFileName() { return "AREML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AREMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AremlContext extends ParserRuleContext {
		public RecognitionContext recognition() {
			return getRuleContext(RecognitionContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ThingContext thing() {
			return getRuleContext(ThingContext.class,0);
		}
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public ConnectionContext connection() {
			return getRuleContext(ConnectionContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public AremlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_areml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterAreml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitAreml(this);
		}
	}

	public final AremlContext areml() throws RecognitionException {
		AremlContext _localctx = new AremlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_areml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			recognition();
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(20);
				action();
				}
				break;
			}
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(23);
				thing();
				}
				break;
			}
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(26);
				person();
				}
				break;
			}
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(29);
				connection();
				}
				break;
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(32);
				property();
				}
			}

			setState(35);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecognitionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public RecognitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recognition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterRecognition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitRecognition(this);
		}
	}

	public final RecognitionContext recognition() throws RecognitionException {
		RecognitionContext _localctx = new RecognitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_recognition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(STRING);
			setState(38);
			match(T__2);
			setState(39);
			pair();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(40);
				match(T__3);
				setState(41);
				pair();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__1);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(48);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(AREMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AREMLParser.STRING, i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(STRING);
			setState(52);
			match(T__2);
			setState(53);
			match(STRING);
			setState(54);
			match(T__2);
			setState(55);
			pair();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(56);
				match(T__3);
				setState(57);
				pair();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__4);
			setState(64);
			match(STRING);
			setState(65);
			match(T__2);
			setState(66);
			pair();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(67);
				match(T__3);
				setState(68);
				pair();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(74);
				match(T__1);
				}
				break;
			}
			setState(77);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(78);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThingContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(AREMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AREMLParser.STRING, i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ThingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitThing(this);
		}
	}

	public final ThingContext thing() throws RecognitionException {
		ThingContext _localctx = new ThingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_thing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(STRING);
			setState(82);
			match(T__2);
			setState(83);
			match(STRING);
			setState(84);
			match(T__2);
			setState(85);
			pair();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(86);
				match(T__3);
				setState(87);
				pair();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__4);
			setState(94);
			match(STRING);
			setState(95);
			match(T__2);
			setState(96);
			pair();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(97);
				match(T__3);
				setState(98);
				pair();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(104);
				match(T__1);
				}
				break;
			}
			setState(107);
			match(T__1);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(108);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_person);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(STRING);
			setState(112);
			match(T__2);
			setState(113);
			pair();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(114);
				match(T__3);
				setState(115);
				pair();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__1);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(122);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitConnection(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(STRING);
			setState(126);
			match(T__2);
			setState(127);
			pair();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(128);
				match(T__3);
				setState(129);
				pair();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__1);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(136);
				match(T__3);
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(139);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(STRING);
			setState(143);
			match(T__2);
			setState(144);
			pair();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(145);
				match(T__3);
				setState(146);
				pair();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__1);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(153);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(STRING);
			setState(157);
			match(T__5);
			setState(158);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AREMLParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\5\2\30\n\2\3\2\5\2\33\n\2\3\2\5\2\36\n\2\3\2\5\2!\n\2\3\2\5\2$\n"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\5\3\64"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\5\4N\n\4\3\4\3\4\5\4R\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5f\n\5\f\5\16\5i\13\5\3\5\5\5l\n\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0085\n\7\f\7\16\7\u0088\13\7\3\7\3\7\5\7\u008c\n\7\3\7\5\7\u008f\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0096\n\b\f\b\16\b\u0099\13\b\3\b\3\b\5\b\u009d"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\t"+
		"\t\13\13\2\u00b1\2\24\3\2\2\2\4\'\3\2\2\2\6\65\3\2\2\2\bS\3\2\2\2\nq\3"+
		"\2\2\2\f\177\3\2\2\2\16\u0090\3\2\2\2\20\u009e\3\2\2\2\22\u00a2\3\2\2"+
		"\2\24\25\7\3\2\2\25\27\5\4\3\2\26\30\5\6\4\2\27\26\3\2\2\2\27\30\3\2\2"+
		"\2\30\32\3\2\2\2\31\33\5\b\5\2\32\31\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2"+
		"\2\34\36\5\n\6\2\35\34\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37!\5\f\7\2 "+
		"\37\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"$\5\16\b\2#\"\3\2\2\2#$\3\2\2\2$%\3\2"+
		"\2\2%&\7\4\2\2&\3\3\2\2\2\'(\7\t\2\2()\7\5\2\2).\5\20\t\2*+\7\6\2\2+-"+
		"\5\20\t\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3"+
		"\2\2\2\61\63\7\4\2\2\62\64\7\6\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\5\3"+
		"\2\2\2\65\66\7\t\2\2\66\67\7\5\2\2\678\7\t\2\289\7\5\2\29>\5\20\t\2:;"+
		"\7\6\2\2;=\5\20\t\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2"+
		"@>\3\2\2\2AB\7\7\2\2BC\7\t\2\2CD\7\5\2\2DI\5\20\t\2EF\7\6\2\2FH\5\20\t"+
		"\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\7\4\2"+
		"\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\4\2\2PR\7\6\2\2QP\3\2\2\2QR\3\2\2"+
		"\2R\7\3\2\2\2ST\7\t\2\2TU\7\5\2\2UV\7\t\2\2VW\7\5\2\2W\\\5\20\t\2XY\7"+
		"\6\2\2Y[\5\20\t\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2"+
		"^\\\3\2\2\2_`\7\7\2\2`a\7\t\2\2ab\7\5\2\2bg\5\20\t\2cd\7\6\2\2df\5\20"+
		"\t\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\7\4"+
		"\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7\4\2\2np\7\6\2\2on\3\2\2\2op\3\2"+
		"\2\2p\t\3\2\2\2qr\7\t\2\2rs\7\5\2\2sx\5\20\t\2tu\7\6\2\2uw\5\20\t\2vt"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\4\2\2|"+
		"~\7\6\2\2}|\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0086\5\20\t\2\u0082\u0083\7\6\2\2\u0083\u0085\5\20\t\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7\4\2\2\u008a"+
		"\u008c\7\6\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008f\7\6\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\r\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0092\7\5\2\2\u0092\u0097\5\20\t"+
		"\2\u0093\u0094\7\6\2\2\u0094\u0096\5\20\t\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7\4\2\2\u009b\u009d\7\6\2\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u009f\7\t\2"+
		"\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\5\22\n\2\u00a1\21\3\2\2\2\u00a2\u00a3"+
		"\t\2\2\2\u00a3\23\3\2\2\2\30\27\32\35 #.\63>IMQ\\gkox}\u0086\u008b\u008e"+
		"\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}