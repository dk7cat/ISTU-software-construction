import java.io.*;

public class CCompiler implements Compiler {


    @Override
    public void compile(File file) throws IOException {
//        Открываем файл
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
//        Считываем и переводим содержимое файла в обьектный код
        while (line != null) {
            System.out.println("Reading C code...");
            System.out.println("Converting C code to object code...");
            System.out.println("Object code.");
            line = bufferedReader.readLine();
        }
    }
}
