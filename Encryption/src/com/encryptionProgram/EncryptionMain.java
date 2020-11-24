package com.encryptionProgram;
/**
 * 
 * @author RajeshPadmanabhuni
 * Encrytion Main Program
 *
 */
import java.util.Scanner;
public class EncryptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryption e=new Encryption();            //object
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your message");
		String s1=sc.nextLine(); //message variable
		String temp="";
		String key;
		s1=s1.toUpperCase();
		for(int i=0;i<s1.length();i++) //removes nonAlphabets in the message
		{
			char c=s1.charAt(i);
			if((c>='A' && c<='Z')||c==' ')
			{
				temp+=c;
			}
		}
		s1=e.encryptionMatrix(temp); //calling for encryption matrix
		boolean b;
		do
		{
			System.out.println("Enter a key word");
			key=sc.nextLine();
			b=e.checkKey(key.toUpperCase());  //calling keyword validation method
		}while(b==false);
		String[] s= new String[key.length()];
		s=e.encryption(s1,key);        //calling encryption matrix
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" "); //printing encrypted final message
		}
	}

}
