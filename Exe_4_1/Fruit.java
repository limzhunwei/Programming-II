package Exe_4_1;

public class Fruit {
	
	protected String name;
	protected int quantity;
	protected double price;
	protected String region;
	
	public Fruit(String name, int quantity, double price, String region) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.region = region;
		
		System.out.println(name + " constructor is invoked");
		System.out.println("Fruit come from " + region);
	}

}
