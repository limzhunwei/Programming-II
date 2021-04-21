package Inheritance;
import java.util.*;
public class Samsung extends Phone{

	private String os;
	private double size;
	private double discount;
	private double finalPrice;
	
	Scanner in = new Scanner(System.in);
	
	public Samsung(String b, String m, double p){
		super(b,m,p);
		System.out.print("Please enter the operating system: ");
		os = in.nextLine();
		System.out.print("Please enter the size(inches): ");
		size = in.nextDouble();
		System.out.print("Please enter the discount(%): ");
		discount = in.nextDouble();
	}
	
	public String getOS() {
		return os;
	}
	
	public double size() {
		return size;
	}
	public double getDiscount() {
		return discount;
	}
	
	public double getFinalPrice() {
		return super.getPrice()*(getDiscount()/100);
	}
	
	public String toString() {
		return super.toString() + "\nOS\t: " + os + "\nSize\t: " + size + "inches" + "\nDiscount: " + discount + "%";
	}
}
