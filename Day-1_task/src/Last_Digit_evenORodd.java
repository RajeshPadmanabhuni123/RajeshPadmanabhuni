import java.util.Scanner;

public class Last_Digit_evenORodd {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three number");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int rev=0,sum=0;

	if((n1%10)%2 == 0)
	{
		sum=sum+n1;
	}
	else
	{
		while(n1!=0)
		{
			rev=rev*10+(n1%10);
			n1=n1/10;
		}
		sum=sum+rev;
	}
	rev=0;
	if((n2%10)%2 == 0)
	{
		sum=sum+n2;
	}
	else
	{
		while(n2!=0)
		{
			rev=rev*10+(n2%10);
			n2=n2/10;
		}
		sum=sum+rev;
	}
	rev=0;
	if((n3%10)%2 == 0)
	{
		sum=sum+n3;
	}
	else
	{
		while(n3!=0)
		{
			rev=rev*10+(n3%10);
			n3=n3/10;
		}
		sum=sum+rev;
	}
	System.out.println("The result is :"+sum);
	sc.close();
}

}
