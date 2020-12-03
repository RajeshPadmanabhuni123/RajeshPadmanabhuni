package com.src;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Statement st=null;
		String url="jdbc:mysql://localhost:3306/registration";
 		String user="root";
 		String password="root";
 		
        try {
        	con=DriverManager.getConnection(url,user,password);
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        HttpSession session=request.getSession();
		
		String un=(String) session.getAttribute("user");
		String name=request.getParameter("name");
		String username=request.getParameter("uname");
		String mob=request.getParameter("mob");
		String pass=request.getParameter("pwd");
		
		try 
		{
			st=con.createStatement();
			st.executeUpdate("insert into page values('"+name+"','"+username+"','"+mob+"','"+pass+"')");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			PreparedStatement st1=con.prepareStatement("delete from page where username=?");
			st1.setString(1, un);
			st1.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Thanks for using !!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
