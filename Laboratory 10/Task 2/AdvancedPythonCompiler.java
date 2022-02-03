import java.io.File;
import java.io.IOException;

public class AdvancedPythonCompiler extends AdvancedCompiler{
    @Override
    public void compile(String code) throws IOException {
        super.compile(code);
    }

    @Override
    public void buildLexemeTable(String code) {
        System.out.println("Building Python lexeme table");
    }

    @Override
    public void buildIdentifierTable(String code) {
        System.out.println("Building Python identifier table");
    }

    @Override
    public void buildDsr(String code) {
        System.out.println("Building Python DSR");
    }

    @Override
    public void buildTriad(String code) {
        System.out.println("Building Python Triad");
    }

    @Override
    public void optimize(String code) {
        System.out.println("Optimizing Python");
    }

    @Override
    public void buildObjectCode(String code) {
        System.out.println("Building Python object code");
    }
}
