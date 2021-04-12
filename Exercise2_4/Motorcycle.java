package Exercise2_4;

public class Motorcycle {
	
	String brand;
	String color;
	int speed;
	float price;
	double weight;
	double fuel;
	
	//setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	//getter
	public String getBrand() {
		return this.brand;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getFuel() {
		return this.fuel;
	}
}
