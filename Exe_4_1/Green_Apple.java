package Exe_4_1;

public class Green_Apple extends Apple{
	
	private char gred;
	private String size;
	
	public Green_Apple(String name, int quantity, double price, String region, char gred, String size) {
		super(name, quantity, price, region);
		this.gred = gred;
		this.size = size;
	}
	
	public double totalPrice() {
		return this.quantity*this.price;
	}
	
	public String toString() {
		return  "Type of apple: " + name
				+ "\nThis green apple come from " + region 
				+ "\nGred: " + this.gred
				+ "\nSize: " + this.size
				+ "\nPrice per unit: RM" + price
				+ "\nQuantity: " + quantity ;
	}


}
