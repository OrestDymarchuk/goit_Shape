
public class Circle implements Shape {
	private String shapeName;

	// Default name
	Circle() {
		this.shapeName = "Default Circle";
	}

	Circle(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public String getName() {
		return shapeName;
	}
}
