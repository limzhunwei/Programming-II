package Abstraction;

public class Banana extends Fruit{
	
	private int quantity;
	private double weight;
	private double price;

	public Banana(String n, double w, double p) {
		super(n);
		this.weight = w;
		this.price = p;
		
		Price pr = new TotalPrice();				// Calculate total price
		DiscountRate aa = new BananaDiscount();		// Calculate banana discount
		double d = aa.rateofdiscount();
		
		if(weight < 2.5) {
			System.out.println("Total weight: " + weight + "kg");
			System.out.println("Price for below 2.5kg: RM" + price);
			System.out.printf("Total price: RM%.2f" , pr.totalPrice(p,w));
		}
		else if(weight >= 2.5 && weight < 5.0) {
			double pp = 2.99;			// price per kg
			weight = (this.weight/1000)*this.quantity;	
			System.out.println("Total weight: " + weight + "kg");
			System.out.println("Price for between 2.5 - 5.0 kg: RM" + 3.50);
			System.out.printf("Total price: RM%.2f" , pr.totalPrice(pp,w));
		}
		else {
			double pp = 1.99;			// price per kg
			System.out.println("Total weight: " + weight + "kg");
			System.out.println("Price for more than 5.0kg: RM" + pp);
			System.out.println("Get 10% discount when weight is more than 5kg!");
			System.out.printf("Total price: RM%.2f" , pr.totalPrice(pp, w,d));
		}
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
