import java.util.Scanner;

public class Menu_Driven {

	public static void main(String[] args) {
		
		int menu,flag=0;
		Scanner name = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=name.nextInt();
		//Menu
		    do
			{
			System.out.println("1. Prime number");
			System.out.println("2. Perfect number");
			System.out.println("3. Palindrome number");
			System.out.println("4. amstrong number");
			System.out.println("5. Exit");
			System.out.println("Enter your choice...");
			menu=name.nextInt(); //Menu option
			switch(menu)
			{
				case 1:
				{
					if(n==1)
					{
						System.out.println("1 is neither prime nor composite");
					}
					else
					{
						int flag1=0;
						for(int i=2;i<=n/2;i++)
						{
							if(n%i == 0)
							{
								flag1=1;
								break;
							}
						}
						if(flag1==0)
						{
							System.out.println("The number is prime");
						}
						else
						{
							System.out.println("The number is not a prime");
						}
					
						
				   }
					break;
			}
			case 2:
			{ 
				int sum=0;
				for(int i=1;i<=n/2;i++)
				{
					if(n%i == 0)
					{
						sum=sum+i;
					}
				}
				if(sum==n)
					System.out.println("The number is perfect");
				else
					System.out.println("The number is not perfect");
				
				break;
			}
			case 3:
			{
				int rev=0;
				int m=n;
				while(m!=0)
				{
					rev=rev*10+(m%10);
					m=m/10;
				}
				if(rev==n)
					System.out.println("The number is palindrome");
				else
					System.out.println("The number is not a palindrome");
				break;
			}
			case 4:
			{
				int m=n;
				int len=0;
				while(m!=0)
				{
					len++;
					m=m/10;
				}
				m=n;
				int sum=0;
				while(m!=0)
				{
					int rem=m%10;
					int sum1=1;
					for(int i=0;i<len;i++)
					{
						sum1=sum1*rem;
					}
					sum=sum+sum1;
					m=m/10;
				}
				if(n==sum)
					System.out.println("The number is Amstrong");
				else
					System.out.println("The number is not Amstrong");
				break;
			}
			case 5:
			{
				flag=1;
				break;
			}
			default:
				System.out.println("Invalid Input");
				break;
					
		}
	
	}while(flag==0);
     name.close();
	}
}
