package com.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.model.Account;
import com.service.AccountBalance;
import com.service.AccountCreation;
import com.service.CurrentAccount;
import com.service.DepositClass;
import com.service.DisplayProfile;
import com.service.SalaryAccount;
import com.service.SavingsAccount;
import com.service.TransactionsRecord;
import com.service.UpdateDetails;
import com.service.WithdrawlClass;

import database.Connections;

public class AccountHolder {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ArrayList Customer = new ArrayList();
		Scanner sc=new Scanner(System.in);
		int flag=0;
		try {
			Connections.connecting();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do
		{
			System.out.println("Please Enter your Choice..");
			System.out.println("1. Account Creation");
			System.out.println("2. Withdrawl");
			System.out.println("3. Deposit");
			System.out.println("4. Account Balance");
			System.out.println("5. Last 5 transactions");
			System.out.println("6. View profile");
			System.out.println("7. Edit profile");
			System.out.println("8. Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					Customer=AccountCreation.AccountCreate(Customer);
					break;
				}
				case 2:
				{
					Customer=WithdrawlClass.withdrawl(Customer);
					break;
				}
				case 3:
				{
					Customer=DepositClass.deposit(Customer);
					break;
				}
				case 4:
				{
					AccountBalance.checkBalance(Customer);
					break;
				}
				case 5:
				{
					TransactionsRecord.last_5_Transactions(Customer);
					break;
				}
				case 6:
				{
					DisplayProfile.viewProfile(Customer);					
					break;
				}
				case 7:
				{
					Customer=UpdateDetails.Update(Customer);
					break;
				}
				case 8:
				{
					flag=1;
					break;
				}
				default:
					System.out.println("Invalid Input");
			}
			
			Thread.sleep(400);
		}while(flag==0);
	}
	public static int search(ArrayList Customer,long accno)
	{
		int len=Customer.size();
		if(len<=0)
		{
			return -1;
		}
		for(int i=0;i<len;i++)
		{
			Account a=(Account)Customer.get(i);
			if(accno==a.getAccno())
			{
				return i;
			}
		}
		return -2;
	}
	
}
