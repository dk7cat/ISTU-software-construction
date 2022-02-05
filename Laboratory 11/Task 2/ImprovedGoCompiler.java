import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ImprovedGoCompiler extends ImprovedCompiler {

    @Override
    public void compile(String code) {
        super.compile(code);
    }

    @Override
    public void buildLexemeTable(String code) {
        System.out.println("Building Go lexeme table");
    }

    @Override
    public void buildIdentifierTable(String code) {
        System.out.println("Building Go identifier table");
    }

    @Override
    public void buildDsr(String code) {
        System.out.println("Building Go DSR");
    }

    @Override
    public void buildTriad(String code) {
        System.out.println("Building Go Triad");
    }

    @Override
    public void optimize(String code) {
        System.out.println("Optimizing Go");
    }

    @Override
    public void buildObjectCode(String code) {
        System.out.println("Building Go object code");
    }
}
