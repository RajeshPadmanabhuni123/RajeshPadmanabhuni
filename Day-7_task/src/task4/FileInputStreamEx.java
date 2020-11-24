package task4;
import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try 
		{
			fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace2\\Day-7\\src\\file\\FileInputStreamEx.java");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
