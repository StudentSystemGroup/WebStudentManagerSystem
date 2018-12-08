package com.stu.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CloseResource {
  public static void close(ResultSet rs,PreparedStatement ps,Connection conn){
	  try {
		if(rs!=null) rs.close();
		  if(ps!=null) ps.close();
		  if(conn!=null) conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }
}


