package task3;
import java.io.*;
public class Exercise7 {

	public static boolean fileExists(String filename)
	{
		try
		{
			//File f=new File(filename);
			File f= new File(filename);
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public static boolean isInt(String value)
	{
		try {
			int c=Integer.parseInt(value);
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public static boolean isDouble(String value)
	{
		double c;
		try 
		{
			c=Double.parseDouble(value);
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
}
