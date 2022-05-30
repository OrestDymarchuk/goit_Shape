
public class Triangle extends Shape {
	private String shapeName;
	private int height;
	private int base;

	public Triangle(String shapeName, int height, int base) {
		this.shapeName = shapeName;
		this.height = height;
		this.base = base;
	}

	public String getshapeName() {
		return shapeName;
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

	@Override
	public String getName() {
		return "My name is : " + getshapeName();
	}

	@Override
	public String getArea() {
		return "And my area is : " + (double)((getHeight() * getBase()) / 2);
		
	}
}
