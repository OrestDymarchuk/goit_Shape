
public class Trapezoid extends Shape {
	private String name;
	private int side1;
	private int side2;
	private int height;
	
	public Trapezoid(String name, int side1, int side2, int height) {
		this.name = name;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}

	public String getName() {
		return name;
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
	public String Name() {
		return "My name is : " + getName();
	}

	@Override
	public String Area() {
		return "My area is : " + (double)(((getSide1() + getSide2()) / 2) * getHeight());
	}

}
