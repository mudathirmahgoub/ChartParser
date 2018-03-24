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
		T__0=1, T__1=2, T__2=3, T__3=4, ActionType=5, Identifier=6, IdentifierLetter=7, 
		LineComment=8, WhiteSpace=9, AnyCharacter=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "ActionType", "Identifier", "IdentifierLetter", 
		"Digit", "LineComment", "WhiteSpace", "AnyCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "'\n'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ActionType", "Identifier", "IdentifierLetter", 
		"LineComment", "WhiteSpace", "AnyCharacter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fR\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\7\3\7\3\7\7\7\66\n\7\f"+
		"\7\16\79\13\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nA\n\n\f\n\16\nD\13\n\3\n\3\n"+
		"\3\n\3\n\3\13\6\13K\n\13\r\13\16\13L\3\13\3\13\3\f\3\f\3B\2\r\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f\3\2\4\5\2C\\aac|\5\2\13\13"+
		"\17\17\"\"\2V\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"+
		"\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13\60\3\2\2\2\r\62"+
		"\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25J\3\2\2\2\27P\3\2\2\2\31"+
		"\32\7\17\2\2\32\4\3\2\2\2\33\34\7\f\2\2\34\6\3\2\2\2\35\36\7.\2\2\36\b"+
		"\3\2\2\2\37 \7<\2\2 \n\3\2\2\2!\"\7g\2\2\"#\7p\2\2#$\7v\2\2$%\7t\2\2%"+
		"\61\7{\2\2&\'\7f\2\2\'(\7w\2\2()\7t\2\2)*\7k\2\2*+\7p\2\2+\61\7i\2\2,"+
		"-\7g\2\2-.\7z\2\2./\7k\2\2/\61\7v\2\2\60!\3\2\2\2\60&\3\2\2\2\60,\3\2"+
		"\2\2\61\f\3\2\2\2\62\67\5\17\b\2\63\66\5\17\b\2\64\66\5\21\t\2\65\63\3"+
		"\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\16\3\2\2\2"+
		"9\67\3\2\2\2:;\t\2\2\2;\20\3\2\2\2<=\4\62;\2=\22\3\2\2\2>B\7\'\2\2?A\13"+
		"\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7"+
		"\f\2\2FG\3\2\2\2GH\b\n\2\2H\24\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\13\2\2O\26\3\2\2\2PQ\13\2\2\2Q\30\3"+
		"\2\2\2\b\2\60\65\67BL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}