// Generated from StateLabel.g4 by ANTLR 4.7.1
package edu.uiowa.chart.state.util;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateLabelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Entry=8, During=9, 
		Exit=10, On=11, After=12, Before=13, At=14, Every=15, Identifier=16, IdentifierLetter=17, 
		Integer=18, Float=19, Digit=20, LineComment=21, WhiteSpace=22, AnyCharacter=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Entry", "During", 
		"Exit", "On", "After", "Before", "At", "Every", "Identifier", "IdentifierLetter", 
		"Integer", "Float", "Digit", "LineComment", "WhiteSpace", "AnyCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "'\n'", "','", "':'", "'bind'", "'('", "')'", null, null, 
		null, "'on'", "'after'", "'before'", "'at'", "'every'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Entry", "During", "Exit", 
		"On", "After", "Before", "At", "Every", "Identifier", "IdentifierLetter", 
		"Integer", "Float", "Digit", "LineComment", "WhiteSpace", "AnyCharacter"
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


	public StateLabelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StateLabel.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tJ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nT\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21z\n\21\f\21\16\21}\13\21\3\22"+
		"\3\22\3\23\6\23\u0082\n\23\r\23\16\23\u0083\3\24\6\24\u0087\n\24\r\24"+
		"\16\24\u0088\3\24\3\24\7\24\u008d\n\24\f\24\16\24\u0090\13\24\3\24\3\24"+
		"\6\24\u0094\n\24\r\24\16\24\u0095\5\24\u0098\n\24\3\25\3\25\3\26\3\26"+
		"\7\26\u009e\n\26\f\26\16\26\u00a1\13\26\3\26\3\26\3\26\3\26\3\27\6\27"+
		"\u00a8\n\27\r\27\16\27\u00a9\3\27\3\27\3\30\3\30\3\u009f\2\31\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\4\5\2C\\aac|\5\2\13\13\17\17\"\"\2\u00ba"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r>"+
		"\3\2\2\2\17@\3\2\2\2\21I\3\2\2\2\23S\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31"+
		"`\3\2\2\2\33f\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!v\3\2\2\2#~\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u00a7\3\2\2\2"+
		"/\u00ad\3\2\2\2\61\62\7\17\2\2\62\4\3\2\2\2\63\64\7\f\2\2\64\6\3\2\2\2"+
		"\65\66\7.\2\2\66\b\3\2\2\2\678\7<\2\28\n\3\2\2\29:\7d\2\2:;\7k\2\2;<\7"+
		"p\2\2<=\7f\2\2=\f\3\2\2\2>?\7*\2\2?\16\3\2\2\2@A\7+\2\2A\20\3\2\2\2BC"+
		"\7g\2\2CD\7p\2\2DE\7v\2\2EF\7t\2\2FJ\7{\2\2GH\7g\2\2HJ\7p\2\2IB\3\2\2"+
		"\2IG\3\2\2\2J\22\3\2\2\2KL\7f\2\2LM\7w\2\2MN\7t\2\2NO\7k\2\2OP\7p\2\2"+
		"PT\7i\2\2QR\7f\2\2RT\7w\2\2SK\3\2\2\2SQ\3\2\2\2T\24\3\2\2\2UV\7g\2\2V"+
		"W\7z\2\2WX\7k\2\2X\\\7v\2\2YZ\7g\2\2Z\\\7z\2\2[U\3\2\2\2[Y\3\2\2\2\\\26"+
		"\3\2\2\2]^\7q\2\2^_\7p\2\2_\30\3\2\2\2`a\7c\2\2ab\7h\2\2bc\7v\2\2cd\7"+
		"g\2\2de\7t\2\2e\32\3\2\2\2fg\7d\2\2gh\7g\2\2hi\7h\2\2ij\7q\2\2jk\7t\2"+
		"\2kl\7g\2\2l\34\3\2\2\2mn\7c\2\2no\7v\2\2o\36\3\2\2\2pq\7g\2\2qr\7x\2"+
		"\2rs\7g\2\2st\7t\2\2tu\7{\2\2u \3\2\2\2v{\5#\22\2wz\5#\22\2xz\5)\25\2"+
		"yw\3\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\"\3\2\2\2}{\3\2\2"+
		"\2~\177\t\2\2\2\177$\3\2\2\2\u0080\u0082\5)\25\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084&\3\2\2\2"+
		"\u0085\u0087\5)\25\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\7\60\2\2"+
		"\u008b\u008d\5)\25\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0098\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\7\60\2\2\u0092\u0094\5)\25\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0086\3\2\2\2\u0097\u0091\3\2\2\2\u0098(\3\2\2\2\u0099\u009a\4\62;\2"+
		"\u009a*\3\2\2\2\u009b\u009f\7\'\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\b\26\2\2\u00a5,\3\2\2\2\u00a6\u00a8\t\3\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\b\27\2\2\u00ac.\3\2\2\2\u00ad\u00ae\13\2\2"+
		"\2\u00ae\60\3\2\2\2\17\2IS[y{\u0083\u0088\u008e\u0095\u0097\u009f\u00a9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}