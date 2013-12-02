package edu.simplepascal.lang;

import edu.simplepascal.antlr.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.*;

public class BaseVisitor extends SimplePascalBaseVisitor<Value> {

    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Memory memory = new Memory();

    @Override
    public Value visitVarDeclSection(@NotNull SimplePascalParser.VarDeclSectionContext ctx) {
        List<SimplePascalParser.VarDeclContext> variables = ctx.varDecl();

        for (SimplePascalParser.VarDeclContext variable : variables) {
            //System.out.print(variable.ID().getText());
            memory.declare(variable.ID().getText(), new Value(0));
        }

        return Value.VOID;
    }

    // assignment/id overrides
    @Override
    public Value visitAssignment(SimplePascalParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitIdTerm(SimplePascalParser.IdTermContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if (value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    // Term overrides
    @Override
    public Value visitStringTerm(SimplePascalParser.StringTermContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberTerm(SimplePascalParser.NumberTermContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Value visitBooleanTerm(SimplePascalParser.BooleanTermContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Value visitNilTerm(SimplePascalParser.NilTermContext ctx) {
        return new Value(0);
    }

    // expr overrides
    @Override
    public Value visitParExpr(SimplePascalParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }


    @Override
    public Value visitUnaryMinusExpr(SimplePascalParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(SimplePascalParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultExpr(SimplePascalParser.MultExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() * right.asDouble());
    }

    @Override
    public Value visitModExpr(SimplePascalParser.ModExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() % right.asDouble());
    }

    @Override
    public Value visitDivExpr(SimplePascalParser.DivExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() / right.asDouble());
    }

    @Override
    public Value visitPlusExpr(SimplePascalParser.PlusExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        if (left.isDouble() && right.isDouble()) {
            return new Value(left.asDouble() + right.asDouble());
        } else {
            return new Value(left.asString() + right.asString());
        }
    }

    @Override
    public Value visitMinusExpr(SimplePascalParser.MinusExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() - right.asDouble());
    }

    @Override
    public Value visitLtExpr(SimplePascalParser.LtExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() < right.asDouble());
    }

    @Override
    public Value visitLteqExpr(SimplePascalParser.LteqExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() <= right.asDouble());
    }

    @Override
    public Value visitGtExpr(SimplePascalParser.GtExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() > right.asDouble());
    }

    @Override
    public Value visitGteqExpr(SimplePascalParser.GteqExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asDouble() >= right.asDouble());
    }

    @Override
    public Value visitNeqExpr(SimplePascalParser.NeqExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        if (left.isDouble() && right.isDouble()) {
            double diff = Math.abs(left.asDouble() - right.asDouble());
            return new Value(diff >= SMALL_VALUE);
        } else {
            return new Value(!left.equals(right));
        }
    }

    @Override
    public Value visitEqExpr(SimplePascalParser.EqExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        if (left.isDouble() && right.isDouble()) {
            double diff = Math.abs(left.asDouble() - right.asDouble());
            return new Value(diff < SMALL_VALUE);
        } else {
            return new Value(left.equals(right));
        }
    }

    @Override
    public Value visitAndExpr(SimplePascalParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(SimplePascalParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitShlExpr(@NotNull SimplePascalParser.ShlExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asInteger() << right.asInteger());
    }

    @Override
    public Value visitShrExpr(@NotNull SimplePascalParser.ShrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asInteger() >> right.asInteger());
    }

    @Override
    public Value visitWriteStatement(SimplePascalParser.WriteStatementContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Value visitReadStatement(SimplePascalParser.ReadStatementContext ctx) {

        String id = ctx.ID().getText();
        String input = new Scanner(System.in).nextLine();
        Value value = new Value( input );
        return memory.put(id, value);
    }


    // if override
    @Override
    public Value visitIfStatement(SimplePascalParser.IfStatementContext ctx) {

        List<SimplePascalParser.ConditionBlockIfContext> conditions = ctx.conditionBlockIf();

        boolean evaluatedBlock = false;

        for (SimplePascalParser.ConditionBlockIfContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if (evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.blockOrStatement());
                break;
            }
        }

        if (!evaluatedBlock && ctx.blockOrStatement() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.blockOrStatement());
        }

