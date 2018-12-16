<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,com.stu.bean.Admin" %>
<%@ page import="java.util.*,com.stu.bean.Student" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css" />
<meta charset="utf-8">
<title>查询结果|学生信息管理系统</title>
</head>
<body>

<div id="d3">
<% Admin ius=(Admin)session.getAttribute("ius"); %>
<table style="height:100%;width:100%">
<tr><td id="z3">学生信息管理系统</td>
<td id="z4">当前登陆账号：<%= ius.getName()%></td>
<td id="t1"><a href="login.jsp">退出登录</a></td></tr>
</table>
</div>

<div style="height:151px;"></div>

<div id="d6">
<table id="t2">
<% Student s=(Student)session.getAttribute("s"); %>
<tr><td>学　号：&nbsp;</td><td><%= s.getId()%></td></tr>
<tr><td height="0"></td></tr>
<tr><td>姓　名：&nbsp;</td><td><%= s.getName()%></td></tr>
<tr><td height="0"></td></tr>
<% if(s.getSex().equals("male")){ %>
<tr><td>性　别：&nbsp;</td><td>男</td></tr>
<% }else{ %>
<tr><td>性　别：&nbsp;</td><td>女</td></tr>
<% } %>
<tr><td height="0"></td></tr>
<tr><td>班　级：&nbsp;</td><td><%= s.getCls()%></td></tr>
</table>

<div style="height:37.5px;"></div>

<table id="t3">
<tr><td><input id="a3" type="button" value="返回" onClick="location.href='select.jsp';"></td></tr>
</table>
</div>

</body>
</html>