import java.io.File;
import java.io.IOException;

public abstract class ImprovedCompiler {
//  Произведение полного цикла обработки кода
    public void compile(String code) {
        buildLexemeTable(code);
        buildIdentifierTable(code);
        buildDsr(code);
        buildTriad(code);
        optimize(code);
        buildObjectCode(code);
    }
//    Построение таблицы лексем
    public void buildLexemeTable(String code) {}
//    Построение таблицы идентификаторов
    public void buildIdentifierTable(String code) {}
//    Построение ДСР
    public void buildDsr(String code) {}
    //    Построение триад
    public void buildTriad(String code) {}
//    Оптимизация
    public void optimize(String code) {}
//    Построение обьектного кода
    public void buildObjectCode(String code) {}
}
