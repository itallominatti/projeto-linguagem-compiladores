package DataLang.DataLang;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "lang";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            DataLangLexer lexer = new DataLangLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DataLangParser parser = new DataLangParser(tokens);
            DataLangParser.ProgramContext tree = parser.program();
            DataLangCustomVisitor visitor = new DataLangCustomVisitor();
            visitor.visit(tree);

            System.out.println("FINISH: " + file);
        }
    }
}
