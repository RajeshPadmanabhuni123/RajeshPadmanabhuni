package Student2;
/*Dervied class of Student1*/
import java.util.Scanner;
public class Record extends Student1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record r=new Record();//object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		r.name=sc.next();
		System.out.println("Enter rollnumber");
		r.rollnumber=sc.next();
		System.out.println("Enter address");
		r.address=sc.next();
		System.out.println("Name "+r.name+" Rollnumber "+r.rollnumber+" Address "+r.address);
	}

}
