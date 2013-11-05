// $ANTLR 3.5.1 D:\\univer\\simplePascal\\src\\SimplePascal.g 2013-11-05 16:52:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SimplePascalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "DIV", "MINUS", "MULT", 
		"NUMBER", "PLUS", "WHITESPACE"
	};
	public static final int EOF=-1;
	public static final int DIGIT=4;
	public static final int DIV=5;
	public static final int MINUS=6;
	public static final int MULT=7;
	public static final int NUMBER=8;
	public static final int PLUS=9;
	public static final int WHITESPACE=10;

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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:1: expr : term ( ( PLUS | MINUS ) term )* ;
	public final SimplePascalParser.expr_return expr() throws RecognitionException {
		SimplePascalParser.expr_return retval = new SimplePascalParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set2=null;
		ParserRuleReturnScope term1 =null;
		ParserRuleReturnScope term3 =null;

		Object set2_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:9: ( term ( ( PLUS | MINUS ) term )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:11: term ( ( PLUS | MINUS ) term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_expr103);
			term1=term();
			state._fsp--;

			adaptor.addChild(root_0, term1.getTree());

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:16: ( ( PLUS | MINUS ) term )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MINUS||LA1_0==PLUS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:21:18: ( PLUS | MINUS ) term
					{
					set2=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set2));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_expr118);
					term3=term();
					state._fsp--;

					adaptor.addChild(root_0, term3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:1: term : factor ( ( MULT | DIV ) factor )* ;
	public final SimplePascalParser.term_return term() throws RecognitionException {
		SimplePascalParser.term_return retval = new SimplePascalParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set5=null;
		ParserRuleReturnScope factor4 =null;
		ParserRuleReturnScope factor6 =null;

		Object set5_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:9: ( factor ( ( MULT | DIV ) factor )* )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:11: factor ( ( MULT | DIV ) factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term134);
			factor4=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor4.getTree());

			// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:18: ( ( MULT | DIV ) factor )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DIV||LA2_0==MULT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\univer\\simplePascal\\src\\SimplePascal.g:23:20: ( MULT | DIV ) factor
					{
					set5=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set5));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_term148);
					factor6=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor6.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// D:\\univer\\simplePascal\\src\\SimplePascal.g:25:1: factor : NUMBER ;
	public final SimplePascalParser.factor_return factor() throws RecognitionException {
		SimplePascalParser.factor_return retval = new SimplePascalParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER7=null;

		Object NUMBER7_tree=null;

		try {
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:25:9: ( NUMBER )
			// D:\\univer\\simplePascal\\src\\SimplePascal.g:25:11: NUMBER
			{
			root_0 = (Object)adaptor.nil();


			NUMBER7=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor162); 
			NUMBER7_tree = (Object)adaptor.create(NUMBER7);
			adaptor.addChild(root_0, NUMBER7_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_term_in_expr103 = new BitSet(new long[]{0x0000000000000242L});
	public static final BitSet FOLLOW_set_in_expr107 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_term_in_expr118 = new BitSet(new long[]{0x0000000000000242L});
	public static final BitSet FOLLOW_factor_in_term134 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_set_in_term138 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_factor_in_term148 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_NUMBER_in_factor162 = new BitSet(new long[]{0x0000000000000002L});
}
