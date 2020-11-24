/**
 * @Student class
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */
package task7;

public class Student {

	String name;
	int id;
	int maths;
	int science;
	int social;
	int total;
	double percentage;
	char grade;
	
	public void getName() {
		System.out.println(name);
	}

	public Student() {
		//default constructor
	}
	
	//parameterised constructor
	public Student(String name, int id, int maths, int science, int social) {
		
		this.name = name;
		this.id = id;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.total = tot(maths,science,social);
		this.percentage=per(total);
		this.grade=gr(percentage);
	}
	//method for grading
	public char gr(double per)
	{
		if(per>80 && per<=100)
			return 'A';
		else if(per>60 && per<=80)
			return 'B';
		else if(per>50 && per<=60)
			return 'C';
		else if(per>30 && per<=50)
			return 'D';
		else
			return 'F';
	}
	//method for total
	public static int tot(int m,int s,int so)
	{
		return m+s+so;
	}
	//method for percentage
	public double per(int tot)
	{
		return (tot/3)*100;
	}
}
