package Assignment_1;

public class UNWomen {		//1.3 User Define Class
	
	//1.2 Pre-Define Class
	String organizationName, location, contact, dateOfFormation;

	public UNWomen() {			// 1.4 Constructor with no argument
		organizationName = "United Nations Entity for Gender Equality and the Empowerment of Women(UN Women)";
		System.out.println("Organization name: " + organizationName);
	}
	
	public UNWomen(String dateOfFormation) {		// 1.4 Constructor with one argument
		this.dateOfFormation = dateOfFormation;
	}
	
	public UNWomen(String location, String contact) {		// 1.4 Constructor with two argument
		this.location = location;
		this.contact = contact;
	}

	public void goal() {
		System.out.println("Organization Goal: i)   Aim to elimination of discrimination against women and girls"
				+ "\n\t\t   ii)  Aim to empowerment of women"
				+ "\n\t\t   iii) Achievement of equality between women and men as partners and beneficiaries of development, "
				+ "\n\t\t        human rights, humanitarian action and peace and security.");
	}
}
