package com.stu.service;

import com.stu.bean.Admin;
import com.stu.dao.AdminDao;

public class AdminService {
    public int login(Admin min){
    	 int i=0;
    	 AdminDao dao=new AdminDao();
    	 Admin admin = dao.selectAdminById(min.getName());
		  if(admin!=null){
			  if(admin.getPasswd().equals(min.getPasswd())){
				  i=1;
			  }else{
				  i=2;
			  }
		  }else{
			  i=3;
		  }
    	 return i;
    }
}
