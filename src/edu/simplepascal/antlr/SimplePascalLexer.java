// Generated from SimplePascal.g4 by ANTLR 4.1

  package edu.simplepascal.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplePascalLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COM=2, COL=3, SCOL=4, ASSIGN=5, OPAR=6, CPAR=7, PLUS=8, MINUS=9, 
		MULT=10, DIV=11, MOD=12, EQ=13, NEQ=14, GT=15, LT=16, GTEQ=17, LTEQ=18, 
		OR=19, XOR=20, AND=21, NOT=22, SHL=23, SHR=24, PROG=25, BEGIN=26, END=27, 
		VAR=28, TRUE=29, FALSE=30, NIL=31, IF=32, OF=33, TO=34, DO=35, THEN=36, 
		ELSE=37, FOR=38, WHILE=39, CASE=40, REPEAT=41, UNTIL=42, READ=43, WRITE=44, 
		T_INT=45, T_REAL=46, T_BOOL=47, T_STR=48, FN_INC=49, FN_DEC=50, FN_SIN=51, 
		FN_COS=52, FN_TAN=53, FN_ATAN=54, FN_SQRT=55, FN_POW=56, FN_EXP=57, FN_LN=58, 
		FN_LEN=59, FN_CNCT=60, FN_DEL=61, FN_CPY=62, ID=63, INT=64, FLOAT=65, 
		STRING=66, COMMENT=67, SPACE=68, OTHER=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "','", "':'", "';'", "':='", "'('", "')'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'='", "'<>'", "'>'", "'<'", "'>='", "'<='", "'or'", "'xor'", 
		"'and'", "'not'", "'shl'", "'shr'", "'program'", "'begin'", "'end'", "'var'", 
		"'true'", "'false'", "'nil'", "'if'", "'of'", "'to'", "'do'", "'then'", 
		"'else'", "'for'", "'while'", "'case'", "'repeat'", "'until'", "'read'", 
		"'write'", "'integer'", "'real'", "'boolean'", "'string'", "'inc'", "'dec'", 
		"'sin'", "'cos'", "'tan'", "'atan'", "'sqrt'", "'power'", "'exp'", "'ln'", 
		"'length'", "'concat'", "'delete'", "'copy'", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "OTHER"
	};
	public static final String[] ruleNames = {
		"DOT", "COM", "COL", "SCOL", "ASSIGN", "OPAR", "CPAR", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "OR", "XOR", 
		"AND", "NOT", "SHL", "SHR", "PROG", "BEGIN", "END", "VAR", "TRUE", "FALSE", 
		"NIL", "IF", "OF", "TO", "DO", "THEN", "ELSE", "FOR", "WHILE", "CASE", 
		"REPEAT", "UNTIL", "READ", "WRITE", "T_INT", "T_REAL", "T_BOOL", "T_STR", 
		"FN_INC", "FN_DEC", "FN_SIN", "FN_COS", "FN_TAN", "FN_ATAN", "FN_SQRT", 
		"FN_POW", "FN_EXP", "FN_LN", "FN_LEN", "FN_CNCT", "FN_DEL", "FN_CPY", 
		"ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
	};


	public SimplePascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimplePascal.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 66: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 67: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2G\u01d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3"+
		"9\39\39\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\7@\u0192\n@\f@\16@\u0195\13"+
		"@\3A\6A\u0198\nA\rA\16A\u0199\3B\6B\u019d\nB\rB\16B\u019e\3B\3B\7B\u01a3"+
		"\nB\fB\16B\u01a6\13B\3B\3B\6B\u01aa\nB\rB\16B\u01ab\5B\u01ae\nB\3C\3C"+
		"\7C\u01b2\nC\fC\16C\u01b5\13C\3C\3C\3D\3D\3D\3D\7D\u01bd\nD\fD\16D\u01c0"+
		"\13D\3D\5D\u01c3\nD\3D\3D\3D\7D\u01c8\nD\fD\16D\u01cb\13D\3D\5D\u01ce"+
		"\nD\3D\3D\3E\3E\3E\3E\3F\3F\4\u01b3\u01c9G\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O"+
		")\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1"+
		"k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085"+
		"D\1\u0087E\2\u0089F\3\u008bG\1\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u01e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091"+
		"\3\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0098\3\2\2\2\17\u009a\3\2"+
		"\2\2\21\u009c\3\2\2\2\23\u009e\3\2\2\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2"+
		"\2\31\u00a4\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00ab\3\2\2\2"+
		"!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b2\3\2\2\2\'\u00b5\3\2\2\2)\u00b8\3"+
		"\2\2\2+\u00bc\3\2\2\2-\u00c0\3\2\2\2/\u00c4\3\2\2\2\61\u00c8\3\2\2\2\63"+
		"\u00cc\3\2\2\2\65\u00d4\3\2\2\2\67\u00da\3\2\2\29\u00de\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00e7\3\2\2\2?\u00ed\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00fa\3\2\2\2I\u00fd\3\2\2\2K\u0102\3\2\2\2M\u0107\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u0111\3\2\2\2S\u0116\3\2\2\2U\u011d\3\2\2\2W\u0123"+
		"\3\2\2\2Y\u0128\3\2\2\2[\u012e\3\2\2\2]\u0136\3\2\2\2_\u013b\3\2\2\2a"+
		"\u0143\3\2\2\2c\u014a\3\2\2\2e\u014e\3\2\2\2g\u0152\3\2\2\2i\u0156\3\2"+
		"\2\2k\u015a\3\2\2\2m\u015e\3\2\2\2o\u0163\3\2\2\2q\u0168\3\2\2\2s\u016e"+
		"\3\2\2\2u\u0172\3\2\2\2w\u0175\3\2\2\2y\u017c\3\2\2\2{\u0183\3\2\2\2}"+
		"\u018a\3\2\2\2\177\u018f\3\2\2\2\u0081\u0197\3\2\2\2\u0083\u01ad\3\2\2"+
		"\2\u0085\u01af\3\2\2\2\u0087\u01cd\3\2\2\2\u0089\u01d1\3\2\2\2\u008b\u01d5"+
		"\3\2\2\2\u008d\u008e\7\60\2\2\u008e\4\3\2\2\2\u008f\u0090\7.\2\2\u0090"+
		"\6\3\2\2\2\u0091\u0092\7<\2\2\u0092\b\3\2\2\2\u0093\u0094\7=\2\2\u0094"+
		"\n\3\2\2\2\u0095\u0096\7<\2\2\u0096\u0097\7?\2\2\u0097\f\3\2\2\2\u0098"+
		"\u0099\7*\2\2\u0099\16\3\2\2\2\u009a\u009b\7+\2\2\u009b\20\3\2\2\2\u009c"+
		"\u009d\7-\2\2\u009d\22\3\2\2\2\u009e\u009f\7/\2\2\u009f\24\3\2\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\30\3\2\2\2\u00a4"+
		"\u00a5\7\'\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\34\3\2\2\2\u00a8"+
		"\u00a9\7>\2\2\u00a9\u00aa\7@\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac"+
		" \3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7@\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		"&\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7(\3\2\2\2\u00b8\u00b9"+
		"\7z\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb*\3\2\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7f\2\2\u00bf,\3\2\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7v\2\2\u00c3.\3\2\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7n\2\2\u00c7\60\3\2\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7t\2\2\u00cb\62\3\2\2\2\u00cc\u00cd"+
		"\7r\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7i\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7o\2\2\u00d3\64\3\2\2\2\u00d4"+
		"\u00d5\7d\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8\7k\2\2"+
		"\u00d8\u00d9\7p\2\2\u00d9\66\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7"+
		"p\2\2\u00dc\u00dd\7f\2\2\u00dd8\3\2\2\2\u00de\u00df\7x\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7t\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7g\2\2\u00e6<\3\2\2\2\u00e7\u00e8"+
		"\7h\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec>\3\2\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3"+
		"B\3\2\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7h\2\2\u00f6D\3\2\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7q\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7p\2\2\u0101J\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104"+
		"\7n\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106L\3\2\2\2\u0107\u0108"+
		"\7h\2\2\u0108\u0109\7q\2\2\u0109\u010a\7t\2\2\u010aN\3\2\2\2\u010b\u010c"+
		"\7y\2\2\u010c\u010d\7j\2\2\u010d\u010e\7k\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0110\7g\2\2\u0110P\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7c\2\2\u0113"+
		"\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115R\3\2\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7g\2\2\u0118\u0119\7r\2\2\u0119\u011a\7g\2\2\u011a\u011b\7c\2\2"+
		"\u011b\u011c\7v\2\2\u011cT\3\2\2\2\u011d\u011e\7w\2\2\u011e\u011f\7p\2"+
		"\2\u011f\u0120\7v\2\2\u0120\u0121\7k\2\2\u0121\u0122\7n\2\2\u0122V\3\2"+
		"\2\2\u0123\u0124\7t\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126\u0127"+
		"\7f\2\2\u0127X\3\2\2\2\u0128\u0129\7y\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7k\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2\u012dZ\3\2\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7i\2\2\u0133\u0134\7g\2\2\u0134\u0135\7t\2\2\u0135\\\3\2\2\2\u0136"+
		"\u0137\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139\7c\2\2\u0139\u013a\7n\2\2"+
		"\u013a^\3\2\2\2\u013b\u013c\7d\2\2\u013c\u013d\7q\2\2\u013d\u013e\7q\2"+
		"\2\u013e\u013f\7n\2\2\u013f\u0140\7g\2\2\u0140\u0141\7c\2\2\u0141\u0142"+
		"\7p\2\2\u0142`\3\2\2\2\u0143\u0144\7u\2\2\u0144\u0145\7v\2\2\u0145\u0146"+
		"\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u0149\7i\2\2\u0149"+
		"b\3\2\2\2\u014a\u014b\7k\2\2\u014b\u014c\7p\2\2\u014c\u014d\7e\2\2\u014d"+
		"d\3\2\2\2\u014e\u014f\7f\2\2\u014f\u0150\7g\2\2\u0150\u0151\7e\2\2\u0151"+
		"f\3\2\2\2\u0152\u0153\7u\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155"+
		"h\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158\7q\2\2\u0158\u0159\7u\2\2\u0159"+
		"j\3\2\2\2\u015a\u015b\7v\2\2\u015b\u015c\7c\2\2\u015c\u015d\7p\2\2\u015d"+
		"l\3\2\2\2\u015e\u015f\7c\2\2\u015f\u0160\7v\2\2\u0160\u0161\7c\2\2\u0161"+
		"\u0162\7p\2\2\u0162n\3\2\2\2\u0163\u0164\7u\2\2\u0164\u0165\7s\2\2\u0165"+
		"\u0166\7t\2\2\u0166\u0167\7v\2\2\u0167p\3\2\2\2\u0168\u0169\7r\2\2\u0169"+
		"\u016a\7q\2\2\u016a\u016b\7y\2\2\u016b\u016c\7g\2\2\u016c\u016d\7t\2\2"+
		"\u016dr\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170\7z\2\2\u0170\u0171\7r\2"+
		"\2\u0171t\3\2\2\2\u0172\u0173\7n\2\2\u0173\u0174\7p\2\2\u0174v\3\2\2\2"+
		"\u0175\u0176\7n\2\2\u0176\u0177\7g\2\2\u0177\u0178\7p\2\2\u0178\u0179"+
		"\7i\2\2\u0179\u017a\7v\2\2\u017a\u017b\7j\2\2\u017bx\3\2\2\2\u017c\u017d"+
		"\7e\2\2\u017d\u017e\7q\2\2\u017e\u017f\7p\2\2\u017f\u0180\7e\2\2\u0180"+
		"\u0181\7c\2\2\u0181\u0182\7v\2\2\u0182z\3\2\2\2\u0183\u0184\7f\2\2\u0184"+
		"\u0185\7g\2\2\u0185\u0186\7n\2\2\u0186\u0187\7g\2\2\u0187\u0188\7v\2\2"+
		"\u0188\u0189\7g\2\2\u0189|\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7q\2"+
		"\2\u018c\u018d\7r\2\2\u018d\u018e\7{\2\2\u018e~\3\2\2\2\u018f\u0193\t"+
		"\2\2\2\u0190\u0192\t\3\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0080\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0198\t\4\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0082\3\2\2\2\u019b\u019d\t\4"+
		"\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\7\60\2\2\u01a1\u01a3\t"+
		"\4\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01ae\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\7\60"+
		"\2\2\u01a8\u01aa\t\4\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u019c\3\2"+
		"\2\2\u01ad\u01a7\3\2\2\2\u01ae\u0084\3\2\2\2\u01af\u01b3\7)\2\2\u01b0"+
		"\u01b2\13\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b4\3"+
		"\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b7\7)\2\2\u01b7\u0086\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01ba\7\61"+
		"\2\2\u01ba\u01be\3\2\2\2\u01bb\u01bd\n\5\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c3\7\17\2\2\u01c2\u01c1\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01ce\7\f\2\2\u01c5\u01c9\7}"+
		"\2\2\u01c6\u01c8\13\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cc\u01ce\7\177\2\2\u01cd\u01b8\3\2\2\2\u01cd\u01c5\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\bD\2\2\u01d0\u0088\3\2\2\2\u01d1\u01d2\t\6"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\bE\3\2\u01d4\u008a\3\2\2\2\u01d5"+
		"\u01d6\13\2\2\2\u01d6\u008c\3\2\2\2\16\2\u0193\u0199\u019e\u01a4\u01ab"+
		"\u01ad\u01b3\u01be\u01c2\u01c9\u01cd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}