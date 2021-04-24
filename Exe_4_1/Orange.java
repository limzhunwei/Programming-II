package Exe_4_1;

public class Orange extends Fruit{

	private String color;
	private double weight;

	public Orange(String name,int quantity, double price, String region, String color, double weight) {
		super(name, quantity, price, region);
		this.color = color;
		this.weight = weight;
	}
	
	public double countCal() {
		return (this.weight/100)*47;
	}
	
	public double totalPrice() {
		return this.quantity*this.price;
	}
	
	public String toString() {
		return  "This is an " + name
				+"\nThis orange come from " + region
				+ "\nColor: " + color
				+ "\nPrice per unit: RM" + price
				+ "\nQuantity: " + quantity;
	}
}
