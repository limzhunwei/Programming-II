package Exe_4_1;

public class Main {

	public static void main(String[] args) {

		Fruit obj1 = new Fruit("Fruit", 2, 4.5, "everywhere");
		
		System.out.println("\n---------------APPLE---------------");
		Apple obj2 = new Apple("Apple", 18, 2, "Jepun");
		System.out.println(obj2);
		System.out.println("Group for 3 apples: " + obj2.group2());
		System.out.println("Group for 7 apples: " + obj2.group1());
		System.out.println("Left: " + obj2.left());
		System.out.println("Total Price: RM" + obj2.totalPrice());
		
		System.out.println("\n---------------GREEN APPLE---------------");
		Green_Apple sub1 = new Green_Apple("Green Apple", 4, 4, "Tokyo", 'A' , "Medium");
		System.out.println(sub1);
		System.out.println("Total Price: RM" + sub1.totalPrice());

		System.out.println("\n---------------RED APPLE---------------");
		Red_Apple sub2 = new Red_Apple("Red Apple", 10, 3 , "Fukushima", 'B', "Small");
		System.out.println(sub2);
		System.out.println("Total Price: RM" + sub2.totalPrice());
		
		System.out.println("\n---------------ORANGE---------------");
		Orange obj3 = new Orange("Orange", 5, 7, "US", "Orange", 2500);
		System.out.println(obj3);
		System.out.println("Total Calories: " + obj3.countCal());
		System.out.println("Total Price: RM" + obj3.totalPrice());
		
		System.out.println("\n---------------BANANA---------------");
		Banana obj4 = new Banana("Banana", 10, 1.8, "Malaysia", 3.5);
		System.out.println(obj4);
		System.out.println("Vitamin A per 100g: " + obj4.vitaminA() + "IU");
		System.out.println("Total Price: RM" + obj4.totalPrice());

	}

}
