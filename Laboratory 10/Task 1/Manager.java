import java.io.File;
import java.io.IOException;

public class Manager {

    String language;
    Compiler compiler;

    public void setLanguage(String language) {
        this.language = language;
    }
    //  Метод создает компилятор
    public void createCompiler() {
        switch (language) {
            case "C": {
                compiler = new CCompiler();
                break;
            }
            case "Java": {
                compiler = new JavaCompiler();
                break;
            }
            case "Python": {
                compiler = new PythonCompiler();
                break;
            }
        }
    }
    //  Метод испольняет компиляцию
    public void compile(File file) throws IOException {
        compiler.compile(file);
    }
}
