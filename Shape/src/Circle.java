
public class Circle extends Shape {
	private String shapeName;
	private float radius;
	private final double PI = Math.PI;

	public Circle(String shapeName, float radius) {
		this.shapeName = shapeName;
		this.radius = radius;
	}

	public String getshapeName() {
		return shapeName;
	}

	public double getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public String getName() {
		return "My name is : " + getshapeName();
	}

	@Override
	public String getArea() {
		double result = getPI() * (getRadius() * getRadius());
		return "My area is : " + (float) Math.round(result * 100) / 100;
	}

}
