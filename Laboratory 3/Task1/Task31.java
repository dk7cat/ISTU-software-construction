
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {

    public static void main(String[] args) {
        String path = "Laboratory 3/Files/task31.txt";
        try(FileReader reader = new FileReader(path)) {
            StringBuilder firstWord = new StringBuilder();
            StringBuilder secondWord = new StringBuilder();
            Pattern pattern = Pattern.compile("\\s");
            int symbol;
            while((symbol=reader.read())!=-1){
                Matcher matcher = pattern.matcher(String.valueOf((char)symbol));
                if (matcher.find()) {
                    if ((firstWord.length() > 0 && secondWord.length() > 0)
                            && secondWord.charAt(secondWord.length() - 1) == firstWord.charAt(0)) {
                        System.out.println(secondWord + " " + firstWord);
                    }
                    if (firstWord.length() > 0) {
                        secondWord = new StringBuilder(firstWord);
                    }
                    firstWord.setLength(0);
                    continue;
                }
                firstWord.append((char) symbol);
            }
            if ((firstWord.length() > 0 && secondWord.length() > 0)
                    && secondWord.charAt(secondWord.length() - 1) == firstWord.charAt(0)) {
                System.out.println(secondWord + " " + firstWord);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
