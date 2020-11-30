package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.main.AccountHolder;

public class ValidatingAccountNumber {

	
	public static long validate(ArrayList Customer, long accno)
	{
		Scanner sc=new Scanner(System.in);
		int b=0;
		while(b>=0)//validation of duplicate account number
		{
			b=AccountHolder.search(Customer,accno);
			if(b>=0)
			{
				System.out.println("Account number already exists");
				System.out.println("Enter new Account number");
				accno=sc.nextLong();
			}
		}
		return accno;
	}
}
