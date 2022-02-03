import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RustCompiler implements BaseCompiler {

    @Override
    public void compile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println("Reading Rust code...");
            System.out.println("Converting Rust code to object code...");
            System.out.println("Object code.");
            line = bufferedReader.readLine();
        }
    }
}
