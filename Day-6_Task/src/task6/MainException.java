package task6;
import java.util.Scanner;
public class MainException {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age>17)
		{
			System.out.println("Can access everything");
		}
		else
		{
			try 
			{
			throw new MyException6("Invalid age");
			}
			catch(MyException6 me)
			{
				me.printStackTrace();
				System.out.println("You can access only game");
			}
		}
	}
}
