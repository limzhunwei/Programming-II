package Abstraction;

public abstract class Fruit {
	
	protected String name;
	
	public Fruit(String n) {
		this.name = n;
		System.out.println(name + " constructor is invoked");
	}
	
	public abstract String printColour();

}
