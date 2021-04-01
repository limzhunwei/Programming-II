package Example3;

public class Dog {
	
	String breed;
	String colour;
	String size;
	
	void Husky() {
		breed = "Husky";
		colour = "Grey or White";
		size = "Big";
		System.out.println("Breed: " + breed);
		System.out.println("Colour: " + colour);
		System.out.println("Size: " + size);

	}
	
	void German_Shepherd() {
		breed = "German Shepherd";
		colour = "Brown mix with some black";
		size = "Big";
		System.out.println("Breed: " + breed);
		System.out.println("Colour: " + colour);
		System.out.println("Size: " + size);
	}
	
	void Run() {
		System.out.println("Dog is running");
	}
	
	void Jump() {
		System.out.println("Dog is jumping");
	}
	
	void Sit() {
		System.out.println("Dog is Sitting");
	}

}
