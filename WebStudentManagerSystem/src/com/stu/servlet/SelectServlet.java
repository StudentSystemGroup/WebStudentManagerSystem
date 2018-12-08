package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.stu.bean.Student;
import com.stu.service.StudentService;

@WebServlet("/select.do")
public class SelectServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException
	{
		String id=request.getParameter("id");
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		StudentService u=new StudentService();
		Student s=u.selectStuById(id);
		if(s==null)
		{
			out.println("<script language='javascript'>alert('该学生不存在！');location.href='select.jsp';</script>");
		}
		else
		{
			request.getSession().setAttribute("s",s);
			out.println("<script language='javascript'>location.href='selectResult.jsp';</script>");
		}
	}
}
