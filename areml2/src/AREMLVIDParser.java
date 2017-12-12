// Generated from AREMLVID.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
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
		RULE_aremlvid = 0, RULE_connectionType = 1, RULE_secondconnectiontype = 2, 
		RULE_and = 3, RULE_person = 4, RULE_action = 5, RULE_object = 6, RULE_secondobject = 7;
	public static final String[] ruleNames = {
		"aremlvid", "connectionType", "secondconnectiontype", "and", "person", 
		"action", "object", "secondobject"
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
		public ConnectionTypeContext connectionType() {
			return getRuleContext(ConnectionTypeContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(AREMLVIDParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AREMLVIDParser.STRING, i);
		}
		public SecondobjectContext secondobject() {
			return getRuleContext(SecondobjectContext.class,0);
		}
		public SecondconnectiontypeContext secondconnectiontype() {
			return getRuleContext(SecondconnectiontypeContext.class,0);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(ARTICLE);
				setState(18);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(17);
					match(STRING);
					}
					break;
				}
				setState(20);
				person();
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(21);
					match(STRING);
					}
					break;
				}
				setState(24);
				action();
				setState(25);
				connectionType();
				setState(26);
				match(ARTICLE);
				setState(27);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(ARTICLE);
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(30);
					match(STRING);
					}
					break;
				}
				setState(33);
				person();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(34);
					match(ARTICLE);
					}
				}

				setState(37);
				action();
				setState(38);
				match(ARTICLE);
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(39);
					match(STRING);
					}
					break;
				}
				setState(42);
				object();
				setState(43);
				connectionType();
				setState(44);
				match(STRING);
				setState(45);
				secondobject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(ARTICLE);
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(48);
					match(STRING);
					}
					break;
				}
				setState(51);
				person();
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(52);
					match(STRING);
					}
					break;
				}
				setState(55);
				action();
				setState(56);
				connectionType();
				setState(57);
				match(ARTICLE);
				setState(58);
				object();
				setState(59);
				secondconnectiontype();
				setState(60);
				match(ARTICLE);
				setState(61);
				match(STRING);
				setState(62);
				secondobject();
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
			if ( listener instanceof AREMLVIDListener ) try {
				((AREMLVIDListener)listener).enterConnectionType(this);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
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
			setState(66);
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

	public static class SecondconnectiontypeContext extends ParserRuleContext {
		public SecondconnectiontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondconnectiontype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterSecondconnectiontype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitSecondconnectiontype(this);
		}
	}

	public final SecondconnectiontypeContext secondconnectiontype() throws RecognitionException {
		SecondconnectiontypeContext _localctx = new SecondconnectiontypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_secondconnectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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
		enterRule(_localctx, 6, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
			if ( listener instanceof AREMLVIDListener ) try {
				((AREMLVIDListener)listener).enterPerson(this);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
			if ( listener instanceof AREMLVIDListener ) try {
				((AREMLVIDListener)listener).enterAction(this);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
			if ( listener instanceof AREMLVIDListener ) try {
				((AREMLVIDListener)listener).enterObject(this);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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

	public static class SecondobjectContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public SecondobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) try {
				((AREMLVIDListener)listener).enterSecondobject(this);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitSecondobject(this);
		}
	}

	public final SecondobjectContext secondobject() throws RecognitionException {
		SecondobjectContext _localctx = new SecondobjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_secondobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\5\2\31\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\2\3\2\5\2"+
		"&\n\2\3\2\3\2\3\2\5\2+\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\64\n\2\3\2"+
		"\3\2\5\28\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2C\n\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\3\3\2\3\17\2S\2B\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nJ\3\2"+
		"\2\2\fL\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22\24\7\20\2\2\23\25\7\21\2\2"+
		"\24\23\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\30\5\n\6\2\27\31\7\21\2"+
		"\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\5\f\7\2\33\34\5\4\3"+
		"\2\34\35\7\20\2\2\35\36\5\16\b\2\36C\3\2\2\2\37!\7\20\2\2 \"\7\21\2\2"+
		"! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#%\5\n\6\2$&\7\20\2\2%$\3\2\2\2%&\3\2"+
		"\2\2&\'\3\2\2\2\'(\5\f\7\2(*\7\20\2\2)+\7\21\2\2*)\3\2\2\2*+\3\2\2\2+"+
		",\3\2\2\2,-\5\16\b\2-.\5\4\3\2./\7\21\2\2/\60\5\20\t\2\60C\3\2\2\2\61"+
		"\63\7\20\2\2\62\64\7\21\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2"+
		"\65\67\5\n\6\2\668\7\21\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\f"+
		"\7\2:;\5\4\3\2;<\7\20\2\2<=\5\16\b\2=>\5\6\4\2>?\7\20\2\2?@\7\21\2\2@"+
		"A\5\20\t\2AC\3\2\2\2B\22\3\2\2\2B\37\3\2\2\2B\61\3\2\2\2C\3\3\2\2\2DE"+
		"\t\2\2\2E\5\3\2\2\2FG\t\2\2\2G\7\3\2\2\2HI\7\21\2\2I\t\3\2\2\2JK\7\21"+
		"\2\2K\13\3\2\2\2LM\7\21\2\2M\r\3\2\2\2NO\7\21\2\2O\17\3\2\2\2PQ\7\21\2"+
		"\2Q\21\3\2\2\2\n\24\30!%*\63\67B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}