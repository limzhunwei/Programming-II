package Assignment_2;

public class Advertisement extends EventDescription{		// 2.1 Inheritance
	
	protected String prize, eventWebsite;
	
	public Advertisement(String organizationName, int eventNo) {		// 1.4 Constructor with two argument
		super(organizationName, eventNo);
		if(eventNo == 1) {
			setPrize("You will get voucher worth RM50!");
			setEventWebsite("https://www.unwomen.org/en/news/events/2021/06/event-youth-activism-for-gender-equality-in-nationality-laws");
		}
		else if (eventNo == 2) {
			setPrize("You will get voucher worth RM150!");
			setEventWebsite("https://www.unwomen.org/en/news/events/2021/07/event-path-to-equal-new-indices-on-gender-equality-and-womens-empowerment");
		}
		else if (eventNo == 3) {
			setPrize("There is no prize for this event!");
			setEventWebsite("https://forum.generationequality.org/home");
		}
	}
	
	// 2.3 Encapsulation - Setter and Getter
	public void setPrize(String prize){
		this.prize = prize;
	}

	public void setEventWebsite(String eventWebsite){
		this.eventWebsite = eventWebsite;
	}
	
	public String getPrize() {
		return this.prize;
	}
	
	public String getEventWebsite(){
		return this.eventWebsite;
	}
	
	public static void organizationWebsite() {
		System.out.println("More info about UN Women can visit the following website:");
		System.out.println("UN Women Facebook	: https://www.facebook.com/unwomen/");
		System.out.println("UN Women website	: https://www.unwomen.org/en");
	}
	
	// 2.2 Polymorphism 
	public String printInfo() {
		return "Prize\t\t: " +  getPrize()
				+ "\nEvent Website\t: " + getEventWebsite()
				+ "\nIf you donate more than RM500, you can get a tax reduction of 5%!"
				+ "\nIf you donate more than RM2000, you can get a tax reduction of 10%!";
	}

}
