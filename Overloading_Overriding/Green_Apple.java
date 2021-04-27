package Overloading_Overriding;

public class Green_Apple extends Apple{
	
	private char gred;
	
	public Green_Apple(String n, int q, double p, char g) {
		super(n,q,p);
		this.gred = g;
		
	}
	
	// overloading method with no parameter
	public char getGred() {
		return this.gred;
	}
	
	// overloading method with 1 parameter
	public char getGred(char gred) {
		return gred;
	}
	
	public double totalPrice(){
		return this.quantity*this.price;
	}
	
	// overriding method
	public String toString() {
		return "Gred 2: " + this.gred
				+"\nQuantity: " + this.quantity
				+ "\nPrice per unit: RM" + this.price
				+"\nTotal Price: RM" + totalPrice() ;
	}

}
