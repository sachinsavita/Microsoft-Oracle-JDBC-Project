package com.http.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.oracleDB.connection.JavaDBConnection;

import oracle.jdbc.internal.OraclePreparedStatement;
import oracle.jdbc.internal.OracleResultSet;

@WebServlet("/ValidateLogin")     //Always pay attention here and on console also
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   //Auto-generated constructor stub
    public ValidateLogin() {
       
    }
    	
	  //Auto-generated method stub doPost method
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String user_id = req.getParameter("user_id");
		String password = req.getParameter("password");
		
		Connection conn = null;
		try {
			conn = JavaDBConnection.connectDB();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Connected bro!");
		
		String checkUP = "select * from employee where emp_id='"+user_id+"' and password='"+password+"'";
		System.out.println("Read query");
		
		
		//#############  Oracle DB configuration    #####################
		/*
		 * 
		 * try 
		 * { 
		 * OraclePreparedStatement stmt = (OraclePreparedStatement)conn.prepareStatement(checkUP); 
		 * OracleResultSet rs = (OracleResultSet) stmt.executeQuery(); 
		 * if(rs.next()) 
		 * { 
		 * RequestDispatcher rd = req.getRequestDispatcher("page2.jsp"); 
		 * rd.forward(req, res); 
		 * } 
		 * else {
		 * out.println("Invalid Login, please try again with the correct input!");
		 *  } 
		 *  }
		 * catch (SQLException e) 
		 * {
		 * 
		 * e.printStackTrace();
		 *  }
		 */
		
		
		
		
		
		//#############  Microsoft DB configuration    #####################
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs  = stmt.executeQuery(checkUP);
			
			if(rs.next()) 
				  { 
				  RequestDispatcher rd = req.getRequestDispatcher("page2.jsp"); 
				  rd.forward(req, res); 
				  } 
			else {
				  out.println("Invalid Login, please try again with the correct input!");
				 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
	}

}
