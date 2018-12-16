package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.bean.Admin;
import com.stu.service.AdminService;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		Admin ius=new Admin(name,pass);
		AdminService u=new AdminService();
		int i=u.login(ius);
		if(i==1)
		{
			request.getSession().setAttribute("ius",ius);
			out.println("<script>location.href='addStu.jsp';</script>");
		}
		else if(i==2)
		{
			out.println("<script>alert('�������');location.href='login.jsp';</script>");
		}
		else if(i==3)
		{
			out.println("<script>alert('�û��������ڣ�');location.href='login.jsp';</script>");
		}
	}
}
	