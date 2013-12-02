// Generated from SimplePascal.g4 by ANTLR 4.1

  package edu.simplepascal.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplePascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplePascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(@NotNull SimplePascalParser.MultExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull SimplePascalParser.AndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(@NotNull SimplePascalParser.ArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull SimplePascalParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#termExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(@NotNull SimplePascalParser.TermExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#modExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(@NotNull SimplePascalParser.ModExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#trigFunCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigFunCall(@NotNull SimplePascalParser.TrigFunCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull SimplePascalParser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SimplePascalParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(@NotNull SimplePascalParser.ReadStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#plusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(@NotNull SimplePascalParser.PlusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#lteqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteqExpr(@NotNull SimplePascalParser.LteqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#mathFunCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFunCall(@NotNull SimplePascalParser.MathFunCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#booleanTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTerm(@NotNull SimplePascalParser.BooleanTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#parExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull SimplePascalParser.ParExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#blockOrStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOrStatement(@NotNull SimplePascalParser.BlockOrStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#idTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTerm(@NotNull SimplePascalParser.IdTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#unaryMinusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(@NotNull SimplePascalParser.UnaryMinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#gtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(@NotNull SimplePascalParser.GtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#neqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(@NotNull SimplePascalParser.NeqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#shlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShlExpr(@NotNull SimplePascalParser.ShlExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull SimplePascalParser.EqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull SimplePascalParser.NotExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#divExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(@NotNull SimplePascalParser.DivExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#strFunCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrFunCall(@NotNull SimplePascalParser.StrFunCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#numberTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTerm(@NotNull SimplePascalParser.NumberTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#conditionBlockIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlockIf(@NotNull SimplePascalParser.ConditionBlockIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(@NotNull SimplePascalParser.RepeatStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#varDeclSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclSection(@NotNull SimplePascalParser.VarDeclSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#funcCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(@NotNull SimplePascalParser.FuncCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(@NotNull SimplePascalParser.CaseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#funcCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStatement(@NotNull SimplePascalParser.FuncCallStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#stringTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTerm(@NotNull SimplePascalParser.StringTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#nilTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilTerm(@NotNull SimplePascalParser.NilTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#ltExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(@NotNull SimplePascalParser.LtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull SimplePascalParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull SimplePascalParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(@NotNull SimplePascalParser.WriteStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SimplePascalParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(@NotNull SimplePascalParser.MinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#conditionBlockCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlockCase(@NotNull SimplePascalParser.ConditionBlockCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SimplePascalParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#gteqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteqExpr(@NotNull SimplePascalParser.GteqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull SimplePascalParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SimplePascalParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull SimplePascalParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#incFunCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncFunCall(@NotNull SimplePascalParser.IncFunCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplePascalParser#shrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShrExpr(@NotNull SimplePascalParser.ShrExprContext ctx);
}