package Overloading_Overriding;

public class Orange extends Fruit{
	
	private String region;
	private double price;
	private double weight;
	private int quantity;
	
	public Orange(String n, String r, double p, double w, int q) {
		super(n);
		this.region = r;
		this.price = p;
		this.weight = w;
		this.quantity = q;
	}
	
	//overloading method with 1 parameter
	public double countCal(int q) {
		return q*62;
	}
	
	//overloading method with no parameter
	public double countCal() {
		return (this.weight/100)*47;
	}
	
	// overloading method with 1 parameter
	public double totalPrice(int q) {
		return q*this.price;
	}
	
	// overriding method
	public String printColour() {
		return "This orange is orange colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour()
				+ "\nRegion: " + this.region
				+ "\nWeight: " + this.weight + "g"
				+ "\nQuantity: " + this.quantity
				+ "\nTotal calories (62cal per orange): " + countCal(this.quantity) + "cal"
				+ "\nTotal calories (47cal per 100g): " + countCal() + "cal"
				+ "\nPrice per orange: RM" + this.price
				+ "\nTotal price: RM" + totalPrice(this.quantity);
	}

}
