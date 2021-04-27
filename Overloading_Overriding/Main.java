package Overloading_Overriding;

public class Main {

	public static void main(String[] args) {

		Fruit obj1 = new Fruit("Fruit");
		
		System.out.println("\n==================Apple==================");
		Apple obj2 = new Apple("Apple", 3, 2.5);
		System.out.println(obj2);
		
		System.out.println("\n================Red Apple================");
		Red_Apple sub1 = new Red_Apple("Red Apple", 4, 3, "Red");
		System.out.println("Colour: " + sub1.getColour("Red"));
		System.out.println(sub1);
		
		System.out.println("\n===============Green Apple===============");
		Green_Apple sub2 = new Green_Apple("Green Apple", 6, 3.5, 'B');
		System.out.println("Gred 1: " + sub2.getGred('A'));
		System.out.println(sub2);
		
		System.out.println("\n==================Banana==================");
		Banana obj3 = new Banana("Banana", 3.7, "Vitamin A, Vitamin B6, Vitamin C");
		System.out.println(obj3);
		System.out.println("Total price: RM" + obj3.totalPrice(2.5, 3.7));
		
		System.out.println("\n==================Orange==================");
		Orange obj4 = new Orange("Orange", "Japan", 3, 140);
		System.out.println(obj4);
		System.out.println("Total price: RM" + obj4.totalPrice(5));

	}

}
