package Overloading_Overriding;

public class Orange extends Fruit{
	
	private String region;
	private double price;
	private double weight;
	
	public Orange(String n, String r, double p, double w) {
		super(n);
		this.region = r;
		this.price = p;
		this.weight = w ;
	}
	
	public double countCal() {
		return (this.weight/100)*47;
	}
	
	// overloading method with 1 parameter
	public double totalPrice(double q) {
		return q*this.price;
	}
	
	// overriding method
	public String toString() {
		return "Region: " + this.region
				+ "\nWeight: " + this.weight + "g"
				+ "\nTotal calories: " + countCal() + "cal"
				+ "\nPrice per orange: RM" + this.price;
	}

}
