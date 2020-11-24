package contact;

public class EmployeeContact extends Contact {

	String city;
	String country;
	String pin;
	String designation;
	String dateOfBirth;

	public EmployeeContact() {

	}

	public EmployeeContact(String contactPerson, String mobile, String email, String city, String country, String pin,
			String designation, String dateOfBirth) {
		super(contactPerson, mobile, email);
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public void printContact() 
	{
		super.printContact();
		System.out.println("City:"+this.city);
		System.out.println("Country:"+this.country);
		System.out.println("Pin:"+this.pin);
		System.out.println("Designation:"+this.designation);
		System.out.println("Date of Birth:"+this.dateOfBirth);
	}
	
}
