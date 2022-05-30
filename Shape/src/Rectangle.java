
public class Rectangle extends Shape {

	private String shapeName;
	private int side1;
	private int side2;

	public Rectangle(String shapeName, int side1, int side2) {
		this.shapeName = shapeName;
		this.side1 = side1;
		this.side2 = side2;
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

	@Override
	public String getName() {
		return "My name is : " + getshapeName();
	}

	@Override
	public String getArea() {
		return "And my area is : " + (double)(getSide1() * getSide2());
	}
}
