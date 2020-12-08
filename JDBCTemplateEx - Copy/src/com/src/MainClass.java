package com.src;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer c=(Customer) con.getBean("cust");
		
		CustDao cd=(CustDao) con.getBean("custdao");
		
		
		System.out.println("1. append");
		System.out.println("2. display");
		System.out.println("3. delete");
		System.out.println("4. update");

		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				int r=cd.append(c);
				if(r>0)
					System.out.println("Appending done Sucessfully");
				else
					System.out.println("Appending is not done");
				break;
			}
			case 2:
			{
				cd.display(c);
				break;
			}
			case 3:
			{
				int r=cd.delete(c);
				if(r>0)
					System.out.println("Deletion done Sucessfully");
				else
					System.out.println("Deletion is not done");
				break;
			}
			case 4:
			{
				int r=cd.update(c);
				if(r>0)
					System.out.println("Updation done Sucessfully");
				else
					System.out.println("Updation is not done");
				break;
			}
			default:
				System.out.println("Invalid");
				break;
		}

	}

}
