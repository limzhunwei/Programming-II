package Overloading_Overriding;

public class Orange extends Fruit{
	
	private char size;
	private double calories;
	private double cal;
	
	public Orange(String n, char s,double c) {
		super(n);
		this.size = s;
		this.calories = c;
		
		switch(size) {
		case 'S':
			calories();
			System.out.println("Size of orange: " + this.size);
			System.out.println("Calories of the orange: " + calories() + "mg");
			break;
			
		case 'M':
			cal = 52.4;
			calories(cal);
			System.out.println("Size of orange: " + this.size);
			System.out.println("Calories of the orange: " + calories(cal) + "mg");
			break;
			
		case 'L':
			cal = 73.6;
			calories(cal);
			System.out.println("Size of orange: " + this.size);
			System.out.println("Calories of the orange: " + calories(cal) + "mg");
			break;
		}
	}

	
	//overloading method with 0 parameter
	public double calories() {
		return this.calories;
	}
	
	//overloading method with 1 parameter
	public double calories(double cal) {
		return cal;
	}
	
	// overriding method
	public String printColour() {
		return "This orange is orange colour.";
	}
	
	// overriding method
	public String toString() {
		return printColour();
	}

}
