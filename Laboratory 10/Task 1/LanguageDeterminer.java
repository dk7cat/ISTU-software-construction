public class LanguageDeterminer {


    public Compiler getCompiler(String language) {
        if (language.equals("Python")) {
            return new PythonCompiler();
        }
        else if (language.equals("Java")) {
            return new JavaCompiler();
        }
        else {
            return new CCompiler();
        }
    }
}
