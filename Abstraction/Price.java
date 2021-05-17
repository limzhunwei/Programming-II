package Abstraction;

class Price implements Total_Price{
	
	// overloading with 2 parameter
	public double totalPrice(double pp, double w) {
		return pp*w;
	}
	
	// overloading with 3 parameter
	public double totalPrice(double pp, double w, double d) {
		return pp*w*d;
	}
}