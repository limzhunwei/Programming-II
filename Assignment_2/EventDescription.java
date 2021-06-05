package Assignment_2;

import java.text.DecimalFormat;

public class EventDescription extends UNWomen {		// 2.1 Inheritance
	
	DecimalFormat dp = new DecimalFormat("0.00");	
	
	protected String location, eventName, date, organization, time;
	protected double fees;
	protected int eventNo, maxParticipant;
	
	public EventDescription(String organizationName, int eventNo) {	
		super(organizationName);
		this.eventNo = eventNo;
		if(eventNo == 1) {
			setEventName("Youth Activism for Gender Equality in Nationality Laws");
			setDate("1 June 2021");
			setTime("5:00 p.m.");
			setLocation("Online");
			setFees(3.50);
			setMaxParticipant(250);
		}
		else if (eventNo == 2) {
			setEventName("Path to equal: New Indices on Gender Equality and Women's Empowerment");
			setDate("15 July 2021");
			setTime("8:00 p.m.");
			setLocation("Online, Zoom");
			setFees(2.50);
			setMaxParticipant(150);
		}
		else if (eventNo == 3) {
			setEventName("Generation Equality Forum: Paris");
			setDate("30 June 2021 - 2 July 2021");
			setTime("9:00 p.m.");
			setLocation("Online");
			setFees(4.00);
			setMaxParticipant(500);
		}
	}
	
	// 2.3 Encapsulation - Setter and Getter
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setFees(double fees){
		this.fees = fees;
	}
	
	public void setMaxParticipant(int maxParticipant) {
		this.maxParticipant = maxParticipant;
	}

	public String getEventName() {
		return this.eventName;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public double getFees() {
		return this.fees;
	}
	
	public int getMaxParticipant() {
		return this.maxParticipant;
	}
	
	// 2.2 Polymorphism 
	public String printInfo() {		
		return "Event Detail"
				+ "\nEvent Name\t: " + getEventName()
				+ "\nDate\t\t: " + getDate()
				+ "\nTime\t\t: " + getTime()
				+ "\nLocation\t: " + getLocation()
				+ "\nFees\t\t: RM" + dp.format(getFees())
				+ "\nMax participants: " + getMaxParticipant() + " participants";
	}

}
