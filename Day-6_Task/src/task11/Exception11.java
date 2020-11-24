package task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception11 e=new Exception11();
			e.method();
		}
		catch(FileNotFoundException | ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public void method() throws FileNotFoundException, ArrayIndexOutOfBoundsException, ArithmeticException
	{
		File file = new File("e://sample.txt");
		FileReader fr= new FileReader(file);
		int num[]= {1,2,3};
		System.out.println(num[4]);
		System.out.println(9/0);
	}

}
