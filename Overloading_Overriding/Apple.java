package Overloading_Overriding;

public class Apple extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		this.quantity = q;
		this.price = p;
		
	}
	
	// overloading with 1 parameter
	public double totalPrice(double p) {
		return  p;
	}
	
	// overloading with 2 parameter
	public double totalPrice(int q, double p) {
		return (q*p);
	}

	// overriding method
	public String printColour() {
		return "This apple is either red or green colour.";
		
	}
	// overriding method
	public String toString() {
		return printColour()
				+ "\nQuantity: " + this.quantity
				+ "\nPrice per unit: RM" + totalPrice(this.price)
				+ "\nTotal price: RM " + totalPrice(this.quantity,this.price);
				
				
	}

}
