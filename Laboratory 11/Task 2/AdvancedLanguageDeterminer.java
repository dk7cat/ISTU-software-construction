public class AdvancedLanguageDeterminer {
//  Метод определяет какой язык дан и выдает соответствующий обьект
    public ImprovedCompiler getCompiler(String language) {
        if (language.equals("Go")) {
            return new ImprovedGoCompiler();
        }
        else if (language.equals("R")) {
            return new ImprovedRCompiler();
        }
        else if (language.equals("Rust")) {
            return new ImprovedRustCompiler();
        }
        return null;
    }
}
