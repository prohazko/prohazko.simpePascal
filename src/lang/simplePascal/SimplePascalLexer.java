// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g 2013-11-10 15:07:56

  package lang.simplePascal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimplePascalLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int ASSIGN=4;
	public static final int BLOCK=5;
	public static final int DIGIT=6;
	public static final int DIV=7;
	public static final int IDENT=8;
	public static final int IF=9;
	public static final int INTEGER=10;
	public static final int LETTER=11;
	public static final int MINUS=12;
	public static final int MOD=13;
	public static final int MULT=14;
	public static final int NEGATION=15;
	public static final int PLUS=16;
	public static final int POW=17;
	public static final int PRINT=18;
	public static final int WHILE=19;
	public static final int WHITESPACE=20;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SimplePascalLexer() {} 
	public SimplePascalLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SimplePascalLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g"; }

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:11:7: ( '(' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:12:7: ( ')' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:13:7: ( ';' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:13:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:14:7: ( 'begin' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:14:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:15:7: ( 'do' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:15:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:16:7: ( 'else' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:16:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:17:7: ( 'end' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:17:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:18:7: ( 'end.' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:18:9: 'end.'
			{
			match("end."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:19:7: ( 'program' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:19:9: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:20:7: ( 'return' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:20:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:21:7: ( 'then' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:21:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:22:7: ( 'var' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:22:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:99:17: ( ( '0' .. '9' ) )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:100:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:102:6: ( '+' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:102:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:103:7: ( '-' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:103:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:104:6: ( '*' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:104:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:105:5: ( 'div' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:105:7: 'div'
			{
			match("div"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:106:5: ( 'mod' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:106:7: 'mod'
			{
			match("mod"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "POW"
	public final void mPOW() throws RecognitionException {
		try {
			int _type = POW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:107:5: ( 'pow' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:107:7: 'pow'
			{
			match("pow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POW"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:109:8: ( ':=' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:109:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:110:4: ( 'if' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:110:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:111:7: ( 'while' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:111:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:112:7: ( 'print' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:112:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:114:9: ( ( DIGIT )+ )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:114:11: ( DIGIT )+
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:114:11: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:115:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:115:10: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:115:17: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:117:13: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:117:15: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )*
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:117:15: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | PLUS | MINUS | MULT | DIV | MOD | POW | ASSIGN | IF | WHILE | PRINT | INTEGER | IDENT | WHITESPACE )
		int alt4=25;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:10: T__21
				{
				mT__21(); 

				}
				break;
			case 2 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:16: T__22
				{
				mT__22(); 

				}
				break;
			case 3 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:22: T__23
				{
				mT__23(); 

				}
				break;
			case 4 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:28: T__24
				{
				mT__24(); 

				}
				break;
			case 5 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:34: T__25
				{
				mT__25(); 

				}
				break;
			case 6 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:40: T__26
				{
				mT__26(); 

				}
				break;
			case 7 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:46: T__27
				{
				mT__27(); 

				}
				break;
			case 8 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:52: T__28
				{
				mT__28(); 

				}
				break;
			case 9 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:58: T__29
				{
				mT__29(); 

				}
				break;
			case 10 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:64: T__30
				{
				mT__30(); 

				}
				break;
			case 11 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:70: T__31
				{
				mT__31(); 

				}
				break;
			case 12 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:76: T__32
				{
				mT__32(); 

				}
				break;
			case 13 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:82: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:87: MINUS
				{
				mMINUS(); 

				}
				break;
			case 15 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:93: MULT
				{
				mMULT(); 

				}
				break;
			case 16 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:98: DIV
				{
				mDIV(); 

				}
				break;
			case 17 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:102: MOD
				{
				mMOD(); 

				}
				break;
			case 18 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:106: POW
				{
				mPOW(); 

				}
				break;
			case 19 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:110: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 20 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:117: IF
				{
				mIF(); 

				}
				break;
			case 21 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:120: WHILE
				{
				mWHILE(); 

				}
				break;
			case 22 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:126: PRINT
				{
				mPRINT(); 

				}
				break;
			case 23 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:132: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 24 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:140: IDENT
				{
				mIDENT(); 

				}
				break;
			case 25 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:146: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\24\3\uffff\7\23\3\uffff\1\23\1\uffff\2\23\3\uffff\1\23\1\43\11\23\1"+
		"\56\2\23\1\uffff\1\61\1\23\1\64\2\23\1\67\2\23\1\72\1\73\1\uffff\2\23"+
		"\1\uffff\1\76\2\uffff\2\23\1\uffff\1\23\1\102\2\uffff\1\23\1\104\1\uffff"+
		"\1\23\1\106\1\23\1\uffff\1\110\1\uffff\1\23\1\uffff\1\112\1\uffff\1\113"+
		"\2\uffff";
	static final String DFA4_eofS =
		"\114\uffff";
	static final String DFA4_minS =
		"\1\50\3\uffff\1\145\1\151\1\154\1\157\1\145\1\150\1\141\3\uffff\1\157"+
		"\1\uffff\1\146\1\150\3\uffff\1\147\1\60\1\166\1\163\1\144\1\151\1\167"+
		"\1\164\1\145\1\162\1\144\1\60\2\151\1\uffff\1\60\1\145\1\56\1\147\1\156"+
		"\1\60\1\165\1\156\2\60\1\uffff\1\154\1\156\1\uffff\1\60\2\uffff\1\162"+
		"\1\164\1\uffff\1\162\1\60\2\uffff\1\145\1\60\1\uffff\1\141\1\60\1\156"+
		"\1\uffff\1\60\1\uffff\1\155\1\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA4_maxS =
		"\1\172\3\uffff\1\145\1\157\1\156\1\162\1\145\1\150\1\141\3\uffff\1\157"+
		"\1\uffff\1\146\1\150\3\uffff\1\147\1\172\1\166\1\163\1\144\1\157\1\167"+
		"\1\164\1\145\1\162\1\144\1\172\2\151\1\uffff\1\172\1\145\1\172\1\147\1"+
		"\156\1\172\1\165\1\156\2\172\1\uffff\1\154\1\156\1\uffff\1\172\2\uffff"+
		"\1\162\1\164\1\uffff\1\162\1\172\2\uffff\1\145\1\172\1\uffff\1\141\1\172"+
		"\1\156\1\uffff\1\172\1\uffff\1\155\1\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\7\uffff\1\15\1\16\1\17\1\uffff\1\23\2\uffff\1\27"+
		"\1\30\1\31\16\uffff\1\5\12\uffff\1\24\2\uffff\1\20\1\uffff\1\10\1\7\2"+
		"\uffff\1\22\2\uffff\1\14\1\21\2\uffff\1\6\3\uffff\1\13\1\uffff\1\4\1\uffff"+
		"\1\26\1\uffff\1\25\1\uffff\1\12\1\11";
	static final String DFA4_specialS =
		"\114\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\1\1\2\1\15\1\13\1\uffff\1\14\2\uffff\12\22\1\17\1\3\5\uffff\32\23"+
			"\6\uffff\1\23\1\4\1\23\1\5\1\6\3\23\1\20\3\23\1\16\2\23\1\7\1\23\1\10"+
			"\1\23\1\11\1\23\1\12\1\21\3\23",
			"",
			"",
			"",
			"\1\25",
			"\1\27\5\uffff\1\26",
			"\1\30\1\uffff\1\31",
			"\1\33\2\uffff\1\32",
			"\1\34",
			"\1\35",
			"\1\36",
			"",
			"",
			"",
			"\1\37",
			"",
			"\1\40",
			"\1\41",
			"",
			"",
			"",
			"\1\42",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\50\5\uffff\1\47",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"\1\57",
			"\1\60",
			"",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"\1\62",
			"\1\63\1\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
			"\1\65",
			"\1\66",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"\1\70",
			"\1\71",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			"\1\74",
			"\1\75",
			"",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"\1\77",
			"\1\100",
			"",
			"\1\101",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"\1\103",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			"\1\105",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"\1\107",
			"",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			"\1\111",
			"",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			"\12\23\7\uffff\32\23\6\uffff\32\23",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | PLUS | MINUS | MULT | DIV | MOD | POW | ASSIGN | IF | WHILE | PRINT | INTEGER | IDENT | WHITESPACE );";
		}
	}

}
