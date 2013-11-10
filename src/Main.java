import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.stringtemplate.v4.compiler.STParser.expr_return;

public class Main {
    public static void main(String[] args) throws Exception {
    	String input = "1 + 1";
    	if(args.length > 0 ){
    		input = args[0];
    		System.out.println("input : " + input);
    	}else{
    		System.out.println("default : " + input);
    	}
    	
    	//String input = args[0];
    	//if()
    	SimplePascalLexer lex = new SimplePascalLexer(new ANTLRStringStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        SimplePascalParser parser = new SimplePascalParser(tokens);
 

        
    	
        try {
          //  SimplePascalParser.expr_return t = parser.expr();
            
          //  System.out.println(((Tree) t.tree).toStringTree());
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }
}
