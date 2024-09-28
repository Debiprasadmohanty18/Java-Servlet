package com.tanmay.CallingOneServletFromAnotherServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
/* If You look to URL, 		
    --->  By Using RequestDispatcher,It will show from where the User started Questioning  
                                 OR
          You will be able to see that the output coming from "FirstServlet" class.(Which is Wrong)*/
		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		rd.forward(request, response);
		
/* If You look to URL,
    --->  By Using sendRedirect,you will be able to see that the output coming from "SecondServlet" class.*/
//		response.sendRedirect("SecondServlet");
		
	}
}
