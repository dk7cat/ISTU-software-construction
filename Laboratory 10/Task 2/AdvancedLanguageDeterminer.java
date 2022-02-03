public class AdvancedLanguageDeterminer {

    public AdvancedCompiler getCompiler(String language) {
        if (language.equals("Python")) {
            return new AdvancedPythonCompiler();
        }
        else if (language.equals("Java")) {
            return new AdvancedJavaCompiler();
        }
        else {
            return new AdvancedCCompiler();
        }
    }
}
