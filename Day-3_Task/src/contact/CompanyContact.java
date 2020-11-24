package contact;

public class CompanyContact extends Contact
{
	String companyName;
	String website;
	String department;
	String city;
	String country;
	String address;
	String pin;
	
	public CompanyContact() {
		
	}
	public CompanyContact(String contactPerson, String mobile, String email, String companyName, String website,
			String department, String city, String country, String address, String pin) {
		super(contactPerson, mobile, email);
		this.companyName = companyName;
		this.website = website;
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
		this.pin = pin;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public void printContact() {
		super.printContact();
		System.out.println("Company Name:"+this.companyName);
		System.out.println("Website:"+this.website);
		System.out.println("Department:"+this.department);
		System.out.println("City:"+this.city);
		System.out.println("Country:"+this.country);
		System.out.println("Address:"+this.address);
		System.out.println("Pin:"+this.pin);	
	}
	
	
}
