package Exe_4_1;

public class Banana extends Fruit {
	
	private double weight;
	
	public Banana(String name, int quantity,double price, String region, double weight) {
		super(name, quantity, price, region);
		this.weight = weight;

	}
	
	public double vitaminA() {
		return this.weight*10*64;
	}
	
	public double totalPrice() {
		return this.weight*price;
	}
	
	public String toString() {
		return  "This is a " + name
				+ "\nRegion: " + region 
				+ "\nPrice per kg: RM" + price
				+ "\nWeight: " + weight + "kg" ;
	}
}
