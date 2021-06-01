package Assignment_1;

import java.text.DecimalFormat;

public class Event {		//1.3 User Define Class
	
	//1.2 Pre-Define Class
	DecimalFormat dp = new DecimalFormat("0.00");	
	
	String location, eventName, date, organization, time;
	double fees;
	
	public Event() {		// 1.4 Constructor with no argument
		eventDescription();
	}
	
	public Event(String eventName) {		// 1.4 Constructor with one argument
		this.eventName= eventName;
		System.out.println("Event Name\t : " + this.eventName);
	}
	
	public Event(String date, String location, String time,double fees) {		// 1.4 Constructor with four argument
		this.date = date;
		this.location = location;
		this.time = time;
		this.fees = fees;
		
		System.out.println("Event Detail");
		System.out.println("Date\t: " + this.date);
		System.out.println("Time\t: " + this.time);
		System.out.println("Location: " + this.location);
		System.out.println("Fees\t: RM" + dp.format(this.fees));
	}
	
	public void eventDescription() {		
		System.out.println("Event Description: "
				+ "Nationality laws in approximately 50 countries deny women equal rights with men."
				+ "\n\t\t   Youth are playing a critical role in campaigns for reform and advancing gender equality across society.");
	}

}
