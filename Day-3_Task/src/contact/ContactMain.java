package contact;

import java.util.Scanner;

public class ContactMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your choice");
		System.out.println("1.Company Contact");
		System.out.println("2.Employee Contact");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice)
		{
			case 1: 
			{
				CompanyContact cc=new CompanyContact();
				System.out.println("Enter Contact Person:");
				cc.setContactPerson(sc.nextLine());
				System.out.println("Enter Mobile:");
				cc.setMobile(sc.nextLine());
				System.out.println("Enter Email:");
				cc.setEmail(sc.nextLine());
				System.out.println("Enter Company Name:");
				cc.setCompanyName(sc.nextLine());
				System.out.println("Enter Website:");
				cc.setWebsite(sc.nextLine());
				System.out.println("Enter Department:");
				cc.setDepartment(sc.nextLine());
				System.out.println("Enter City:");
				cc.setCity(sc.nextLine());
				System.out.println("Enter Country:");
				cc.setCountry(sc.nextLine());
				System.out.println("Enter Address:");
				cc.setAddress(sc.nextLine());
				System.out.println("Enter Pin:");
				cc.setPin(sc.nextLine());	
				System.out.println("Company Contact Details:");
				cc.printContact();
				break;
			}
			case 2: 
			{
				EmployeeContact ec=new EmployeeContact();
				System.out.println("Enter Contact Person:");
				ec.setContactPerson(sc.nextLine());
				System.out.println("Enter Mobile:");
				ec.setMobile(sc.nextLine());
				System.out.println("Enter Email:");
				ec.setEmail(sc.nextLine());
				System.out.println("Enter City:");
				ec.setCity(sc.nextLine());
				System.out.println("Enter Country:");
				ec.setCountry(sc.nextLine());
				System.out.println("Enter Pin:");
				ec.setPin(sc.nextLine());
				System.out.println("Enter Designation:");
				ec.setDesignation(sc.nextLine());
				System.out.println("Enter Date of Birth:");
				ec.setDateOfBirth(sc.nextLine());
				System.out.println("Employee Contact Details:");
				ec.printContact();
				break;
			}
			default:
			{
				System.out.println("Invalid Choice");
			}
			
		}
	}

}

