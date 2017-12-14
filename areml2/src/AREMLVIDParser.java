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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ARTICLE=18, STRING=19, WS=20;
	public static final int
		RULE_aremlvid = 0, RULE_verb = 1, RULE_connectionType = 2, RULE_secondconnectiontype = 3, 
		RULE_gender = 4, RULE_and = 5, RULE_person = 6, RULE_action = 7, RULE_object = 8, 
		RULE_secondobject = 9;
	public static final String[] ruleNames = {
		"aremlvid", "verb", "connectionType", "secondconnectiontype", "gender", 
		"and", "person", "action", "object", "secondobject"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'is'", "'are'", "'on'", "'in'", "'under'", "'next to'", "'in front of'", 
		"'behind'", "'with'", "'into'", "'in to'", "'down'", "'up'", "'to'", "'from'", 
		"'his'", "'her'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ARTICLE", "STRING", "WS"
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
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public SecondobjectContext secondobject() {
			return getRuleContext(SecondobjectContext.class,0);
		}
		public GenderContext gender() {
			return getRuleContext(GenderContext.class,0);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(ARTICLE);
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(21);
					match(STRING);
					}
					break;
				}
				setState(24);
				person();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(25);
					verb();
					}
				}

				setState(28);
				action();
				setState(29);
				connectionType();
				setState(30);
				match(ARTICLE);
				setState(31);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(ARTICLE);
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					match(STRING);
					}
					break;
				}
				setState(37);
				person();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(38);
					match(ARTICLE);
					}
				}

				setState(41);
				action();
				setState(42);
				match(ARTICLE);
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(43);
					match(STRING);
					}
					break;
				}
				setState(46);
				object();
				setState(47);
				connectionType();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==T__16) {
					{
					setState(48);
					gender();
					}
				}

				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(51);
					match(STRING);
					}
					break;
				}
				setState(54);
				secondobject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(ARTICLE);
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(57);
					match(STRING);
					}
					break;
				}
				setState(60);
				person();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(61);
					verb();
					}
				}

				setState(64);
				action();
				setState(65);
				connectionType();
				setState(66);
				match(ARTICLE);
				setState(67);
				object();
				setState(68);
				secondconnectiontype();
				setState(69);
				match(ARTICLE);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==T__16) {
					{
					setState(70);
					gender();
					}
				}

				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(73);
					match(STRING);
					}
					break;
				}
				setState(76);
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

	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		enterRule(_localctx, 4, RULE_connectionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		enterRule(_localctx, 6, RULE_secondconnectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class GenderContext extends ParserRuleContext {
		public GenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).enterGender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitGender(this);
		}
	}

	public final GenderContext gender() throws RecognitionException {
		GenderContext _localctx = new GenderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gender);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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
		enterRule(_localctx, 10, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 12, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 14, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 16, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 18, RULE_secondobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\5\2\31\n\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&"+
		"\n\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\2\5\2/\n\2\3\2\3\2\3\2\5\2\64\n\2\3\2"+
		"\5\2\67\n\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\2\3\2\5\2A\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2J\n\2\3\2\5\2M\n\2\3\2\3\2\5\2Q\n\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\5\3\2\3\4\3\2\5\21\3\2\22\23\2g\2P\3\2\2\2\4"+
		"R\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20"+
		"^\3\2\2\2\22`\3\2\2\2\24b\3\2\2\2\26\30\7\24\2\2\27\31\7\25\2\2\30\27"+
		"\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\34\5\16\b\2\33\35\5\4\3\2\34\33"+
		"\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\5\20\t\2\37 \5\6\4\2 !\7\24"+
		"\2\2!\"\5\22\n\2\"Q\3\2\2\2#%\7\24\2\2$&\7\25\2\2%$\3\2\2\2%&\3\2\2\2"+
		"&\'\3\2\2\2\')\5\16\b\2(*\7\24\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\20"+
		"\t\2,.\7\24\2\2-/\7\25\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\5\22"+
		"\n\2\61\63\5\6\4\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2"+
		"\2\2\65\67\7\25\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\5\24\13"+
		"\29Q\3\2\2\2:<\7\24\2\2;=\7\25\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@\5\16"+
		"\b\2?A\5\4\3\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\20\t\2CD\5\6\4\2DE\7"+
		"\24\2\2EF\5\22\n\2FG\5\b\5\2GI\7\24\2\2HJ\5\n\6\2IH\3\2\2\2IJ\3\2\2\2"+
		"JL\3\2\2\2KM\7\25\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\24\13\2OQ\3\2"+
		"\2\2P\26\3\2\2\2P#\3\2\2\2P:\3\2\2\2Q\3\3\2\2\2RS\t\2\2\2S\5\3\2\2\2T"+
		"U\t\3\2\2U\7\3\2\2\2VW\t\3\2\2W\t\3\2\2\2XY\t\4\2\2Y\13\3\2\2\2Z[\7\25"+
		"\2\2[\r\3\2\2\2\\]\7\25\2\2]\17\3\2\2\2^_\7\25\2\2_\21\3\2\2\2`a\7\25"+
		"\2\2a\23\3\2\2\2bc\7\25\2\2c\25\3\2\2\2\16\30\34%).\63\66<@ILP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}