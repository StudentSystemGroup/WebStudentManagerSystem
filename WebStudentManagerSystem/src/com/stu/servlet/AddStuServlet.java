package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.stu.bean.Student;
import com.stu.service.StudentService;

@WebServlet("/add.do")
public class AddStuServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException
	{
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String classes=request.getParameter("classes");
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		Student s=new Student(id,name,sex,classes);
		StudentService u=new StudentService();
		int i=u.addStu(s);
		if(i==1)
		{
			out.println("<script language='javascript'>alert('该学生已存在！');location.href='addStu.jsp';</script>");
		}
		else if(i==2)
		{
			out.println("<script language='javascript'>alert('添加成功！');location.href='addStu.jsp';</script>");
		}  
	}
}