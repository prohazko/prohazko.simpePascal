// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\SimplePascal.g 2013-11-10 13:34:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SimplePascalLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
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
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int CHAR_LITERAL=4;
	public static final int COMMENT=5;
	public static final int DIGIT=6;
	public static final int IDENT=7;
	public static final int INTEGER=8;
	public static final int LETTER=9;
	public static final int MULTILINE_COMMENT=10;
	public static final int STRING_LITERAL=11;
	public static final int WS=12;

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
	@Override public String getGrammarFileName() { return "D:\\univer\\simplePascal\\src\\SimplePascal.g"; }

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:7:7: ( '(' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:7:9: '('
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:8:7: ( ')' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:8:9: ')'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:9:7: ( '*' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:9:9: '*'
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:10:7: ( '+' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:10:9: '+'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:11:7: ( '-' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:11:9: '-'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:12:7: ( '/' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:13:7: ( '/=' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:13:9: '/='
			{
			match("/="); 

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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:14:7: ( ':=' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:14:9: ':='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:15:7: ( ';' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:15:9: ';'
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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:16:7: ( '<' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:16:9: '<'
			{
			match('<'); 
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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:17:7: ( '<=' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:17:9: '<='
			{
			match("<="); 

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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:18:7: ( '=' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:18:9: '='
			{
			match('='); 
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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:19:7: ( '>' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:19:9: '>'
			{
			match('>'); 
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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:20:7: ( '>=' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:20:9: '>='
			{
			match(">="); 

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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:7: ( 'and' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:9: 'and'
			{
			match("and"); 

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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:22:7: ( 'begin' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:22:9: 'begin'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:7: ( 'else' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:9: 'else'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:24:7: ( 'elsif' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:24:9: 'elsif'
			{
			match("elsif"); 

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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:25:7: ( 'end' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:25:9: 'end'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:26:7: ( 'end.' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:26:9: 'end.'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:27:7: ( 'if' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:27:9: 'if'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:28:7: ( 'loop' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:28:9: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:29:7: ( 'mod' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:29:9: 'mod'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:30:7: ( 'or' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:30:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:31:7: ( 'program' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:31:9: 'program'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:32:7: ( 'return' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:32:9: 'return'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:33:7: ( 'then' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:33:9: 'then'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:34:7: ( 'var' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:34:9: 'var'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:35:7: ( 'while' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:35:9: 'while'
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
	// $ANTLR end "T__41"

	// $ANTLR start "MULTILINE_COMMENT"
	public final void mMULTILINE_COMMENT() throws RecognitionException {
		try {
			int _type = MULTILINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:84:19: ( '/*' ( . )* '*/' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:84:21: '/*' ( . )* '*/'
			{
			match("/*"); 

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:84:26: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='*') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='/') ) {
						alt1=2;
					}
					else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:84:26: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match("*/"); 

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTILINE_COMMENT"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:87:2: ( '\"' ( '\"' '\"' |c=~ ( '\"' | '\\r' | '\\n' ) )* '\"' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:87:4: '\"' ( '\"' '\"' |c=~ ( '\"' | '\\r' | '\\n' ) )* '\"'
			{
			match('\"'); 
			 StringBuilder b = new StringBuilder(); 
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:89:3: ( '\"' '\"' |c=~ ( '\"' | '\\r' | '\\n' ) )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\"') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='\"') ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:89:5: '\"' '\"'
					{
					match('\"'); 
					match('\"'); 
					 b.appendCodePoint('"');
					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:90:5: c=~ ( '\"' | '\\r' | '\\n' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c);
					}
					break;

				default :
					break loop2;
				}
			}

			match('\"'); 
			 setText(b.toString()); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			int _type = CHAR_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:97:2: ( '\\'' . '\\'' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:97:4: '\\'' . '\\''
			{
			match('\''); 
			matchAny(); 
			match('\''); 
			setText(getText().substring(1,2));
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:100:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:101:16: ( '0' .. '9' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:102:9: ( ( DIGIT )+ )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:102:11: ( DIGIT )+
			{
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:102:11: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:103:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:103:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:103:16: ( LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:
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
					break loop4;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:104:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:104:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:104:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:105:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:105:11: '//' ( . )* ( '\\n' | '\\r' )
			{
			match("//"); 

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:105:16: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\n'||LA6_0=='\r') ) {
					alt6=2;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:105:16: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | MULTILINE_COMMENT | STRING_LITERAL | CHAR_LITERAL | INTEGER | IDENT | WS | COMMENT )
		int alt7=36;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:10: T__13
				{
				mT__13(); 

				}
				break;
			case 2 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:16: T__14
				{
				mT__14(); 

				}
				break;
			case 3 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:22: T__15
				{
				mT__15(); 

				}
				break;
			case 4 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:28: T__16
				{
				mT__16(); 

				}
				break;
			case 5 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:34: T__17
				{
				mT__17(); 

				}
				break;
			case 6 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:40: T__18
				{
				mT__18(); 

				}
				break;
			case 7 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:46: T__19
				{
				mT__19(); 

				}
				break;
			case 8 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:52: T__20
				{
				mT__20(); 

				}
				break;
			case 9 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:58: T__21
				{
				mT__21(); 

				}
				break;
			case 10 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:64: T__22
				{
				mT__22(); 

				}
				break;
			case 11 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:70: T__23
				{
				mT__23(); 

				}
				break;
			case 12 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:76: T__24
				{
				mT__24(); 

				}
				break;
			case 13 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:82: T__25
				{
				mT__25(); 

				}
				break;
			case 14 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:88: T__26
				{
				mT__26(); 

				}
				break;
			case 15 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:94: T__27
				{
				mT__27(); 

				}
				break;
			case 16 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:100: T__28
				{
				mT__28(); 

				}
				break;
			case 17 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:106: T__29
				{
				mT__29(); 

				}
				break;
			case 18 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:112: T__30
				{
				mT__30(); 

				}
				break;
			case 19 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:118: T__31
				{
				mT__31(); 

				}
				break;
			case 20 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:124: T__32
				{
				mT__32(); 

				}
				break;
			case 21 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:130: T__33
				{
				mT__33(); 

				}
				break;
			case 22 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:136: T__34
				{
				mT__34(); 

				}
				break;
			case 23 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:142: T__35
				{
				mT__35(); 

				}
				break;
			case 24 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:148: T__36
				{
				mT__36(); 

				}
				break;
			case 25 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:154: T__37
				{
				mT__37(); 

				}
				break;
			case 26 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:160: T__38
				{
				mT__38(); 

				}
				break;
			case 27 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:166: T__39
				{
				mT__39(); 

				}
				break;
			case 28 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:172: T__40
				{
				mT__40(); 

				}
				break;
			case 29 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:178: T__41
				{
				mT__41(); 

				}
				break;
			case 30 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:184: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;
			case 31 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:202: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 32 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:217: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 33 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:230: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 34 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:238: IDENT
				{
				mIDENT(); 

				}
				break;
			case 35 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:244: WS
				{
				mWS(); 

				}
				break;
			case 36 :
				// D:\\univer\\simplePascal\\src\\SimplePascal.g:1:247: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\6\uffff\1\40\2\uffff\1\42\1\uffff\1\44\14\33\15\uffff\4\33\1\66\2\33"+
		"\1\71\5\33\1\77\2\33\1\104\1\uffff\1\33\1\106\1\uffff\3\33\1\112\1\33"+
		"\1\uffff\1\33\1\115\1\33\2\uffff\1\117\1\uffff\2\33\1\122\1\uffff\1\33"+
		"\1\124\1\uffff\1\125\1\uffff\2\33\1\uffff\1\130\2\uffff\1\33\1\132\1\uffff"+
		"\1\133\2\uffff";
	static final String DFA7_eofS =
		"\134\uffff";
	static final String DFA7_minS =
		"\1\11\5\uffff\1\52\2\uffff\1\75\1\uffff\1\75\1\156\1\145\1\154\1\146\2"+
		"\157\2\162\1\145\1\150\1\141\1\150\15\uffff\1\144\1\147\1\163\1\144\1"+
		"\60\1\157\1\144\1\60\1\157\1\164\1\145\1\162\1\151\1\60\1\151\1\145\1"+
		"\56\1\uffff\1\160\1\60\1\uffff\1\147\1\165\1\156\1\60\1\154\1\uffff\1"+
		"\156\1\60\1\146\2\uffff\1\60\1\uffff\2\162\1\60\1\uffff\1\145\1\60\1\uffff"+
		"\1\60\1\uffff\1\141\1\156\1\uffff\1\60\2\uffff\1\155\1\60\1\uffff\1\60"+
		"\2\uffff";
	static final String DFA7_maxS =
		"\1\172\5\uffff\1\75\2\uffff\1\75\1\uffff\1\75\1\156\1\145\1\156\1\146"+
		"\2\157\2\162\1\145\1\150\1\141\1\150\15\uffff\1\144\1\147\1\163\1\144"+
		"\1\172\1\157\1\144\1\172\1\157\1\164\1\145\1\162\1\151\1\172\2\151\1\172"+
		"\1\uffff\1\160\1\172\1\uffff\1\147\1\165\1\156\1\172\1\154\1\uffff\1\156"+
		"\1\172\1\146\2\uffff\1\172\1\uffff\2\162\1\172\1\uffff\1\145\1\172\1\uffff"+
		"\1\172\1\uffff\1\141\1\156\1\uffff\1\172\2\uffff\1\155\1\172\1\uffff\1"+
		"\172\2\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\11\1\uffff\1\14\15\uffff\1"+
		"\37\1\40\1\41\1\42\1\43\1\7\1\36\1\44\1\6\1\13\1\12\1\16\1\15\21\uffff"+
		"\1\25\2\uffff\1\30\5\uffff\1\17\3\uffff\1\24\1\23\1\uffff\1\27\3\uffff"+
		"\1\34\2\uffff\1\21\1\uffff\1\26\2\uffff\1\33\1\uffff\1\20\1\22\2\uffff"+
		"\1\35\1\uffff\1\32\1\31";
	static final String DFA7_specialS =
		"\134\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\34\1\uffff\2\34\22\uffff\1\34\1\uffff\1\30\4\uffff\1\31\1\1\1\2\1"+
			"\3\1\4\1\uffff\1\5\1\uffff\1\6\12\32\1\7\1\10\1\11\1\12\1\13\2\uffff"+
			"\32\33\6\uffff\1\14\1\15\2\33\1\16\3\33\1\17\2\33\1\20\1\21\1\33\1\22"+
			"\1\23\1\33\1\24\1\33\1\25\1\33\1\26\1\27\3\33",
			"",
			"",
			"",
			"",
			"",
			"\1\36\4\uffff\1\37\15\uffff\1\35",
			"",
			"",
			"\1\41",
			"",
			"\1\43",
			"\1\45",
			"\1\46",
			"\1\47\1\uffff\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\67",
			"\1\70",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\100",
			"\1\101\3\uffff\1\102",
			"\1\103\1\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\105",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\113",
			"",
			"\1\114",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\116",
			"",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\120",
			"\1\121",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\123",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\126",
			"\1\127",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"",
			"\1\131",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | MULTILINE_COMMENT | STRING_LITERAL | CHAR_LITERAL | INTEGER | IDENT | WS | COMMENT );";
		}
	}

}
