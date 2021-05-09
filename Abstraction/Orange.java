package Abstraction;

public class Orange extends Fruit{

	private char size;
	private double calories;
	private double cal;
	private int quantity;
	private double price;
	
	public Orange(String n, char s,double c, int q, double p) {
		super(n);
		this.size = s;
		this.calories = c;
		this.quantity = q;
		this.price = p;
		
		// calculate calories of orange based on size
		switch(size) {
		case 'S':
			calories();
			System.out.println("Size of orange: " + this.size);
			System.out.println("Calories of the orange: " + calories() + "mg");
			break;
			
		case 'M':
			cal = 52.4;
			calories(cal);
			System.out.println("Size of orange: " + this.size);
			System.out.println("Calories of the orange: " + calories(cal) + "mg");
			break;
			
		case 'L':
			cal = 73.6;
			calories(cal);
			System.out.println("Size of orange: " + this.size);
			System.out.println("Calories of the orange: " + calories(cal) + "mg");
			break;
		}
		
		// calculate total price of orange
		if(this.quantity<5) {
			totalPrice();
			System.out.println("Quantity: " + this.quantity);
			System.out.println("Price for below 5 oranges : RM" + this.price);
			System.out.printf("Total price: RM%.2f" , totalPrice());
		}
		else if(this.quantity >= 5 && this.quantity < 50) {
			double pp = 2.50;		//price per unit
			totalPrice(pp);
			System.out.println("Quantity: " + this.quantity);
			System.out.println("Price for below 50 oranges: RM" + pp);
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
			System.out.println("Price for more than 50 oranges: RM" + pp);
			System.out.println("Get 20% discount when purchase more than 50 oranges!");
			System.out.printf("Total price: RM%.2f" , totalPrice(pp,d));
		}
	}

	
	//overloading method with 0 parameter
	public double calories() {
		return this.calories;
	}
	
	//overloading method with 1 parameter
	public double calories(double cal) {
		return cal;
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
		return "This orange is orange colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour();
	}
}
