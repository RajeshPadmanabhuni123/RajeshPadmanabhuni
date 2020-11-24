import java.util.Scanner;
import java.io.*;
public class EvenOrOdd {

	public static void main(String[] args) throws IOException {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the number of elements to read..");
		int n=name.nextInt();
		System.out.println("Enter the values");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=name.nextInt();

		}
		/*FileWriter fose = new FileWriter("even.txt");
		FileWriter foso = new FileWriter("odd.txt");
	
			
			for(int i=0;i<n;i++)
			{
				
				if(a[i]%2 == 0)
				{
					fose.write(a[i]);
				}
				else
				{
					foso.write(a[i]);
				}
				
			}
		
			foso.close();
			fose.close();*/
			
		FileOutputStream fose=new FileOutputStream("even.txt");
		FileOutputStream foso=new FileOutputStream("odd.txt");
		DataOutputStream dose=new DataOutputStream(fose);
		DataOutputStream doso=new DataOutputStream(foso);
		for(int i=0;i<n;i++)
		{
			
			if(a[i]%2 == 0)
			{
				dose.writeInt(a[i]);
			}
			else
			{
				doso.writeInt(a[i]);
			}
			
		}
		dose.close();
		doso.close();
	}
}
