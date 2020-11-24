public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		if(args.length>0)
		{
			n=Integer.parseInt(args[0]);
			//Reverse
			int rev=0;
			while(n!=0)
			{
				rev=rev*10+n%10;
				n=n/10;
			}
			
			
			//prime check
			if(rev==1)
			{
				System.out.println("1 is neither prime nor composite");
			}
			else
			{
				int flag1=0;
				for(int i=2;i<=rev/2;i++)
				{
					if(rev%i == 0)
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
		else
		{
			System.out.println("Enter the input as CommandLine...!!");
			
		}
	}

}
