package Abstraction;

public class Main {
	
	public static void main(String[] args) {
	
		System.out.println("\n==================Apple==================");
		Apple obj1 = new Apple("Apple", 300, 2.5);
		System.out.println("\n" + obj1);
		
		System.out.println("\n================Red Apple================");
		Red_Apple sub1 = new Red_Apple("Red Apple", 50, 3, 'A');
		System.out.println(sub1);
		
		System.out.println("\n===============Green Apple===============");
		Green_Apple sub2 = new Green_Apple("Green Apple", 150, 4.50, 'B');
		System.out.println(sub2);
		
		System.out.println("\n==================Banana==================");
		Banana obj3 = new Banana("Banana", 25, 117, 64.6, 3.99, 0.117);
		System.out.println("\n" + obj3);
		
		System.out.println("\n==================Orange==================");
		Orange obj4 = new Orange("Orange", 'S', 38.4, 120, 3.0);
		System.out.println("\n" + obj4);
	}

}
