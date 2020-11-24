package Student1;
/*Child of Student class*/
import java.util.Scanner;
public class MyRecord {
	public static void main(String[] args) {
		Student s; //object declaration
		String name;
		String rollnumber;
		int marks[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter roll number");
		rollnumber=sc.next();
		System.out.println("Enter marks of 5 subjects");
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
		}
		s=new Student(rollnumber,name,marks); //calling constructor and intiliasing values
		s.display(); //calling display method to print
	}
	
	
}
