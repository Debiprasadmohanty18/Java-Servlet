package com.tanmay.ServletMultipleParameter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultipleParameter extends HttpServlet{
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
 		String userName = request.getParameter("userName");
 		String fullName = request.getParameter("fullName");
		out.println("Your User Name is :- "+ "<b>" + userName + "</b>" + "<br>");
		out.println("Your Full Name is :- "+ "<b>" + fullName + "</b>" + "<br>");
		String prof = request.getParameter("prof");
		out.println("Profession :- "+"<b>" + prof + "</b>" + "<br>");
		
		String[] locations = request.getParameterValues("locations");
		out.println("Preferred Locations :- " + "<b>" + Arrays.toString(locations) + "</b>" + "<br>");
	}
}
