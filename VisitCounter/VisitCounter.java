package com.tanmay.VisitCounter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitCounter")
public class VisitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	int i = 0;
	public void init()
	{
		i = 1;
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter  out = response.getWriter();
		out.println("<b>" + i + "</b>");
		i++;
		
	}

}
