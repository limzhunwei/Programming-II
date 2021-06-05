package Assignment_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Participant extends Advertisement implements Payment{		// 2.1 Inheritance & 2.5 Interface
	
	Scanner in = new Scanner(System.in);			
	DecimalFormat dp = new DecimalFormat("0.00");	
	
	protected String name, address, email, contact, event;
	protected int age, taxReduction;
	protected double donation;
	
	public Participant(String organizationName, int eventNo) {	
		super(organizationName, eventNo);
		if(eventNo == 1 || eventNo == 2 || eventNo ==3) {
			System.out.println("\nRegistration for event " + eventNo );
			registration();
		}
		
	}
	
	// 2.5 Interface
	public double getPayment() {
		return super.fees + this.donation;
	}
	
	public double getPayment(int taxReduction) {
		this.taxReduction = taxReduction;
		return this.donation*(this.taxReduction/100.00);
	}
	
	public void registration() {
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
		System.out.print("Donation: RM");
		donation = in.nextDouble();
	}
	
	public void tax() {
		if(this.donation<500) {
			System.out.println("There is no tax reduced for donation below RM500!");
		}
		else if(this.donation>500 && this.donation < 2000){
			System.out.println("Tax Reduced\t: RM" + dp.format(getPayment(5)));
		}
		else {
			System.out.println("Tax Reduced\t: RM" + dp.format(getPayment(10)));
		}
	}
	
	//2.2 Polymorphism 
	public String printInfo() {
		return "\nCongratulation, you have successful registered in this event" 
					+ "\nName\t\t: " + name
					+ "\nAge\t\t: " + age + " years old"
					+ "\nContact\t\t: " + contact
					+ "\nAddress\t\t: " + address
					+ "\nEmail\t\t: " + email
					+ "\nTotal Price\t: RM" + dp.format(getPayment());
	}

}
