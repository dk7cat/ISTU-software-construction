import jdk.jshell.Snippet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task101 {
    //  Точка входа
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.print("Введите язык: ");
        manager.setLanguage(scanner.nextLine());
        manager.createCompiler();
        manager.compile(new File("pom.xml"));
    }
}
