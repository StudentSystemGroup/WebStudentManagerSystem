package com.stu.service;

import com.stu.bean.Student;
import com.stu.dao.StudentDao;

public class StudentService {
    public int addStu(Student s){
    	int i=0;
         StudentDao dao=new StudentDao();
         Student stu = dao.selectStuById(s.getId());
         if(stu!=null){
        	 i=1;
         }else{
        	 dao.addStudent(s);
        	 i=2;
         }
         return i;
    }
    
    public int deleteStu(String id){
    	int i=0;
       StudentDao dao=new StudentDao();
        Student stu = dao.selectStuById(id);
    	if(stu!=null){
    		dao.deleteStudent(id);
    		i=1;
    	}else{
    		i=2;
    	}
    	return i;
    }
    
    public int updateStu(String id,Student newStu){
    	StudentDao dao=new StudentDao();
    	int i=0;
    	Student stu = dao.selectStuById(id);
    	if(stu!=null){
    		dao.updateStudent(id,newStu);
    		i=1;
    	}else{
    		i=2;
    	}
    	return i;
    }
    
     public Student selectStuById(String id){
    	 Student s=null;
    	 StudentDao dao=new StudentDao();
    	 Student stu = dao.selectStuById(id);
         if(stu!=null){
        	 s=stu;
         }
         return s;
     }
}


