package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
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
			
	        String ch=request.getParameter("choice");
			
			switch(ch)
			{
			
			case "1":
			{
				try 
				{
					
					st=con.createStatement();
					ResultSet result=st.executeQuery("select * from page");
					
					while(result.next())
					{
						out.print(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+""+"<a href='./delete.html'>update</a>"+"<br/>");
						System.out.println();
					}
					
				
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
				case "3":
				{
					try 
					{
						PreparedStatement st1=con.prepareStatement("delete from page where username=?");
						st1.setString(1, un);
						int k=st1.executeUpdate();
						if(k>0)
							System.out.println(un+" removed from database");
					} 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println();
					System.out.println();
					System.out.println("Thanks for using !!!");
					
					break;
				}
			
				case "2":
				{
					try 
					{
						
						st=con.createStatement();
						ResultSet result=st.executeQuery("select * from page");
						
						while(result.next())
						{
							out.print(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+"<br/>");
							System.out.println();
						}
					
					} 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println();
					System.out.println();
					System.out.println("Thanks for using !!!");
					
					break;
				}
			}
	        			
			try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
