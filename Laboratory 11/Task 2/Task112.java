import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task112 {
    //  Точка входа
    public static void main(String[] args) throws IOException {
        DialogManager dialogManager = new DialogManager(new AdvancedLanguageDeterminer());
        dialogManager.startDialog();
    }

}