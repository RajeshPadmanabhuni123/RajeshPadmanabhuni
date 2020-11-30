package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.main.AccountHolder;
import com.model.Account;

import database.Connections;

public class DepositClass {

	static Scanner sc=new Scanner(System.in);
	public static ArrayList deposit(ArrayList Customer) throws SQLException
	{
		System.out.println("Enter account number");
		long accnum=sc.nextLong();
		int a=AccountHolder.search(Customer,accnum);
		if(a>=0)
		{
			Account ac=(Account)Customer.get(a);
			System.out.println("Enter the amount to be deposited");
			int damount=sc.nextInt();
			ac.deposit(damount);
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
