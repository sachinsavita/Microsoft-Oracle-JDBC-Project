package com.generic.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ContextServlet extends GenericServlet {
	
	
	/*
	 * <init-param> is local for the servlet <context-param> is global for any
	 * servlet
	 */
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = res.getWriter();
		ServletConfig sc = getServletConfig();
		String name = sc.getInitParameter("myName");
		//this name will show null here bcs we used here <init-param> which is local for a servlet
		out.print("Welcome "+name);
		
		//here we are fetching <context-param> paramaters which are available throughout the application
		ServletContext context = sc.getServletContext();
		String appName = context.getInitParameter("appName");
		out.print(" to the "+appName+" application.");
		
		
		System.out.println("Hello");
		//close the connection
		out.close();

	}

}
