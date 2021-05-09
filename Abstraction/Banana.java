package Abstraction;

public class Banana extends Fruit{
	
	private int quantity;
	private double weight;
	private double vitamin;
	private double price;
	private double totalWeight;
	
	public Banana(String n,int q, double w, double v, double p, double tw) {
		super(n);
		this.quantity = q;
		this.weight = w;
		this.vitamin = v;
		this.price = p;
		this.totalWeight = tw;
		
		this.totalWeight = (this.weight/1000)*this.quantity;		// Total weight for all banana in kg
		
		// Calculation for vitamin
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
		
		// Calculation for total price
		if(this.totalWeight < 2.5) {
			totalPrice();
			System.out.printf("Total weight: %.2f%2s" , this.totalWeight , "kg");
			System.out.printf("%nPrice for below 2.5kg: RM%/2f" , this.price);
			System.out.printf("%nTotal price: RM%.2f" , totalPrice());
		}
		else if(this.totalWeight >= 2.5 && this.totalWeight < 5.0) {
			double pp = 3.50;		//price per kg
			totalPrice(pp);
			System.out.printf("Total weight: %.2f%2s" , this.totalWeight , "kg");
			System.out.printf("%nPrice for between 2.5 - 5.0 kg: RM%.2f" , pp);
			System.out.printf("%nTotal price: RM%.2f" , totalPrice(pp));
		}
		else {
			double pp = 2.99;		// price per kg
			double d;				// discount
			
			DiscountRate aa = new Discount();
			System.out.println("Discount: " + aa.rateofdiscount());
			d = aa.rateofdiscount();
			
			totalPrice(pp,d);
			System.out.printf("Total weight: %.2f%2s" , this.totalWeight , "kg");
			System.out.printf("%nPrice for more than 5.0kg: RM%.2f" , pp);
			System.out.println("\nGet 20% discount when weight is more than 5kg!");
			System.out.printf("Total price: RM%.2f" , totalPrice(pp,d));
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
	
	// overloading with 0 parameter
	public double totalPrice() {
		return  this.price*this.totalWeight;
	}
	
	// overloading with 1 parameter
	public double totalPrice(double pp) {
		return this.totalWeight*pp;
	}
	
	// overloading with 2 parameter
	public double totalPrice(double pp, double d) {
		return this.totalWeight*pp*d;
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
