
public class Triangle implements Shape {
	private String shapeName;
	
	// Default name
	Triangle(){
		this.shapeName = "Default Triangle";
	}
	
	Triangle(String shapeName){
		this.shapeName = shapeName;
	}

	@Override
	public String getName() {
		return shapeName;
	}
}
