
public class ShapeTest {

	public static void main(String[] args) {

		Circle circle = new Circle("Circle #1");
		Rectangle rectangle = new Rectangle();
		Square square = new Square("Square #1");
		Trapezoid trapezoid = new Trapezoid();
		Triangle triangle = new Triangle("Triangle #1");

		printer(circle);
		printer(rectangle);
		printer(square);
		printer(trapezoid);
		printer(triangle);

	}

	public static void printer(Shape shapeInformation) {
		System.out.println(shapeInformation.getName() + "\n");
	}
}
