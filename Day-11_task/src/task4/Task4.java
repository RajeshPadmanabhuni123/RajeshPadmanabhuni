/**
 * @Interface
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */


package task4;

public interface Task4 {

	public void compare(String s[]);//unimplemented method
	
	static void method(String s[],int a)//static-service method
	{
		if(a==1)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i].contains("e") || s[i].contains("E"))
					System.out.print(s[i]+", ");
			}
		}
		else
		{

			for(int i=0;i<s.length;i++)
			{
				if(!s[i].contains("e") && !s[i].contains("E"))
					System.out.print(s[i]+", ");
			}
		}
	}
}
