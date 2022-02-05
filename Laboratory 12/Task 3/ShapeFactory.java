import java.util.Random;
// Базовый интерфейс создателя фигур
public interface ShapeFactory {
    Shape createShape(ShapeClass shapeClass);
}
