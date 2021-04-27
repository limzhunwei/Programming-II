package Overloading_Overriding;

public class Banana extends Fruit{
	
	private double weight;
	private String vitamin;
	
	public Banana(String n, double w, String v) {
		super(n);
		this.weight = w;
		this.vitamin = v;
	}
	
	public double vitaminA() {
		return this.weight*10*64;
	}
	
	public double price() {
		return 2.50;
	}
	
	// overloading method with 2 parameter
	public double totalPrice(double p, double w) {
		return p*w;
	}
	
	// overriding method
	public String toString() {
		return "Vitamin: " + this.vitamin
				+ "\nWight: " + this.weight + "kg"
				+ "\nPrice per kg: RM" + price()
				+ "\nVitamin A per 100g: " + vitaminA()  + "IU";
	}

}
