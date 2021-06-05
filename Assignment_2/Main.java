package Assignment_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static Scanner in = new Scanner(System.in);				
	static DecimalFormat dp = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		int eventNo = 0;
		int option = 0;
		int choice = 0;
		
		System.out.println("======================================== WELCOME TO UN WOMEN =======================================================");
		System.out.println("Organization Name:  United Nations Entity for Gender Equality and the Empowerment of Women(UN Women)");
		System.out.println("Date of Formation: 2 July 2010");
		System.out.println("HQ Location: New York City, United States");
		System.out.println("HQ Contact: +1 646 781-4400");
		System.out.println("Organization Goal: i)   Aim to elimination of discrimination against women and girls"
				+ "\n\t\t   ii)  Aim to empowerment of women"
				+ "\n\t\t   iii) Achievement of equality between women and men as partners and beneficiaries of development, "
				+ "\n\t\t        human rights, humanitarian action and peace and security.");

		while(option < 4) {
			System.out.println("\nSelect option:"
					+ "\t1. Admin"
					+ "\n\t\t2. Participant"
					+ "\n\t\t3. Exit");
			System.out.print("Option: ");
			option = in.nextInt();
			System.out.println("");
			
			switch(option) {
			case 1:
				
				System.out.println("Select the event you wish to check the total fees collected: ");
				while (choice < 5) {
					Finance f = new Finance("UN Women", choice);
					if(choice <= 3) {
						System.out.println("1. Event 1: Youth Activism for Gender Equality in Nationality Laws"
								+ "\n2. Event 2: Path to equal: New Indices on Gender Equality and Women's Empowerment"
								+ "\n3. Event 3: Generation Equality Forum: Paris"
								+ "\n4. Check overall finance of UN Women");
						System.out.print("Choice: ");
						choice = in.nextInt();
					
					}
					else if(choice == 4) {
						System.out.println("Finance for UN Women");
						f.setEventExpenses(7500);
						f.setOtherExpenses(3467.60);
						f.setSponsor(12000);
						f.setTotalDonation(25000.45);
						f.setTotalFees(3250);
						System.out.println(f.printInfo());
						break;
					}
				}
				break;
				
			case 2:
				
				System.out.println("Event 1: Youth Activism for Gender Equality in Nationality Laws"
						+ "\nEvent 2: Path to equal: New Indices on Gender Equality and Women's Empowerment"
						+ "\nEvent 3: Generation Equality Forum: Paris");
				System.out.print("Select the event you wish to paricipate: ");
				eventNo = in.nextInt();
				System.out.println("");
				EventDescription ed = new EventDescription("UN Women", eventNo);
				System.out.println(ed.printInfo());
				Advertisement ads = new Advertisement("UN Women", eventNo);
				System.out.println(ads.printInfo());
				Participant p = new Participant("UN Women", eventNo);
				System.out.println(p.printInfo());
				p.tax();
				break;

			case 3:
				Advertisement.organizationWebsite();
				System.out.println("Thanks for visting UN Women!");
				System.exit(0);
			}
	
		}
			
		
	}

}
