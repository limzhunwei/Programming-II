package Inheritance;

public class Phone {
	
	private String brand, model;
	private double price;

	public Phone(String b, String m, double p) {
		brand = b;
		model = m;
		price =p;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Brand\t: " + brand + "\nModel\t: " + model  + "\nPrice\t: RM" + price;
	}


}
