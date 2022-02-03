import java.util.Random;

public class ShapesRandomizer {

    public static ShapeFactory chooseRandomSize() {
        Random random = new Random();
        ShapeSize shapeSize = ShapeSize.values()[random.nextInt(ShapeSize.values().length)];
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
        ShapeClass shapeClass = ShapeClass.values()[random.nextInt(ShapeClass.values().length)];
        return shapeFactory.createShape(shapeClass);
    }

}
