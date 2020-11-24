import java.util.Scanner;
public class Main_Operation_on_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the max range of elements");
		size=sc.nextInt();
		int a[]=new int[size];
		//initialize
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//checking conditions
		for(int i=0;i<size;i++)
		{
			System.out.println("The number is "+a[i]);
			Operation_on_n_numbers.prime(a[i]);
			Operation_on_n_numbers.palindrome(a[i]);
			Operation_on_n_numbers.perfect(a[i]);
			Operation_on_n_numbers.amstrong(a[i]);
			System.out.println();
			
		}
		sc.close();
	}

}
