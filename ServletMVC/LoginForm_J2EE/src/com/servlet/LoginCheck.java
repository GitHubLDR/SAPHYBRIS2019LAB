package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

     
    public LoginCheck()
    {
    	super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname   = request.getParameter("uname");
		String password= request.getParameter("password");
		if(uname.equals("karthik") && password.equals("8985199780"))
		{
			response.sendRedirect("Success.jsp");
		}
		else
		{
			response.sendRedirect("Unsuccess.jsp");
		}
		  
	}

}
