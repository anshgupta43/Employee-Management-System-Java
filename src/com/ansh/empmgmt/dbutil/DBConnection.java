package com.ansh.empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;
	static {
    	 try {
    		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","admin");
  	        System.out.println("Database Connected Sucessfully");
    	 }catch(SQLException ex) {
    		 System.out.println("Error in opening teh connection : " + ex.getMessage());
    		 System.exit(1);
    	 }
     }
	public static Connection getConnection() {
		return conn;
	}
	public static void closeConnection() {
		try {
			conn.close();
			System.out.println("Db closed Sucessfully");
		}catch(SQLException ex) {
			System.out.println("Error in closing the connnection : " + ex.getMessage());
		}
	}
}
