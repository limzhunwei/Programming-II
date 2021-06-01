package Assignment_1;

import java.text.DecimalFormat;

public class Finance {		//1.3 User Define Class
	
	//1.2 Pre-Define Class
	DecimalFormat dp = new DecimalFormat("0.00");	
	
	double totalDonation, eventExpenses, otherExpenses, sponsor, registrationFees;
	int totalParticipant;
	
	public Finance() {		// 1.4 Constructor with no argument
		System.out.println("Finance for UN Women");
	}
	
	public Finance(double sponsor) {		// 1.4 Constructor with one argument
		this.sponsor = sponsor;
		System.out.println("Total sponsor \t\t: RM" + dp.format(this.sponsor));;
	}
	
	public Finance(double  registrationFees,int totalParticipant) {		// 1.4 Constructor two no argument
		this.registrationFees = registrationFees;
		this.totalParticipant = totalParticipant;
		System.out.println("Total participant\t: " + this.totalParticipant + " participants");
		System.out.println("Total fees\t\t: RM" + dp.format(totalFees()));
	}
	
	
	public double totalExpenses() {			
		return eventExpenses + otherExpenses;
	}
	
	public double totalFees() {					
		return registrationFees*totalParticipant;
	}
	
	public double netIncome() {				
		return  totalDonation + sponsor + totalFees() - totalExpenses();
	}
	
	public void setEventExpenses(double eventExpenses) {		
		this.eventExpenses = eventExpenses;
	}
	
	public void setOtherExpenses(double otherExpenses) {		
		this.otherExpenses = otherExpenses;
	}
	
	public void setTotalDonation(double totalDonation) {		
		this.totalDonation = totalDonation;
	}
	
	public double getEventExpenses() {				
		return eventExpenses;
	}
	
	public double getOtherExpenses() {				
		return otherExpenses;
	}
	
	public double getTotalDonation() {				
		return totalDonation;
	}
	

}
