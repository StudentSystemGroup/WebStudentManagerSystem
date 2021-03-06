package com.stu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stu.bean.Admin;
import com.stu.db.ConnectionFactory;

public class AdminDao {
   
	public Admin selectAdminById(String id){
		  Connection conn = ConnectionFactory.getConnection();
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  Admin ad=null;
		  String sql="select * from tbl_admin where id=?";
		  try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);
			 rs= ps.executeQuery();
			 if(rs.next()){
				 String name=rs.getString("id");
				 String passwd=rs.getString("passwd");
				 ad=new Admin(name,passwd);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ad;
	}
}




