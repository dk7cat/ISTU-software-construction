import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ImprovedRustCompiler extends ImprovedCompiler {
    @Override
    public void compile(String code) {
        super.compile(code);
    }

    @Override
    public void buildLexemeTable(String code) {
        System.out.println("Building Rust lexeme table");
    }

    @Override
    public void buildIdentifierTable(String code) {
        System.out.println("Building Rust identifier table");
    }

    @Override
    public void buildDsr(String code) {
        System.out.println("Building Rust DSR");
    }

    @Override
    public void buildTriad(String code) {
        System.out.println("Building Rust Triad");
    }

    @Override
    public void optimize(String code) {
        System.out.println("Optimizing Rust");
    }

    @Override
    public void buildObjectCode(String code) {
        System.out.println("Building Rust object code");
    }
}
