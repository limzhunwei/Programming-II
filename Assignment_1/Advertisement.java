package Assignment_1;

public class Advertisement {		//1.3 User Define Class
	
	//1.2 Pre-Define Class
	String organization, event, prize;
	int taxReduction;

	public Advertisement() {		// 1.4 Constructor with no argument
		eventWebsite();
	}
	
	public Advertisement(String organization) {		// 1.4 Constructor with one argument
		this.organization = organization;
		UNWomen();
	}
	
	public Advertisement(String prize, int taxReduction) {		// 1.4 Constructor with two argument
		this.prize = prize;
		this.taxReduction = taxReduction;
		System.out.println("Prize\t: " +  prize);
		System.out.println("IF you donate more than RM500, you can get a tax reduction of " + taxReduction + "%!");
	}
	
	public void UNWomen() {
		System.out.println("More info about UN Women can visit the following website:");
		System.out.println(this.organization + " Facebook: https://www.facebook.com/unwomen/");
		System.out.println(this.organization + " website: https://www.unwomen.org/en");
	}
	
	public void eventWebsite() {
		System.out.println("Event Website: https://www.unwomen.org/en/news/events/2021/06/event-youth-activism-for-gender-equality-in-nationality-laws");
	}

}
