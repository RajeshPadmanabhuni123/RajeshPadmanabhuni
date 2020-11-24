package Student1;
import java.util.Arrays;

/*Student Class*/
public class Student {

	String rollnumber;
	String name;
	int marks[]=new int[5];
	public Student(String rollnumber, String name, int marks[]) //constructor
	{
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	public void display() {
		System.out.println(" name " + name + ", rollnumber=" + rollnumber + ", marks=" + Arrays.toString(marks));
	}
	
}
