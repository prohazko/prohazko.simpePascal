package lang.simplePascal;

import lang.simplePascal.SimplePascalParser.program_return;
import lang.simplePascal.SimplePascalParser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class SimplePascalEvaluator {

	private static Map<String, Integer> variables;
	
	public static int execute(String program) throws RecognitionException {
		CharStream stream = new ANTLRStringStream(program);
		SimplePascalLexer lexer = new SimplePascalLexer(stream);
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		SimplePascalParser parser = new SimplePascalParser(tokens);
		
		program_return programEvaluation = parser.program();
		CommonTree tree = (CommonTree) programEvaluation.getTree();
		
		
		
		variables = new HashMap<String, Integer>();
		int beginIndex = assignVariables(tree);

		return executeProgram(tree, beginIndex);
	}
	
	private static int assignVariables(CommonTree root) {
		int beginIndex = 0;
		CommonTree assignTree = (CommonTree) root.getChild(0);
		while(assignTree.getToken().getType() == SimplePascalParser.ASSIGN ){
			
			String id = assignTree.getChild(0).getText();
			int value = evaluateExpression((CommonTree) assignTree.getChild(1));

			variables.put(id, value);

			beginIndex++;
			assignTree = (CommonTree) root.getChild(beginIndex);
		}

		return beginIndex;
	}

	private static int executeProgram(CommonTree root, int begin) {
		
		for (int i = begin; i < root.getChildCount(); i++) {
			CommonTree c = (CommonTree) root.getChild(i);

			executeStatement(c);
		}
		
		CommonTree returnStatement = (CommonTree) root.getChild(root.getChildCount() - 1);
		return evaluateExpression((CommonTree) returnStatement.getChild(0));
	}
	

	private static void executeTree(CommonTree root) {
		for (int i = 0; i < root.getChildCount(); i++) {
			CommonTree c = (CommonTree) root.getChild(i);
			executeStatement(c);
		}
	}
	

	private static void executeStatement(CommonTree statement) {
		switch (statement.getToken().getType()) {
			case SimplePascalParser.ASSIGN:
				String id = statement.getChild(0).getText();
				int value = evaluateExpression((CommonTree) statement.getChild(1));
				variables.put(id, value);
				break;
			case SimplePascalParser.IF:
				int condition = evaluateExpression((CommonTree) statement.getChild(0));
				if (condition != 0) {
					executeTree((CommonTree) statement.getChild(1));
				} else if (statement.getChildCount() > 2) {
					executeTree((CommonTree) statement.getChild(2));
				}
				break;
			case SimplePascalParser.WHILE:
				CommonTree conditionNode = (CommonTree) statement.getChild(0);
				while (evaluateExpression(conditionNode) != 0) {
					executeTree((CommonTree) statement.getChild(1));
				}
				break;
			case SimplePascalParser.PRINT:
				CommonTree printNode = (CommonTree) statement.getChild(0);
				System.out.print(printNode.getLine());
				System.out.print(": print " + printNode.getText() + " - " );
				System.out.println( evaluateExpression(printNode));
				break;
		}
	}
	
	private static int evaluateExpression(CommonTree expression) {
		CommonTree op1 = (CommonTree) expression.getChild(0);
		CommonTree op2 = (CommonTree) expression.getChild(1);
		org.antlr.runtime.Token token = expression.getToken();
		
		switch (token.getType()) {
			case SimplePascalParser.INTEGER:
				return Integer.parseInt(token.getText());
			case SimplePascalParser.IDENT:
				if (variables.containsKey(token.getText())) {
					return variables.get(token.getText());
				} else {
					System.out.println("Warning: Undefined variable " + token.getText() + ". Assuming value 0.");
					return 0;
				}
			
			case SimplePascalParser.PLUS:
				return evaluateExpression(op1) + evaluateExpression(op2);
			case SimplePascalParser.MINUS:
				return evaluateExpression(op1) - evaluateExpression(op2);
			case SimplePascalParser.MULT:
				return evaluateExpression(op1) * evaluateExpression(op2);
			case SimplePascalParser.DIV:
				return evaluateExpression(op1) / evaluateExpression(op2);
			case SimplePascalParser.MOD:
				return evaluateExpression(op1) % evaluateExpression(op2);
			case SimplePascalParser.POW:
				return (int) Math.pow(evaluateExpression(op1), evaluateExpression(op2));
			case SimplePascalParser.NEGATION:
				return -evaluateExpression(op1);
		}
		
		return 0;
	}
	
}
