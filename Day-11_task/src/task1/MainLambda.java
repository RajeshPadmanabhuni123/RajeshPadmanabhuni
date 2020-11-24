/**
 * @FunctionalInterface
 * @author RajeshPadmanabhuni
 * @16-Nov-2020
 * 
 */
package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Rajesh";
		String str2="Rockzz";
		//calculates length
		FunctInterface len=(str3,str4)->{
			System.out.println(str3.length());
			System.out.println(str3.length());
		};
		len.StringMethod(str1, str2);
		//concats string
		len=(str3,str4)->{
			System.out.println(str3.concat(str4));
		};
		len.StringMethod(str1, str2);
		//equals method
		len=(str3,str4)->{
			System.out.println(str3.equals(str4));
		};
		len.StringMethod(str1, str2);
		//file creation
		len=(str3,str4)->{
			FileOutputStream fos=null;
			try {
				fos=new FileOutputStream(str3+".txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String str="Rajesh";
			byte b[]=str.getBytes();
			try {
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		len.StringMethod(str1, str2);
		
	}
}
