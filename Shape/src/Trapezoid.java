
public class Trapezoid implements Shape {
	private String shapeName;

	// Default name
	Trapezoid() {
		this.shapeName = "Default Trapezoid";
	}

	Trapezoid(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public String getName() {
		return shapeName;
	}
}
