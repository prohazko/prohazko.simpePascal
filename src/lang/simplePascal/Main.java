package lang.simplePascal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.antlr.runtime.RecognitionException;


public class Main {
    public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("No input file specified.");
		} else {
			File input = new File(args[0]);
			Scanner scanner = null;
			try {
				scanner = new Scanner(input).useDelimiter("\\Z");
			} catch (FileNotFoundException e1) {
				System.out.println("File " + args[0] + " not found." );
			}
			String program = scanner.next();

			int result = 0;
			try {
				result = SimplePascalEvaluator.execute(program);
				System.out.println("The result is: " + result);
			} catch (RecognitionException e) {
				System.out.println("Recognition exception:");
				System.out.println(e.getMessage());
			}
		}
    }
}
