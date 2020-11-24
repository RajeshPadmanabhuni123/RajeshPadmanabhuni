package task2;
import java.io.*;
public class Exercise4 {
	public static void main(String[] args) 
	{
		int n=10;
		int[] v = new int[n];
		FileReader f=null;
		try
		{
			f= new FileReader("dati.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		BufferedReader in=null;
		try
		{
			in = new BufferedReader(f);
			int i=0;
			String linea = in.readLine();
			while (linea!=null) {
				v[i] = Integer.parseInt(linea);
				linea = in.readLine();
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}