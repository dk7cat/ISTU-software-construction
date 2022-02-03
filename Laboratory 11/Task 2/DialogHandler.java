import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DialogHandler {

    Scanner scanner = new Scanner(System.in);
    ImprovedManager manager;

    public DialogHandler(ImprovedManager manager) {
        this.manager = manager;
    }


    public void startDialog() throws IOException {
        System.out.print("Введите путь к файлу с кодом: ");
        File file = new File(scanner.nextLine());
        boolean isLasts = true;
        String answer = "";
        while (isLasts) {
            System.out.println("\n1. Смена / задание языка\n" +
                    "2. Построить таблицу лексем\n3. Построить таблицу идентификаторов\n" +
                    "4. Построить ДСР\n5. Построить триады\n6. Произвести оптимизацию\n" +
                    "7. Создать объектный код\n8. Произвести все операции\n0. Выход\n");
            System.out.print("Выберите опцию: ");
            answer = scanner.nextLine();
            System.out.println();
            switch (answer) {
                case "1": {
                    System.out.println("Вы выбрали \"Смена / задание языка\"");
                    System.out.print("Введите название языка: ");
                    manager.setLanguage(scanner.nextLine());
                    manager.createCompiler();
                    break;
                }
                case "2": {
                    manager.buildLexemeTable(file);
                    break;
                }
                case "3": {
                    manager.buildIdentifierTable(file);
                    break;
                }
                case "4": {
                    manager.buildDsr(file);
                    break;
                }
                case "5": {
                    manager.buildTriad(file);
                    break;
                }
                case "6": {
                    manager.optimize(file);
                    break;
                }
                case "7": {
                    manager.buildObjectCode(file);
                    break;
                }
                case "8": {
                    manager.compile(file);
                    break;
                }
                case "0": {
                    isLasts = false;
                    break;
                }
            }
        }
    }
}
