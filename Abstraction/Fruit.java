package Abstraction;

public abstract class Fruit {
	
	protected String name;
	
	public Fruit(String n) {
		this.name = n;
		System.out.println(name + " constructor is invoked");
	}
	
//	public abstract double totalPrice();
//	
//	public abstract double totalPrice(double pp);
//	
//	public abstract double totalPrice(double pp, double d);
	
	public abstract String printColour();

}
