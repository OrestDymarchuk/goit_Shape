
public class Rectangle implements Shape {
	private String shapeName;

	// Default name
	Rectangle() {
		this.shapeName = "Default Rectangle";
	}

	Rectangle(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public String getName() {
		return shapeName;
	}
}
