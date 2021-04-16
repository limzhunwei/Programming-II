package Constructor;

public class Main {

	public static void main(String[] args) {
		 
		Phone samsung = new Phone();
		System.out.printf("%n %-8s %13s %20s %18s %15s", "Brand", "Model", "Operating System" ,"Size(inches)", "Price(RM)");
		System.out.println("");
		System.out.printf("%-8s %14s %15s %18.1f %19.2f", samsung.brand, samsung.model, samsung.operating_system, samsung.size, samsung.price);
		
		Phone apple = new Phone("Apple", "i12 pro max", "IOS", 6.7, 4999);
		System.out.printf("%n%n %-8s %13s %20s %18s %15s", "Brand", "Model", "Operating System" ,"Size(inches)", "Price(RM)");
		System.out.println("");
		System.out.printf("%-8s %14s %15s %18.1f %19.2f", apple.brand, apple.model, apple.operating_system, apple.size, apple.price);
	}

}
