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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		NUMBER=10, WS=11;
	public static final int
		RULE_areml = 0, RULE_recognition = 1, RULE_action = 2, RULE_thing = 3, 
		RULE_person = 4, RULE_connection = 5, RULE_property = 6, RULE_sub = 7, 
		RULE_pair = 8, RULE_value = 9;
	public static final String[] ruleNames = {
		"areml", "recognition", "action", "thing", "person", "connection", "property", 
		"sub", "pair", "value"
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
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<ThingContext> thing() {
			return getRuleContexts(ThingContext.class);
		}
		public ThingContext thing(int i) {
			return getRuleContext(ThingContext.class,i);
		}
		public List<PersonContext> person() {
			return getRuleContexts(PersonContext.class);
		}
		public PersonContext person(int i) {
			return getRuleContext(PersonContext.class,i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			recognition();
			setState(22);
			match(T__1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(23);
					action();
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(29);
				match(T__1);
				}
				break;
			}
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					thing();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(38);
				match(T__1);
				}
				break;
			}
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					person();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(47);
				match(T__1);
				}
				break;
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					connection();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(56);
				match(T__1);
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(59);
				property();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__2);
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
			setState(67);
			match(STRING);
			setState(68);
			match(T__3);
			setState(69);
			pair();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(70);
				match(T__1);
				setState(71);
				pair();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__2);
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
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
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
			setState(79);
			match(STRING);
			setState(80);
			match(T__3);
			setState(81);
			sub();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(82);
				match(T__1);
				setState(83);
				sub();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__2);
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
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
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
			setState(91);
			match(STRING);
			setState(92);
			match(T__3);
			setState(93);
			sub();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(94);
				match(T__1);
				setState(95);
				sub();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__2);
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
			setState(103);
			match(STRING);
			setState(104);
			match(T__4);
			setState(105);
			match(STRING);
			setState(106);
			match(T__5);
			setState(107);
			match(T__3);
			setState(108);
			pair();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(109);
				match(T__1);
				setState(110);
				pair();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__2);
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
			setState(118);
			match(STRING);
			setState(119);
			match(T__3);
			setState(120);
			pair();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(121);
				match(T__1);
				setState(122);
				pair();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(T__2);
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
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(STRING);
			setState(131);
			match(T__3);
			setState(132);
			sub();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(T__2);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AREMLParser.NUMBER, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(STRING);
			setState(140);
			match(NUMBER);
			setState(141);
			match(T__3);
			setState(142);
			pair();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(143);
				match(T__1);
				setState(144);
				pair();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__2);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 16, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(STRING);
			setState(153);
			match(T__6);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==NUMBER) {
				{
				{
				setState(154);
				value();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AREMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AREMLParser.NUMBER, i);
		}
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
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(NUMBER);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(162);
					match(T__7);
					setState(163);
					match(NUMBER);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\5\2!\n\2\3\2\7\2$"+
		"\n\2\f\2\16\2\'\13\2\3\2\5\2*\n\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\5"+
		"\2\63\n\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\5\2<\n\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6r\n\6\f\6\16\6u\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\13\3\13\3\13\3\13\7\13\u00a7\n"+
		"\13\f\13\16\13\u00aa\13\13\5\13\u00ac\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\2\2\u00b6\2\26\3\2\2\2\4E\3\2\2\2\6Q\3\2\2\2\b]\3\2\2\2\ni\3"+
		"\2\2\2\fx\3\2\2\2\16\u0084\3\2\2\2\20\u008d\3\2\2\2\22\u009a\3\2\2\2\24"+
		"\u00ab\3\2\2\2\26\27\7\3\2\2\27\30\5\4\3\2\30\34\7\4\2\2\31\33\5\6\4\2"+
		"\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36"+
		"\34\3\2\2\2\37!\7\4\2\2 \37\3\2\2\2 !\3\2\2\2!%\3\2\2\2\"$\5\b\5\2#\""+
		"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\'%\3\2\2\2(*\7\4\2\2"+
		")(\3\2\2\2)*\3\2\2\2*.\3\2\2\2+-\5\n\6\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\7\4\2\2\62\61\3\2\2\2\62\63"+
		"\3\2\2\2\63\67\3\2\2\2\64\66\5\f\7\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2\2:<\7\4\2\2;:\3\2\2\2;<\3\2\2\2"+
		"<@\3\2\2\2=?\5\16\b\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2"+
		"\2B@\3\2\2\2CD\7\5\2\2D\3\3\2\2\2EF\7\13\2\2FG\7\6\2\2GL\5\22\n\2HI\7"+
		"\4\2\2IK\5\22\n\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL"+
		"\3\2\2\2OP\7\5\2\2P\5\3\2\2\2QR\7\13\2\2RS\7\6\2\2SX\5\20\t\2TU\7\4\2"+
		"\2UW\5\20\t\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2"+
		"\2\2[\\\7\5\2\2\\\7\3\2\2\2]^\7\13\2\2^_\7\6\2\2_d\5\20\t\2`a\7\4\2\2"+
		"ac\5\20\t\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2"+
		"\2gh\7\5\2\2h\t\3\2\2\2ij\7\13\2\2jk\7\7\2\2kl\7\13\2\2lm\7\b\2\2mn\7"+
		"\6\2\2ns\5\22\n\2op\7\4\2\2pr\5\22\n\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2w\13\3\2\2\2xy\7\13\2\2yz\7\6\2"+
		"\2z\177\5\22\n\2{|\7\4\2\2|~\5\22\n\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7\5\2\2\u0083\r\3\2\2\2\u0084\u0085\7\13\2\2\u0085\u0086\7\6\2\2\u0086"+
		"\u008a\5\20\t\2\u0087\u0089\7\5\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7"+
		"\6\2\2\u0090\u0095\5\22\n\2\u0091\u0092\7\4\2\2\u0092\u0094\5\22\n\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\5\2\2\u0099"+
		"\21\3\2\2\2\u009a\u009b\7\13\2\2\u009b\u009f\7\t\2\2\u009c\u009e\5\24"+
		"\13\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00ac\7\13\2"+
		"\2\u00a3\u00a8\7\f\2\2\u00a4\u00a5\7\n\2\2\u00a5\u00a7\7\f\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2"+
		"\2\2\u00ac\25\3\2\2\2\25\34 %).\62\67;@LXds\177\u008a\u0095\u009f\u00a8"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}