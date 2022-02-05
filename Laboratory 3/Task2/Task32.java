import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task32 {

    public static void main(String[] args) {
        String path = "Laboratory 3/Files/task32.txt";
        String tempPath = path + ".tmp";
//        Создаем обьект для чтения из файла
        try (FileReader reader = new FileReader(path)) {
//            Создаем обьект для записи в файла
            try (FileWriter writer = new FileWriter(tempPath)) {
                Pattern pattern = Pattern.compile("\\s");
                StringBuilder word = new StringBuilder();
                int symbol;
//                Читаем файл по символьно
                while ((symbol = reader.read()) != -1) {
//                    Паттерн проверяющий является ли элемент пробелом или переводом каретки
                    Matcher matcher = pattern.matcher(String.valueOf((char) symbol));
                    if (matcher.find()) {
//                        Заменяем public на private
                        if (String.valueOf(word).equals("public")) {
                            writer.write("private");
                        } else {
                            writer.write(String.valueOf(word));
                        }
                        writer.write((char) symbol);
                        word = new StringBuilder();
                        continue;
                    }
                    word.append((char) symbol);

                }
//                Заменяем public на private
                if (String.valueOf(word).equals("public")) {
                    writer.write("private");
                } else {
                    writer.write(String.valueOf(word));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Переносим все в основной файл из временного. И удаляем временный
        File oldFile = new File(path);
        File newFile = new File(tempPath);
        oldFile.delete();
        newFile.renameTo(oldFile);
    }
}
