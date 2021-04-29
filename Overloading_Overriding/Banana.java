package Overloading_Overriding;

public class Banana extends Fruit{
	
	private double weight;
	private double price;
	private double discount;
	private String vitamin;
	private double vitaminC;
	
	public Banana(String n, double w, double p,double d, double vitC, String v) {
		super(n);
		this.weight = w;
		this.vitamin = v;
		this.price =p;
		this.discount = d;
		this.vitaminC = vitC;
	}
	
	// overloading method with no parameter
	public double vitamin() {
		return this.weight*10*64;
	}
	
	// overloading method with 1 parameter
	public double vitamin(double vitC) {
		return this.weight*10*vitC;
	}
	
	
	// overloading method with 2 parameter
	public double totalPrice(double p, double w) {
		return p*w;
	}
	
	// overloading with 3 parameter
	public double totalPrice(double p, double w, double d) {
		return p*w*(1-(d/100));
	}
	
	// overriding method
	public String toString() {
		return "Vitamin: " + this.vitamin
				+ "\nWight: " + this.weight + "kg"
				+ "\nVitamin A per 100g: " + vitamin()  + "IU"
				+ "\nVitamin C per 100g: " + vitamin(this.vitaminC)  + "mg"
				+ "\nPrice per kg: RM" + this.price
				+ "\nTotal price: RM" + totalPrice(this.price,this.weight)
				+ "\nTotal price after discount: RM" + totalPrice(this.price,this.weight,this.discount);
	}

}
