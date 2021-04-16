package Constructor;

import java.util.Scanner;

public class Phone {
	
	String brand, model, operating_system;
	 double size, price;

	Scanner in = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	
	//Default constructor
	Phone() {
		System.out.print("Enter the brand: ");
		this.brand = in.next();
		System.out.print("Enter the model: ");
		this.model = sc.next();
		System.out.print("Enter the OS: ");
		this.operating_system = in.next();
		System.out.print("Enter the phone size(inches): ");
		this.size = in.nextDouble();
		System.out.print("Enter the price: RM");
		this.price = in.nextDouble();
		
	}
	
	//Parameterized constructor
	Phone(String b, String m, String os, double s, double p){
		this.brand = b;
		this.model = m;
		this.operating_system = os;
		this.size = s;
		this.price = p;
	}
	
}
