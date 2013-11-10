// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g 2013-11-10 14:18:20

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
		"PLUS", "WHILE", "WHITESPACE", "'('", "')'", "';'", "'do'", "'else'", 
		"'end'", "'end.'", "'program'", "'return'", "'then'"
	};
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:24:1: program : 'program' ! ( statement )* returnStatement 'end.' !;
	public final SimplePascalParser.program_return program() throws RecognitionException {
		SimplePascalParser.program_return retval = new SimplePascalParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token string_literal4=null;
		ParserRuleReturnScope statement2 =null;
		ParserRuleReturnScope returnStatement3 =null;

		CommonTree string_literal1_tree=null;
		CommonTree string_literal4_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:25:3: ( 'program' ! ( statement )* returnStatement 'end.' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:25:5: 'program' ! ( statement )* returnStatement 'end.' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal1=(Token)match(input,26,FOLLOW_26_in_program84); if (state.failed) return retval;
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:7: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= IDENT && LA1_0 <= IF)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:26:7: statement
					{
					pushFollow(FOLLOW_statement_in_program93);
					statement2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_returnStatement_in_program102);
			returnStatement3=returnStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement3.getTree());

			string_literal4=(Token)match(input,25,FOLLOW_25_in_program108); if (state.failed) return retval;
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:31:1: returnStatement : 'return' ^ expression ';' !;
	public final SimplePascalParser.returnStatement_return returnStatement() throws RecognitionException {
		SimplePascalParser.returnStatement_return retval = new SimplePascalParser.returnStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal5=null;
		Token char_literal7=null;
		ParserRuleReturnScope expression6 =null;

		CommonTree string_literal5_tree=null;
		CommonTree char_literal7_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:32:3: ( 'return' ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:32:5: 'return' ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal5=(Token)match(input,27,FOLLOW_27_in_returnStatement124); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal5_tree = (CommonTree)adaptor.create(string_literal5);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_returnStatement127);
			expression6=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression6.getTree());

			char_literal7=(Token)match(input,21,FOLLOW_21_in_returnStatement129); if (state.failed) return retval;
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


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:35:1: statement : ( assignStatement | ifStatement | whileStatement );
	public final SimplePascalParser.statement_return statement() throws RecognitionException {
		SimplePascalParser.statement_return retval = new SimplePascalParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope assignStatement8 =null;
		ParserRuleReturnScope ifStatement9 =null;
		ParserRuleReturnScope whileStatement10 =null;


		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:36:3: ( assignStatement | ifStatement | whileStatement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt2=1;
				}
				break;
			case IF:
				{
				alt2=2;
				}
				break;
			case WHILE:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:36:5: assignStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignStatement_in_statement145);
					assignStatement8=assignStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignStatement8.getTree());

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:37:5: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement151);
					ifStatement9=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement9.getTree());

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:38:5: whileStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement157);
					whileStatement10=whileStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement10.getTree());

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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:41:1: assignStatement : IDENT ASSIGN ^ expression ';' !;
	public final SimplePascalParser.assignStatement_return assignStatement() throws RecognitionException {
		SimplePascalParser.assignStatement_return retval = new SimplePascalParser.assignStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT11=null;
		Token ASSIGN12=null;
		Token char_literal14=null;
		ParserRuleReturnScope expression13 =null;

		CommonTree IDENT11_tree=null;
		CommonTree ASSIGN12_tree=null;
		CommonTree char_literal14_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:42:3: ( IDENT ASSIGN ^ expression ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:42:5: IDENT ASSIGN ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignStatement172); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT11_tree = (CommonTree)adaptor.create(IDENT11);
			adaptor.addChild(root_0, IDENT11_tree);
			}

			ASSIGN12=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement174); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN12_tree = (CommonTree)adaptor.create(ASSIGN12);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN12_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_assignStatement177);
			expression13=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression13.getTree());

			char_literal14=(Token)match(input,21,FOLLOW_21_in_assignStatement179); if (state.failed) return retval;
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


	public static class ifStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:45:1: ifStatement : IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !;
	public final SimplePascalParser.ifStatement_return ifStatement() throws RecognitionException {
		SimplePascalParser.ifStatement_return retval = new SimplePascalParser.ifStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF15=null;
		Token string_literal17=null;
		Token string_literal19=null;
		Token string_literal21=null;
		Token string_literal22=null;
		Token char_literal23=null;
		ParserRuleReturnScope expression16 =null;
		ParserRuleReturnScope block18 =null;
		ParserRuleReturnScope block20 =null;

		CommonTree IF15_tree=null;
		CommonTree string_literal17_tree=null;
		CommonTree string_literal19_tree=null;
		CommonTree string_literal21_tree=null;
		CommonTree string_literal22_tree=null;
		CommonTree char_literal23_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:46:3: ( IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:46:5: IF ^ expression 'then' ! block ( 'else' ! block )? 'end' ! 'if' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IF15=(Token)match(input,IF,FOLLOW_IF_in_ifStatement195); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF15_tree = (CommonTree)adaptor.create(IF15);
			root_0 = (CommonTree)adaptor.becomeRoot(IF15_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_ifStatement198);
			expression16=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression16.getTree());

			string_literal17=(Token)match(input,28,FOLLOW_28_in_ifStatement200); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_ifStatement209);
			block18=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block18.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:48:5: ( 'else' ! block )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==23) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:48:6: 'else' ! block
					{
					string_literal19=(Token)match(input,23,FOLLOW_23_in_ifStatement216); if (state.failed) return retval;
					pushFollow(FOLLOW_block_in_ifStatement225);
					block20=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

					}
					break;

			}

			string_literal21=(Token)match(input,24,FOLLOW_24_in_ifStatement233); if (state.failed) return retval;
			string_literal22=(Token)match(input,IF,FOLLOW_IF_in_ifStatement236); if (state.failed) return retval;
			char_literal23=(Token)match(input,21,FOLLOW_21_in_ifStatement239); if (state.failed) return retval;
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:53:1: whileStatement : WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !;
	public final SimplePascalParser.whileStatement_return whileStatement() throws RecognitionException {
		SimplePascalParser.whileStatement_return retval = new SimplePascalParser.whileStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token WHILE24=null;
		Token string_literal26=null;
		Token string_literal28=null;
		Token string_literal29=null;
		Token char_literal30=null;
		ParserRuleReturnScope expression25 =null;
		ParserRuleReturnScope block27 =null;

		CommonTree WHILE24_tree=null;
		CommonTree string_literal26_tree=null;
		CommonTree string_literal28_tree=null;
		CommonTree string_literal29_tree=null;
		CommonTree char_literal30_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:54:3: ( WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !)
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:54:5: WHILE ^ expression 'do' ! block 'end' ! 'while' ! ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			WHILE24=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement255); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE24_tree = (CommonTree)adaptor.create(WHILE24);
			root_0 = (CommonTree)adaptor.becomeRoot(WHILE24_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_whileStatement258);
			expression25=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());

			string_literal26=(Token)match(input,22,FOLLOW_22_in_whileStatement260); if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_whileStatement269);
			block27=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, block27.getTree());

			string_literal28=(Token)match(input,24,FOLLOW_24_in_whileStatement275); if (state.failed) return retval;
			string_literal29=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement278); if (state.failed) return retval;
			char_literal30=(Token)match(input,21,FOLLOW_21_in_whileStatement281); if (state.failed) return retval;
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:59:1: block : ( statement )* -> ^( BLOCK ( statement )* ) ;
	public final SimplePascalParser.block_return block() throws RecognitionException {
		SimplePascalParser.block_return retval = new SimplePascalParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement31 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:3: ( ( statement )* -> ^( BLOCK ( statement )* ) )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:5: ( statement )*
			{
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:5: ( statement )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= IDENT && LA4_0 <= IF)||LA4_0==WHILE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:5: statement
					{
					pushFollow(FOLLOW_statement_in_block297);
					statement31=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement31.getTree());
					}
					break;

				default :
					break loop4;
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
			// 60:16: -> ^( BLOCK ( statement )* )
			{
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:19: ^( BLOCK ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:60:27: ( statement )*
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:65:1: term : ( IDENT | '(' expression ')' | INTEGER );
	public final SimplePascalParser.term_return term() throws RecognitionException {
		SimplePascalParser.term_return retval = new SimplePascalParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token INTEGER36=null;
		ParserRuleReturnScope expression34 =null;

		CommonTree IDENT32_tree=null;
		CommonTree char_literal33_tree=null;
		CommonTree char_literal35_tree=null;
		CommonTree INTEGER36_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:66:3: ( IDENT | '(' expression ')' | INTEGER )
			int alt5=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt5=1;
				}
				break;
			case 19:
				{
				alt5=2;
				}
				break;
			case INTEGER:
				{
				alt5=3;
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
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:66:5: IDENT
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENT32=(Token)match(input,IDENT,FOLLOW_IDENT_in_term326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT32_tree = (CommonTree)adaptor.create(IDENT32);
					adaptor.addChild(root_0, IDENT32_tree);
					}

					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:67:5: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal33=(Token)match(input,19,FOLLOW_19_in_term332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
					adaptor.addChild(root_0, char_literal33_tree);
					}

					pushFollow(FOLLOW_expression_in_term334);
					expression34=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression34.getTree());

					char_literal35=(Token)match(input,20,FOLLOW_20_in_term336); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
					adaptor.addChild(root_0, char_literal35_tree);
					}

					}
					break;
				case 3 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:68:5: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER36=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term342); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER36_tree = (CommonTree)adaptor.create(INTEGER36);
					adaptor.addChild(root_0, INTEGER36_tree);
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:71:1: unary : ( '+' !| negation ^)* term ;
	public final SimplePascalParser.unary_return unary() throws RecognitionException {
		SimplePascalParser.unary_return retval = new SimplePascalParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal37=null;
		ParserRuleReturnScope negation38 =null;
		ParserRuleReturnScope term39 =null;

		CommonTree char_literal37_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:3: ( ( '+' !| negation ^)* term )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: ( '+' !| negation ^)* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:5: ( '+' !| negation ^)*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==PLUS) ) {
					alt6=1;
				}
				else if ( (LA6_0==MINUS) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:6: '+' !
					{
					char_literal37=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary358); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:72:13: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary363);
					negation38=negation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(negation38.getTree(), root_0);
					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_term_in_unary368);
			term39=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term39.getTree());

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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:75:1: mult : unary ( ( MULT ^| DIV ^| MOD ^) unary )* ;
	public final SimplePascalParser.mult_return mult() throws RecognitionException {
		SimplePascalParser.mult_return retval = new SimplePascalParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT41=null;
		Token DIV42=null;
		Token MOD43=null;
		ParserRuleReturnScope unary40 =null;
		ParserRuleReturnScope unary44 =null;

		CommonTree MULT41_tree=null;
		CommonTree DIV42_tree=null;
		CommonTree MOD43_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:3: ( unary ( ( MULT ^| DIV ^| MOD ^) unary )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:5: unary ( ( MULT ^| DIV ^| MOD ^) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult381);
			unary40=unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unary40.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:11: ( ( MULT ^| DIV ^| MOD ^) unary )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==DIV||(LA8_0 >= MOD && LA8_0 <= MULT)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:12: ( MULT ^| DIV ^| MOD ^) unary
					{
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:12: ( MULT ^| DIV ^| MOD ^)
					int alt7=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt7=1;
						}
						break;
					case DIV:
						{
						alt7=2;
						}
						break;
					case MOD:
						{
						alt7=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:13: MULT ^
							{
							MULT41=(Token)match(input,MULT,FOLLOW_MULT_in_mult385); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT41_tree = (CommonTree)adaptor.create(MULT41);
							root_0 = (CommonTree)adaptor.becomeRoot(MULT41_tree, root_0);
							}

							}
							break;
						case 2 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:21: DIV ^
							{
							DIV42=(Token)match(input,DIV,FOLLOW_DIV_in_mult390); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV42_tree = (CommonTree)adaptor.create(DIV42);
							root_0 = (CommonTree)adaptor.becomeRoot(DIV42_tree, root_0);
							}

							}
							break;
						case 3 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:76:28: MOD ^
							{
							MOD43=(Token)match(input,MOD,FOLLOW_MOD_in_mult395); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD43_tree = (CommonTree)adaptor.create(MOD43);
							root_0 = (CommonTree)adaptor.becomeRoot(MOD43_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_mult399);
					unary44=unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary44.getTree());

					}
					break;

				default :
					break loop8;
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:79:1: expression : mult ( ( PLUS ^| MINUS ^) mult )* ;
	public final SimplePascalParser.expression_return expression() throws RecognitionException {
		SimplePascalParser.expression_return retval = new SimplePascalParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PLUS46=null;
		Token MINUS47=null;
		ParserRuleReturnScope mult45 =null;
		ParserRuleReturnScope mult48 =null;

		CommonTree PLUS46_tree=null;
		CommonTree MINUS47_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:3: ( mult ( ( PLUS ^| MINUS ^) mult )* )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:5: mult ( ( PLUS ^| MINUS ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_expression416);
			mult45=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult45.getTree());

			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:10: ( ( PLUS ^| MINUS ^) mult )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:11: ( PLUS ^| MINUS ^) mult
					{
					// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:11: ( PLUS ^| MINUS ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==PLUS) ) {
						alt9=1;
					}
					else if ( (LA9_0==MINUS) ) {
						alt9=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:12: PLUS ^
							{
							PLUS46=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression420); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS46_tree = (CommonTree)adaptor.create(PLUS46);
							root_0 = (CommonTree)adaptor.becomeRoot(PLUS46_tree, root_0);
							}

							}
							break;
						case 2 :
							// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:80:20: MINUS ^
							{
							MINUS47=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression425); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS47_tree = (CommonTree)adaptor.create(MINUS47);
							root_0 = (CommonTree)adaptor.becomeRoot(MINUS47_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_expression429);
					mult48=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mult48.getTree());

					}
					break;

				default :
					break loop10;
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
	// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:83:1: negation : '-' -> NEGATION ;
	public final SimplePascalParser.negation_return negation() throws RecognitionException {
		SimplePascalParser.negation_return retval = new SimplePascalParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal49=null;

		CommonTree char_literal49_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:3: ( '-' -> NEGATION )
			// D:\\univer\\simplePascal\\src\\lang\\simplePascal\\SimplePascal.g:84:5: '-'
			{
			char_literal49=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation446); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MINUS.add(char_literal49);

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
			// 84:9: -> NEGATION
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



	public static final BitSet FOLLOW_26_in_program84 = new BitSet(new long[]{0x0000000008020300L});
	public static final BitSet FOLLOW_statement_in_program93 = new BitSet(new long[]{0x0000000008020300L});
	public static final BitSet FOLLOW_returnStatement_in_program102 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_program108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_returnStatement124 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_expression_in_returnStatement127 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_returnStatement129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignStatement172 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_assignStatement174 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_expression_in_assignStatement177 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_assignStatement179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement195 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_expression_in_ifStatement198 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ifStatement200 = new BitSet(new long[]{0x0000000001820300L});
	public static final BitSet FOLLOW_block_in_ifStatement209 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_23_in_ifStatement216 = new BitSet(new long[]{0x0000000001020300L});
	public static final BitSet FOLLOW_block_in_ifStatement225 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ifStatement233 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IF_in_ifStatement236 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ifStatement239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement255 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_expression_in_whileStatement258 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_whileStatement260 = new BitSet(new long[]{0x0000000001020300L});
	public static final BitSet FOLLOW_block_in_whileStatement269 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_whileStatement275 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHILE_in_whileStatement278 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_whileStatement281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block297 = new BitSet(new long[]{0x0000000000020302L});
	public static final BitSet FOLLOW_IDENT_in_term326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_term332 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_expression_in_term334 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_term336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary358 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_negation_in_unary363 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_term_in_unary368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult381 = new BitSet(new long[]{0x0000000000006082L});
	public static final BitSet FOLLOW_MULT_in_mult385 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_DIV_in_mult390 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_MOD_in_mult395 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_unary_in_mult399 = new BitSet(new long[]{0x0000000000006082L});
	public static final BitSet FOLLOW_mult_in_expression416 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_PLUS_in_expression420 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_MINUS_in_expression425 = new BitSet(new long[]{0x0000000000091500L});
	public static final BitSet FOLLOW_mult_in_expression429 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_MINUS_in_negation446 = new BitSet(new long[]{0x0000000000000002L});
}
