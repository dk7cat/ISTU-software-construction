public class NormalShapeFactory implements ShapeFactory {

    @Override
    public Shape createShape(ShapeClass shapeClass) {
        switch (shapeClass) {
            case ISHAPE: {
                return new IShape();
            }
            case JSHAPE: {
                return new JShape();
            }
            case LSHAPE: {
                return new LShape();
            }
            case OSHAPE: {
                return new OShape();
            }
        }
        return null;
    }
}
