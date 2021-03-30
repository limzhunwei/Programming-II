package Example3;

public class Motorcycle {

	String brand;
	String model;
	int cc;
	
	void Speed() {
		cc = 125;
		System.out.println("Motorcycle speed(cc): " + cc);
	}
	
	void Break() {
		System.out.println("Motorcycle break");
	}
	
	void Honk() {
		System.out.println("Motorcycle honk");
	}
}
