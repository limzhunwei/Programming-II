import java.util.Scanner;

public class Computer {
	
	Scanner in = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	
	String brand, model, color, operating_system;
	double size, price, discount, finalPrice;

	//setter
	public void setBrand() {
		System.out.print("Please enter the brand: ");
		this.brand = in.next();
	}
	
	public void setModel() {
		System.out.print("Please enter the model: ");
		this.model = in.next();
	}
	
	public void setColor() {
		System.out.print("Please enter the color: ");
		this.color = in.next();
	}
	
	public void setOperatingSystem() {
		System.out.print("Please enter the OS: ");
		this.operating_system = in.next();
	}
	
	public void setSize() {
		System.out.print("Please enter the size(inches): ");
		this.size = in.nextDouble();
	}
	
	public void setPrice() {
		System.out.print("Please enter the price(RM): ");
		this.price = sc.nextDouble();
	}
	
	public void setDiscount() {
		System.out.print("Please enter the discount percentage(%): ");
		this.discount = in.nextFloat();
	}
	
	//getter
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getOperatingSystem() {
		return this.operating_system;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getFinalPrice() {
		this.finalPrice = this.price*(1.00 -(this.discount/100.00));
		return this.finalPrice;
	}

}
