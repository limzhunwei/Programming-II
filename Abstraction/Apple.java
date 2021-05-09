package Abstraction;

public class Apple extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		this.quantity = q;
		this.price = p;
		
		if(this.quantity<10) {
			totalPrice();
			System.out.println("Quantity: " + this.quantity);
			System.out.println("Price for below 10 apple: RM" + this.price);
			System.out.printf("Total price: RM%.2f" , totalPrice());
		}
		else if(this.quantity > 10 && this.quantity < 100) {
			double pp = 2.0;		//price per unit
			totalPrice(pp);
			System.out.println("Quantity: " + this.quantity);
			System.out.println("Price for below 100 apple: RM" + pp);
			System.out.printf("Total price: RM%.2f" , totalPrice(pp));
		}
		else {
			double pp = 1.50;		// price per unit
			double d;				// discount
			
			DiscountRate aa = new Discount();
			System.out.println("Discount: " + (100-(aa.rateofdiscount()*100)) + "%");
			d = aa.rateofdiscount();
			
			totalPrice(pp,d);
			System.out.println("Quantity: " + this.quantity);
			System.out.println("Price for more than 100 apple: RM" + pp);
			System.out.println("Get 20% discount when purchase more than 100 apples!");
			System.out.printf("Total price: RM%.2f" , totalPrice(pp,d));
		}
	}
	
	// overloading with 0 parameter
	public double totalPrice() {
		return  this.price*this.quantity;
	}
	
	// overloading with 1 parameter
	public double totalPrice(double pp) {
		return this.quantity*pp;
	}
	
	// overloading with 2 parameter
	public double totalPrice(double pp, double d) {
		return this.quantity*pp*d;
	}

	// overriding method
	public String printColour() {
		return "This apple is either red or green colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour();
	}


}