        return Value.VOID;
    }

    @Override
    public Value visitCaseStatement(@NotNull SimplePascalParser.CaseStatementContext ctx) {
        List<SimplePascalParser.ConditionBlockCaseContext> conditions = ctx.conditionBlockCase();
        Value evaluated = this.visit(ctx.expr());

        for (SimplePascalParser.ConditionBlockCaseContext condition : conditions) {
            Value condValue = this.visit(condition.term());
            if (condValue.toString().equals(evaluated.toString())) {
                this.visit(condition.blockOrStatement());
                break;
            }
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhileStatement(SimplePascalParser.WhileStatementContext ctx) {

        Value value = this.visit(ctx.expr());

        while (value.asBoolean()) {
            this.visit(ctx.blockOrStatement());

            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }

    @Override
    public Value visitRepeatStatement(@NotNull SimplePascalParser.RepeatStatementContext ctx) {
        Value value = new Value(false);


        while (!value.asBoolean()) {
            for (SimplePascalParser.StatementContext stmt : ctx.statement()) {
                this.visit(stmt);
            }

            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }

    @Override
    public Value visitForStatement(@NotNull SimplePascalParser.ForStatementContext ctx) {
        String counterId = ctx.ID().getText();
        Value initial = this.visit(ctx.initial);
        Value terminal = this.visit(ctx.terminal);

        memory.put(counterId, initial);

        for (double i = initial.asDouble(); i <= terminal.asDouble(); i++) {
            memory.put(counterId, new Value(i));

            this.visit(ctx.blockOrStatement());

        }
        return Value.VOID;
    }

    public List<Value> evaluateArgs(SimplePascalParser.ArgListContext argsCtx) {
        List<Value> fnArgs = new ArrayList<Value>();
        for (SimplePascalParser.ExprContext argExpr : argsCtx.expr()) {
            fnArgs.add(this.visit(argExpr));
        }
        return fnArgs;
    }


    @Override
    public Value visitTrigFunCall(@NotNull SimplePascalParser.TrigFunCallContext ctx) {

        Value arg = this.visit(ctx.expr());
        Double angle = Math.toRadians(arg.asDouble());

        switch (ctx.fun.getType()){
            case SimplePascalParser.FN_SIN  : return new Value(Math.sin(angle));
            case SimplePascalParser.FN_COS  : return new Value(Math.cos(angle));
            case SimplePascalParser.FN_TAN  : return new Value(Math.tan(angle));
            case SimplePascalParser.FN_ATAN : return new Value(Math.atan(angle));
        }
        return Value.VOID;
    }

    @Override
    public Value visitIncFunCall(@NotNull SimplePascalParser.IncFunCallContext ctx) {
        Value val =  memory.get( ctx.ID().getText() );
        Double modified;

        if(ctx.fun.getType() == SimplePascalParser.FN_INC){
            modified = val.asDouble() + 1;
        } else {
            modified = val.asDouble() - 1;
        }
        return memory.put(ctx.ID().getText(), new Value(modified));
    }

    @Override
    public Value visitMathFunCall(@NotNull SimplePascalParser.MathFunCallContext ctx) {
        List<Value> args = this.evaluateArgs(ctx.argList());
        Double firstArg =  args.get(0).asDouble();
        switch (ctx.fun.getType()){
            case SimplePascalParser.FN_SQRT : return new Value(Math.sqrt ( firstArg ));
            case SimplePascalParser.FN_POW  : return new Value(Math.pow  ( firstArg, args.get(1).asDouble() ));
            case SimplePascalParser.FN_LN   : return new Value(Math.log10( firstArg ));
            case SimplePascalParser.FN_EXP  : return new Value(Math.exp  ( firstArg ));
        }
        return Value.VOID;
    }

    @Override
    public Value visitStrFunCall(@NotNull SimplePascalParser.StrFunCallContext ctx) {
        List<Value> args = this.evaluateArgs(ctx.argList());
        String stringArg = args.get(0).asString();
        Integer startIndex, endIndex;

        switch (ctx.fun.getType()){
            case SimplePascalParser.FN_LEN: return new Value( stringArg.length()  );

            case SimplePascalParser.FN_CPY:
                startIndex  = args.get(1).asInteger();
                endIndex =  startIndex + args.get(2).asInteger();
                return new Value( stringArg.substring(startIndex, endIndex));

            case SimplePascalParser.FN_DEL:
                startIndex = args.get(1).asInteger();
                endIndex =  startIndex + args.get(2).asInteger();
                return new Value(stringArg.substring(0, startIndex) + stringArg.substring(endIndex, stringArg.length()) );

            case SimplePascalParser.FN_CNCT:
                StringBuilder builder = new StringBuilder();
                for (Value arg: args) {
                    builder.append(arg.asString());
                }
                return  new Value(builder.toString());
        }
        return Value.VOID;
    }
}