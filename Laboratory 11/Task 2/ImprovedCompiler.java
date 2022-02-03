import java.io.File;
import java.io.IOException;

public abstract class ImprovedCompiler {

    public void compile(File file) throws IOException {
        buildLexemeTable(file);
        buildIdentifierTable(file);
        buildDsr(file);
        buildTriad(file);
        optimize(file);
        buildObjectCode(file);
    }

    public void buildLexemeTable(File file) {}
    public void buildIdentifierTable(File file) {}
    public void buildDsr(File file) {}
    public void buildTriad(File file) {}
    public void optimize(File file) {}
    public void buildObjectCode(File file) {}
}
