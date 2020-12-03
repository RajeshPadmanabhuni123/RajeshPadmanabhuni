package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String pass=request.getParameter("pwd");
		String rpassword=request.getParameter("rpwd");
		if(pass.equals(rpassword))
		{
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
			String name=request.getParameter("name");
			String username=request.getParameter("uname");
			String mob=request.getParameter("mob");
			
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
			
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.forward(request, response);
		}
		else
		{
			out.print("Password doesnt matches");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
