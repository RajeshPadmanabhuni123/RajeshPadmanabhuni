package contact;

public class Contact 
{
	String contactPerson;
	String mobile;
	String email;
	
	public Contact() {
	}
	public Contact(String contactPerson, String mobile, String email) {
		super();
		this.contactPerson = contactPerson;
		this.mobile = mobile;
		this.email = email;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void printContact()
	{
		System.out.println("Contact Person:"+this.contactPerson);
		System.out.println("Mobile:"+this.mobile);
		System.out.println("Email:"+this.email);
	}
}
