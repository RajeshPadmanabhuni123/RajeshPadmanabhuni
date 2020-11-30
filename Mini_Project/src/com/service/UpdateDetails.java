package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.main.AccountHolder;
import com.model.Account;

import database.Connections;

public class UpdateDetails {
	static Scanner sc=new Scanner(System.in);
	  
	public static ArrayList Update(ArrayList Customer) throws SQLException {
		
		System.out.println("Please Enter your Choice..");
		System.out.println("1. Edit Customer Name");
		System.out.println("2. Edit Customer id");
		System.out.println("3. Edit Customer email id");
		System.out.println("4. Edit Customer mobile number");
		System.out.println("5. Edit Customer address");
		System.out.println("6. Edit Customer Account number");
		int ch2=sc.nextInt();
		
		switch(ch2)
		{
			case 1:
			{
				System.out.println("Enter account number");
				long accnum=sc.nextLong();
				int a=AccountHolder.search(Customer,accnum);
				if(a>=0)
				{
					Customer=UpdateDetails.UpdateName(Customer, a);
					
				}
				else if(a==-1)
				{
					System.out.println("No customers");
				}
				else
				{
					System.out.println("Customer not Found");
				}
				
				break;
			}
			case 2:
			{
				System.out.println("Enter account number");
				long accnum=sc.nextLong();
				int a=AccountHolder.search(Customer,accnum);
				if(a>=0)
				{
					Customer=UpdateDetails.UpdateCustomerID(Customer, a);
				}
				else if(a==-1)
				{
					System.out.println("No customers");
				}
				else
				{
					System.out.println("Customer not Found");
				}
				
				break;
			}
			case 3:
			{
				System.out.println("Enter account number");
				long accnum=sc.nextLong();
				int a=AccountHolder.search(Customer,accnum);
				if(a>=0)
				{
					Customer=UpdateDetails.UpdateEmailID(Customer, a);
				}
				else if(a==-1)
				{
					System.out.println("No customers");
				}
				else
				{
					System.out.println("Customer not Found");
				}
				
				break;
			}
			case 4:
			{
				System.out.println("Enter account number");
				long accnum=sc.nextLong();
				int a=AccountHolder.search(Customer,accnum);
				if(a>=0)
				{
					Customer=UpdateDetails.UpdateMobileNumber(Customer, a);
				}
				else if(a==-1)
				{
					System.out.println("No customers");
				}
				else
				{
					System.out.println("Customer not Found");
				}
				
				break;
			}
			case 5:
			{
				System.out.println("Enter account number");
				long accnum=sc.nextLong();
				int a=AccountHolder.search(Customer,accnum);
				if(a>=0)
				{
					Customer=UpdateDetails.UpdateAddress(Customer, a);
				}
				else if(a==-1)
				{
					System.out.println("No customers");
				}
				else
				{
					System.out.println("Customer not Found");
				}
				
				break;
			}
			case 6:
			{
				System.out.println("Enter account number");
				long accnum=sc.nextLong();
				int a=AccountHolder.search(Customer,accnum);
				if(a>=0)
				{
					Customer=UpdateDetails.UpdateAccountNumber(Customer, a);
				}
				else if(a==-1)
				{
					System.out.println("No customers");
				}
				else
				{
					System.out.println("Customer not Found");
				}
				
				break;
			}
			
		}
			
		return Customer;
	}
	
	public static ArrayList UpdateMobileNumber(ArrayList Customer,int a) throws SQLException {
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		System.out.println("Enter Mobile number");
		long s=sc.nextLong();
		ac.setMobileno(s);
		Connections.updatedatabaseMob(Customer,s,a);
		return Customer1;
	}
	public static ArrayList UpdateAddress(ArrayList Customer,int a) throws SQLException {
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		System.out.println("Enter Address");
		String s=sc.next();
		ac.setAddress(s);
		Connections.updatedatabaseAddress(Customer,s,a);
		return Customer1;
	}
	public static ArrayList UpdateEmailID(ArrayList Customer,int a) throws SQLException {
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		System.out.println("Enter email id");
		String s=sc.next();
		ac.setEmailid(s);
		Connections.updatedatabaseEmail(Customer,s,a);
		return Customer1;
	}
	public static ArrayList UpdateCustomerID(ArrayList Customer,int a) throws SQLException {
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		System.out.println("Enter Customer id");
		int s=sc.nextInt();
		ac.setCustid(s);
		Connections.updatedatabaseCustomerID(Customer,s,a);
		return Customer1;
	}
	public static ArrayList UpdateName(ArrayList Customer,int a) throws SQLException {
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		System.out.println("Enter name");
		String s=sc.next();
		ac.setName(s);
		Connections.updatedatabaseName(Customer,s,a);
		return Customer1;
	}
	public static ArrayList UpdateAccountNumber(ArrayList Customer,int a) throws SQLException {
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		System.out.println("Enter new Account number");
		long s=sc.nextLong();
		int b=0;
		while(b>=0)
		{
			b=AccountHolder.search(Customer,s);
			if(b>=0)
			{
				System.out.println("Account number already exists");
				System.out.println("Enter new Account number");
				s=sc.nextLong();
			}
		}
		 ac.setAccno(s);
		 Connections.updatedatabaseAccno(Customer,s,a);
		 return Customer1;
	}

}
