package human;

import java.util.Scanner;

/*main method*/
class Main_Human
{
	public static void main(String args[])
	{
		String name;
		String gender;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of man");
		name=sc.next();
		System.out.println("Enter gender");
		gender=sc.next();
		System.out.println("Enter age of man");
		age=sc.nextInt();
		Man m=new Man(age,name,gender);
		System.out.println("Enter name of woman");
		name=sc.next();
		System.out.println("Enter gender");
		gender=sc.next();
		System.out.println("Enter age of woman");
		age=sc.nextInt();
		Woman w=new Woman(age,name,gender);
		m.find(m, w);
	}
}