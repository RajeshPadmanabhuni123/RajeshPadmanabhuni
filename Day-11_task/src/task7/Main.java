package task7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Student> al=new ArrayList<Student>();
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter Maths marks");
			int maths=sc.nextInt();
			System.out.println("Enter Science marks");
			int science=sc.nextInt();
			System.out.println("Enter Social marks");
			int social=sc.nextInt();
			
			Student s=new Student(name,id,maths,science,social);
			al.add(s);
		}
		System.out.println("Students failed in three subjects");
		ArrayList al1=(ArrayList)al.stream()
				.filter(p->p.maths<35 && p.science<35 && p.social<35)
				.map(p->p.name)
				.collect(Collectors.toList());
		System.out.println(al1);
		System.out.println("Students passed in three subjects");

		al.stream().filter(p->p.maths>=35 && p.science>=35 && p.social>=35)
				.forEach(p->p.getName());
		
				
		//System.out.println(al2);
	}

}
