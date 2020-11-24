package task13;
import java.util.Scanner;
public class Exception13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int a;
		Scanner sc=new Scanner(System.in);
		while(flag)
		{
			try
			{
				System.out.println("enter a number");
				flag=false;
				a=sc.nextInt();
			}
			catch(Exception e)
			{
				flag=true;
				System.out.println("you have not entered a number");
			}
		}
		System.out.println("Thanks for entering !!");
	}

}
