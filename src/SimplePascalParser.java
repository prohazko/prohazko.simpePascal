// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\SimplePascal.g 2013-11-10 13:34:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SimplePascalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR_LITERAL", "COMMENT", "DIGIT", 
		"IDENT", "INTEGER", "LETTER", "MULTILINE_COMMENT", "STRING_LITERAL", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'", "'/='", "':='", "';'", "'<'", 
		"'<='", "'='", "'>'", "'>='", "'and'", "'begin'", "'else'", "'elsif'", 
		"'end'", "'end.'", "'if'", "'loop'", "'mod'", "'or'", "'program'", "'return'", 
		"'then'", "'var'", "'while'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SimplePascalParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SimplePascalParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return SimplePascalParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\univer\\simplePascal\\src\\SimplePascal.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:10:1: program : 'program' IDENT ( variable )* 'begin' ( statement )* 'end.' ;
	public final SimplePascalParser.program_return program() throws RecognitionException {
		SimplePascalParser.program_return retval = new SimplePascalParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token IDENT2=null;
		Token string_literal4=null;
		Token string_literal6=null;
		ParserRuleReturnScope variable3 =null;
		ParserRuleReturnScope statement5 =null;

		CommonTree string_literal1_tree=null;
		CommonTree IDENT2_tree=null;
		CommonTree string_literal4_tree=null;
		CommonTree string_literal6_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:11:2: ( 'program' IDENT ( variable )* 'begin' ( statement )* 'end.' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:11:4: 'program' IDENT ( variable )* 'begin' ( statement )* 'end.'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal1=(Token)match(input,37,FOLLOW_37_in_program44); 
			string_literal1_tree = (CommonTree)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program46); 
			IDENT2_tree = (CommonTree)adaptor.create(IDENT2);
			adaptor.addChild(root_0, IDENT2_tree);

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:12:3: ( variable )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==40) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:12:4: variable
					{
					pushFollow(FOLLOW_variable_in_program51);
					variable3=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			string_literal4=(Token)match(input,28,FOLLOW_28_in_program57); 
			string_literal4_tree = (CommonTree)adaptor.create(string_literal4);
			adaptor.addChild(root_0, string_literal4_tree);

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:14:3: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENT||LA2_0==33||LA2_0==41) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:14:3: statement
					{
					pushFollow(FOLLOW_statement_in_program61);
					statement5=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement5.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			string_literal6=(Token)match(input,32,FOLLOW_32_in_program66); 
			string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
			adaptor.addChild(root_0, string_literal6_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:19:1: variable : 'var' IDENT ( ':=' expression )? ';' ;
	public final SimplePascalParser.variable_return variable() throws RecognitionException {
		SimplePascalParser.variable_return retval = new SimplePascalParser.variable_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal7=null;
		Token IDENT8=null;
		Token string_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope expression10 =null;

		CommonTree string_literal7_tree=null;
		CommonTree IDENT8_tree=null;
		CommonTree string_literal9_tree=null;
		CommonTree char_literal11_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:20:2: ( 'var' IDENT ( ':=' expression )? ';' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:20:4: 'var' IDENT ( ':=' expression )? ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal7=(Token)match(input,40,FOLLOW_40_in_variable78); 
			string_literal7_tree = (CommonTree)adaptor.create(string_literal7);
			adaptor.addChild(root_0, string_literal7_tree);

			IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable80); 
			IDENT8_tree = (CommonTree)adaptor.create(IDENT8);
			adaptor.addChild(root_0, IDENT8_tree);

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:20:16: ( ':=' expression )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==20) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:20:17: ':=' expression
					{
					string_literal9=(Token)match(input,20,FOLLOW_20_in_variable83); 
					string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
					adaptor.addChild(root_0, string_literal9_tree);

					pushFollow(FOLLOW_expression_in_variable85);
					expression10=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression10.getTree());

					}
					break;

			}

			char_literal11=(Token)match(input,21,FOLLOW_21_in_variable89); 
			char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
			adaptor.addChild(root_0, char_literal11_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:1: statement : ( assignmentStatement | ifStatement | whileStatement );
	public final SimplePascalParser.statement_return statement() throws RecognitionException {
		SimplePascalParser.statement_return retval = new SimplePascalParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope assignmentStatement12 =null;
		ParserRuleReturnScope ifStatement13 =null;
		ParserRuleReturnScope whileStatement14 =null;


		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:24:2: ( assignmentStatement | ifStatement | whileStatement )
			int alt4=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt4=1;
				}
				break;
			case 33:
				{
				alt4=2;
				}
				break;
			case 41:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:24:4: assignmentStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignmentStatement_in_statement101);
					assignmentStatement12=assignmentStatement();
					state._fsp--;

					adaptor.addChild(root_0, assignmentStatement12.getTree());

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:25:4: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement106);
					ifStatement13=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement13.getTree());

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:26:4: whileStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement111);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:30:1: ifStatement : 'if' expression 'then' ( statement )+ ( 'elsif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';' ;
	public final SimplePascalParser.ifStatement_return ifStatement() throws RecognitionException {
		SimplePascalParser.ifStatement_return retval = new SimplePascalParser.ifStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15=null;
		Token string_literal17=null;
		Token string_literal19=null;
		Token string_literal21=null;
		Token string_literal23=null;
		Token string_literal25=null;
		Token string_literal26=null;
		Token char_literal27=null;
		ParserRuleReturnScope expression16 =null;
		ParserRuleReturnScope statement18 =null;
		ParserRuleReturnScope expression20 =null;
		ParserRuleReturnScope statement22 =null;
		ParserRuleReturnScope statement24 =null;

		CommonTree string_literal15_tree=null;
		CommonTree string_literal17_tree=null;
		CommonTree string_literal19_tree=null;
		CommonTree string_literal21_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree string_literal25_tree=null;
		CommonTree string_literal26_tree=null;
		CommonTree char_literal27_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:31:2: ( 'if' expression 'then' ( statement )+ ( 'elsif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:31:4: 'if' expression 'then' ( statement )+ ( 'elsif' expression 'then' ( statement )+ )* ( 'else' ( statement )+ )? 'end' 'if' ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal15=(Token)match(input,33,FOLLOW_33_in_ifStatement125); 
			string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
			adaptor.addChild(root_0, string_literal15_tree);

			pushFollow(FOLLOW_expression_in_ifStatement127);
			expression16=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression16.getTree());

			string_literal17=(Token)match(input,39,FOLLOW_39_in_ifStatement129); 
			string_literal17_tree = (CommonTree)adaptor.create(string_literal17);
			adaptor.addChild(root_0, string_literal17_tree);

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:31:27: ( statement )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==IDENT||LA5_0==33||LA5_0==41) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:31:27: statement
					{
					pushFollow(FOLLOW_statement_in_ifStatement131);
					statement18=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement18.getTree());

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:32:3: ( 'elsif' expression 'then' ( statement )+ )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==30) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:32:4: 'elsif' expression 'then' ( statement )+
					{
					string_literal19=(Token)match(input,30,FOLLOW_30_in_ifStatement137); 
					string_literal19_tree = (CommonTree)adaptor.create(string_literal19);
					adaptor.addChild(root_0, string_literal19_tree);

					pushFollow(FOLLOW_expression_in_ifStatement139);
					expression20=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression20.getTree());

					string_literal21=(Token)match(input,39,FOLLOW_39_in_ifStatement141); 
					string_literal21_tree = (CommonTree)adaptor.create(string_literal21);
					adaptor.addChild(root_0, string_literal21_tree);

					// D:\\univer\\simplePascal\\src\\SimplePascal.g:32:30: ( statement )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IDENT||LA6_0==33||LA6_0==41) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\SimplePascal.g:32:30: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement143);
							statement22=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement22.getTree());

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

				default :
					break loop7;
				}
			}

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:33:3: ( 'else' ( statement )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==29) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:33:4: 'else' ( statement )+
					{
					string_literal23=(Token)match(input,29,FOLLOW_29_in_ifStatement151); 
					string_literal23_tree = (CommonTree)adaptor.create(string_literal23);
					adaptor.addChild(root_0, string_literal23_tree);

					// D:\\univer\\simplePascal\\src\\SimplePascal.g:33:11: ( statement )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==IDENT||LA8_0==33||LA8_0==41) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\SimplePascal.g:33:11: statement
							{
							pushFollow(FOLLOW_statement_in_ifStatement153);
							statement24=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement24.getTree());

							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}
					break;

			}

			string_literal25=(Token)match(input,31,FOLLOW_31_in_ifStatement160); 
			string_literal25_tree = (CommonTree)adaptor.create(string_literal25);
			adaptor.addChild(root_0, string_literal25_tree);

			string_literal26=(Token)match(input,33,FOLLOW_33_in_ifStatement162); 
			string_literal26_tree = (CommonTree)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);

			char_literal27=(Token)match(input,21,FOLLOW_21_in_ifStatement164); 
			char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
			adaptor.addChild(root_0, char_literal27_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class assignmentStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignmentStatement"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:37:1: assignmentStatement : IDENT ':=' expression ';' ;
	public final SimplePascalParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
		SimplePascalParser.assignmentStatement_return retval = new SimplePascalParser.assignmentStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT28=null;
		Token string_literal29=null;
		Token char_literal31=null;
		ParserRuleReturnScope expression30 =null;

		CommonTree IDENT28_tree=null;
		CommonTree string_literal29_tree=null;
		CommonTree char_literal31_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:38:2: ( IDENT ':=' expression ';' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:38:4: IDENT ':=' expression ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT28=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignmentStatement176); 
			IDENT28_tree = (CommonTree)adaptor.create(IDENT28);
			adaptor.addChild(root_0, IDENT28_tree);

			string_literal29=(Token)match(input,20,FOLLOW_20_in_assignmentStatement178); 
			string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
			adaptor.addChild(root_0, string_literal29_tree);

			pushFollow(FOLLOW_expression_in_assignmentStatement180);
			expression30=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression30.getTree());

			char_literal31=(Token)match(input,21,FOLLOW_21_in_assignmentStatement182); 
			char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
			adaptor.addChild(root_0, char_literal31_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:41:1: whileStatement : 'while' expression 'loop' ( statement )* 'end' 'while' ';' ;
	public final SimplePascalParser.whileStatement_return whileStatement() throws RecognitionException {
		SimplePascalParser.whileStatement_return retval = new SimplePascalParser.whileStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal32=null;
		Token string_literal34=null;
		Token string_literal36=null;
		Token string_literal37=null;
		Token char_literal38=null;
		ParserRuleReturnScope expression33 =null;
		ParserRuleReturnScope statement35 =null;

		CommonTree string_literal32_tree=null;
		CommonTree string_literal34_tree=null;
		CommonTree string_literal36_tree=null;
		CommonTree string_literal37_tree=null;
		CommonTree char_literal38_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:42:2: ( 'while' expression 'loop' ( statement )* 'end' 'while' ';' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:42:4: 'while' expression 'loop' ( statement )* 'end' 'while' ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal32=(Token)match(input,41,FOLLOW_41_in_whileStatement195); 
			string_literal32_tree = (CommonTree)adaptor.create(string_literal32);
			adaptor.addChild(root_0, string_literal32_tree);

			pushFollow(FOLLOW_expression_in_whileStatement197);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			string_literal34=(Token)match(input,34,FOLLOW_34_in_whileStatement199); 
			string_literal34_tree = (CommonTree)adaptor.create(string_literal34);
			adaptor.addChild(root_0, string_literal34_tree);

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:43:3: ( statement )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENT||LA10_0==33||LA10_0==41) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:43:4: statement
					{
					pushFollow(FOLLOW_statement_in_whileStatement204);
					statement35=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement35.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			string_literal36=(Token)match(input,31,FOLLOW_31_in_whileStatement210); 
			string_literal36_tree = (CommonTree)adaptor.create(string_literal36);
			adaptor.addChild(root_0, string_literal36_tree);

			string_literal37=(Token)match(input,41,FOLLOW_41_in_whileStatement212); 
			string_literal37_tree = (CommonTree)adaptor.create(string_literal37);
			adaptor.addChild(root_0, string_literal37_tree);

			char_literal38=(Token)match(input,21,FOLLOW_21_in_whileStatement214); 
			char_literal38_tree = (CommonTree)adaptor.create(char_literal38);
			adaptor.addChild(root_0, char_literal38_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class returnStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "returnStatement"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:47:1: returnStatement : 'return' expression ';' ;
	public final SimplePascalParser.returnStatement_return returnStatement() throws RecognitionException {
		SimplePascalParser.returnStatement_return retval = new SimplePascalParser.returnStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope expression40 =null;

		CommonTree string_literal39_tree=null;
		CommonTree char_literal41_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:48:2: ( 'return' expression ';' )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:48:4: 'return' expression ';'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal39=(Token)match(input,38,FOLLOW_38_in_returnStatement226); 
			string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
			adaptor.addChild(root_0, string_literal39_tree);

			pushFollow(FOLLOW_expression_in_returnStatement228);
			expression40=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression40.getTree());

			char_literal41=(Token)match(input,21,FOLLOW_21_in_returnStatement230); 
			char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
			adaptor.addChild(root_0, char_literal41_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnStatement"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:54:1: term : ( IDENT | '(' expression ')' | INTEGER | STRING_LITERAL | CHAR_LITERAL );
	public final SimplePascalParser.term_return term() throws RecognitionException {
		SimplePascalParser.term_return retval = new SimplePascalParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT42=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token INTEGER46=null;
		Token STRING_LITERAL47=null;
		Token CHAR_LITERAL48=null;
		ParserRuleReturnScope expression44 =null;

		CommonTree IDENT42_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree char_literal45_tree=null;
		CommonTree INTEGER46_tree=null;
		CommonTree STRING_LITERAL47_tree=null;
		CommonTree CHAR_LITERAL48_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:55:2: ( IDENT | '(' expression ')' | INTEGER | STRING_LITERAL | CHAR_LITERAL )
			int alt11=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt11=1;
				}
				break;
			case 13:
				{
				alt11=2;
				}
				break;
			case INTEGER:
				{
				alt11=3;
				}
				break;
			case STRING_LITERAL:
				{
				alt11=4;
				}
				break;
			case CHAR_LITERAL:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:55:4: IDENT
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENT42=(Token)match(input,IDENT,FOLLOW_IDENT_in_term246); 
					IDENT42_tree = (CommonTree)adaptor.create(IDENT42);
					adaptor.addChild(root_0, IDENT42_tree);

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:56:4: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal43=(Token)match(input,13,FOLLOW_13_in_term251); 
					char_literal43_tree = (CommonTree)adaptor.create(char_literal43);
					adaptor.addChild(root_0, char_literal43_tree);

					pushFollow(FOLLOW_expression_in_term253);
					expression44=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression44.getTree());

					char_literal45=(Token)match(input,14,FOLLOW_14_in_term255); 
					char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
					adaptor.addChild(root_0, char_literal45_tree);

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:57:4: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER46=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term260); 
					INTEGER46_tree = (CommonTree)adaptor.create(INTEGER46);
					adaptor.addChild(root_0, INTEGER46_tree);

					}
					break;
				case 4 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:58:4: STRING_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING_LITERAL47=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_term265); 
					STRING_LITERAL47_tree = (CommonTree)adaptor.create(STRING_LITERAL47);
					adaptor.addChild(root_0, STRING_LITERAL47_tree);

					}
					break;
				case 5 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:59:4: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL48=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_term270); 
					CHAR_LITERAL48_tree = (CommonTree)adaptor.create(CHAR_LITERAL48);
					adaptor.addChild(root_0, CHAR_LITERAL48_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:63:1: unary : ( '+' | '-' )* term ;
	public final SimplePascalParser.unary_return unary() throws RecognitionException {
		SimplePascalParser.unary_return retval = new SimplePascalParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set49=null;
		ParserRuleReturnScope term50 =null;

		CommonTree set49_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:64:2: ( ( '+' | '-' )* term )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:64:4: ( '+' | '-' )* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\univer\\simplePascal\\src\\SimplePascal.g:64:4: ( '+' | '-' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 16 && LA12_0 <= 17)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:
					{
					set49=input.LT(1);
					if ( (input.LA(1) >= 16 && input.LA(1) <= 17) ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(set49));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			pushFollow(FOLLOW_term_in_unary293);
			term50=term();
			state._fsp--;

			adaptor.addChild(root_0, term50.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class mult_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:67:1: mult : unary ( ( '*' | '/' | 'mod' ) unary )* ;
	public final SimplePascalParser.mult_return mult() throws RecognitionException {
		SimplePascalParser.mult_return retval = new SimplePascalParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set52=null;
		ParserRuleReturnScope unary51 =null;
		ParserRuleReturnScope unary53 =null;

		CommonTree set52_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:68:2: ( unary ( ( '*' | '/' | 'mod' ) unary )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:68:4: unary ( ( '*' | '/' | 'mod' ) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult304);
			unary51=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary51.getTree());

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:68:10: ( ( '*' | '/' | 'mod' ) unary )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==15||LA13_0==18||LA13_0==35) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:68:11: ( '*' | '/' | 'mod' ) unary
					{
					set52=input.LT(1);
					if ( input.LA(1)==15||input.LA(1)==18||input.LA(1)==35 ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(set52));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unary_in_mult319);
					unary53=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary53.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class add_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:71:1: add : mult ( ( '+' | '-' ) mult )* ;
	public final SimplePascalParser.add_return add() throws RecognitionException {
		SimplePascalParser.add_return retval = new SimplePascalParser.add_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set55=null;
		ParserRuleReturnScope mult54 =null;
		ParserRuleReturnScope mult56 =null;

		CommonTree set55_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:72:2: ( mult ( ( '+' | '-' ) mult )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:72:4: mult ( ( '+' | '-' ) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add333);
			mult54=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult54.getTree());

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:72:9: ( ( '+' | '-' ) mult )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= 16 && LA14_0 <= 17)) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:72:10: ( '+' | '-' ) mult
					{
					set55=input.LT(1);
					if ( (input.LA(1) >= 16 && input.LA(1) <= 17) ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(set55));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_in_add344);
					mult56=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult56.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add"


	public static class relation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:75:1: relation : add ( ( '=' | '/=' | '<' | '<=' | '>=' | '>' ) add )* ;
	public final SimplePascalParser.relation_return relation() throws RecognitionException {
		SimplePascalParser.relation_return retval = new SimplePascalParser.relation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set58=null;
		ParserRuleReturnScope add57 =null;
		ParserRuleReturnScope add59 =null;

		CommonTree set58_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:76:2: ( add ( ( '=' | '/=' | '<' | '<=' | '>=' | '>' ) add )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:76:4: add ( ( '=' | '/=' | '<' | '<=' | '>=' | '>' ) add )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_add_in_relation357);
			add57=add();
			state._fsp--;

			adaptor.addChild(root_0, add57.getTree());

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:76:8: ( ( '=' | '/=' | '<' | '<=' | '>=' | '>' ) add )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==19||(LA15_0 >= 22 && LA15_0 <= 26)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:76:9: ( '=' | '/=' | '<' | '<=' | '>=' | '>' ) add
					{
					set58=input.LT(1);
					if ( input.LA(1)==19||(input.LA(1) >= 22 && input.LA(1) <= 26) ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(set58));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_add_in_relation384);
					add59=add();
					state._fsp--;

					adaptor.addChild(root_0, add59.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:79:1: expression : relation ( ( 'and' | 'or' ) relation )* ;
	public final SimplePascalParser.expression_return expression() throws RecognitionException {
		SimplePascalParser.expression_return retval = new SimplePascalParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set61=null;
		ParserRuleReturnScope relation60 =null;
		ParserRuleReturnScope relation62 =null;

		CommonTree set61_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:80:2: ( relation ( ( 'and' | 'or' ) relation )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:80:4: relation ( ( 'and' | 'or' ) relation )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relation_in_expression398);
			relation60=relation();
			state._fsp--;

			adaptor.addChild(root_0, relation60.getTree());

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:80:13: ( ( 'and' | 'or' ) relation )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==27||LA16_0==36) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:80:14: ( 'and' | 'or' ) relation
					{
					set61=input.LT(1);
					if ( input.LA(1)==27||input.LA(1)==36 ) {
						input.consume();
						adaptor.addChild(root_0, (CommonTree)adaptor.create(set61));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relation_in_expression409);
					relation62=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation62.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_37_in_program44 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IDENT_in_program46 = new BitSet(new long[]{0x0000010010000000L});
	public static final BitSet FOLLOW_variable_in_program51 = new BitSet(new long[]{0x0000010010000000L});
	public static final BitSet FOLLOW_28_in_program57 = new BitSet(new long[]{0x0000020300000080L});
	public static final BitSet FOLLOW_statement_in_program61 = new BitSet(new long[]{0x0000020300000080L});
	public static final BitSet FOLLOW_32_in_program66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_variable78 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_IDENT_in_variable80 = new BitSet(new long[]{0x0000000000300000L});
	public static final BitSet FOLLOW_20_in_variable83 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_variable85 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_variable89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStatement_in_statement101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_ifStatement125 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_ifStatement127 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_ifStatement129 = new BitSet(new long[]{0x0000020200000080L});
	public static final BitSet FOLLOW_statement_in_ifStatement131 = new BitSet(new long[]{0x00000202E0000080L});
	public static final BitSet FOLLOW_30_in_ifStatement137 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_ifStatement139 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_ifStatement141 = new BitSet(new long[]{0x0000020200000080L});
	public static final BitSet FOLLOW_statement_in_ifStatement143 = new BitSet(new long[]{0x00000202E0000080L});
	public static final BitSet FOLLOW_29_in_ifStatement151 = new BitSet(new long[]{0x0000020200000080L});
	public static final BitSet FOLLOW_statement_in_ifStatement153 = new BitSet(new long[]{0x0000020280000080L});
	public static final BitSet FOLLOW_31_in_ifStatement160 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_ifStatement162 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ifStatement164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignmentStatement176 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignmentStatement178 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement180 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_assignmentStatement182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_whileStatement195 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_whileStatement197 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_whileStatement199 = new BitSet(new long[]{0x0000020280000080L});
	public static final BitSet FOLLOW_statement_in_whileStatement204 = new BitSet(new long[]{0x0000020280000080L});
	public static final BitSet FOLLOW_31_in_whileStatement210 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_whileStatement212 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_whileStatement214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_returnStatement226 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_returnStatement228 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_returnStatement230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_term251 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_expression_in_term253 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_term255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_term265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_term270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_unary293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult304 = new BitSet(new long[]{0x0000000800048002L});
	public static final BitSet FOLLOW_set_in_mult307 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_unary_in_mult319 = new BitSet(new long[]{0x0000000800048002L});
	public static final BitSet FOLLOW_mult_in_add333 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_set_in_add336 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_mult_in_add344 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_add_in_relation357 = new BitSet(new long[]{0x0000000007C80002L});
	public static final BitSet FOLLOW_set_in_relation360 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_add_in_relation384 = new BitSet(new long[]{0x0000000007C80002L});
	public static final BitSet FOLLOW_relation_in_expression398 = new BitSet(new long[]{0x0000001008000002L});
	public static final BitSet FOLLOW_set_in_expression401 = new BitSet(new long[]{0x0000000000032990L});
	public static final BitSet FOLLOW_relation_in_expression409 = new BitSet(new long[]{0x0000001008000002L});
}
