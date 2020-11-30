package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.model.Account;

import database.Connections;

public class AccountCreation {
	static Scanner sc=new Scanner(System.in);
	public static ArrayList AccountCreate(ArrayList Customer) throws ClassNotFoundException
	{
		System.out.println("Enter bank Name");
		String bname=sc.next();
		System.out.println("Select the type of Account ");
		System.out.println("1. Current account");
		System.out.println("2. Savings account");
		System.out.println("3. Salary account");
		int choice=sc.nextInt();//entering choice 
		
		
		//Entering details....
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter customer-id");
		int custid=sc.nextInt();
		System.out.println("Enter Account number");					
		long accno=ValidatingAccountNumber.validate(Customer, sc.nextLong());
		System.out.println("Enter email-id");
		String emailid=sc.next();
		System.out.println("Enter address");
		String add=sc.next();
		System.out.println("Enter mobile number");
		long mob=sc.nextLong();
		switch(choice)
		{
			case 1:
			{
				Account c=new CurrentAccount(name,custid,emailid,mob,add,accno);
				Customer.add(c);
				c.bankName=bname;
				c.type="CurrentAccount";
				try {
					Connections.insertElements(c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 2:
			{
				Account c=new SavingsAccount(name,custid,emailid,mob,add,accno);
				Customer.add(c);
				c.bankName=bname;
				c.type="SavingsAccount";
				try {
					Connections.insertElements(c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 3:
			{
				Account c=new SalaryAccount(name,custid,emailid,mob,add,accno);
				Customer.add(c);
				c.bankName=bname;
				c.type="SalaryAccount";
				try {
					Connections.insertElements(c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			default:
				System.out.println("Invalid input");
				break;
		}
		return Customer;
	}

}
