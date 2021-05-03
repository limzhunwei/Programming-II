package Overloading_Overriding;

public class Red_Apple extends Apple{
	
	private char gred;
	
	public Red_Apple(String n, int q, double p, char g) {
		super(n,q,p);
		this.gred = g;

		getGred();
	}
	
	// overriding method
	public void getGred() {
		System.out.println("Gred: " + this.gred);
	}
	
	// overriding method
	public String printColour() {
		return "This apple is red colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour();
	}
}
