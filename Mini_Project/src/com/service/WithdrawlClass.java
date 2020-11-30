package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.main.AccountHolder;
import com.model.Account;

import database.Connections;

public class WithdrawlClass {
 
	static Scanner sc=new Scanner(System.in);
	public static ArrayList withdrawl(ArrayList Customer) throws SQLException
	{
		System.out.println("Enter account number");
		long accnum=sc.nextLong();
		int a=AccountHolder.search(Customer,accnum);
		if(a>=0)
		{
			Account ac=(Account)Customer.get(a);
			System.out.println("Enter the amount to be withdrawn");
			int wamount=sc.nextInt();
			ac.withdraw(wamount);
			//Connections.updatedatabaseamount(Customer,a);
		}
		else if(a==-1)
		{
			System.out.println("No customers");
		}
		else
		{
			System.out.println("Customer not Found");
		}
		return Customer;
	}
}
