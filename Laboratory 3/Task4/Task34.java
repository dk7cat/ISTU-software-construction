import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34 {

    public static void main(String[] args) {
        // Слово шаблон
        String patternWord = "123";

        String path = "Laboratory 3/Files/task34.txt";
        String newPath = "Laboratory 3/Files/task34_new.txt";
        Pattern pattern = Pattern.compile("\\s");
//        Создаем обьект для чтения из файла
        try (FileReader reader = new FileReader(path)) {

            StringBuilder string = new StringBuilder();
//             Создаем обьект для записи в файл
            try (FileWriter writer = new FileWriter(newPath)) {

                int symbol;
//                Читаем по символьно
                while ((symbol = reader.read()) != -1) {

                    Matcher matcher = pattern.matcher(String.valueOf((char) symbol));
                    if (matcher.find()) {
//                      Если находим строку шаблон, то записываем
                        if (patternWord.equals(string.toString())) {

                            writer.write(string+" ");
                        }
                        else {

                            string = new StringBuilder();
                            continue;
                        }
                    }
                    string.append((char) symbol);
                }
//                Если находим строку шаблон, то записываем
                if (patternWord.equals(string.toString())) {

                    writer.write(string.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
