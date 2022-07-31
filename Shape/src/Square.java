
public class Square implements Shape {
	private String shapeName;

	// Default name
	Square() {
		this.shapeName = "Default Square";
	}

	Square(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public String getName() {
		return shapeName;
	}
}
