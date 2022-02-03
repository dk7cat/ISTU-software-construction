import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ImprovedRustCompiler extends ImprovedCompiler {
    @Override
    public void compile(File file) throws IOException {
        super.compile(file);
    }

    @Override
    public void buildLexemeTable(File file) {
        System.out.println("Building Rust lexeme table");
    }

    @Override
    public void buildIdentifierTable(File file) {
        System.out.println("Building Rust identifier table");
    }

    @Override
    public void buildDsr(File file) {
        System.out.println("Building Rust DSR");
    }

    @Override
    public void buildTriad(File file) {
        System.out.println("Building Rust Triad");
    }

    @Override
    public void optimize(File file) {
        System.out.println("Optimizing Rust");
    }

    @Override
    public void buildObjectCode(File file) {
        System.out.println("Building Rust object code");
    }
}
