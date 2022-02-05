import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task111 {
    //  Точка входа
    public static void main(String[] args) throws IOException {
//        Создаем определитель языка
        LanguageDeterminer determiner = new LanguageDeterminer();
//        Получаем язык по желанию
        BaseCompiler compiler = determiner.getCompiler("Go");
//        Компилируем файл
        File codeFile = new File("pom.xml");
        compiler.compile(codeFile);
    }
}
