package Abstraction;

public class Apple extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		this.quantity = q;
		this.price = p;
		
		Price pr = new TotalPrice();
		
		if(this.quantity<10) {
			System.out.println("Quantity: " + quantity);
			System.out.println("Price for below 10 : RM" + price);
			System.out.printf("Total price: RM%.2f" , pr.totalPrice(p,q));
		}
		else if(this.quantity > 10 && this.quantity < 100) {
			double pp = 2.0;		//price per unit
			System.out.println("Quantity: " + quantity);
			System.out.println("Price for below 100 : RM" + pp);
			System.out.printf("Total price: RM%.2f" , pr.totalPrice(pp,q));
		}
		else {
			double pp = 1.50;		// price per unit
			double d;				// discount
			
			if(n == "Apple" || n == "Red Apple" || n == "Green Apple") {		// discount for apple class
				DiscountRate aa = new AppleDiscount();
				d = aa.rateofdiscount();
			}
			else {																// discount for orange class
				DiscountRate aa = new OrangeDiscount();
				d = aa.rateofdiscount();
			}
			
			System.out.println("Quantity: " + quantity);
			System.out.println("Price for more than 100 : RM" + pp);
			System.out.println("Get "+ (100-(d*100)) + "% discount when purchase more than 100 !");
			System.out.printf("Total price: RM%.2f" , pr.totalPrice(pp,q,d));
		}
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
