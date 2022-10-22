package com.oracleDB.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JavaDBConnection {
	
	public static Connection connectDB() throws ClassNotFoundException, SQLException 
	{
		
		//Connection with oracle database
		
		/*Connection conn = null;
		 * Class.forName("oracle.jdbc.driver.OracleDriver");
		 * 
		 * conn =
		 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system",
		 * "oracle123"); System.out.println("Connected.ji");
		 * return conn;
		 */
		
		
		//Connection with MS SQL databse
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;encrypt=false;databaseName=empl_details;";
		String username = "MicroSystem";
		String pass = "micro@123";
		Connection con  = DriverManager.getConnection(url, username, pass);
		System.out.println("Connected bhai connected");
		
		
		return con;
	}

}
