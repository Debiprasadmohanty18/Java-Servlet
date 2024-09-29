package com.tanmay.HttpSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
//    		If we use RequestDispatcher here then It will run perfectly & show the output in other-Servlet.
//    		RequestDispatcher rd = request.getRequestDispatcher("MappedSession");
//    		rd.forward(request, response);
    		
//    		If we use "sendRedirect" here then It will run perfectly, but it will print the default value as output in other-Servlet i.e :- null
//    		                     because, when it reload in other-servlet that-servlet takes it as new request,so that-servlet will not be able to get the value we had given.
//    		 for that we need to use HttpSession to continue the same session.
    		String name = request.getParameter("name");
    		
    		// Here we send the value and we need to accept this value in other-servlet.
    		HttpSession session = request.getSession();
    		session.setAttribute("name", name);
    		
    		response.sendRedirect("MappedSession");
    	}

}
