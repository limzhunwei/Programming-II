package Abstraction;

class TotalPrice implements Price{
	
	// overloading with 2 parameter
	public double totalPrice(double pp, double q) {
		return pp*q;
	}
	
	// overloading with 3 parameter
	public double totalPrice(double pp, double q, double d) {
		return pp*q*d;
	}
}