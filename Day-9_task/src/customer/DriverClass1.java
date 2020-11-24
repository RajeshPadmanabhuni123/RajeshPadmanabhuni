package customer;

import java.util.Scanner;
import java.util.TreeSet;

public class DriverClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		
		System.out.println("Enter no.of customers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Customer1 c[]=new Customer1[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the accountNumber");
			long accno=sc.nextLong();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the CustomerId");
			String cid=sc.next();
			System.out.println("Enter the Customer Address");
			String address=sc.next();
			
			
			c[i]=new Customer1(accno,name,cid,address);
			ts.add(c[i]);
		}
		System.out.println(ts);

	}

}
