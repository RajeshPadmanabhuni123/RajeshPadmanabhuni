package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		out.print("<form action=\"./secondregister\" method=\"get\">\r\n" + 
				"username: "+request.getParameter("uname")+"<input type=\"hidden\" name=\"uname\"value="+request.getParameter("uname")+"/><br/>\r\n" + 
				"password: "+request.getParameter("pwd")+"<input type=\"hidden\" name=\"pwd\"value="+request.getParameter("pwd")+"/><br/>\r\n" + 
				"address: "+request.getParameter("add")+"<input type=\"hidden\"name=\"add\"value="+request.getParameter("add")+"/><br/>\r\n" + 
				"<input type=\"submit\" value=\"confirm\"/>\r\n" + 
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
