package com.http.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Validate")

public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   //Auto-generated constructor stub
    public Validate() {
       
    }
    	
	  //Auto-generated method stub doPost method
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		out.println("My name is "+name);
		
		
		String[] skills = req.getParameterValues("skill");
		out.println("Skills are: ");
		for(int i=0; i<skills.length;i++)
		{
			out.println(i+1+ ". "+skills[i]);
		}
		
		/*
		 * Total three methods to redirect from servlet to jsp page 
		 * 1.sendRedirect  = just to redirect
		 * 2.include = redirect with data and also it will show
		 * 3.forward = redirect with data but hidden at back
		 */
		
		//below code will redirect to page2 without any data
		//res.sendRedirect("page2.jsp");
		
		//This will redirect to the page 2 with data, it has two method to do that
		RequestDispatcher rd = req.getRequestDispatcher("page2.jsp");
		
		//include this line otherwise rd.include(req, res) will show source code of page2.jsp
		res.setContentType("text/html");
		//Method-1 include   Method-2 forward()
		rd.include(req, res);
		//rd.forward(req, res);
		
		
		
	}

}
