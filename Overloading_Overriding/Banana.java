package Overloading_Overriding;

public class Banana extends Fruit{
	
	private int quantity;
	private double weight;
	private double vitamin;
	
	public Banana(String n,int q, double w, double v) {
		super(n);
		this.quantity = q;
		this.weight = w;
		this.vitamin = v;
		
		if(this.weight<= 101) {
			vitamin();
			System.out.println("Weight: " + this.weight + "g");
			System.out.println("This banana is small size!");
			System.out.println("Vitamin A: " + vitamin() + "IU");
		}
		else if(this.weight > 101 && this.weight <= 118 ) {
			double medium = 75.5;
			vitamin(medium);
			System.out.println("Weight: " + this.weight + "g");
			System.out.println("This banana is medium size!");
			System.out.println("Vitamin A: " + vitamin(medium) + "IU");
		}
		else if(this.weight > 118 && this.weight <= 136 ) {
			double large = 87;
			int day = 7;
			vitamin(day, large);
			System.out.println("Weight: " + this.weight + "g");
			System.out.println("This banana is large size!");
			System.out.println("Vitamin A for" + day + "days: " + vitamin(day, large) + "IU");
		}
	}
	
	// overloading method with no parameter
	public double vitamin() {
		return this.quantity*this.vitamin;
	}
	
	// overloading method with 1 parameter
	public double vitamin(double medium) {
		return this.quantity*medium;
	}
	
	// overloading method with 2 parameter
	public double vitamin(int day, double large) {
		return this.quantity*day*large;
	}
	
	// overriding method
	public String printColour() {
		return "This banana is yellow colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour();
	}

}
