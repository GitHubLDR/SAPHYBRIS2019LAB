package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/MyController")
public class MyController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp"); 
		User myuser = new User();
		String uid      = request.getParameter("uid");
		String uname    = request.getParameter("name");
		String uemail   = request.getParameter("email");
		String uaddress = request.getParameter("address");
		if(uname==null)
		{
			uname="karthik"; uemail="manickyamkarthik@gmail.com";
			uid="100"; uaddress="Chittoor";
		}
		
		myuser.setName(uname);
		myuser.setEmail(uemail);
		myuser.setUid(Integer.parseInt(uid));
		myuser.setAddress(uaddress);
		  
		request.setAttribute("myuser",myuser);
		rd.forward(request,response);
		
		
					
		}
	}

