// Generated from AREMLVID.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AREMLVIDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ARTICLE=14, STRING=15, WS=16;
	public static final int
		RULE_aremlvid = 0, RULE_connectionType = 1, RULE_and = 2, RULE_person = 3, 
		RULE_action = 4, RULE_object = 5;
	public static final String[] ruleNames = {
		"aremlvid", "connectionType", "and", "person", "action", "object"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'on'", "'in'", "'under'", "'next to'", "'in front of'", "'behind'", 
		"'with'", "'into'", "'in to'", "'down'", "'up'", "'to'", "'from'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ARTICLE", "STRING", "WS"
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
	public String getGrammarFileName() { return "AREMLVID.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AREMLVIDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AremlvidContext extends ParserRuleContext {
		public List<TerminalNode> ARTICLE() { return getTokens(AREMLVIDParser.ARTICLE); }
		public TerminalNode ARTICLE(int i) {
			return getToken(AREMLVIDParser.ARTICLE, i);
		}
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public List<ConnectionTypeContext> connectionType() {
			return getRuleContexts(ConnectionTypeContext.class);
		}
		public ConnectionTypeContext connectionType(int i) {
			return getRuleContext(ConnectionTypeContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AremlvidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aremlvid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterAremlvid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitAremlvid(this);
		}
	}

	public final AremlvidContext aremlvid() throws RecognitionException {
		AremlvidContext _localctx = new AremlvidContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aremlvid);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(ARTICLE);
				setState(13);
				person();
				setState(15);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					match(STRING);
					}
					break;
				}
				setState(17);
				action();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(18);
					connectionType();
					}
				}

				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(21);
					match(ARTICLE);
					}
				}

				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(24);
					object();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ARTICLE);
				setState(28);
				person();
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(29);
					match(STRING);
					}
					break;
				}
				setState(32);
				action();
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(33);
					connectionType();
					}
					break;
				}
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(36);
					match(ARTICLE);
					}
					break;
				}
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(39);
					object();
					}
					break;
				}
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(42);
					and();
					}
					break;
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(45);
					connectionType();
					}
				}

				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(48);
					match(ARTICLE);
					}
				}

				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					object();
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
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

	public static class ConnectionTypeContext extends ParserRuleContext {
		public ConnectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterConnectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitConnectionType(this);
		}
	}

	public final ConnectionTypeContext connectionType() throws RecognitionException {
		ConnectionTypeContext _localctx = new ConnectionTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_connectionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(STRING);
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
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(STRING);
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
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(STRING);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5\2\22\n\2\3\2\3\2\5\2"+
		"\26\n\2\3\2\5\2\31\n\2\3\2\5\2\34\n\2\3\2\3\2\3\2\5\2!\n\2\3\2\3\2\5\2"+
		"%\n\2\3\2\5\2(\n\2\3\2\5\2+\n\2\3\2\5\2.\n\2\3\2\5\2\61\n\2\3\2\5\2\64"+
		"\n\2\3\2\6\2\67\n\2\r\2\16\28\5\2;\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\3\17\2M\2:\3\2\2\2\4<\3\2\2\2\6"+
		">\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16\17\7\20\2\2\17\21\5\b\5"+
		"\2\20\22\7\21\2\2\21\20\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\25\5\n"+
		"\6\2\24\26\5\4\3\2\25\24\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\7\20"+
		"\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\5\f\7\2\33\32\3\2"+
		"\2\2\33\34\3\2\2\2\34;\3\2\2\2\35\36\7\20\2\2\36 \5\b\5\2\37!\7\21\2\2"+
		" \37\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"$\5\n\6\2#%\5\4\3\2$#\3\2\2\2$%\3\2"+
		"\2\2%\'\3\2\2\2&(\7\20\2\2\'&\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)+\5\f\7\2*"+
		")\3\2\2\2*+\3\2\2\2+-\3\2\2\2,.\5\6\4\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2"+
		"\2/\61\5\4\3\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\64\7\20\2\2"+
		"\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\f\7\2\66\65\3\2\2\2"+
		"\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:\16\3\2\2\2:\35\3\2\2\2;"+
		"\3\3\2\2\2<=\t\2\2\2=\5\3\2\2\2>?\7\21\2\2?\7\3\2\2\2@A\7\21\2\2A\t\3"+
		"\2\2\2BC\7\21\2\2C\13\3\2\2\2DE\7\21\2\2E\r\3\2\2\2\17\21\25\30\33 $\'"+
		"*-\60\638:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}