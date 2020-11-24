import java.util.Scanner;
public class Student_Grade {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int s1,s2,s3;
		char grade;
		System.out.println("Enter marks of 1st subject within range(0-100)");
		s1=sc.nextInt();
		System.out.println("Enter marks of 2nd subject within range(0-100)");
		s2=sc.nextInt();
		System.out.println("Enter marks of 3rd subject within range(0-100)");
		s3=sc.nextInt();
		
		System.out.println("Total marks is "+(s1+s2+s3));
		int percentage=((s1+s2+s3)/3);
		System.out.println("Percentage is "+percentage);
		if(percentage>=70 && percentage <=100)
		{
			grade='A';
			
		}
		else if(percentage>=50 && percentage<70)
		{
			grade='B';
		
		}
		else if(percentage>=35 && percentage<50)
		{
			grade='C';
			
		}
		else if(percentage>=0 && percentage<35)
		{
			grade='D';
			
		}
		else
			grade='z';
		System.out.println("Grade " +grade);
		switch(grade)
		{
		case 'A' :
			System.out.println("First Class");
			break;
		case 'B' :
			System.out.println("Second Class");
			break;
		case 'C' :
			System.out.println("Third Class");
			break;
		case 'D' :
			System.out.println("Fail");
			break;
		default :
			System.out.println("Invalid Grade (Due to wrong entering of marks)");
		}
		sc.close();
	}

}
