// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		FLOAT=18, MULTIDIV=19, ADDSUB=20, ALPHA=21, NUM=22, WHITESPACE=23, COMMENT=24, 
		COMMENT2=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "ID", "FLOAT", 
			"MULTIDIV", "ADDSUB", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'for'", "'..'", "'!='", "'=='", "'<'", "'>'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "FLOAT", "MULTIDIV", "ADDSUB", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22i\n\22\f\22\16\22l\13\22\3\23\5\23o\n"+
		"\23\3\23\6\23r\n\23\r\23\16\23s\3\23\3\23\6\23x\n\23\r\23\16\23y\5\23"+
		"|\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u0087\n\30\r"+
		"\30\16\30\u0088\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0091\n\31\f\31\16"+
		"\31\u0094\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u009e\n\32"+
		"\f\32\16\32\u00a1\13\32\3\32\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\n\4\2,,\61\61\4\2--//\t\2C\\"+
		"aac|\u00c7\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\3\2\62;\5\2\13\f"+
		"\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\rD\3\2\2"+
		"\2\17J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25R\3\2\2\2\27U\3\2\2\2\31X\3\2"+
		"\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!b\3\2\2\2#e\3\2\2\2%n\3\2\2\2"+
		"\'}\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0086\3\2\2\2"+
		"\61\u008c\3\2\2\2\63\u0097\3\2\2\2\65\66\7}\2\2\66\4\3\2\2\2\678\7\177"+
		"\2\28\6\3\2\2\29:\7?\2\2:\b\3\2\2\2;<\7=\2\2<\n\3\2\2\2=>\7q\2\2>?\7w"+
		"\2\2?@\7v\2\2@A\7r\2\2AB\7w\2\2BC\7v\2\2C\f\3\2\2\2DE\7y\2\2EF\7j\2\2"+
		"FG\7k\2\2GH\7n\2\2HI\7g\2\2I\16\3\2\2\2JK\7*\2\2K\20\3\2\2\2LM\7+\2\2"+
		"M\22\3\2\2\2NO\7h\2\2OP\7q\2\2PQ\7t\2\2Q\24\3\2\2\2RS\7\60\2\2ST\7\60"+
		"\2\2T\26\3\2\2\2UV\7#\2\2VW\7?\2\2W\30\3\2\2\2XY\7?\2\2YZ\7?\2\2Z\32\3"+
		"\2\2\2[\\\7>\2\2\\\34\3\2\2\2]^\7@\2\2^\36\3\2\2\2_`\7(\2\2`a\7(\2\2a"+
		" \3\2\2\2bc\7~\2\2cd\7~\2\2d\"\3\2\2\2ej\5+\26\2fi\5+\26\2gi\5-\27\2h"+
		"f\3\2\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k$\3\2\2\2lj\3\2\2\2"+
		"mo\7/\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5-\27\2qp\3\2\2\2rs\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2t{\3\2\2\2uw\7\60\2\2vx\5-\27\2wv\3\2\2\2xy\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{u\3\2\2\2{|\3\2\2\2|&\3\2\2\2}~\t\2\2"+
		"\2~(\3\2\2\2\177\u0080\t\3\2\2\u0080*\3\2\2\2\u0081\u0082\t\4\2\2\u0082"+
		",\3\2\2\2\u0083\u0084\t\5\2\2\u0084.\3\2\2\2\u0085\u0087\t\6\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\30\2\2\u008b\60\3\2\2\2\u008c\u008d"+
		"\7\61\2\2\u008d\u008e\7\61\2\2\u008e\u0092\3\2\2\2\u008f\u0091\n\7\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\31\2\2"+
		"\u0096\62\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7,\2\2\u0099\u009f"+
		"\3\2\2\2\u009a\u009e\n\b\2\2\u009b\u009c\7,\2\2\u009c\u009e\n\t\2\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7,\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\32"+
		"\2\2\u00a6\64\3\2\2\2\r\2hjnsy{\u0088\u0092\u009d\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}