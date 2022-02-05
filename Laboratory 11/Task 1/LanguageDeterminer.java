public class LanguageDeterminer {

//  Метод определяет какой язык дан и выдает соответствующий обьект
    public BaseCompiler getCompiler(String language) {
        if (language.equals("Go")) {
            return new GoCompiler();
        }
        else if (language.equals("Rust")) {
            return new RustCompiler();
        }
        else if (language.equals("R")) {
            return new RCompiler();
        }
        return null;
    }
}
