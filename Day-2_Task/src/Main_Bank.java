import java.util.*;
public class Main_Bank {

	static Bank Applicant[]=new Bank[100];
	static int no_Applicants;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Choose from following option : ");
			System.out.println("1. Add customer");
			System.out.println("2. Delete customer");
			System.out.println("3. update customer");
			System.out.println("4. display all customer");
			System.out.println("5. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					
						Applicant[no_Applicants]=new Bank();
						Bank.addCustomer(Applicant[no_Applicants]);
						no_Applicants++;
						System.out.println("Customer added Successfully...");
						break;
				}
				case 2:
				{
					System.out.println("Enter the Id of Customer to delete");
					int id=sc.nextInt();
					int flag=0;
					for(int i=0;i<no_Applicants;i++)
					{
						if(Applicant[i].custid==id)
						{
							Bank.delCustomer(Applicant,i);
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println("Customer not Found...!!");
					}
					else
					{
						no_Applicants--;
						System.out.println("Customer deleted Successfully...");
					}
					break;
				}
			case 3:
			{
				System.out.println("enter Customer id...");
				int id=sc.nextInt();
				int d=-1;
				d=Bank.search(Applicant,id);
				if(d!=-1)
				{
					System.out.println("Proceed for updating...");
					System.out.println();
					System.out.println("1.update name");
					System.out.println("2.update customerId");
					System.out.println("3.update emailID");
					System.out.println("4.update mobile number");
					System.out.println("5.update Account number");
					System.out.println("6.update Address");
					int ch;
					System.out.println("Enter your choice to update..");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
						{
							String name=sc.next();
							Bank.setName(Applicant[d],name);
							System.out.println("Updated Sucessfully...");
							break;
						}
						case 2:
						{
							int csid=sc.nextInt();
							Bank.setCustid(Applicant[d],csid);
							System.out.println("Updated Sucessfully...");
							break;
						}
						case 3:
						{
							String emid=sc.next();
							Bank.setEmailid(Applicant[d],emid);
							System.out.println("Updated Sucessfully...");
							break;
						}
						case 4:
						{
							long mbl=sc.nextInt();
							Bank.setMobileno(Applicant[d],mbl);
							System.out.println("Updated Sucessfully...");
							break;
						}
						case 5:
						{
							long Acc=sc.nextInt();
							Bank.setAccno(Applicant[d],Acc);
							System.out.println("Updated Sucessfully...");
							break;
						}
						case 6:
						{
							String Add=sc.next();
							Bank.setAddress(Applicant[d],Add);
							System.out.println("Updated Sucessfully...");
							break;
						}
						default:
							System.out.println("Invalid input....");

					}
					
				}
				else
				{
					System.out.println("Customer not Found...!!");
				}
				
				break;
			}
			case 4:
			{
				System.out.println("Details of All Customers...");
				for(int i=0;i<no_Applicants;i++)
				{
					Bank.toString(Applicant[i]);
				}
				break;
			}
			case 5:
				System.out.println("Thanks for using... Have a nice Day:)");
				break;
			default:
				System.out.println("Invalid choice...!!");
		}
			
		}while(choice != 5);
		sc.close();
	}

}
