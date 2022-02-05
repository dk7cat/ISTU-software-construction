import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task102 {
    //  Точка входа
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ImprovedManager manager = new ImprovedManager();
        DialogHandler dialog = new DialogHandler(manager);
        System.out.print("Введите язык: ");
        manager.setLanguage(scanner.nextLine());
        manager.createCompiler();
        dialog.startDialog();
    }
}
