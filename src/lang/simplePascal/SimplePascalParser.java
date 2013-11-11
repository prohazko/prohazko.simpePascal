// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g 2013-11-11 17:35:25

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BEGIN", "BLOCK", "DIGIT", 
		"DIV", "IDENT", "IF", "INTEGER", "LETTER", "MINUS", "MOD", "MULT", "NEGATION", 
		"PLUS", "POW", "PRINT", "VAR", "WHILE", "WHITESPACE", "'('", "')'", "';'", 
		"'do'", "'else'", "'end'", "'end.'", "'program'", "'return'", "'then'"
	};
	public static final int EOF=-1;
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
	public static final int BEGIN=5;
	public static final int BLOCK=6;
	public static final int DIGIT=7;
	public static final int DIV=8;
	public static final int IDENT=9;
	public static final int IF=10;
	public static final int INTEGER=11;
	public static final int LETTER=12;
	public static final int MINUS=13;
	public static final int MOD=14;
	public static final int MULT=15;
	public static final int NEGATION=16;
	public static final int PLUS=17;
	public static final int POW=18;
	public static final int PRINT=19;
	public static final int VAR=20;
	public static final int WHILE=21;
	public static final int WHITESPACE=22;

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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:24:1: program : 'program' ! IDENT ! ( VAR ^ ( variableDeclaration )* )? BEGIN ( statement )* returnStatement 'end.' !;
	public final SimplePascalParser.program_return program() throws RecognitionException {
		SimplePascalParser.program_return retval = new SimplePascalParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token IDENT2=null;
		Token VAR3=null;
		Token BEGIN5=null;
		Token string_literal8=null;
		ParserRuleReturnScope variableDeclaration4 =null;
		ParserRuleReturnScope statement6 =null;
		ParserRuleReturnScope returnStatement7 =null;

		CommonTree string_literal1_tree=null;
		CommonTree IDENT2_tree=null;
		CommonTree VAR3_tree=null;
		CommonTree BEGIN5_tree=null;
		CommonTree string_literal8_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:25:3: ( 'program' ! IDENT ! ( VAR ^ ( variableDeclaration )* )? BEGIN ( statement )* returnStatement 'end.' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:25:5: 'program' ! IDENT ! ( VAR ^ ( variableDeclaration )* )? BEGIN ( statement )* returnStatement 'end.' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal1=(Token)match(input,30,FOLLOW_30_in_program84); if (state.failed) return retval;
			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program87); if (state.failed) return retval;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:5: ( VAR ^ ( variableDeclaration )* )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VAR) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:6: VAR ^ ( variableDeclaration )*
					{
					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_program95); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VAR3_tree = (CommonTree)adaptor.create(VAR3);
					root_0 = (CommonTree)adaptor.becomeRoot(VAR3_tree, root_0);
					}

					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:12: ( variableDeclaration )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==IDENT) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:12: variableDeclaration
							{
							pushFollow(FOLLOW_variableDeclaration_in_program99);
							variableDeclaration4=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration4.getTree());

							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			BEGIN5=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_program108); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BEGIN5_tree = (CommonTree)adaptor.create(BEGIN5);
			adaptor.addChild(root_0, BEGIN5_tree);
			}

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:28:7: ( statement )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= IDENT && LA3_0 <= IF)||LA3_0==PRINT||LA3_0==WHILE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:28:7: statement
					{
					pushFollow(FOLLOW_statement_in_program116);
					statement6=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement6.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_returnStatement_in_program125);
			returnStatement7=returnStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement7.getTree());

			string_literal8=(Token)match(input,29,FOLLOW_29_in_program131); if (state.failed) return retval;
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

		Token string_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope expression10 =null;

		CommonTree string_literal9_tree=null;
		CommonTree char_literal11_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:34:3: ( 'return' ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:34:5: 'return' ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal9=(Token)match(input,31,FOLLOW_31_in_returnStatement147); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_returnStatement150);
			expression10=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression10.getTree());

			char_literal11=(Token)match(input,25,FOLLOW_25_in_returnStatement152); if (state.failed) return retval;
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:37:1: variableDeclaration : IDENT ( ASSIGN ^ expression )? ';' !;
	public final SimplePascalParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		SimplePascalParser.variableDeclaration_return retval = new SimplePascalParser.variableDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT12=null;
		Token ASSIGN13=null;
		Token char_literal15=null;
		ParserRuleReturnScope expression14 =null;

		CommonTree IDENT12_tree=null;
		CommonTree ASSIGN13_tree=null;
		CommonTree char_literal15_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:3: ( IDENT ( ASSIGN ^ expression )? ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:5: IDENT ( ASSIGN ^ expression )? ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration166); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT12_tree = (CommonTree)adaptor.create(IDENT12);
			adaptor.addChild(root_0, IDENT12_tree);
			}

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:11: ( ASSIGN ^ expression )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ASSIGN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:12: ASSIGN ^ expression
					{
					ASSIGN13=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration169); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN13_tree = (CommonTree)adaptor.create(ASSIGN13);
					root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN13_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_variableDeclaration172);
					expression14=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression14.getTree());

					}
					break;

			}

			char_literal15=(Token)match(input,25,FOLLOW_25_in_variableDeclaration176); if (state.failed) return retval;
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

		ParserRuleReturnScope assignStatement16 =null;
		ParserRuleReturnScope ifStatement17 =null;
		ParserRuleReturnScope printStatement18 =null;
		ParserRuleReturnScope whileStatement19 =null;


		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:43:3: ( assignStatement | ifStatement | printStatement | whileStatement )
			int alt5=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt5=1;
				}
				break;
			case IF:
				{
				alt5=2;
				}
				break;
			case PRINT:
				{
				alt5=3;
				}
				break;
			case WHILE:
				{
				alt5=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:43:5: assignStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignStatement_in_statement195);
					assignStatement16=assignStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignStatement16.getTree());

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:44:5: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement201);
					ifStatement17=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement17.getTree());

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:45:5: printStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_printStatement_in_statement207);
					printStatement18=printStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, printStatement18.getTree());

					}
					break;
				case 4 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:46:5: whileStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement213);
					whileStatement19=whileStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement19.getTree());

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

		Token IDENT20=null;
		Token ASSIGN21=null;
		Token char_literal23=null;
		ParserRuleReturnScope expression22 =null;

		CommonTree IDENT20_tree=null;
		CommonTree ASSIGN21_tree=null;
		CommonTree char_literal23_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:50:3: ( IDENT ASSIGN ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:50:5: IDENT ASSIGN ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignStatement228); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT20_tree = (CommonTree)adaptor.create(IDENT20);
			adaptor.addChild(root_0, IDENT20_tree);
			}

			ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement230); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN21_tree = (CommonTree)adaptor.create(ASSIGN21);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN21_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignStatement233);
			expression22=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression22.getTree());

			char_literal23=(Token)match(input,25,FOLLOW_25_in_assignStatement235); if (state.failed) return retval;
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

		Token PRINT24=null;
		Token char_literal26=null;
		ParserRuleReturnScope expression25 =null;

		CommonTree PRINT24_tree=null;
		CommonTree char_literal26_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:54:3: ( PRINT ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:54:5: PRINT ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			PRINT24=(Token)match(input,PRINT,FOLLOW_PRINT_in_printStatement251); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT24_tree = (CommonTree)adaptor.create(PRINT24);
			root_0 = (CommonTree)adaptor.becomeRoot(PRINT24_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_printStatement254);
			expression25=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

			char_literal26=(Token)match(input,25,FOLLOW_25_in_printStatement256); if (state.failed) return retval;
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

		Token IF27=null;
		Token string_literal29=null;
		Token string_literal31=null;
		Token string_literal33=null;
		Token string_literal34=null;
		Token char_literal35=null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope block30 =null;
		ParserRuleReturnScope block32 =null;

		CommonTree IF27_tree=null;
		CommonTree string_literal29_tree=null;
		CommonTree string_literal31_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree string_literal34_tree=null;
		CommonTree char_literal35_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:58:3: ( IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:58:5: IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IF27=(Token)match(input,IF,FOLLOW_IF_in_ifStatement274); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF27_tree = (CommonTree)adaptor.create(IF27);
			root_0 = (CommonTree)adaptor.becomeRoot(IF27_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_ifStatement277);
			expression28=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression28.getTree());

			string_literal29=(Token)match(input,32,FOLLOW_32_in_ifStatement279); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_ifStatement288);
			block30=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block30.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:5: ( 'else' ! block )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==27) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:6: 'else' ! block
					{
					string_literal31=(Token)match(input,27,FOLLOW_27_in_ifStatement295); if (state.failed) return retval;
					pushFollow(FOLLOW_block_in_ifStatement304);
					block32=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block32.getTree());

					}
					break;

			}

			string_literal33=(Token)match(input,28,FOLLOW_28_in_ifStatement312); if (state.failed) return retval;
			string_literal34=(Token)match(input,IF,FOLLOW_IF_in_ifStatement315); if (state.failed) return retval;
			char_literal35=(Token)match(input,25,FOLLOW_25_in_ifStatement318); if (state.failed) return retval;
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

		Token WHILE36=null;
		Token string_literal38=null;
		Token string_literal40=null;
		Token string_literal41=null;
		Token char_literal42=null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope block39 =null;

		CommonTree WHILE36_tree=null;
		CommonTree string_literal38_tree=null;
		CommonTree string_literal40_tree=null;
		CommonTree string_literal41_tree=null;
		CommonTree char_literal42_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:66:3: ( WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:66:5: WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			WHILE36=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement334); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE36_tree = (CommonTree)adaptor.create(WHILE36);
			root_0 = (CommonTree)adaptor.becomeRoot(WHILE36_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_whileStatement337);
			expression37=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression37.getTree());

			string_literal38=(Token)match(input,26,FOLLOW_26_in_whileStatement339); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_whileStatement348);
			block39=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block39.getTree());

			string_literal40=(Token)match(input,28,FOLLOW_28_in_whileStatement354); if (state.failed) return retval;
			string_literal41=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement357); if (state.failed) return retval;
			char_literal42=(Token)match(input,25,FOLLOW_25_in_whileStatement360); if (state.failed) return retval;
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

		ParserRuleReturnScope statement43 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:3: ( ( statement )* -> ^( BLOCK ( statement )* ) )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: ( statement )*
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: ( statement )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= IDENT && LA7_0 <= IF)||LA7_0==PRINT||LA7_0==WHILE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: statement
					{
					pushFollow(FOLLOW_statement_in_block376);
					statement43=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement43.getTree());
					}
					break;

				default :
					break loop7;
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

		Token IDENT44=null;
		Token char_literal45=null;
		Token char_literal47=null;
		Token INTEGER48=null;
		ParserRuleReturnScope expression46 =null;

		CommonTree IDENT44_tree=null;
		CommonTree char_literal45_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree INTEGER48_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:78:3: ( IDENT | '(' expression ')' | INTEGER )
			int alt8=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt8=1;
				}
				break;
			case 23:
				{
				alt8=2;
				}
				break;
			case INTEGER:
				{
				alt8=3;
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
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:78:5: IDENT
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_term405); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT44_tree = (CommonTree)adaptor.create(IDENT44);
					adaptor.addChild(root_0, IDENT44_tree);
					}

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:79:5: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal45=(Token)match(input,23,FOLLOW_23_in_term411); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
					adaptor.addChild(root_0, char_literal45_tree);
					}

					pushFollow(FOLLOW_expression_in_term413);
					expression46=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression46.getTree());

					char_literal47=(Token)match(input,24,FOLLOW_24_in_term415); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal47_tree = (CommonTree)adaptor.create(char_literal47);
					adaptor.addChild(root_0, char_literal47_tree);
					}

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:5: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER48=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term421); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER48_tree = (CommonTree)adaptor.create(INTEGER48);
					adaptor.addChild(root_0, INTEGER48_tree);
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

		Token char_literal49=null;
		ParserRuleReturnScope negation50 =null;
		ParserRuleReturnScope term51 =null;

		CommonTree char_literal49_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:3: ( ( '+' !| negation ^)* term )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:5: ( '+' !| negation ^)* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:5: ( '+' !| negation ^)*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==PLUS) ) {
					alt9=1;
				}
				else if ( (LA9_0==MINUS) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:6: '+' !
					{
					char_literal49=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary437); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:13: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary442);
					negation50=negation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(negation50.getTree(), root_0);
					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_term_in_unary447);
			term51=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term51.getTree());

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

		Token MULT53=null;
		Token DIV54=null;
		Token MOD55=null;
		Token POW56=null;
		ParserRuleReturnScope unary52 =null;
		ParserRuleReturnScope unary57 =null;

		CommonTree MULT53_tree=null;
		CommonTree DIV54_tree=null;
		CommonTree MOD55_tree=null;
		CommonTree POW56_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:3: ( unary ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:5: unary ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult460);
			unary52=unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unary52.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:11: ( ( MULT ^| DIV ^| MOD ^| POW ^) unary )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==DIV||(LA11_0 >= MOD && LA11_0 <= MULT)||LA11_0==POW) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:12: ( MULT ^| DIV ^| MOD ^| POW ^) unary
					{
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:12: ( MULT ^| DIV ^| MOD ^| POW ^)
					int alt10=4;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt10=1;
						}
						break;
					case DIV:
						{
						alt10=2;
						}
						break;
					case MOD:
						{
						alt10=3;
						}
						break;
					case POW:
						{
						alt10=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:13: MULT ^
							{
							MULT53=(Token)match(input,MULT,FOLLOW_MULT_in_mult464); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT53_tree = (CommonTree)adaptor.create(MULT53);
							root_0 = (CommonTree)adaptor.becomeRoot(MULT53_tree, root_0);
							}

							}
							break;
						case 2 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:21: DIV ^
							{
							DIV54=(Token)match(input,DIV,FOLLOW_DIV_in_mult469); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV54_tree = (CommonTree)adaptor.create(DIV54);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV54_tree, root_0);
							}

							}
							break;
						case 3 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:28: MOD ^
							{
							MOD55=(Token)match(input,MOD,FOLLOW_MOD_in_mult474); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD55_tree = (CommonTree)adaptor.create(MOD55);
							root_0 = (CommonTree)adaptor.becomeRoot(MOD55_tree, root_0);
							}

							}
							break;
						case 4 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:88:35: POW ^
							{
							POW56=(Token)match(input,POW,FOLLOW_POW_in_mult479); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							POW56_tree = (CommonTree)adaptor.create(POW56);
							root_0 = (CommonTree)adaptor.becomeRoot(POW56_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_mult483);
					unary57=unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary57.getTree());

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

		Token PLUS59=null;
		Token MINUS60=null;
		ParserRuleReturnScope mult58 =null;
		ParserRuleReturnScope mult61 =null;

		CommonTree PLUS59_tree=null;
		CommonTree MINUS60_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:3: ( mult ( ( PLUS ^| MINUS ^) mult )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:5: mult ( ( PLUS ^| MINUS ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_expression500);
			mult58=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult58.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:10: ( ( PLUS ^| MINUS ^) mult )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:11: ( PLUS ^| MINUS ^) mult
					{
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:11: ( PLUS ^| MINUS ^)
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==PLUS) ) {
						alt12=1;
					}
					else if ( (LA12_0==MINUS) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:12: PLUS ^
							{
							PLUS59=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression504); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS59_tree = (CommonTree)adaptor.create(PLUS59);
							root_0 = (CommonTree)adaptor.becomeRoot(PLUS59_tree, root_0);
							}

							}
							break;
						case 2 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:92:20: MINUS ^
							{
							MINUS60=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression509); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS60_tree = (CommonTree)adaptor.create(MINUS60);
							root_0 = (CommonTree)adaptor.becomeRoot(MINUS60_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_expression513);
					mult61=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mult61.getTree());

					}
					break;

				default :
					break loop13;
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

		Token char_literal62=null;

		CommonTree char_literal62_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:96:3: ( '-' -> NEGATION )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:96:5: '-'
			{
			char_literal62=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation530); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MINUS.add(char_literal62);

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



	public static final BitSet FOLLOW_30_in_program84 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_program87 = new BitSet(new long[]{0x0000000000100020L});
	public static final BitSet FOLLOW_VAR_in_program95 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_variableDeclaration_in_program99 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_BEGIN_in_program108 = new BitSet(new long[]{0x0000000080280600L});
	public static final BitSet FOLLOW_statement_in_program116 = new BitSet(new long[]{0x0000000080280600L});
	public static final BitSet FOLLOW_returnStatement_in_program125 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_program131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_returnStatement147 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_returnStatement150 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStatement152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaration166 = new BitSet(new long[]{0x0000000002000010L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration169 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration172 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_variableDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStatement_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignStatement228 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_assignStatement230 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_assignStatement233 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_assignStatement235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStatement251 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_printStatement254 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStatement256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement274 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_ifStatement277 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_ifStatement279 = new BitSet(new long[]{0x0000000018280600L});
	public static final BitSet FOLLOW_block_in_ifStatement288 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_27_in_ifStatement295 = new BitSet(new long[]{0x0000000010280600L});
	public static final BitSet FOLLOW_block_in_ifStatement304 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ifStatement312 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IF_in_ifStatement315 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_ifStatement318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement334 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_whileStatement337 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_whileStatement339 = new BitSet(new long[]{0x0000000010280600L});
	public static final BitSet FOLLOW_block_in_whileStatement348 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_whileStatement354 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement357 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_whileStatement360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block376 = new BitSet(new long[]{0x0000000000280602L});
	public static final BitSet FOLLOW_IDENT_in_term405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_term411 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_expression_in_term413 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_term415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary437 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_negation_in_unary442 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_term_in_unary447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult460 = new BitSet(new long[]{0x000000000004C102L});
	public static final BitSet FOLLOW_MULT_in_mult464 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_DIV_in_mult469 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_MOD_in_mult474 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_POW_in_mult479 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_unary_in_mult483 = new BitSet(new long[]{0x000000000004C102L});
	public static final BitSet FOLLOW_mult_in_expression500 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_PLUS_in_expression504 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_MINUS_in_expression509 = new BitSet(new long[]{0x0000000000822A00L});
	public static final BitSet FOLLOW_mult_in_expression513 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_MINUS_in_negation530 = new BitSet(new long[]{0x0000000000000002L});
}
