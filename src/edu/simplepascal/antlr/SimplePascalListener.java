// Generated from SimplePascal.g4 by ANTLR 4.1

  package edu.simplepascal.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplePascalParser}.
 */
public interface SimplePascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull SimplePascalParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull SimplePascalParser.MultExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull SimplePascalParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull SimplePascalParser.AndExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(@NotNull SimplePascalParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(@NotNull SimplePascalParser.ArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull SimplePascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull SimplePascalParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#termExpr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(@NotNull SimplePascalParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#termExpr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(@NotNull SimplePascalParser.TermExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#modExpr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(@NotNull SimplePascalParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#modExpr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(@NotNull SimplePascalParser.ModExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#trigFunCall}.
	 * @param ctx the parse tree
	 */
	void enterTrigFunCall(@NotNull SimplePascalParser.TrigFunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#trigFunCall}.
	 * @param ctx the parse tree
	 */
	void exitTrigFunCall(@NotNull SimplePascalParser.TrigFunCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull SimplePascalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull SimplePascalParser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimplePascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimplePascalParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(@NotNull SimplePascalParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(@NotNull SimplePascalParser.ReadStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(@NotNull SimplePascalParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(@NotNull SimplePascalParser.PlusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#lteqExpr}.
	 * @param ctx the parse tree
	 */
	void enterLteqExpr(@NotNull SimplePascalParser.LteqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#lteqExpr}.
	 * @param ctx the parse tree
	 */
	void exitLteqExpr(@NotNull SimplePascalParser.LteqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#mathFunCall}.
	 * @param ctx the parse tree
	 */
	void enterMathFunCall(@NotNull SimplePascalParser.MathFunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#mathFunCall}.
	 * @param ctx the parse tree
	 */
	void exitMathFunCall(@NotNull SimplePascalParser.MathFunCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#booleanTerm}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTerm(@NotNull SimplePascalParser.BooleanTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#booleanTerm}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTerm(@NotNull SimplePascalParser.BooleanTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull SimplePascalParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull SimplePascalParser.ParExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#blockOrStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockOrStatement(@NotNull SimplePascalParser.BlockOrStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#blockOrStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockOrStatement(@NotNull SimplePascalParser.BlockOrStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#idTerm}.
	 * @param ctx the parse tree
	 */
	void enterIdTerm(@NotNull SimplePascalParser.IdTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#idTerm}.
	 * @param ctx the parse tree
	 */
	void exitIdTerm(@NotNull SimplePascalParser.IdTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#unaryMinusExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull SimplePascalParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#unaryMinusExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull SimplePascalParser.UnaryMinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#gtExpr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(@NotNull SimplePascalParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#gtExpr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(@NotNull SimplePascalParser.GtExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#neqExpr}.
	 * @param ctx the parse tree
	 */
	void enterNeqExpr(@NotNull SimplePascalParser.NeqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#neqExpr}.
	 * @param ctx the parse tree
	 */
	void exitNeqExpr(@NotNull SimplePascalParser.NeqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#shlExpr}.
	 * @param ctx the parse tree
	 */
	void enterShlExpr(@NotNull SimplePascalParser.ShlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#shlExpr}.
	 * @param ctx the parse tree
	 */
	void exitShlExpr(@NotNull SimplePascalParser.ShlExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(@NotNull SimplePascalParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(@NotNull SimplePascalParser.EqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull SimplePascalParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull SimplePascalParser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#divExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(@NotNull SimplePascalParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#divExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(@NotNull SimplePascalParser.DivExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#strFunCall}.
	 * @param ctx the parse tree
	 */
	void enterStrFunCall(@NotNull SimplePascalParser.StrFunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#strFunCall}.
	 * @param ctx the parse tree
	 */
	void exitStrFunCall(@NotNull SimplePascalParser.StrFunCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#numberTerm}.
	 * @param ctx the parse tree
	 */
	void enterNumberTerm(@NotNull SimplePascalParser.NumberTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#numberTerm}.
	 * @param ctx the parse tree
	 */
	void exitNumberTerm(@NotNull SimplePascalParser.NumberTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#conditionBlockIf}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlockIf(@NotNull SimplePascalParser.ConditionBlockIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#conditionBlockIf}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlockIf(@NotNull SimplePascalParser.ConditionBlockIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(@NotNull SimplePascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(@NotNull SimplePascalParser.RepeatStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#varDeclSection}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclSection(@NotNull SimplePascalParser.VarDeclSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#varDeclSection}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclSection(@NotNull SimplePascalParser.VarDeclSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#funcCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(@NotNull SimplePascalParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#funcCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(@NotNull SimplePascalParser.FuncCallExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(@NotNull SimplePascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(@NotNull SimplePascalParser.CaseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#funcCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallStatement(@NotNull SimplePascalParser.FuncCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#funcCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallStatement(@NotNull SimplePascalParser.FuncCallStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#stringTerm}.
	 * @param ctx the parse tree
	 */
	void enterStringTerm(@NotNull SimplePascalParser.StringTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#stringTerm}.
	 * @param ctx the parse tree
	 */
	void exitStringTerm(@NotNull SimplePascalParser.StringTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#nilTerm}.
	 * @param ctx the parse tree
	 */
	void enterNilTerm(@NotNull SimplePascalParser.NilTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#nilTerm}.
	 * @param ctx the parse tree
	 */
	void exitNilTerm(@NotNull SimplePascalParser.NilTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#ltExpr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(@NotNull SimplePascalParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#ltExpr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(@NotNull SimplePascalParser.LtExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull SimplePascalParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull SimplePascalParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull SimplePascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull SimplePascalParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(@NotNull SimplePascalParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(@NotNull SimplePascalParser.WriteStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimplePascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimplePascalParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull SimplePascalParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull SimplePascalParser.MinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#conditionBlockCase}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlockCase(@NotNull SimplePascalParser.ConditionBlockCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#conditionBlockCase}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlockCase(@NotNull SimplePascalParser.ConditionBlockCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SimplePascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SimplePascalParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#gteqExpr}.
	 * @param ctx the parse tree
	 */
	void enterGteqExpr(@NotNull SimplePascalParser.GteqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#gteqExpr}.
	 * @param ctx the parse tree
	 */
	void exitGteqExpr(@NotNull SimplePascalParser.GteqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull SimplePascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull SimplePascalParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimplePascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimplePascalParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull SimplePascalParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull SimplePascalParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#incFunCall}.
	 * @param ctx the parse tree
	 */
	void enterIncFunCall(@NotNull SimplePascalParser.IncFunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#incFunCall}.
	 * @param ctx the parse tree
	 */
	void exitIncFunCall(@NotNull SimplePascalParser.IncFunCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplePascalParser#shrExpr}.
	 * @param ctx the parse tree
	 */
	void enterShrExpr(@NotNull SimplePascalParser.ShrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplePascalParser#shrExpr}.
	 * @param ctx the parse tree
	 */
	void exitShrExpr(@NotNull SimplePascalParser.ShrExprContext ctx);
}