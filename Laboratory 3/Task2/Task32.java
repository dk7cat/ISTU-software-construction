import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task32 {

    public static void main(String[] args) {
        String path = "Laboratory 3/Files/task32.txt";
        String tempPath = path + ".tmp";
        try (FileReader reader = new FileReader(path)) {
            try (FileWriter writer = new FileWriter(tempPath)) {
                Pattern pattern = Pattern.compile("\\s");
                StringBuilder word = new StringBuilder();
                int symbol;
                while ((symbol = reader.read()) != -1) {
                    Matcher matcher = pattern.matcher(String.valueOf((char) symbol));
                    if (matcher.find()) {
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
                if (String.valueOf(word).equals("public")) {
                    writer.write("private");
                } else {
                    writer.write(String.valueOf(word));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File oldFile = new File(path);
        File newFile = new File(tempPath);
        oldFile.delete();
        newFile.renameTo(oldFile);
    }
}
