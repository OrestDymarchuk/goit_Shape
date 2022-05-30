
public class Trapezoid extends Shape {
	private String shapeName;
	private int side1;
	private int side2;
	private int height;
	
	public Trapezoid(String shapeName, int side1, int side2, int height) {
		this.shapeName = shapeName;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}

	public String getshapeName() {
		return shapeName;
	}

	public int getSide1() {
		return side1;
	}

	public int getSide2() {
		return side2;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String getName() {
		return "My name is : " + getshapeName();
	}

	@Override
	public String getArea() {
		return "My area is : " + (double)(((getSide1() + getSide2()) / 2) * getHeight());
	}

}
