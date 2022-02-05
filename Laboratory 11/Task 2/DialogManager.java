import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DialogManager {
//    Класс ждет команд от пользователя и совершает соответствующие действия
    Scanner scanner = new Scanner(System.in);
    ImprovedCompiler compiler;
    AdvancedLanguageDeterminer determiner;

    public DialogManager(AdvancedLanguageDeterminer determiner) {
        this.determiner = determiner;
    }

    public void startDialog() {
        System.out.print("Введите название языка: ");
        String language = scanner.nextLine();
        compiler = determiner.getCompiler(language);
        System.out.print("Введите код: ");
        String code = scanner.nextLine();
        boolean isLasts = true;
        String answer = "";
        while (isLasts) {
            System.out.println("\n1. Смена / задание языка\n" +
                            "2. Построить таблицу лексем\n3. Построить таблицу идентификаторов\n" +
                            "4. Построить ДСР\n5. Построить триады\n6. Произвести оптимизацию\n" +
                            "7. Создать объектный код\n8. Произвести все операции\n0. Выход");
            System.out.print("Выберите опцию: ");
            answer = scanner.nextLine();
            System.out.println();
//            Получаем ответ от пользователя и совершаем операцию
            switch (answer) {
                case "1": {
                    System.out.println("Вы выбрали \"Смена / задание языка\"");
                    System.out.print("Введите название языка: ");
                    compiler = determiner.getCompiler(scanner.nextLine());
                    break;
                }
                case "2": {
                    compiler.buildLexemeTable(code);
                    break;
                }
                case "3": {
                    compiler.buildIdentifierTable(code);
                    break;
                }
                case "4": {
                    compiler.buildDsr(code);
                    break;
                }
                case "5": {
                    compiler.buildTriad(code);
                    break;
                }
                case "6": {
                    compiler.optimize(code);
                    break;
                }
                case "7": {
                    compiler.buildObjectCode(code);
                    break;
                }
                case "8": {
                    compiler.compile(code);
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
