package com.http.servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TestServlet")

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   //Auto-generated constructor stub
    public TestServlet() {
       
    }
    
    
//    Important Note: The priority of all three methods as as     service > doGet > doPost

    //Auto-generated method stub service method
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter out = res.getWriter();
		out.print("You are in service method!");
	}

	  //Auto-generated method stub doGet method
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.print("You are in doGet method!");
	}

	  //Auto-generated method stub doPost method
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter out = res.getWriter();
		out.print("You are in doPost method!");
	}

}
