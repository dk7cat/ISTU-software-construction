import java.util.Random;

public class ShapesRandomizer {
// Класс создает случайную фигуру
    public static ShapeFactory chooseRandomSize() {
        Random random = new Random();
//       Получаем случайный размер фигуры
        ShapeSize shapeSize = ShapeSize.values()[random.nextInt(ShapeSize.values().length)];
//        Создаем соответствующую Фабрику
        switch (shapeSize) {
            case SUPER:
                return new SuperShapeFactory();
            case NORMAL:
                return new NormalShapeFactory();
        }
        return null;
    }

    public static Shape chooseRandomClass(ShapeFactory shapeFactory) {
        Random random = new Random();
//        Получаем случайный тип фигуры
        ShapeClass shapeClass = ShapeClass.values()[random.nextInt(ShapeClass.values().length)];
//        При помощи полученной фабрики создаем обьект фигуры
        return shapeFactory.createShape(shapeClass);
    }

}
