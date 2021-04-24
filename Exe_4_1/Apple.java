package Exe_4_1;

public class Apple extends Fruit{
	
	private int g1;
	private int g2;
	
	public Apple(String name, int quantity, double price, String region) {
		super(name, quantity, price, region);
	}
	
	public int group1() {
		if(this.quantity >= 7) {
			g1 = this.quantity/7;
		}
		return g1;
	}
	public int group2() {
		if (this.quantity >=3 & this.quantity<7) {
			g2 = this.quantity/3;
		}else if (this.quantity%7 >= 3) {
			g2 = (this.quantity%7)/3;
		}
		return g2;
	}
	
	public int left() {
		return this.quantity-this.group1()*7-this.group2()*3;
	}
	
	public int groupPrice() {
		return g1*10 + g2*5;
	}
	
	public double totalPrice() {
		return this.groupPrice() + (this.quantity-(this.group1()*7)-(this.group2()*3))*this.price;
	}
	
	public String toString() {
		return  "This is an " + name
				+ "\nThis apple come from " + region 
				+ "\nPrice per unit: RM" + price
				+ "\nRM5 for 3 apples and RM10 for 7 apples!!!"
				+ "\nQuantity: " + quantity;
				
	}

}
