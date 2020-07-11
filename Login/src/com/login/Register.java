package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;
import com.login.dao.RegisterDao;

@WebServlet("/registration")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
	      RegisterDao dao=new RegisterDao();
		PrintWriter out=response.getWriter();
		int status=dao.check(username, password);  
		if(status>0)  
		out.print("You are successfully registered");  
		else
			response.sendRedirect("login.jsp");
	}

}
