import java.util.Scanner;
public class Bank {

	String name;
	int custid;
	String emailid;
	long mobileno;
	String address;
	long accno;
	public static void addCustomer(Bank a)
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		a.name=sc.next();
		System.out.println("Enter custid");
		a.custid=sc.nextInt();
		System.out.println("Enter Email-ID");
		a.emailid=sc.next();
		System.out.println("Enter mobile number");
		a.mobileno=sc.nextInt();
		System.out.println("Enter address");
		a.address=sc.next();
		System.out.println("Enter Account number");
		a.accno=sc.nextInt();	
	}
	public static void delCustomer(Bank a[],int d)
	{
		for(int i=d;i<Main_Bank.no_Applicants-1;i++)
		{
			a[i]=a[i+1];
		}
	}
	public static int search(Bank a[],int d)
	{
		for(int i=0;i<Main_Bank.no_Applicants;i++)
		{
			if(a[i].custid==d)
				return i;
		}
		return -1;
	}
	public static void setName(Bank a,String name) {
		a.name = name;
	}
	public static void setCustid(Bank a,int custid) {
		a.custid = custid;
	}
	public static void setEmailid(Bank a,String emailid) {
		a.emailid = emailid;
	}
	public static void setMobileno(Bank a,long mobileno) {
		a.mobileno = mobileno;
	}
	public static void setAddress(Bank a,String address) {
		a.address = address;
	}
	public static void setAccno(Bank a,long accno) {
		a.accno = accno;
	}
	public static void toString(Bank a) {
		System.out.println("name=" + a.name + ", custid=" + a.custid + ", emailid=" + a.emailid + ", mobileno=" + a.mobileno
				+ ", address=" + a.address + ", accno=" + a.accno);
	}
}
