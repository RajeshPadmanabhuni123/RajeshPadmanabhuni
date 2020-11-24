package Employee;

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
		HashSet<Employee> hs=new HashSet<>();
		for(int i=0;i<number;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("enter salary");
			double salary=sc.nextDouble();
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println("enter employee working years");
			double empworkingyears=sc.nextDouble();
			
			
			Employee e=new Employee(id,name,salary,age,empworkingyears);
			hs.add(e);
		}
		//sorting
		hs.stream().sorted(Comparator.comparingDouble(Employee :: getEmpworkingyears));
		System.out.println(hs);
		//condition for salary update
		hs.stream().filter(p-> p.empworkingyears>5.0).map(p-> (double)p.empsalary+50000.0);
		hs.stream().filter(p-> p.empworkingyears>2.0 && p.empworkingyears<5.0).map(p-> (double)p.empsalary+25000.0);
		hs.stream().filter(p-> p.empworkingyears<2.0).map(p-> (double)p.empsalary+10000.0);
		System.out.println(hs);
		
		//greater 5 years
		HashSet hs2=(HashSet) hs.stream().filter(p-> p.empworkingyears>5.0).collect(Collectors.toSet());
		System.out.println(hs2);
		
		//sorting based on salary
		HashSet hs3=(HashSet) hs.stream().sorted((p,v)->(Double)p.empsalary<(Double)p.empsalary ?1:-1).collect(Collectors.toSet());
		System.out.println(hs3);
		
		//soting based on empid and filtering less than 2 years of work experience
		HashSet hs4=(HashSet) hs.stream().filter(p-> p.empworkingyears<2.0).sorted((p,v)->p.empid<p.empid ?1:-1).collect(Collectors.toSet());
		System.out.println(hs4);
		
		//printing greater than 5 years of experience
		int count=0;
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			if(e.empworkingyears>5.0)
				count++;
		}
		System.out.println("Employees with more than 5 years of experience "+count);		
	}
}
