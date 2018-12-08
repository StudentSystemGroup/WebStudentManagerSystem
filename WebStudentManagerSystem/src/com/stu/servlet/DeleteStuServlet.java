package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.service.StudentService;

@WebServlet("/delete.do")

public class DeleteStuServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException
	{
		String id=request.getParameter("id");
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		StudentService u=new StudentService();
		int i=u.deleteStu(id);
		if(i==1)
		{
			out.println("<script language='javascript'>alert('删除成功！');location.href='deleteStu.jsp';</script>");
		}
		else if(i==2)
		{
			out.println("<script language='javascript'>alert('该学生不存在！');location.href='deleteStu.jsp';</script>");
		}
	}
}
