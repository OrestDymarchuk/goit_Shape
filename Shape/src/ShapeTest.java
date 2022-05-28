
public class ShapeTest {

	public static void main(String[] args) {
		Square quad = new Square("Square Gimli", 4);
		Rectangle rectangle = new Rectangle("Rectangle Hancock", 12, 8);
		Triangle triangle = new Triangle("Triangle Joshua", 10, 5);
		Circle circle = new Circle("Circle Halyna", 5);
		Trapezoid trapezoid = new Trapezoid("Trapezoid Rex", 8, 10, 6);

		System.out.println(quad.Name() + "\n" + quad.Area());
		System.out.println("\n" + rectangle.Name() + "\n" + rectangle.Area());
		System.out.println("\n" + triangle.Name() + "\n" + triangle.Area());
		System.out.println("\n" + circle.Name() + "\n" + circle.Area());
		System.out.println("\n" + trapezoid.Name() + "\n" + trapezoid.Area());
	}
}
