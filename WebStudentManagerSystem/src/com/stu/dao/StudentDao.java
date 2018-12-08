package com.stu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stu.bean.Student;
import com.stu.db.CloseResource;
import com.stu.db.ConnectionFactory;

public class StudentDao {
   public void addStudent(Student stu){
	  Connection conn = ConnectionFactory.getConnection();
	  PreparedStatement ps=null;
	  String sql="insert into tbl_stu values(?,?,?,?)";
        try {
	    ps= conn.prepareStatement(sql);
		 ps.setString(1,stu.getId());
		 ps.setString(2,stu.getName());
		 ps.setString(3,stu.getSex());
		 ps.setString(4,stu.getCls());
		 ps.execute();
        } catch (SQLException e) {
			e.printStackTrace();
		}finally{
			CloseResource.close(null, ps, conn);
		}
   }
   
   public void deleteStudent(String id){
	   Connection conn = ConnectionFactory.getConnection();
		  PreparedStatement ps=null;
		  String sql="delete tbl_stu where id=?";
	        try {
		    ps= conn.prepareStatement(sql);
			 ps.setString(1,id);
	
			 ps.execute();
	        } catch (SQLException e) {
				e.printStackTrace();
			}finally{
				CloseResource.close(null, ps, conn);
			}
   }
   
    public void updateStudent(String id,Student newStu){
    	 Connection conn = ConnectionFactory.getConnection();
   	  PreparedStatement ps=null;
   	  String sql="update tbl_stu set name=?,sex=?,classes=? where id=?";
           try {
   	    ps= conn.prepareStatement(sql);
   		 ps.setString(1,newStu.getName());
   		 ps.setString(2,newStu.getSex());
   		 ps.setString(3,newStu.getCls());
   		 ps.setString(4,id);
   		 ps.execute();
           } catch (SQLException e) {
   			e.printStackTrace();
   		}finally{
   			CloseResource.close(null, ps, conn);
   		}
    }
    
     public Student selectStuById(String id){
    	 Student stu=null;
    	 Connection conn = ConnectionFactory.getConnection();
         PreparedStatement ps=null;
         ResultSet rs=null;
         String sql="select * from tbl_stu where id=?";
         try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,id);
		 	rs=ps.executeQuery();
		 	if(rs.next()){
		 		String id2=rs.getString("id");
		 		String name=rs.getString("name");
		 		String sex=rs.getString("sex");
		 		String classes=rs.getString("classes");
		 		stu=new Student(id2, name, sex, classes);
		 	}
		 	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			CloseResource.close(rs, ps, conn);
		}
           return stu;
     }
}





