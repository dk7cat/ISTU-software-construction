import java.io.File;
import java.io.IOException;

public class ImprovedManager {

    String language;
    AdvancedCompiler compiler;

    public void setLanguage(String language) {
        this.language = language;
    }
//  Метод создает компилятор
    public void createCompiler() {
        switch (language) {
            case "Java": {
                compiler = new AdvancedJavaCompiler();
                break;
            }
            case "Python": {
                compiler = new AdvancedPythonCompiler();
                break;
            }
            case "C": {
                compiler = new AdvancedCCompiler();
                break;
            }
        }
    }
//  Методы делегируют компилятору функции
    public void compile(String code) throws IOException {
        compiler.compile(code);
    }

    public void buildLexemeTable(String code) {
        compiler.buildLexemeTable(code);
    }
    public void buildIdentifierTable(String code) {
        compiler.buildIdentifierTable(code);
    }
    public void buildDsr(String code) {
        compiler.buildDsr(code);
    }
    public void buildTriad(String code) {
        compiler.buildTriad(code);
    }
    public void optimize(String code) {
        compiler.optimize(code);
    }
    public void buildObjectCode(String code) {
        compiler.buildObjectCode(code);
    }
}
