
public class Operation_on_n_numbers {

	public static void prime(int n)
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
	}
	public static void palindrome(int n)
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
		
	}
	public static void perfect(int n)
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
	}
	public static void amstrong(int n)
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
		
	}
}
