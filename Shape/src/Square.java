
public class Square extends Shape {
	private String shapeName;
	private int side;

	public Square(String shapeName, int side) {
		this.shapeName = shapeName;
		this.side = side;
	}

	public String getshapeName() {
		return shapeName;
	}

	public int getSide() {
		return side;
	}

	@Override
	public String getName() {
		return "My name is : " + getshapeName();
	}

	@Override
	public String getArea() {
		return "And my area is : " + (double)(getSide() * getSide());
	}
}
