package Overloading_Overriding;

public class Red_Apple extends Apple{
	
	private double discount;
	
	public Red_Apple(String n, int q, double p,double d) {
		super(n,q,p);
		this.discount =d;

	}
	
	// overloading method with 2 parameter
	public double totalPrice(int q, double p){
		return (q*p);
	}
	
	// overloading method with 3 parameter
	public double totalPrice(int q, double p, double d) {
		return q*p*(1-(d/100));
	}
	
	// overriding method
	public String printColour() {
		return "This apple is red colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour()
				+"\nQuantity: " + quantity
				+ "\nPrice per unit: RM" + price
				+ "\nTotal price: RM" + totalPrice(quantity,price)
				+ "\nTotal price after dsicount: RM" + totalPrice(quantity,price,discount);
				
	}
}
