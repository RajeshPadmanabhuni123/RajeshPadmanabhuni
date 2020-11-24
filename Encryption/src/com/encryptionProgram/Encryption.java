/**
 * 
 * @author RajeshPadmanabhuni
 * Encrytion Business logic Program
 *
 */
package com.encryptionProgram;

public class Encryption {

	public String encryptionMatrix(String s)  //Encryption matrix
	{
		String dup="";
		for(int i=0;i<s.length();i++)
		{
			char t=s.charAt(i);
			if(t!=' ')
			{
				if(t=='Z')
				{
					dup+="31";
				}
				else
				{
					int x=t-65;
					int a=x%5;
					a+=48;
					int b=x/5;
					b+=48;
					dup+=""+(char)b+""+(char)a;
				}
				
			}
		}
		return dup; //return encrypted matrix
	}
	public boolean checkKey(String str) //validates the key word
	{
		char[] key=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(key[i]<65 || key[i]>90)
				return false;
			
			for(int j=i+1;j<str.length();j++)
			{
				if(key[i]==key[j])
					return false;
			}
		}
		return true;
	}
	public String[] encryption(String s1,String key) //Arraning the code based on keyword
	{
		String[] s= new String[key.length()]; //temporary array 
		for(int i=0;i<s.length;i++)
		{
			s[i]="";                        
			s[i]+=key.charAt(i);              //appends keyword to first character of every string in string array
		}
		for(int i=0;i<s1.length();)
		{
			for(int j=0;j<key.length()&&i<s1.length();j++)
			{
				s[j]+=s1.charAt(i);
				i++;
			}
		}
		s=this.arrangekey(s);
		for(int i=0;i<s.length;i++)
		{
				s[i]=s[i].substring(1);       //removes first character of every string(keyword) in string array	
		}
		return s;//final result
	}
	public String[] arrangekey(String s[]) //sort the keyword based on Alphabetical order
	{
		String temp;
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].charAt(0)>s[j].charAt(0))
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		return s;
	}
	
}
