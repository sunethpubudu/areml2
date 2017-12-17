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
		RULE_gender = 4, RULE_personProperty = 5, RULE_and = 6, RULE_person = 7, 
		RULE_action = 8, RULE_object = 9, RULE_secondobject = 10;
	public static final String[] ruleNames = {
		"aremlvid", "verb", "connectionType", "secondconnectiontype", "gender", 
		"personProperty", "and", "person", "action", "object", "secondobject"
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
			return getRuleContext(PersonContext.class, 0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ConnectionTypeContext connectionType() {
			return getRuleContext(ConnectionTypeContext.class, 0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class, 0);
		}
		public List<TerminalNode> STRING() { return getTokens(AREMLVIDParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AREMLVIDParser.STRING, i);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public SecondobjectContext secondobject() {
			return getRuleContext(SecondobjectContext.class, 0);
		}
		public GenderContext gender() {
			return getRuleContext(GenderContext.class,0);
		}
		public PersonPropertyContext personProperty() {
			return getRuleContext(PersonPropertyContext.class,0);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(ARTICLE);
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(23);
					match(STRING);
					}
					break;
				}
				setState(26);
				person();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(27);
					verb();
					}
				}

				setState(30);
				action();
				setState(31);
				connectionType();
				setState(32);
				match(ARTICLE);
				setState(33);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ARTICLE);
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(36);
					match(STRING);
					}
					break;
				}
				setState(39);
				person();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(40);
					match(ARTICLE);
					}
				}

				setState(43);
				action();
				setState(44);
				match(ARTICLE);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(45);
					match(STRING);
					}
					break;
				}
				setState(48);
				object();
				setState(49);
				connectionType();
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(50);
					match(STRING);
					}
					break;
				}
				setState(53);
				secondobject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(ARTICLE);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(56);
					match(STRING);
					}
					break;
				}
				setState(59);
				person();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(60);
					match(ARTICLE);
					}
				}

				setState(63);
				action();
				setState(64);
				match(ARTICLE);
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(65);
					match(STRING);
					}
					break;
				}
				setState(68);
				object();
				setState(69);
				connectionType();
				setState(70);
				gender();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(71);
					match(STRING);
					}
					break;
				}
				setState(74);
				personProperty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(ARTICLE);
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(77);
					match(STRING);
					}
					break;
				}
				setState(80);
				person();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(81);
					verb();
					}
				}

				setState(84);
				action();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(85);
					match(ARTICLE);
					}
				}

				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(88);
					match(STRING);
					}
					break;
				}
				setState(91);
				object();
				setState(92);
				connectionType();
				setState(93);
				gender();
				setState(94);
				personProperty();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(ARTICLE);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(97);
					match(STRING);
					}
					break;
				}
				setState(100);
				person();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(101);
					verb();
					}
				}

				setState(104);
				action();
				setState(105);
				connectionType();
				setState(106);
				match(ARTICLE);
				setState(107);
				object();
				setState(108);
				secondconnectiontype();
				setState(109);
				match(ARTICLE);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==T__16) {
					{
					setState(110);
					gender();
					}
				}

				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(113);
					match(STRING);
					}
					break;
				}
				setState(116);
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
			setState(120);
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
			setState(122);
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
			setState(124);
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
			setState(126);
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

	public static class PersonPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLVIDParser.STRING, 0); }
		public PersonPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) try {
				((AREMLVIDListener)listener).enterPersonProperty(this);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLVIDListener ) ((AREMLVIDListener)listener).exitPersonProperty(this);
		}
	}

	public final PersonPropertyContext personProperty() throws RecognitionException {
		PersonPropertyContext _localctx = new PersonPropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_personProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		enterRule(_localctx, 12, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		enterRule(_localctx, 14, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		enterRule(_localctx, 16, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 18, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 20, RULE_secondobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\5\2\33\n\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2(\n\2\3\2\3\2\5\2,\n\2\3\2\3\2\3\2\5\2\61\n\2\3\2\3\2\3"+
		"\2\5\2\66\n\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\2\3\2\5\2@\n\2\3\2\3\2\3\2\5"+
		"\2E\n\2\3\2\3\2\3\2\3\2\5\2K\n\2\3\2\3\2\3\2\3\2\5\2Q\n\2\3\2\3\2\5\2"+
		"U\n\2\3\2\3\2\5\2Y\n\2\3\2\5\2\\\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2e"+
		"\n\2\3\2\3\2\5\2i\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2r\n\2\3\2\5\2u\n"+
		"\2\3\2\3\2\5\2y\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\5\3\2\3\4\3\2\5\21\3\2\22\23\2\u0099\2x\3\2\2\2\4z\3\2\2\2\6|\3\2\2"+
		"\2\b~\3\2\2\2\n\u0080\3\2\2\2\f\u0082\3\2\2\2\16\u0084\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u008c\3\2\2\2\30\32\7\24"+
		"\2\2\31\33\7\25\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\5"+
		"\20\t\2\35\37\5\4\3\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\5\22\n"+
		"\2!\"\5\6\4\2\"#\7\24\2\2#$\5\24\13\2$y\3\2\2\2%\'\7\24\2\2&(\7\25\2\2"+
		"\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2)+\5\20\t\2*,\7\24\2\2+*\3\2\2\2+,\3\2"+
		"\2\2,-\3\2\2\2-.\5\22\n\2.\60\7\24\2\2/\61\7\25\2\2\60/\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\5\24\13\2\63\65\5\6\4\2\64\66\7\25\2\2\65"+
		"\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\5\26\f\28y\3\2\2\29;\7\24"+
		"\2\2:<\7\25\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5\20\t\2>@\7\24\2\2?>"+
		"\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\22\n\2BD\7\24\2\2CE\7\25\2\2DC\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\5\24\13\2GH\5\6\4\2HJ\5\n\6\2IK\7\25\2\2JI\3"+
		"\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\f\7\2My\3\2\2\2NP\7\24\2\2OQ\7\25\2\2P"+
		"O\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\5\20\t\2SU\5\4\3\2TS\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VX\5\22\n\2WY\7\24\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\25"+
		"\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5\24\13\2^_\5\6\4\2_`\5\n\6\2`"+
		"a\5\f\7\2ay\3\2\2\2bd\7\24\2\2ce\7\25\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fh\5\20\t\2gi\5\4\3\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5\22\n\2kl\5\6"+
		"\4\2lm\7\24\2\2mn\5\24\13\2no\5\b\5\2oq\7\24\2\2pr\5\n\6\2qp\3\2\2\2q"+
		"r\3\2\2\2rt\3\2\2\2su\7\25\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\26\f"+
		"\2wy\3\2\2\2x\30\3\2\2\2x%\3\2\2\2x9\3\2\2\2xN\3\2\2\2xb\3\2\2\2y\3\3"+
		"\2\2\2z{\t\2\2\2{\5\3\2\2\2|}\t\3\2\2}\7\3\2\2\2~\177\t\3\2\2\177\t\3"+
		"\2\2\2\u0080\u0081\t\4\2\2\u0081\13\3\2\2\2\u0082\u0083\7\25\2\2\u0083"+
		"\r\3\2\2\2\u0084\u0085\7\25\2\2\u0085\17\3\2\2\2\u0086\u0087\7\25\2\2"+
		"\u0087\21\3\2\2\2\u0088\u0089\7\25\2\2\u0089\23\3\2\2\2\u008a\u008b\7"+
		"\25\2\2\u008b\25\3\2\2\2\u008c\u008d\7\25\2\2\u008d\27\3\2\2\2\25\32\36"+
		"\'+\60\65;?DJPTX[dhqtx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}