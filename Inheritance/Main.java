package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Phone obj1 = new Phone("Samsung", "S21 Ultra", 3599);
		System.out.println(obj1 + "\n");
		
		Samsung obj2 = new Samsung("Samsung", "S21 Ultra", 3599);
		System.out.println(obj2);
		System.out.printf("Final Price: RM%.2f" , obj2.getFinalPrice());
		
		
		
	}

}
