package Overloading_Overriding;

public class Red_Apple extends Apple{
	
	private String colour;
	
	public Red_Apple(String n, int q, double p, String c) {
		super(n,q,p);
		this.colour = c;
		
	}
	
	// overloading method with no parameter
	public String getColour() {
		return this.colour;
	}
	
	// overloading method with 1 parameter
	public String getColour(String colour) {
		return colour;
	}
	
	public double totalPrice(){
		return this.quantity*this.price;
	}
	
	// overriding method
	public String toString() {
		return "Quantity: " + this.quantity
				+ "\nPrice per unit: RM" + this.price
				+"\nTotal Price: RM" + totalPrice() ;
	}
}
