package edu.simplepascal;

import edu.simplepascal.antlr.*;
import edu.simplepascal.lang.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String srcFileName = args.length != 0 ? args[0] : "test/general.pas";
        SimplePascalLexer lexer =   new SimplePascalLexer(new ANTLRFileStream(srcFileName));

        SimplePascalParser parser = new SimplePascalParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();

        BaseVisitor visitor = new BaseVisitor();
        visitor.visit(tree);

    }
}
