// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g 2013-11-10 14:18:20

  package lang.simplePascal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimplePascalLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
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
	public static final int WHILE=17;
	public static final int WHITESPACE=18;

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

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:14:7: ( 'do' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:14:9: 'do'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:15:7: ( 'else' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:15:9: 'else'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:16:7: ( 'end' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:16:9: 'end'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:17:7: ( 'end.' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:17:9: 'end.'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:18:7: ( 'program' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:18:9: 'program'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:19:7: ( 'return' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:19:9: 'return'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:20:7: ( 'then' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:20:9: 'then'
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
	// $ANTLR end "T__28"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:87:17: ( ( '0' .. '9' ) )
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:90:6: ( '+' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:90:8: '+'
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:91:7: ( '-' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:91:9: '-'
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:6: ( '*' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:8: '*'
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:93:5: ( '\\\\' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:93:7: '\\\\'
			{
			match('\\'); 
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:94:5: ( 'mod' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:94:7: 'mod'
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

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:96:8: ( ':=' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:96:10: ':='
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:97:4: ( 'if' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:97:6: 'if'
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:98:7: ( 'while' )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:98:9: 'while'
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:100:9: ( ( DIGIT )+ )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:100:11: ( DIGIT )+
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:100:11: ( DIGIT )+
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:101:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:101:10: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:101:17: ( LETTER | DIGIT )*
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
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:103:13: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:103:15: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )*
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:103:15: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )*
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
		// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | PLUS | MINUS | MULT | DIV | MOD | ASSIGN | IF | WHILE | INTEGER | IDENT | WHITESPACE )
		int alt4=21;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case ';':
			{
			alt4=3;
			}
			break;
		case 'd':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='o') ) {
				int LA4_20 = input.LA(3);
				if ( ((LA4_20 >= '0' && LA4_20 <= '9')||(LA4_20 >= 'A' && LA4_20 <= 'Z')||(LA4_20 >= 'a' && LA4_20 <= 'z')) ) {
					alt4=20;
				}

				else {
					alt4=4;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 'e':
			{
			switch ( input.LA(2) ) {
			case 'l':
				{
				int LA4_21 = input.LA(3);
				if ( (LA4_21=='s') ) {
					int LA4_30 = input.LA(4);
					if ( (LA4_30=='e') ) {
						int LA4_38 = input.LA(5);
						if ( ((LA4_38 >= '0' && LA4_38 <= '9')||(LA4_38 >= 'A' && LA4_38 <= 'Z')||(LA4_38 >= 'a' && LA4_38 <= 'z')) ) {
							alt4=20;
						}

						else {
							alt4=5;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

				}
				break;
			case 'n':
				{
				int LA4_22 = input.LA(3);
				if ( (LA4_22=='d') ) {
					switch ( input.LA(4) ) {
					case '.':
						{
						alt4=7;
						}
						break;
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
					case 'A':
					case 'B':
					case 'C':
					case 'D':
					case 'E':
					case 'F':
					case 'G':
					case 'H':
					case 'I':
					case 'J':
					case 'K':
					case 'L':
					case 'M':
					case 'N':
					case 'O':
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
					case 'T':
					case 'U':
					case 'V':
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
					case 'a':
					case 'b':
					case 'c':
					case 'd':
					case 'e':
					case 'f':
					case 'g':
					case 'h':
					case 'i':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'n':
					case 'o':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'u':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						{
						alt4=20;
						}
						break;
					default:
						alt4=6;
					}
				}

				else {
					alt4=20;
				}

				}
				break;
			default:
				alt4=20;
			}
			}
			break;
		case 'p':
			{
			int LA4_6 = input.LA(2);
			if ( (LA4_6=='r') ) {
				int LA4_23 = input.LA(3);
				if ( (LA4_23=='o') ) {
					int LA4_32 = input.LA(4);
					if ( (LA4_32=='g') ) {
						int LA4_41 = input.LA(5);
						if ( (LA4_41=='r') ) {
							int LA4_47 = input.LA(6);
							if ( (LA4_47=='a') ) {
								int LA4_51 = input.LA(7);
								if ( (LA4_51=='m') ) {
									int LA4_54 = input.LA(8);
									if ( ((LA4_54 >= '0' && LA4_54 <= '9')||(LA4_54 >= 'A' && LA4_54 <= 'Z')||(LA4_54 >= 'a' && LA4_54 <= 'z')) ) {
										alt4=20;
									}

									else {
										alt4=8;
									}

								}

								else {
									alt4=20;
								}

							}

							else {
								alt4=20;
							}

						}

						else {
							alt4=20;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 'r':
			{
			int LA4_7 = input.LA(2);
			if ( (LA4_7=='e') ) {
				int LA4_24 = input.LA(3);
				if ( (LA4_24=='t') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='u') ) {
						int LA4_42 = input.LA(5);
						if ( (LA4_42=='r') ) {
							int LA4_48 = input.LA(6);
							if ( (LA4_48=='n') ) {
								int LA4_52 = input.LA(7);
								if ( ((LA4_52 >= '0' && LA4_52 <= '9')||(LA4_52 >= 'A' && LA4_52 <= 'Z')||(LA4_52 >= 'a' && LA4_52 <= 'z')) ) {
									alt4=20;
								}

								else {
									alt4=9;
								}

							}

							else {
								alt4=20;
							}

						}

						else {
							alt4=20;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 't':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='h') ) {
				int LA4_25 = input.LA(3);
				if ( (LA4_25=='e') ) {
					int LA4_34 = input.LA(4);
					if ( (LA4_34=='n') ) {
						int LA4_43 = input.LA(5);
						if ( ((LA4_43 >= '0' && LA4_43 <= '9')||(LA4_43 >= 'A' && LA4_43 <= 'Z')||(LA4_43 >= 'a' && LA4_43 <= 'z')) ) {
							alt4=20;
						}

						else {
							alt4=10;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case '+':
			{
			alt4=11;
			}
			break;
		case '-':
			{
			alt4=12;
			}
			break;
		case '*':
			{
			alt4=13;
			}
			break;
		case '\\':
			{
			alt4=14;
			}
			break;
		case 'm':
			{
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='o') ) {
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='d') ) {
					int LA4_35 = input.LA(4);
					if ( ((LA4_35 >= '0' && LA4_35 <= '9')||(LA4_35 >= 'A' && LA4_35 <= 'Z')||(LA4_35 >= 'a' && LA4_35 <= 'z')) ) {
						alt4=20;
					}

					else {
						alt4=15;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case ':':
			{
			alt4=16;
			}
			break;
		case 'i':
			{
			int LA4_15 = input.LA(2);
			if ( (LA4_15=='f') ) {
				int LA4_27 = input.LA(3);
				if ( ((LA4_27 >= '0' && LA4_27 <= '9')||(LA4_27 >= 'A' && LA4_27 <= 'Z')||(LA4_27 >= 'a' && LA4_27 <= 'z')) ) {
					alt4=20;
				}

				else {
					alt4=17;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case 'w':
			{
			int LA4_16 = input.LA(2);
			if ( (LA4_16=='h') ) {
				int LA4_28 = input.LA(3);
				if ( (LA4_28=='i') ) {
					int LA4_37 = input.LA(4);
					if ( (LA4_37=='l') ) {
						int LA4_45 = input.LA(5);
						if ( (LA4_45=='e') ) {
							int LA4_50 = input.LA(6);
							if ( ((LA4_50 >= '0' && LA4_50 <= '9')||(LA4_50 >= 'A' && LA4_50 <= 'Z')||(LA4_50 >= 'a' && LA4_50 <= 'z')) ) {
								alt4=20;
							}

							else {
								alt4=18;
							}

						}

						else {
							alt4=20;
						}

					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=20;
				}

			}

			else {
				alt4=20;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=19;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'n':
		case 'o':
		case 'q':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=20;
			}
			break;
		default:
			alt4=21;
		}
		switch (alt4) {
			case 1 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:70: PLUS
				{
				mPLUS(); 

				}
				break;
			case 12 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:75: MINUS
				{
				mMINUS(); 

				}
				break;
			case 13 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:81: MULT
				{
				mMULT(); 

				}
				break;
			case 14 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:86: DIV
				{
				mDIV(); 

				}
				break;
			case 15 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:90: MOD
				{
				mMOD(); 

				}
				break;
			case 16 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:94: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 17 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:101: IF
				{
				mIF(); 

				}
				break;
			case 18 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:104: WHILE
				{
				mWHILE(); 

				}
				break;
			case 19 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:110: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 20 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:118: IDENT
				{
				mIDENT(); 

				}
				break;
			case 21 :
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:1:124: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}



}
