// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g 2013-11-10 15:07:56

  package lang.simplePascal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SimplePascalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BLOCK", "DIGIT", "DIV", 
		"IDENT", "IF", "INTEGER", "LETTER", "MINUS", "MOD", "MULT", "NEGATION", 
		"PLUS", "POW", "PRINT", "WHILE", "WHITESPACE", "'('", "')'", "';'", "'begin'", 
		"'do'", "'else'", "'end'", "'end.'", "'program'", "'return'", "'then'", 
		"'var'"
	};
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
	@Override public String getGrammarFileName() { return "D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:24:1: program : 'program' ! IDENT ( variableDeclaration )* 'begin' ! ( statement )* returnStatement 'end.' !;
	public final SimplePascalParser.program_return program() throws RecognitionException {
		SimplePascalParser.program_return retval = new SimplePascalParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token IDENT2=null;
		Token string_literal4=null;
		Token string_literal7=null;
		ParserRuleReturnScope variableDeclaration3 =null;
		ParserRuleReturnScope statement5 =null;
		ParserRuleReturnScope returnStatement6 =null;

		CommonTree string_literal1_tree=null;
		CommonTree IDENT2_tree=null;
		CommonTree string_literal4_tree=null;
		CommonTree string_literal7_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:25:3: ( 'program' ! IDENT ( variableDeclaration )* 'begin' ! ( statement )* returnStatement 'end.' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:25:5: 'program' ! IDENT ( variableDeclaration )* 'begin' ! ( statement )* returnStatement 'end.' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal1=(Token)match(input,29,FOLLOW_29_in_program84); if (state.failed) return retval;
			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program87); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT2_tree = (CommonTree)adaptor.create(IDENT2);
			adaptor.addChild(root_0, IDENT2_tree);
			}

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:7: ( variableDeclaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==32) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:7: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_program95);
					variableDeclaration3=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			string_literal4=(Token)match(input,24,FOLLOW_24_in_program102); if (state.failed) return retval;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:28:7: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= IDENT && LA2_0 <= IF)||(LA2_0 >= PRINT && LA2_0 <= WHILE)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:28:7: statement
					{
					pushFollow(FOLLOW_statement_in_program111);
					statement5=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement5.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_returnStatement_in_program120);
			returnStatement6=returnStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement6.getTree());

			string_literal7=(Token)match(input,28,FOLLOW_28_in_program126); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class returnStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "returnStatement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:33:1: returnStatement : 'return' ^ expression ';' !;
	public final SimplePascalParser.returnStatement_return returnStatement() throws RecognitionException {
		SimplePascalParser.returnStatement_return retval = new SimplePascalParser.returnStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope expression9 =null;

		CommonTree string_literal8_tree=null;
		CommonTree char_literal10_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:34:3: ( 'return' ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:34:5: 'return' ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal8=(Token)match(input,30,FOLLOW_30_in_returnStatement142); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal8_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_returnStatement145);
			expression9=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression9.getTree());

			char_literal10=(Token)match(input,23,FOLLOW_23_in_returnStatement147); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:37:1: variableDeclaration : 'var' ^ IDENT ';' !;
	public final SimplePascalParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		SimplePascalParser.variableDeclaration_return retval = new SimplePascalParser.variableDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal11=null;
		Token IDENT12=null;
		Token char_literal13=null;

		CommonTree string_literal11_tree=null;
		CommonTree IDENT12_tree=null;
		CommonTree char_literal13_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:3: ( 'var' ^ IDENT ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:5: 'var' ^ IDENT ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal11=(Token)match(input,32,FOLLOW_32_in_variableDeclaration161); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = (CommonTree)adaptor.create(string_literal11);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal11_tree, root_0);
			}

			IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration164); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT12_tree = (CommonTree)adaptor.create(IDENT12);
			adaptor.addChild(root_0, IDENT12_tree);
			}

			char_literal13=(Token)match(input,23,FOLLOW_23_in_variableDeclaration166); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "variableDeclaration"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:42:1: statement : ( assignStatement | ifStatement | printStatement | whileStatement );
	public final SimplePascalParser.statement_return statement() throws RecognitionException {
		SimplePascalParser.statement_return retval = new SimplePascalParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope assignStatement14 =null;
		ParserRuleReturnScope ifStatement15 =null;
		ParserRuleReturnScope printStatement16 =null;
		ParserRuleReturnScope whileStatement17 =null;


		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:43:3: ( assignStatement | ifStatement | printStatement | whileStatement )
			int alt3=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt3=1;
				}
				break;
			case IF:
				{
				alt3=2;
				}
				break;
			case PRINT:
				{
				alt3=3;
				}
				break;
			case WHILE:
				{
				alt3=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:43:5: assignStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignStatement_in_statement185);
					assignStatement14=assignStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignStatement14.getTree());

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:44:5: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement191);
					ifStatement15=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement15.getTree());

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:45:5: printStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_printStatement_in_statement197);
					printStatement16=printStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, printStatement16.getTree());

					}
					break;
				case 4 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:46:5: whileStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement203);
					whileStatement17=whileStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement17.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class assignStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignStatement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:49:1: assignStatement : IDENT ASSIGN ^ expression ';' !;
	public final SimplePascalParser.assignStatement_return assignStatement() throws RecognitionException {
		SimplePascalParser.assignStatement_return retval = new SimplePascalParser.assignStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT18=null;
		Token ASSIGN19=null;
		Token char_literal21=null;
		ParserRuleReturnScope expression20 =null;

		CommonTree IDENT18_tree=null;
		CommonTree ASSIGN19_tree=null;
		CommonTree char_literal21_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:50:3: ( IDENT ASSIGN ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:50:5: IDENT ASSIGN ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT18=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignStatement218); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT18_tree = (CommonTree)adaptor.create(IDENT18);
			adaptor.addChild(root_0, IDENT18_tree);
			}

			ASSIGN19=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement220); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN19_tree = (CommonTree)adaptor.create(ASSIGN19);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN19_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignStatement223);
			expression20=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression20.getTree());

			char_literal21=(Token)match(input,23,FOLLOW_23_in_assignStatement225); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assignStatement"


	public static class printStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "printStatement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:53:1: printStatement : PRINT ^ expression ';' !;
	public final SimplePascalParser.printStatement_return printStatement() throws RecognitionException {
		SimplePascalParser.printStatement_return retval = new SimplePascalParser.printStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PRINT22=null;
		Token char_literal24=null;
		ParserRuleReturnScope expression23 =null;

		CommonTree PRINT22_tree=null;
		CommonTree char_literal24_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:54:3: ( PRINT ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:54:5: PRINT ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			PRINT22=(Token)match(input,PRINT,FOLLOW_PRINT_in_printStatement241); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT22_tree = (CommonTree)adaptor.create(PRINT22);
			root_0 = (CommonTree)adaptor.becomeRoot(PRINT22_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_printStatement244);
			expression23=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression23.getTree());

			char_literal24=(Token)match(input,23,FOLLOW_23_in_printStatement246); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "printStatement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:57:1: ifStatement : IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !;
	public final SimplePascalParser.ifStatement_return ifStatement() throws RecognitionException {
		SimplePascalParser.ifStatement_return retval = new SimplePascalParser.ifStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF25=null;
		Token string_literal27=null;
		Token string_literal29=null;
		Token string_literal31=null;
		Token string_literal32=null;
		Token char_literal33=null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope block28 =null;
		ParserRuleReturnScope block30 =null;

		CommonTree IF25_tree=null;
		CommonTree string_literal27_tree=null;
		CommonTree string_literal29_tree=null;
		CommonTree string_literal31_tree=null;
		CommonTree string_literal32_tree=null;
		CommonTree char_literal33_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:58:3: ( IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:58:5: IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IF25=(Token)match(input,IF,FOLLOW_IF_in_ifStatement264); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF25_tree = (CommonTree)adaptor.create(IF25);
			root_0 = (CommonTree)adaptor.becomeRoot(IF25_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_ifStatement267);
			expression26=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression26.getTree());

			string_literal27=(Token)match(input,31,FOLLOW_31_in_ifStatement269); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_ifStatement278);
			block28=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block28.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:5: ( 'else' ! block )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==26) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:6: 'else' ! block
					{
					string_literal29=(Token)match(input,26,FOLLOW_26_in_ifStatement285); if (state.failed) return retval;
					pushFollow(FOLLOW_block_in_ifStatement294);
					block30=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block30.getTree());

					}
					break;

			}

			string_literal31=(Token)match(input,27,FOLLOW_27_in_ifStatement302); if (state.failed) return retval;
			string_literal32=(Token)match(input,IF,FOLLOW_IF_in_ifStatement305); if (state.failed) return retval;
			char_literal33=(Token)match(input,23,FOLLOW_23_in_ifStatement308); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class whileStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:65:1: whileStatement : WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !;
	public final SimplePascalParser.whileStatement_return whileStatement() throws RecognitionException {
		SimplePascalParser.whileStatement_return retval = new SimplePascalParser.whileStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WHILE34=null;
		Token string_literal36=null;
		Token string_literal38=null;
		Token string_literal39=null;
		Token char_literal40=null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope block37 =null;

		CommonTree WHILE34_tree=null;
		CommonTree string_literal36_tree=null;
		CommonTree string_literal38_tree=null;
		CommonTree string_literal39_tree=null;
		CommonTree char_literal40_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:66:3: ( WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:66:5: WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			WHILE34=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement324); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE34_tree = (CommonTree)adaptor.create(WHILE34);
			root_0 = (CommonTree)adaptor.becomeRoot(WHILE34_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_whileStatement327);
			expression35=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression35.getTree());

			string_literal36=(Token)match(input,25,FOLLOW_25_in_whileStatement329); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_whileStatement338);
			block37=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block37.getTree());

			string_literal38=(Token)match(input,27,FOLLOW_27_in_whileStatement344); if (state.failed) return retval;
			string_literal39=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement347); if (state.failed) return retval;
			char_literal40=(Token)match(input,23,FOLLOW_23_in_whileStatement350); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:71:1: block : ( statement )* -> ^( BLOCK ( statement )* ) ;
	public final SimplePascalParser.block_return block() throws RecognitionException {
		SimplePascalParser.block_return retval = new SimplePascalParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement41 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:3: ( ( statement )* -> ^( BLOCK ( statement )* ) )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: ( statement )*
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: ( statement )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= IDENT && LA5_0 <= IF)||(LA5_0 >= PRINT && LA5_0 <= WHILE)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: statement
					{
					pushFollow(FOLLOW_statement_in_block366);
					statement41=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement41.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 72:16: -> ^( BLOCK ( statement )* )
			{
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:19: ^( BLOCK ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:27: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "block"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:77:1: term : ( IDENT | '(' expression ')' | INTEGER );
	public final SimplePascalParser.term_return term() throws RecognitionException {
		SimplePascalParser.term_return retval = new SimplePascalParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT42=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token INTEGER46=null;
		ParserRuleReturnScope expression44 =null;

		CommonTree IDENT42_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree char_literal45_tree=null;
		CommonTree INTEGER46_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:78:3: ( IDENT | '(' expression ')' | INTEGER )
			int alt6=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt6=1;
				}
				break;
			case 21:
				{
				alt6=2;
				}
				break;
			case INTEGER:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:78:5: IDENT
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENT42=(Token)match(input,IDENT,FOLLOW_IDENT_in_term395); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT42_tree = (CommonTree)adaptor.create(IDENT42);
					adaptor.addChild(root_0, IDENT42_tree);
					}

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:79:5: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal43=(Token)match(input,21,FOLLOW_21_in_term401); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal43_tree = (CommonTree)adaptor.create(char_literal43);
					adaptor.addChild(root_0, char_literal43_tree);
					}

					pushFollow(FOLLOW_expression_in_term403);
					expression44=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression44.getTree());

					char_literal45=(Token)match(input,22,FOLLOW_22_in_term405); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
					adaptor.addChild(root_0, char_literal45_tree);
					}

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:5: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER46=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term411); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER46_tree = (CommonTree)adaptor.create(INTEGER46);
					adaptor.addChild(root_0, INTEGER46_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:83:1: unary : ( '+' !| negation ^)* term ;
	public final SimplePascalParser.unary_return unary() throws RecognitionException {
		SimplePascalParser.unary_return retval = new SimplePascalParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal47=null;
		ParserRuleReturnScope negation48 =null;
		ParserRuleReturnScope term49 =null;

		CommonTree char_literal47_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:3: ( ( '+' !| negation ^)* term )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:5: ( '+' !| negation ^)* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:5: ( '+' !| negation ^)*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==PLUS) ) {
					alt7=1;
				}
				else if ( (LA7_0==MINUS) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:6: '+' !
					{
					char_literal47=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary427); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:13: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary432);
					negation48=negation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(negation48.getTree(), root_0);
					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_term_in_unary437);
			term49=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term49.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:87:1: mult : unary ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )* ;
	public final SimplePascalParser.mult_return mult() throws RecognitionException {
		SimplePascalParser.mult_return retval = new SimplePascalParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT51=null;
		Token DIV52=null;
		Token MOD53=null;
		Token POW54=null;
		ParserRuleReturnScope unary50 =null;
		ParserRuleReturnScope unary55 =null;

		CommonTree MULT51_tree=null;
		CommonTree DIV52_tree=null;
		CommonTree MOD53_tree=null;
		CommonTree POW54_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:3: ( unary ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:5: unary ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult450);
			unary50=unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unary50.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:11: ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DIV||(LA9_0 >= MOD && LA9_0 <= MULT)||LA9_0==POW) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:12: ( MULT ^| DIV ^| MOD ^| POW ^) unary
					{
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:12: ( MULT ^| DIV ^| MOD ^| POW ^)
					int alt8=4;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt8=1;
						}
						break;
					case DIV:
						{
						alt8=2;
						}
						break;
					case MOD:
						{
						alt8=3;
						}
						break;
					case POW:
						{
						alt8=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:13: MULT ^
							{
							MULT51=(Token)match(input,MULT,FOLLOW_MULT_in_mult454); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT51_tree = (CommonTree)adaptor.create(MULT51);
							root_0 = (CommonTree)adaptor.becomeRoot(MULT51_tree, root_0);
							}

							}
							break;
						case 2 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:21: DIV ^
							{
							DIV52=(Token)match(input,DIV,FOLLOW_DIV_in_mult459); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV52_tree = (CommonTree)adaptor.create(DIV52);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV52_tree, root_0);
							}

							}
							break;
						case 3 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:28: MOD ^
							{
							MOD53=(Token)match(input,MOD,FOLLOW_MOD_in_mult464); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD53_tree = (CommonTree)adaptor.create(MOD53);
							root_0 = (CommonTree)adaptor.becomeRoot(MOD53_tree, root_0);
							}

							}
							break;
						case 4 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:35: POW ^
							{
							POW54=(Token)match(input,POW,FOLLOW_POW_in_mult469); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							POW54_tree = (CommonTree)adaptor.create(POW54);
							root_0 = (CommonTree)adaptor.becomeRoot(POW54_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_mult473);
					unary55=unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary55.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:91:1: expression : mult ( ( PLUS ^| MINUS ^) mult )* ;
	public final SimplePascalParser.expression_return expression() throws RecognitionException {
		SimplePascalParser.expression_return retval = new SimplePascalParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PLUS57=null;
		Token MINUS58=null;
		ParserRuleReturnScope mult56 =null;
		ParserRuleReturnScope mult59 =null;

		CommonTree PLUS57_tree=null;
		CommonTree MINUS58_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:3: ( mult ( ( PLUS ^| MINUS ^) mult )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:5: mult ( ( PLUS ^| MINUS ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_expression490);
			mult56=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult56.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:10: ( ( PLUS ^| MINUS ^) mult )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:11: ( PLUS ^| MINUS ^) mult
					{
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:11: ( PLUS ^| MINUS ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PLUS) ) {
						alt10=1;
					}
					else if ( (LA10_0==MINUS) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:12: PLUS ^
							{
							PLUS57=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression494); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS57_tree = (CommonTree)adaptor.create(PLUS57);
							root_0 = (CommonTree)adaptor.becomeRoot(PLUS57_tree, root_0);
							}

							}
							break;
						case 2 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:20: MINUS ^
							{
							MINUS58=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression499); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS58_tree = (CommonTree)adaptor.create(MINUS58);
							root_0 = (CommonTree)adaptor.becomeRoot(MINUS58_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_expression503);
					mult59=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mult59.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class negation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:95:1: negation : '-' -> NEGATION ;
	public final SimplePascalParser.negation_return negation() throws RecognitionException {
		SimplePascalParser.negation_return retval = new SimplePascalParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal60=null;

		CommonTree char_literal60_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:96:3: ( '-' -> NEGATION )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:96:5: '-'
			{
			char_literal60=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation520); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MINUS.add(char_literal60);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 96:9: -> NEGATION
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "negation"

	// Delegated rules



	public static final BitSet FOLLOW_29_in_program84 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_IDENT_in_program87 = new BitSet(new long[]{0x0000000101000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_program95 = new BitSet(new long[]{0x0000000101000000L});
	public static final BitSet FOLLOW_24_in_program102 = new BitSet(new long[]{0x00000000400C0300L});
	public static final BitSet FOLLOW_statement_in_program111 = new BitSet(new long[]{0x00000000400C0300L});
	public static final BitSet FOLLOW_returnStatement_in_program120 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_program126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_returnStatement142 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_expression_in_returnStatement145 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_returnStatement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_variableDeclaration161 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration164 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_variableDeclaration166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignStatement218 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_assignStatement220 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_expression_in_assignStatement223 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_assignStatement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStatement241 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_expression_in_printStatement244 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_printStatement246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement264 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_expression_in_ifStatement267 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_ifStatement269 = new BitSet(new long[]{0x000000000C0C0300L});
	public static final BitSet FOLLOW_block_in_ifStatement278 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_26_in_ifStatement285 = new BitSet(new long[]{0x00000000080C0300L});
	public static final BitSet FOLLOW_block_in_ifStatement294 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_ifStatement302 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IF_in_ifStatement305 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_ifStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement324 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_expression_in_whileStatement327 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_whileStatement329 = new BitSet(new long[]{0x00000000080C0300L});
	public static final BitSet FOLLOW_block_in_whileStatement338 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_whileStatement344 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement347 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_whileStatement350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block366 = new BitSet(new long[]{0x00000000000C0302L});
	public static final BitSet FOLLOW_IDENT_in_term395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_term401 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_expression_in_term403 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_term405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary427 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_negation_in_unary432 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_term_in_unary437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult450 = new BitSet(new long[]{0x0000000000026082L});
	public static final BitSet FOLLOW_MULT_in_mult454 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_DIV_in_mult459 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_MOD_in_mult464 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_POW_in_mult469 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_unary_in_mult473 = new BitSet(new long[]{0x0000000000026082L});
	public static final BitSet FOLLOW_mult_in_expression490 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_PLUS_in_expression494 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_MINUS_in_expression499 = new BitSet(new long[]{0x0000000000211500L});
	public static final BitSet FOLLOW_mult_in_expression503 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_MINUS_in_negation520 = new BitSet(new long[]{0x0000000000000002L});
}
