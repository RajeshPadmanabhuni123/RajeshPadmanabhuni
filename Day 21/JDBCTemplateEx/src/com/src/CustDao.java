package com.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustDao {

	static Scanner sc=new Scanner(System.in);
	JdbcTemplate jdbctemp;

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int append(Customer c)
	{
		
		String qu="insert into customer values("+c.getCustid()+",'"+c.getCustname()+"',"+c.getCustmob()+",'"+c.getCustdob()+"')";
	
		return jdbctemp.update(qu);
	}
	public int delete(Customer c)
	{
		System.out.println("Enter customer id : ");
		int id=sc.nextInt();
		String qu="delete from customer where id="+id+"";
	
		return jdbctemp.update(qu);
	}
	public int update(Customer c)
	{
		System.out.println("Enter customer id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter customer Name : ");
		String name=sc.next();
		String qu="update customer set name="+name+" where id="+id+"";
		return jdbctemp.update(qu);
	}
	public void display(Customer c)
	{
		//System.out.println("Enter customer id : ");
		//int id=sc.nextInt();
		//String qu="select * from customer where id="+id+"";
		String qu="select * from customer";
		List<Customer> cust=jdbctemp.query(qu, new RowMapper<Customer>(){
			
			public Customer mapRow(ResultSet res,int rowNum) throws SQLException {
				Customer c1=new Customer();
				c1.setCustid(res.getInt("id"));
				c1.setCustname(res.getString("name"));
				c1.setCustmob(res.getLong("mobileno"));
				c1.setCustdob(res.getString("dob"));
				
				return c1;
			}
		});
		for(Customer c2: cust) {
			System.out.println(c2);
		}
	}
	
}
