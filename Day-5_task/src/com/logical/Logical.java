package com.logical;

public class Logical {

	public void greaterThan(int a,int b)
	{
		if(a>b)
			System.out.println(a+" is greater than "+b);
		else
			System.out.println(a+" is not greater than "+b);
	}
	public void lessThan(int a,int b)
	{
		if(a<b)
			System.out.println(a+" is less than "+b);
		else
			System.out.println(a+" is not less than "+a);
	}
	public void greaterThanEqual(int a,int b)
	{
		if(a>=b)
			System.out.println(a+" is greater than or equal to "+b);
		else
			System.out.println(a+" is not greater than or equal to "+b);
	}
	public void lessThanEqual(int a,int b)
	{
		if(a<=b)
			System.out.println(a+" is less than or equal "+b);
		else
			System.out.println(a+" is not less than or equal "+a);
	}
	public void notEqual(int a,int b)
	{
		if(a!=b)
		System.out.println(a+" is not equal to "+b);
		else
			System.out.println(a+" is equal to "+b);
	}	
}
