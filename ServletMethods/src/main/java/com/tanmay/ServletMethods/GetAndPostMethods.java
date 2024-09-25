package com.tanmay.ServletMethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAndPostMethods extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Check URL!</h1><h3>If you found the method name that you have given input then it is Get Method</h3>");
		out.println("<h1>Yes, It is Get Method.</h1>");
		String userName = request.getParameter("userName");
		out.println("<b>My Name is :- </b>" + userName);
		
	}
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Check URL!</h1><h3>If you didn't find the method name that you have given input then it is Post Method.</h3>");
		out.println("<h1>Yes, It is Post Method.</h1>");
 		String userName = request.getParameter("userName");
		out.println("<b>My Name is :- </b>" + userName);
	}
}
