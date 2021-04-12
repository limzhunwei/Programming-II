package AnimalSetterGetter;

public class Main {

	public static void main(String[] args) {
		
		Animal dog  = new Animal();
		Animal cat = new Animal();
		Animal fish = new Animal();
		Animal bird = new Animal();

		System.out.println("----------DOG----------");
		dog.setBreed("Husky");
		dog.setColor("Grey");
		dog.setWeight(17);
		dog.setAge(7);
		dog.setGender('M');
		
		System.out.println("Breed: " + dog.getBreed());
		System.out.println("Color: " + dog.getColor());
		System.out.println("Weight: " + dog.getWeight() + "kg");
		System.out.println("Age: " + dog.getAge() + "years old");
		System.out.println("Gender: " + dog.getGender());
		
		System.out.println("\n----------CAT----------");
		cat.setBreed("Bombay Cat");
		cat.setColor("Black");
		cat.setWeight(5);
		cat.setAge(3);
		cat.setGender('M');
		
		System.out.println("Breed: " + cat.getBreed());
		System.out.println("Color: " + cat.getColor());
		System.out.println("Weight: " + cat.getWeight() + "kg");
		System.out.println("Age: " + cat.getAge() + "years old");
		System.out.println("Gender: " + cat.getGender());
		
		System.out.println("\n----------FISH----------");
		fish.setBreed("Dolphin");
		fish.setColor("Pink");
		fish.setWeight(35);
		fish.setAge(8);
		fish.setGender('F');
		
		System.out.println("Breed: " + fish.getBreed());
		System.out.println("Color: " + fish.getColor());
		System.out.println("Weight: " + fish.getWeight() + "kg");
		System.out.println("Age: " + fish.getAge() + "years old");
		System.out.println("Gender: " + fish.getGender());
		
		System.out.println("\n----------BIRD----------");
		bird.setBreed("Parrot");
		bird.setColor("Colorful");
		bird.setWeight(1.7);
		bird.setAge(47);
		bird.setGender('F');
		
		System.out.println("Breed: " + bird.getBreed());
		System.out.println("Color: " + bird.getColor());
		System.out.println("Weight: " + bird.getWeight() + "kg");
		System.out.println("Age: " + bird.getAge() + "years old");
		System.out.println("Gender: " + bird.getGender());
	}

}
