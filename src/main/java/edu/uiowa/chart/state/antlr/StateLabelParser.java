// Generated from StateLabel.g4 by ANTLR 4.7.1
package edu.uiowa.chart.state.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateLabelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Entry=7, During=8, Exit=9, 
		Bind=10, On=11, After=12, Before=13, At=14, Every=15, Identifier=16, IdentifierLetter=17, 
		Number=18, Integer=19, Float=20, Digit=21, LineComment=22, WhiteSpace=23, 
		AnyCharacter=24;
	public static final int
		RULE_stateLabel = 0, RULE_actions = 1, RULE_action = 2, RULE_actionType = 3, 
		RULE_actionBody = 4;
	public static final String[] ruleNames = {
		"stateLabel", "actions", "action", "actionType", "actionBody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "'\n'", "','", "':'", "'('", "')'", null, null, null, "'bind'", 
		"'on'", "'after'", "'before'", "'at'", "'every'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Entry", "During", "Exit", "Bind", 
		"On", "After", "Before", "At", "Every", "Identifier", "IdentifierLetter", 
		"Number", "Integer", "Float", "Digit", "LineComment", "WhiteSpace", "AnyCharacter"
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
	public String getGrammarFileName() { return "StateLabel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateLabelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StateLabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateLabelParser.Identifier, 0); }
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public StateLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).enterStateLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).exitStateLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateLabelVisitor ) return ((StateLabelVisitor<? extends T>)visitor).visitStateLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateLabelContext stateLabel() throws RecognitionException {
		StateLabelContext _localctx = new StateLabelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stateLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(Identifier);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(11);
				match(T__0);
				}
			}

			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(14);
				match(T__1);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Entry) | (1L << During) | (1L << Exit) | (1L << Bind) | (1L << On))) != 0)) {
				{
				setState(20);
				actions();
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

	public static class ActionsContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateLabelVisitor ) return ((StateLabelVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				action();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Entry) | (1L << During) | (1L << Exit) | (1L << Bind) | (1L << On))) != 0) );
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
		public List<ActionTypeContext> actionType() {
			return getRuleContexts(ActionTypeContext.class);
		}
		public ActionTypeContext actionType(int i) {
			return getRuleContext(ActionTypeContext.class,i);
		}
		public ActionBodyContext actionBody() {
			return getRuleContext(ActionBodyContext.class,0);
		}
		public TerminalNode Bind() { return getToken(StateLabelParser.Bind, 0); }
		public List<TerminalNode> Identifier() { return getTokens(StateLabelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateLabelParser.Identifier, i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateLabelVisitor ) return ((StateLabelVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_action);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Entry:
			case During:
			case Exit:
			case On:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				actionType();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(29);
					match(T__2);
					setState(30);
					actionType();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__3);
				setState(37);
				actionBody();
				}
				break;
			case Bind:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(Bind);
				setState(40);
				match(T__3);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(41);
					match(Identifier);
					}
				}

				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(44);
					match(T__2);
					setState(45);
					match(Identifier);
					}
					}
					setState(50);
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

	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode Entry() { return getToken(StateLabelParser.Entry, 0); }
		public TerminalNode During() { return getToken(StateLabelParser.During, 0); }
		public TerminalNode Exit() { return getToken(StateLabelParser.Exit, 0); }
		public TerminalNode On() { return getToken(StateLabelParser.On, 0); }
		public TerminalNode Identifier() { return getToken(StateLabelParser.Identifier, 0); }
		public TerminalNode After() { return getToken(StateLabelParser.After, 0); }
		public TerminalNode Number() { return getToken(StateLabelParser.Number, 0); }
		public TerminalNode Before() { return getToken(StateLabelParser.Before, 0); }
		public TerminalNode At() { return getToken(StateLabelParser.At, 0); }
		public TerminalNode Every() { return getToken(StateLabelParser.Every, 0); }
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateLabelVisitor ) return ((StateLabelVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actionType);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(Entry);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(During);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(Exit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(On);
				setState(57);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(On);
				setState(59);
				match(After);
				setState(60);
				match(T__4);
				setState(61);
				match(Number);
				setState(62);
				match(T__2);
				setState(63);
				match(Identifier);
				setState(64);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(On);
				setState(66);
				match(Before);
				setState(67);
				match(T__4);
				setState(68);
				match(Number);
				setState(69);
				match(T__2);
				setState(70);
				match(Identifier);
				setState(71);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				match(On);
				setState(73);
				match(At);
				setState(74);
				match(T__4);
				setState(75);
				match(Number);
				setState(76);
				match(T__2);
				setState(77);
				match(Identifier);
				setState(78);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(On);
				setState(80);
				match(Every);
				setState(81);
				match(T__4);
				setState(82);
				match(Number);
				setState(83);
				match(T__2);
				setState(84);
				match(Identifier);
				setState(85);
				match(T__5);
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

	public static class ActionBodyContext extends ParserRuleContext {
		public ActionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).enterActionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateLabelListener ) ((StateLabelListener)listener).exitActionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateLabelVisitor ) return ((StateLabelVisitor<? extends T>)visitor).visitActionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionBodyContext actionBody() throws RecognitionException {
		ActionBodyContext _localctx = new ActionBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(88);
						matchWildcard();
						}
						break;
					case 2:
						{
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(89);
							match(T__0);
							}
						}

						setState(92);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\5\2\30\n\2\3\3\6\3\33\n\3\r\3\16\3\34\3\4\3\4\3\4\7\4\"\n"+
		"\4\f\4\16\4%\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\7\4\61\n\4"+
		"\f\4\16\4\64\13\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\5\6]\n\6\3\6\7\6`\n\6\f\6\16\6c"+
		"\13\6\3\6\3a\2\7\2\4\6\b\n\2\2\2q\2\f\3\2\2\2\4\32\3\2\2\2\6\65\3\2\2"+
		"\2\bX\3\2\2\2\na\3\2\2\2\f\16\7\22\2\2\r\17\7\3\2\2\16\r\3\2\2\2\16\17"+
		"\3\2\2\2\17\23\3\2\2\2\20\22\7\4\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\26\30\5\4\3\2\27\26"+
		"\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\33\5\6\4\2\32\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36#\5\b\5\2\37 \7\5"+
		"\2\2 \"\5\b\5\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%"+
		"#\3\2\2\2&\'\7\6\2\2\'(\5\n\6\2(\66\3\2\2\2)*\7\f\2\2*,\7\6\2\2+-\7\22"+
		"\2\2,+\3\2\2\2,-\3\2\2\2-\62\3\2\2\2./\7\5\2\2/\61\7\22\2\2\60.\3\2\2"+
		"\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2"+
		"\2\65\36\3\2\2\2\65)\3\2\2\2\66\7\3\2\2\2\67Y\7\t\2\28Y\7\n\2\29Y\7\13"+
		"\2\2:;\7\r\2\2;Y\7\22\2\2<=\7\r\2\2=>\7\16\2\2>?\7\7\2\2?@\7\24\2\2@A"+
		"\7\5\2\2AB\7\22\2\2BY\7\b\2\2CD\7\r\2\2DE\7\17\2\2EF\7\7\2\2FG\7\24\2"+
		"\2GH\7\5\2\2HI\7\22\2\2IY\7\b\2\2JK\7\r\2\2KL\7\20\2\2LM\7\7\2\2MN\7\24"+
		"\2\2NO\7\5\2\2OP\7\22\2\2PY\7\b\2\2QR\7\r\2\2RS\7\21\2\2ST\7\7\2\2TU\7"+
		"\24\2\2UV\7\5\2\2VW\7\22\2\2WY\7\b\2\2X\67\3\2\2\2X8\3\2\2\2X9\3\2\2\2"+
		"X:\3\2\2\2X<\3\2\2\2XC\3\2\2\2XJ\3\2\2\2XQ\3\2\2\2Y\t\3\2\2\2Z`\13\2\2"+
		"\2[]\7\3\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\4\2\2_Z\3\2\2\2_\\\3"+
		"\2\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2b\13\3\2\2\2ca\3\2\2\2\16\16\23\27"+
		"\34#,\62\65X\\_a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}