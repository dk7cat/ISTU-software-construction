import java.io.File;
import java.io.IOException;

public class Task101 {

    public static void main(String[] args) throws IOException {
        LanguageDeterminer determiner = new LanguageDeterminer();
        Compiler compiler = determiner.getCompiler("Java");
        File codeFile = new File("");
        compiler.compile(codeFile);
    }
}
