
public class Triangle extends Shape {
	private String name;
	private int height;
	private int base;

	public Triangle(String name, int height, int base) {
		this.name = name;
		this.height = height;
		this.base = base;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

	@Override
	public String Name() {
		return "My name is : " + getName();
	}

	@Override
	public String Area() {
		return "And my area is : " + (double)((getHeight() * getBase()) / 2);
		
	}
}
