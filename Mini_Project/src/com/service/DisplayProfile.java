package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.main.AccountHolder;
import com.model.Account;

public class DisplayProfile {
	static Scanner sc=new Scanner(System.in);
	public static void viewProfile(ArrayList Customer)
	{
		System.out.println("Enter account number");
		long accnum=sc.nextLong();
		int a=AccountHolder.search(Customer,accnum);
		if(a>=0)
		{
			Account ac=(Account)Customer.get(a);
			System.out.println(ac.toString());
		}
		else if(a==-1)
		{
			System.out.println("No customers");
		}
		else
		{
			System.out.println("Customer not Found");
		}
	}
}
