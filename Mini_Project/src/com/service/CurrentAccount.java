package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.Account;

public class CurrentAccount extends Account{

	ArrayList<String> transactions=new ArrayList<String>();
	long amount;
	public CurrentAccount(String name, int custid, String emailid, long mobileno, String address, long accno) {
		super(name,custid,emailid,mobileno,address,accno);
	}
	
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if((this.amount-amount)<10000)
		{
			if((this.amount-amount)<0)
			{
				System.out.println("Your account balance is less");
				checkAccountBalance();
			}
			else
			{
				this.amount=this.amount-amount;
				this.transactions.add("Withdrawl of "+amount);
				System.out.println("Take ur money....!!");
				System.out.println("Your account balance is less than Minimum balance");
				checkAccountBalance();
			}
		}
		else
		{
			this.amount=this.amount-amount;
			this.transactions.add("Withdrawl of "+amount);
			System.out.println("Take ur money....!!");
			checkAccountBalance();
		}
	}
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(toString());
		System.out.println("Confirm your details once...(Y or N)");
		char c=sc.next().charAt(0);
		if(c=='Y')
		{
			this.amount=this.amount+amount;
			this.transactions.add("Deposit of "+amount);
			System.out.println(amount+" deposited successfully..");	
		}
		else
		{
			System.out.println("Transaction Cancelled.. ");
		}	
	}
	@Override
	public void checkAccountBalance() {
		System.out.println("Your Account balance is "+this.amount);
		
	}
	@Override
	public void Previous_5_Transactions() {
		// TODO Auto-generated method stub
		int len=this.transactions.size();
		if(len>5)
		{
			for(int i=len-5;i<len;i++)
			{
				System.out.println(this.transactions.get(i));
			}
		}
		else
		{
			for(int i=0;i<len;i++)
			{
				System.out.println(this.transactions.get(i));
			}
		}
	}
}
