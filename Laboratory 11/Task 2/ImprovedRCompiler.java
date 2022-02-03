import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ImprovedRCompiler extends ImprovedCompiler{

    @Override
    public void compile(File file) throws IOException {
        super.compile(file);
    }

    @Override
    public void buildLexemeTable(File file) {
        System.out.println("Building R lexeme table");
    }

    @Override
    public void buildIdentifierTable(File file) {
        System.out.println("Building R identifier table");
    }

    @Override
    public void buildDsr(File file) {
        System.out.println("Building R DSR");
    }

    @Override
    public void buildTriad(File file) {
        System.out.println("Building R Triad");
    }

    @Override
    public void optimize(File file) {
        System.out.println("Optimizing R");
    }

    @Override
    public void buildObjectCode(File file) {
        System.out.println("Building R object code");
    }
}
