import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task35 {
    public static void main(String[] args) {

        String path = "Laboratory 3/Files/task35.txt";
        String longestNumber = "";
        StringBuilder currentNumber = new StringBuilder();
//        Создаем обьект для чтения из файла
        try (FileReader reader = new FileReader(path)) {

            Pattern pattern = Pattern.compile("\\d+");
            Pattern spacePattern = Pattern.compile("\\s");
            Matcher spaceMatcher;
            Matcher matcher;
            int symbol;
//            Читаем посимвольно
            while ((symbol = reader.read()) != -1) {

                spaceMatcher = spacePattern.matcher(String.valueOf((char)symbol));
                if (spaceMatcher.find()) {
//                    Если находим число, проверяем не длинее ли оно текущего самого длинного числа
                    matcher = pattern.matcher(currentNumber.toString());
                    if (matcher.find() && currentNumber.toString().length() > longestNumber.length()) {
                        longestNumber = currentNumber.toString();
                    }
                    currentNumber = new StringBuilder();
                    continue;
                }
                currentNumber.append((char)symbol);
            }
//           Проверяем не длинее ли последнее число текущего самого длинного числа
            matcher = pattern.matcher(currentNumber.toString());
            if (matcher.find() && currentNumber.toString().length() > longestNumber.length()) {
                longestNumber = currentNumber.toString();
            }
            System.out.println(longestNumber);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
