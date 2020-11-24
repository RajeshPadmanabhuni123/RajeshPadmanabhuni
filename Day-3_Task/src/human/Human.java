package human;
import java.util.Scanner;
public class Human {

	String name;
	String gender;
	public Human(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public void find(Man m,Woman w)
	{
		if(m.age>w.age)
		{
			System.out.println("Man is younger");
		}
		else
		{
			System.out.println("Woman is younger");

		}
	}
}



