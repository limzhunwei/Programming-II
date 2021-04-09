package AnimalProfileScanner;

import java.util.Scanner;

public class Animal {
	
	static Scanner in = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	void animalProfile() {
		System.out.print("Breed: ");
		String breed = in.next();
		System.out.print("Male(M) or Female(F): ");
		char gender = in.next().charAt(0);
		System.out.print("Colour: ");
		String colour = in.next();
		System.out.println("The breed of this animal is " + breed + " and it's colour is " + colour);
		System.out.print("Market price: RM");
		double price = in.nextInt();
		System.out.println("The price in market is RM" + price);
	}
	
	void calculateAge() {
		System.out.print("Year of birth: ");
		int year = in.nextInt();
		int age = 2021-year;	
		System.out.println("Age : " + age + "years old");
	}
	
	void animalType() {
		System.out.print("Class of animal : ");
		String type = sc.nextLine();
		System.out.print("Weight(kg): ");
		double weight = in.nextDouble();
		System.out.print("Foods: ");
		String food = sc.nextLine();
		System.out.println("This animal's weight is " + weight + "kg and it eat " + food);
	}
	
	void foodCost () {
		System.out.print("Average food costs per day: RM");
		float price = in.nextFloat();
		float monthlyCost = price*30;
		float annualCost = price*365;
		System.out.println("Monthly food cost: RM" + monthlyCost);
		System.out.println("Annual food cost: RM" + annualCost);
	}
	

}
