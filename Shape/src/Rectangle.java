
public class Rectangle extends Shape {

	private String name;
	private int side1;
	private int side2;

	public Rectangle(String name, int side1, int side2) {
		this.name = name;
		this.side1 = side1;
		this.side2 = side2;
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

	@Override
	public String Name() {
		return "My name is : " + getName();
	}

	@Override
	public String Area() {
		return "And my area is : " + (double)(getSide1() * getSide2());
	}
}
