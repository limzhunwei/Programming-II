package AnimalSetterGetter;

public class Animal {
	
	String breed;
	String color;
	double weight;
	int age;
	char gender;
	
	//setter
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//getter
	public String getBreed() {
		return this.breed;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
}
