package AnimalProfile;

public class Main {

	public static void main(String[] args) {
		
		Animal dog  = new Animal();
		Animal cat = new Animal();
		Animal fish = new Animal();
		Animal bird = new Animal();
		
		System.out.println("\n--------------------DOG--------------------");
		dog.animalProfile("Husky", "Grey", 16, 27);
		dog.calculateAge(2014, 22);
		dog.animalType("Mammalia", "Live-bearing mammals", "Raw foods and vegetables");
		dog.foodCost(100, 7);
		
		System.out.println("\n---------------------CAT--------------------");
		cat.animalProfile("Bombay Cat", "Black", 3.6, 5.4);
		cat.calculateAge(2017, 15);
		cat.animalType("Mammalia", "Live-bearing mammals", "Cat foods");
		cat.foodCost(110, 4);
		
		System.out.println("\n---------------------FISH--------------------");
		fish.animalProfile("Bottlenose Dolphin", "Grey", 150, 650);
		fish.calculateAge(2004, 40);
		fish.animalType("Mammalia", "Live-bearing mammals", "Fishes");
		fish.foodCost(900, 17);
		
		System.out.println("\n---------------------BIRD--------------------");
		bird.animalProfile("Parrot", "Colourful", 2, 4);
		bird.calculateAge(1991, 60);
		bird.animalType("Birds", "Egg laying", "Both meats and vegetables");
		bird.foodCost(80, 30);
	}
}