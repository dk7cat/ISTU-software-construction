import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task33 {

    public static void main(String[] args) {
        String path = "Laboratory 3/Files/task33.csv";
        int counter = 0;
        try (FileReader reader = new FileReader(path)) {

            int symbol;
            while ((symbol = reader.read()) != -1) {

                if (symbol == 44) {

                    counter += 1;
                }
                else if (symbol == 13) {

                    counter += 1;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] numbersArray = new int[counter][counter];
        try (FileReader reader = new FileReader(path)) {

            Pattern commaPattern = Pattern.compile(",");
            Pattern newLinePattern = Pattern.compile("\\s");
            StringBuilder number = new StringBuilder();
            int rowCounter = 0, columnCounter = 0;
            int symbol;
            while ((symbol = reader.read()) != -1) {

                Matcher commaMatcher = commaPattern.matcher(String.valueOf((char) symbol));
                Matcher newLineMatcher = newLinePattern.matcher(String.valueOf((char) symbol));
                if (symbol == 44) {

                    numbersArray[rowCounter][columnCounter] = Integer.parseInt(number.toString());
                    columnCounter += 1;
                    number = new StringBuilder();
                    continue;
                } else if (symbol == 13) {

                    numbersArray[rowCounter][columnCounter] = Integer.parseInt(number.toString());
                    columnCounter = 0;
                    rowCounter += 1;
                    number = new StringBuilder();
                    continue;
                } else if (symbol == 10) {

                    continue;
                }
                number.append((char) symbol);
            }
            numbersArray[rowCounter][columnCounter] = Integer.parseInt(number.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int[] numbers: numbersArray) {

            for (int number: numbers) {

                System.out.format("%-4d", number);
            }
            System.out.println();
        }
        for(int i = 0; i < numbersArray.length; i++) {

            for(int j = 0; j < numbersArray[i].length; j++) {

                if (i > j) {

                    continue;
                }
                int num = numbersArray[i][j];
                numbersArray[i][j] = numbersArray[j][i];
                numbersArray[j][i] = num;
            }
        }
        System.out.println();
        for (int[] numbers: numbersArray) {

            for (int number: numbers) {

                System.out.format("%-4d", number);
            }
            System.out.println();
        }
    }
}
