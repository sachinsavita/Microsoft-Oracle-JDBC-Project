package com.generic.servlets;


import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GenServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = res.getWriter();
		ServletConfig sc = getServletConfig();
		String name = sc.getInitParameter("myName");
		out.print("Welcome "+name);
		
		//here we are fetching <context-param> paramaters which are available throughout the application
		ServletContext context = sc.getServletContext();
		String appName = context.getInitParameter("appName");
		out.print(" to the "+appName+" application.");
		
		
		//close the connection
		out.close();

	}


}
