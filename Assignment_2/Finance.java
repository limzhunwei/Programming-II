package Assignment_2;

import java.text.DecimalFormat;

public class Finance extends EventDescription implements Payment{		// 2.1 Inheritance & 2.5 Interface
	

	DecimalFormat dp = new DecimalFormat("0.00");	
	
	protected double totalDonation, totalFees, eventExpenses, otherExpenses, sponsor;
	
	
	public Finance(String organizationName, int eventNo) {
		super(organizationName, eventNo);
		if(eventNo == 1 || eventNo == 2 || eventNo ==3) {
			System.out.println("Total fees collected in event " + eventNo +": RM" + dp.format(getPayment()));
		}
	}
	
	// 2.3 Encapsulation - Setter and Getter
	public void setEventExpenses(double eventExpenses) {		
		this.eventExpenses = eventExpenses;
	}
	
	public void setOtherExpenses(double otherExpenses) {		
		this.otherExpenses = otherExpenses;
	}
	
	public void setTotalDonation(double totalDonation) {		
		this.totalDonation = totalDonation;
	}
	
	public void setTotalFees(double totalFees) {		
		this.totalFees = totalFees;
	}

	public void setSponsor(double sponsor) {
		this.sponsor = sponsor;
	}
	
	public double getEventExpenses() {				
		return this.eventExpenses;
	}
	
	public double getOtherExpenses() {				
		return this.otherExpenses;
	}
	
	public double getTotalDonation() {				
		return this.totalDonation;
	}
	
	public double getTotalFees() {				
		return this.totalFees;
	}
	
	public double getSponsor() {
		return this.sponsor;
	}
	
	public double totalExpenses() {			
		return getEventExpenses() + getOtherExpenses();
	}
	
	public double netIncome() {				
		return  getTotalDonation() + getSponsor() + getTotalFees() - totalExpenses();
	}
	
	//2.5 Interface
	public double getPayment() {
		return super.fees*getMaxParticipant();
	}
	
	public double getPayment(int taxReduction) {
		return netIncome()*(taxReduction/100.00);
	}
	
	// 2.2 Polymorphism 
	public String printInfo() {
		return "Total fees\t\t: RM" + dp.format(getTotalFees())
			+ "\nTotal sponsor\t\t: RM" + dp.format(getSponsor())
			+ "\nTotal donation\t\t: RM" + dp.format(getTotalDonation())
			+ "\nTotal expenses\t\t: RM" + dp.format(totalExpenses())
			+ "\nNet income\t\t: RM" + dp.format(netIncome())
			+ "\nIncome tax reduction\t: RM" + dp.format(getPayment(7));
		
	}
	

}
