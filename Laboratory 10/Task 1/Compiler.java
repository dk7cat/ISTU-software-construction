import java.io.File;
import java.io.IOException;

public interface Compiler {
// Базовый класс компилятора
    public void compile(File file) throws IOException;
}
