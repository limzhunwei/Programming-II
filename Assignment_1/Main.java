package Assignment_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner in = new Scanner(System.in);				
	static DecimalFormat dp = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		int option = 0;
		
		System.out.println("======================================== WELCOME TO UN WOMEN =======================================================");
		UNWomen unw = new UNWomen();
		UNWomen unwDate = new UNWomen("2 July 2010");
		System.out.println("Date of Formation: " + unwDate.dateOfFormation);
		UNWomen unwInfo = new UNWomen("New York City, United States","+1 646 781-4400");
		System.out.println("HQ Location\t : " + unwInfo.location);
		System.out.println("HQ Contact\t : " + unwInfo.contact);
		unw.goal();
		System.out.println("");

		while(option < 4) {
			System.out.println("Select option:"
					+ "\t1. Admin"
					+ "\n\t\t2. Participant"
					+ "\n\t\t3. Exit");
			System.out.print("Option: ");
			option = in.nextInt();
			
			switch(option) {
			case 1:
				Finance fTitle = new Finance();
				Finance fSponsor = new Finance(4500);
				Finance f = new Finance(3.50, 250);
				f.setEventExpenses(5500);
				f.setOtherExpenses(1500);
				f.setTotalDonation(12000);
				System.out.println("Total donation\t\t: RM" + dp.format(f.getTotalDonation()));
				System.out.println("Total expenses\t\t: RM" + dp.format(f.totalExpenses()));
				System.out.println("Net income\t\t: RM" + dp.format(f.netIncome()));
				System.out.println("");
				break;
				
			case 2:
				Event eName = new Event("Youth Activism for Gender Equality in Nationality Laws");
				Event e = new Event();
				Event eDetail = new Event("1 June 2021","Online", "5:00 p.m.", 3.50);
				Advertisement adsPrizeTax = new Advertisement("1st prize - RM100 \n\t  2nd prize - RM70 \n\t  3rd prize - RM50", 20);
				Advertisement ads = new Advertisement();
				System.out.println("");
				
				Participant pRegistration = new Participant("Youth Activism for Gender Equality in Nationality Laws");
				Participant p = new Participant();
				Participant pFees = new Participant(3.50, 20);
				System.out.println(p.printInfo());
				System.out.println("Total money paid: RM" + dp.format(pFees.totalPrice()));
				if(pFees.donation < 500) {
					System.out.println("There is no tax reduction for donation below RM500!" );
					System.out.println("");
				}
				else {
					System.out.println("Total tax reduced: RM" + dp.format(pFees.calTax()));
					System.out.println("");
				}
				break;

			case 3:
				Advertisement adsEvent = new Advertisement("UN Women");
				System.out.println("Thanks for visting UN Women!");
				System.exit(0);
			}
	
		}
			
		
	}

}
