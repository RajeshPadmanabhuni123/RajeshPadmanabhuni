package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/hero"; //local-host & db-name
		System.out.println("Enter username");
		String user=sc.next(); //password
		System.out.println("Enter password");
		String password=sc.next(); //username
		Connection con=null;
		
		try
		{
			con=DriverManager.getConnection(url,user,password);
			Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver class
			DatabaseMetaData dbmd=con.getMetaData();
			
			String table[]= {"TABLE"};
			
			ResultSet rs1=dbmd.getTables(null, null, "customer", table);
			if(rs1.next())
			{
				
			}
			else
			{
				System.out.println("table not exist");
				System.exit(0);
			}
			
			Statement st=con.createStatement(); //creating statement
			int flag=0;
			while(flag==0)
			{
				System.out.println("Welcome to student management system :");
				System.out.println("choose from following options :");
				System.out.println("1. Add student");
				System.out.println("2. Remove student");
				System.out.println("3. update student");
				System.out.println("4. display students");
				System.out.println("5. logout");
				
				
				
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						System.out.println("Enter id");
						int id=sc.nextInt();
						System.out.println("Enter name");
						String name=sc.next();
						System.out.println("Enter address");
						String address=sc.next();
						st.executeUpdate("insert into customer values("+id+",'"+name+"','"+address+"')"); //Resultset generation
						
						/*while(rs.next()) //printing values in result set
						{
							System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
						}*/
						break;
					}
					case 3:
					{
						System.out.println("Enter name");
						String name=sc.next();
						System.out.println("Enter id");
						int id=sc.nextInt();
						st.executeUpdate("update customer set customername='"+name+"' where customerid="+id+""); //Resultset generation
						
						/*while(rs.next()) //printing values in result set
						{
							System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
						}*/
						break;
					}
				
					case 2:
					{
						System.out.println("Enter id");
						int id=sc.nextInt();
						st.executeUpdate("delete from customer where customerid="+id+""); //Resultset generation
						
						/*while(rs.next()) //printing values in result set
						{
							System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
						}*/
						break;
					}
					case 4:
					{
						ResultSet ts=st.executeQuery("select * from customer"); //Resultset generation
						
						while(ts.next()) //printing values in result set
						{
							System.out.println(ts.getInt(1)+" | "+ts.getString(2)+" | "+ts.getString(3));
						}
						break;
					}
					case 5:
					{
						flag=1;
						break;
					}
					default:
						System.out.println("*** invalid input ***");
						break;
				}
			}
			
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception found");
		}
		finally 
		{
			try 
			{
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			}
		}
		System.out.println("Thanks for using.... !!");
		
	}

}
