import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the String");
		String str=sc.next();
		byte b[]=str.getBytes();
		try
		{
			ByteArrayInputStream bis =new ByteArrayInputStream(b);
			FileOutputStream fos1= new FileOutputStream("file1.txt");
			FileOutputStream fos2= new FileOutputStream("file2.txt");
			int i;
			while((i=bis.read())!=-1)
			{
				fos1.write(i);
				fos2.write(i);
			}
			fos1.close();
			fos2.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
