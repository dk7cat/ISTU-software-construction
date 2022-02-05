import java.io.File;
import java.io.IOException;

public class AdvancedJavaCompiler extends AdvancedCompiler{
    @Override
    public void compile(String code) {
        super.compile(code);
    }

    @Override
    public void buildLexemeTable(String code) {
        System.out.println("Building Java lexeme table");
    }

    @Override
    public void buildIdentifierTable(String code) {
        System.out.println("Building Java identifier table");
    }

    @Override
    public void buildDsr(String code) {
        System.out.println("Building Java DSR");
    }

    @Override
    public void buildTriad(String code) {
        System.out.println("Building Java Triad");
    }

    @Override
    public void optimize(String code) {
        System.out.println("Optimizing Java");
    }

    @Override
    public void buildObjectCode(String code) {
        System.out.println("Building Java object code");
    }
}
