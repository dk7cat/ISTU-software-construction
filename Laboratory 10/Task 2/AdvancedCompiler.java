import java.io.File;
import java.io.IOException;

public abstract class AdvancedCompiler {

    public void compile(String code) throws IOException {
        buildLexemeTable(code);
        buildIdentifierTable(code);
        buildDsr(code);
        buildTriad(code);
        optimize(code);
        buildObjectCode(code);
    }
    public void buildLexemeTable(String code) {}
    public void buildIdentifierTable(String code) {}
    public void buildDsr(String code) {}
    public void buildTriad(String code) {}
    public void optimize(String code) {}
    public void buildObjectCode(String code) {}
}
