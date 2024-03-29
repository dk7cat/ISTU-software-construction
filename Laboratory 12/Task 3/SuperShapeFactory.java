public class SuperShapeFactory implements ShapeFactory{
// Класс создающий супер фигуры по заданному типу фигуры
    @Override
    public Shape createShape(ShapeClass shapeClass) {
        switch (shapeClass) {
            case ISHAPE: {
                return new SuperIShape();
            }
            case JSHAPE: {
                return new SuperJShape();
            }
            case LSHAPE: {
                return new SuperLShape();
            }
            case OSHAPE: {
                return new SuperOShape();
            }
        }
        return null;
    }
}
