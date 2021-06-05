package Assignment_2;

public abstract class UNWomen {			// 2.4 Abstract Class
	
	protected String organizationName;

	public UNWomen(String organizationName) {
		this.organizationName = organizationName;
	}
	
	public abstract String printInfo();
}