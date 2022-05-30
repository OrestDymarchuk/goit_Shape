
public class ShapeTest {

	public static void main(String[] args) {
		ShapePrinter instance = new ShapePrinter();
		
		Shape square = new Square("Square Gimli", 4);
		Rectangle rectangle = new Rectangle("Rectangle Hancock", 12, 8);
		Triangle triangle = new Triangle("Triangle Joshua", 10, 5);
		Circle circle = new Circle("Circle Halyna", 5);
		Trapezoid trapezoid = new Trapezoid("Trapezoid Rex", 8, 10, 6);

		instance.printer(square);
		instance.printer(rectangle);
		instance.printer(triangle);
		instance.printer(circle);
		instance.printer(trapezoid);
	}
}
