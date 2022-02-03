import java.io.*;
import java.util.ArrayList;

public class TxtWorker {

    ArrayList<String> article = new ArrayList<>();

    public ArrayList<String> articleToList(String txtPath) throws IOException {
        File file = new File(txtPath);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line = bufferedReader.readLine();
        while (line != null) {
            article.add(line);
            line = bufferedReader.readLine();
        }
        return article;
    }
}
