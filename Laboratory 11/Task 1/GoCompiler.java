import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GoCompiler implements BaseCompiler {
    @Override
    public void compile(File file) throws IOException {
//        Открываем файл
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
//        Считываем и переводим содержимое файла в обьектный код
        while (line != null) {
            System.out.println("Reading Go code...");
            System.out.println("Converting Go code to object code...");
            System.out.println("Object code.");
            line = bufferedReader.readLine();
        }
    }
}
