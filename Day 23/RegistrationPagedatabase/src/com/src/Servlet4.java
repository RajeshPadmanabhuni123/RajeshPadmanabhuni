package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet4
 */
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
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
			
			session.setAttribute("user", un);

			
			
	        out.print("<form action=\"./servlet2\" method=\"post\">\r\n" + 
					"<pre>1. update\r\n" + 
					"2. display\r\n" + 
					"3.delete </pre>\r\n" + 
					"Enter your choice : <input type=\"text\" name=\"choice\"/><br/>\r\n" + 
					"<input type=\"submit\" value=\"submit\"><br/>\r\n" + 
					"</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
