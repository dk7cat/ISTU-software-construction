import java.io.File;
import java.io.IOException;

public class Manager {

    String language;
    BaseCompiler compiler;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void createCompiler() {
        switch (language) {
            case "Go": {
                compiler = new GoCompiler();
                break;
            }
            case "R": {
                compiler = new RCompiler();
                break;
            }
            case "Rust": {
                compiler = new RustCompiler();
                break;
            }
        }
    }

    public void compile(File file) throws IOException {
        compiler.compile(file);
    }
}
