package com.stu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
     private static String url;
     private static String userName;
     private static String passWord;
     
    static{
    	url="jdbc:oracle:thin:@localhost:1521:XE"; 
    	userName="stu";
    	passWord="stu";
     }
    
    public static Connection getConnection(){
    	Connection conn=null;
    	try {
		Class.forName("oracle.jdbc.OracleDriver");
		 conn= DriverManager.getConnection(url,userName,passWord);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	   return conn;
    }
    
}




