package Exercise2_4;

public class Main {
	
	public static void main(String[] args) {
		
		Motorcycle yamaha = new Motorcycle();
		
		yamaha.setBrand("135LC");
		yamaha.setColor("Blue");
		yamaha.setPrice(6868);
		yamaha.setSpeed(120);
		yamaha.setWeight(109);
		yamaha.setFuel(4.0);
		
		System.out.println("Brand: " + yamaha.getBrand());
		System.out.println("Color: " + yamaha.getColor());
		System.out.println("Price: RM" + yamaha.getPrice());
		System.out.println("Speed: " + yamaha.getSpeed() + "km/h");
		System.out.println("Weight: " + yamaha.getWeight() + "kg");
		System.out.println("Petrol: " + yamaha.getFuel() + "litres");
		
		
	}

}
