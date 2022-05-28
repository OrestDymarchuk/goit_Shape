
public class Circle extends Shape {
	private String name;
	private float radius;
	private final double PI = Math.PI;

	public Circle(String name, float radius) {
		this.name = name;
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public double getRadius() {
		return radius;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public String Name() {
		return "My name is : " + getName();
	}

	@Override
	public String Area() {
		double result = getPI() * (getRadius() * getRadius());
		return "My area is : " + (float) Math.round(result * 100) / 100;
	}

}
