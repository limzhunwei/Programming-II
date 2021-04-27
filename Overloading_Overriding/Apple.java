package Overloading_Overriding;

public class Apple extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		this.quantity = q;
		this.price = p;
	}
	
	public double totalPrice() {
		return this.quantity*this.price;
	}
	
	// overriding method
	public String toString() {
		return "Quantity: " + this.quantity
				+ "\nPrice per unit: RM" + this.price
				+"\nTotal Price: RM" + totalPrice() ;
	}

}
