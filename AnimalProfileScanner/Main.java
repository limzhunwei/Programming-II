package AnimalProfileScanner;

public class Main {

	public static void main(String[] args) {
		
		Animal dog  = new Animal();
		Animal cat = new Animal();
		Animal fish = new Animal();
		Animal bird = new Animal();
		
		System.out.println("\n--------------------DOG--------------------");
		dog.animalProfile();
		dog.calculateAge();
		dog.animalType();
		dog.foodCost();
		
		System.out.println("\n---------------------CAT--------------------");
		cat.animalProfile();
		cat.calculateAge();
		cat.animalType();
		cat.foodCost();
		
		System.out.println("\n---------------------FISH--------------------");
		fish.animalProfile();
		fish.calculateAge();
		fish.animalType();
		fish.foodCost();
		
		System.out.println("\n---------------------BIRD--------------------");
		bird.animalProfile();
		bird.calculateAge();
		bird.animalType();
		bird.foodCost();
	}
}