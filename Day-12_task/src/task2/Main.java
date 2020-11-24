package task2;

import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees");
		int number =sc.nextInt();
		Employee e[]=new Employee[number];
		
		for(int i=0;i<number;i++)
		{
			System.out.println("enter id");
			String id=sc.next();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("enter salary");
			double salary=sc.nextDouble();
			System.out.println("Enter age");
			int age=sc.nextInt();
			
			e[i]=new Employee(id,name,salary,age);
		}
		

		Base64.Encoder encode= Base64.getEncoder();
		
		for(int i=0;i<number;i++)
		{
			byte a[] = {(byte) e[i].empsalary};
			byte b[] = {(byte) e[i].empage};
			System.out.println("name : "+encode.encodeToString(e[i].empname.getBytes())+" id : "+encode.encode(e[i].empid.getBytes())
								+" salary : "+encode.encode(a)+" age : "+encode.encode(b));
			
		}
		
	}
}
