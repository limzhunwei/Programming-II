package Assignment_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Participant {		//1.3 User Define Class
	
	//1.2 Pre-Define Class
	Scanner in = new Scanner(System.in);			
	DecimalFormat dp = new DecimalFormat("0.00");	
	
	String name, address, email, contact, event;
	int age, taxReduction;
	double donation, fees;
	
	public Participant() {				// 1.4 Constructor with no argument
		System.out.print("Name\t: ");
		name = in.nextLine();
		System.out.print("Age\t: ");
		age = in.nextInt();
		System.out.print("Contact\t: ");
		contact = in.next();
		in.nextLine();
		System.out.print("Address\t: ");
		address = in.nextLine();
		System.out.print("Email\t: ");
		email = in.next();
	}
	
	public Participant(String event) {		// 1.4 Constructor with one argument
		this.event = event;
		System.out.println("Registration for \"" + this.event + "\":");
		
	}
	
	public Participant(double fees, int taxReduction) {		// 1.4 Constructor with two argument
		this.fees = fees;
		this.taxReduction = taxReduction;
		System.out.print("Donation: RM");
		donation = in.nextDouble();
		
	}
	
	public double totalPrice() {
		return fees + donation;
	}
	
	public double calTax() {
		return donation*(taxReduction/100.00);
	}
	
	public String printInfo() {
		return "\nCongratulation, you have successful registered in this event" 
					+ "\nName\t: " + name 
					+ "\nAge\t: " + age  + " years old"
					+ "\nContact\t: " + contact
					+ "\nAddress\t: " + address
					+ "\nEmail\t: " + email;
	}

}
