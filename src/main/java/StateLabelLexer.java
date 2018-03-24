// Generated from StateLabel.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, ACTION_TYPE=3, ID=4, ID_LETTER=5, LINE_COMMENT=6, WS=7, 
		AnyCharacter=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ACTION_TYPE", "ID", "ID_LETTER", "DIGIT", "LINE_COMMENT", 
		"WS", "AnyCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ACTION_TYPE", "ID", "ID_LETTER", "LINE_COMMENT", "WS", 
		"AnyCharacter"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4)\n\4\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\7\b9\n\b\f\b\16\b<\13\b\3\b\3\b\3\b\3\b\3\t\6\tC\n\t\r\t\16\tD\3\t\3"+
		"\t\3\n\3\n\3:\2\13\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\3\2\4\5\2C"+
		"\\aac|\5\2\13\f\17\17\"\"\2N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2"+
		"\2\5\27\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\66"+
		"\3\2\2\2\21B\3\2\2\2\23H\3\2\2\2\25\26\7.\2\2\26\4\3\2\2\2\27\30\7<\2"+
		"\2\30\6\3\2\2\2\31\32\7g\2\2\32\33\7p\2\2\33\34\7v\2\2\34\35\7t\2\2\35"+
		")\7{\2\2\36\37\7f\2\2\37 \7w\2\2 !\7t\2\2!\"\7k\2\2\"#\7p\2\2#)\7i\2\2"+
		"$%\7g\2\2%&\7z\2\2&\'\7k\2\2\')\7v\2\2(\31\3\2\2\2(\36\3\2\2\2($\3\2\2"+
		"\2)\b\3\2\2\2*/\5\13\6\2+.\5\13\6\2,.\5\r\7\2-+\3\2\2\2-,\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\n\3\2\2\2\61/\3\2\2\2\62\63\t\2\2\2"+
		"\63\f\3\2\2\2\64\65\4\62;\2\65\16\3\2\2\2\66:\7\'\2\2\679\13\2\2\28\67"+
		"\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\f\2\2>"+
		"?\3\2\2\2?@\b\b\2\2@\20\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\b\t\2\2G\22\3\2\2\2HI\13\2\2\2I\24\3\2\2\2\b"+
		"\2(-/:D\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}