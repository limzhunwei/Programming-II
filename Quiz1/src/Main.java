
public class Main {

	public static void main(String[] args) {
		
		Computer asus =  new Computer();
		System.out.println("---------------Computer 1----------------");
		asus.setBrand();
		asus.setModel();
		asus.setColor();
		asus.setOperatingSystem();
		asus.setSize();
		asus.setPrice();
		asus.setDiscount();

		System.out.println("\nBrand : " + asus.getBrand());
		System.out.println("Model : " + asus.getModel());
		System.out.println("Color : " + asus.getColor());
		System.out.println("Operating System(OS) : " + asus.getOperatingSystem());
		System.out.println("Size  : " + asus.getSize() + "inches");
		System.out.printf("Price : RM%.2f", asus.getPrice());
		System.out.printf("%nPrice after discount: RM%.2f" , asus.getFinalPrice());
	;
	}

}
