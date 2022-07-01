package testing;

public class Vehicle {
	public static void Vehicle_doc() {
		System.out.println("Vehicle class.");
	}

	private String color = "Red";

	public Vehicle(String in_color) {
		this.color = in_color;
	}

	public void horn() {
		System.out.println("Honk!");
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String set_color) {
		this.color = set_color;
	}
}
