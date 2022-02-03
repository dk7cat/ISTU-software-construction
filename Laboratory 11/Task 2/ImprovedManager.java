import java.io.File;
import java.io.IOException;

public class ImprovedManager {

    String language;
    ImprovedCompiler compiler;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void createCompiler() {
        switch (language) {
            case "Go": {
                compiler = new ImprovedGoCompiler();
                break;
            }
            case "R": {
                compiler = new ImprovedRCompiler();
                break;
            }
            case "Rust": {
                compiler = new ImprovedRustCompiler();
                break;
            }
        }
    }

    public void compile(File file) throws IOException {
        compiler.compile(file);
    }

    public void buildLexemeTable(File file) {
        compiler.buildLexemeTable(file);
    }
    public void buildIdentifierTable(File file) {
        compiler.buildIdentifierTable(file);
    }
    public void buildDsr(File file) {
        compiler.buildDsr(file);
    }
    public void buildTriad(File file) {
        compiler.buildTriad(file);
    }
    public void optimize(File file) {
        compiler.optimize(file);
    }
    public void buildObjectCode(File file) {
        compiler.buildObjectCode(file);
    }
}
