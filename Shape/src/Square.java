
public class Square extends Shape {
	private String name;
	private int side;

	public Square(String name, int side) {
		this.name = name;
		this.side = side;
	}

	public String getName() {
		return name;
	}

	public int getSide() {
		return side;
	}

	@Override
	public String Name() {
		return "My name is : " + getName();
	}

	@Override
	public String Area() {
		return "And my area is : " + (double)(getSide() * getSide());
	}
}
