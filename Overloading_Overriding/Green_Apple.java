package Overloading_Overriding;

public class Green_Apple extends Apple{
	
	private char gred;
	
	public Green_Apple(String n, int q, double p, char g) {
		super(n,q,p);
		this.gred = g;
		
	}
	
	// overloading method with no parameter
	public char getGred() {
		return 'A';
	}
	
	// overloading method with 1 parameter
	public char getGred(char gred) {
		return gred;
	}
	
	// overloading method with 0 parameter
	public double totalPrice(){
		return quantity*price;
	}
	
	// overriding method
	public String printColour() {
		return "This apple is green colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour()
				+ "\nGred 1: " +  getGred()
				+ "\nGred 2: " + getGred(gred)
				+"\nQuantity: " + this.quantity
				+ "\nPrice per unit: RM" + this.price
				+"\nTotal Price: RM" + totalPrice() ;
	}

}
