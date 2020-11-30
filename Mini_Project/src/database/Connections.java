package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.model.Account;
 

public class Connections 
{
	static Connection con=null;
	static Statement st=null;
	public static void connecting() throws SQLException, ClassNotFoundException
 	{
		String url="jdbc:mysql://localhost:3306/bankapplication";
 		String user="root";
 		String password="root";
 		con=DriverManager.getConnection(url,user,password);
        Class.forName("com.mysql.cj.jdbc.Driver");
        st=con.createStatement();
 	}
	public static void insertElements(Account customer) throws SQLException
	{
		
		int i=st.executeUpdate("insert into salaryaccount values('"+customer.bankName+"','"+customer.getName()+"',"+customer.getCustid()+","+customer.getAccno()+",'"+customer.getEmailid()+"','"+customer.getAddress()+"',"+customer.getMobileno()+",'"+customer.getType()+"')");
        System.out.println(i+" rows Added Successfully");
	}
	/*public static void updatedatabaseamount(ArrayList Customer,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set balance="+ac.amount+" where accountNumber="+ac.getAccno()+"");
		System.out.println(k+" rows updated Successfully");
	}*/
	public static void updatedatabaseMob(ArrayList Customer,long mob,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set mobileno="+mob+" where accountNumber="+ac.getAccno()+"");
		System.out.println(k+" rows updated Successfully");
	}
	public static void updatedatabaseAddress(ArrayList Customer,String addr,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set address='"+addr+"' where accountNumber="+ac.getAccno()+"");
		System.out.println(k+" rows updated Successfully");
	}
	public static void updatedatabaseEmail(ArrayList Customer,String email,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set emailid='"+email+"' where accountNumber="+ac.getAccno()+"");
		System.out.println(k+" rows updated Successfully");
	}
	public static void updatedatabaseCustomerID(ArrayList Customer,int id,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set customerid="+id+" where accountNumber="+ac.getAccno()+"");
		System.out.println(k+" rows updated Successfully");
	}
	public static void updatedatabaseName(ArrayList Customer,String name,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set name='"+name+"' where accountNumber="+ac.getAccno()+"");
		System.out.println(k+" rows updated Successfully");
	}
	public static void updatedatabaseAccno(ArrayList Customer,long accno,int a) throws SQLException
	{
		ArrayList Customer1 = Customer;
		Account ac=(Account)Customer1.get(a);
		int k=st.executeUpdate("update salaryaccount set accountNumber="+accno+" where customerid="+ac.getCustid()+"");
		System.out.println(k+" rows updated Successfully");
	}
	
		          
}