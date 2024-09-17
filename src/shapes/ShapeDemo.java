package EIcode3.shapes;

public class ShapeDemo {
    public static void runDemo() {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        CompositeShape compositeShape = new CompositeShape();
        compositeShape.addShape(circle);
        compositeShape.addShape(rectangle);

        circle.draw();
        rectangle.draw();
        compositeShape.draw();
    }
}
