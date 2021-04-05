package AnimalProfile;

public class Animal {

	void animalProfile(String breed, String colour, double weight1, double weight2) {
		System.out.println("Breed: " + breed);
		System.out.println("Colour: " + colour);
		System.out.println("Average Weight: " + weight1 + "kg - " + weight2 + "kg");
	}
	
	void animalType(String type, String fertility ,String food) {
		System.out.println("Class of anaiml : " + type);
		System.out.println("How they give birth: " + fertility);
		System.out.println("Food: " + food);
		
	}
	
	void foodCost (int price, int age) {
		int amount = price*12;
		System.out.println("Average food costs per month: RM" + price);
		System.out.println("Annual of food cost: RM" + amount);
	}
	
	void calculateAge(int year, int average) {
		int age = 2021-year;
		int countdown = average-age;
		System.out.println("Age : " + age + "years old");
		System.out.println("Average age: " + average + "years old");
		System.out.println("Time left: " + countdown + "years");
	}
}
