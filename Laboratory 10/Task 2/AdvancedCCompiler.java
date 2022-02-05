import java.io.File;
import java.io.IOException;

public class AdvancedCCompiler extends AdvancedCompiler {
    @Override
    public void compile(String code) {
        super.compile(code);
    }

    @Override
    public void buildLexemeTable(String code) {
        System.out.println("Building C lexeme table");
    }

    @Override
    public void buildIdentifierTable(String code) {
        System.out.println("Building C identifier table");
    }

    @Override
    public void buildDsr(String code) {
        System.out.println("Building C DSR");
    }

    @Override
    public void buildTriad(String code) {
        System.out.println("Building C Triad");
    }

    @Override
    public void optimize(String code) {
        System.out.println("Optimizing C");
    }

    @Override
    public void buildObjectCode(String code) {
        System.out.println("Building C object code");
    }
}
