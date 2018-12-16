<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,com.stu.bean.Admin" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css" />
<meta charset="utf-8">
<title>删除学生信息|学生信息管理系统</title>
<script>
function check(form)
{
	if(form.id.value=="")
	{
		alert("学号不能为空！");
		form.id.focus();
		return false;
	}
}
</script>
</head>
<body onLoad="form1.id.focus()">

<div id="d3">
<% Admin ius=(Admin)session.getAttribute("ius"); %>
<table style="height:100%;width:100%">
<tr><td id="z3">学生信息管理系统</td>
<td id="z4">当前登陆账号：<%= ius.getName()%></td>
<td id="t1"><a href="login.jsp">退出登录</a></td></tr>
</table>
</div>

<div id="d4">
<div id="d1">
<form action="addStu.jsp">
<table id="t3">
<tr align="center"><td><input id="a2" type="submit" value="添加学生信息"></td></tr>
</table>
</form>

<form action="deleteStu.jsp">
<table id="t3">
<tr><td>&nbsp;</td></tr>
<tr align="center"><td>
<input style="box-shadow:0 0 1.5px 1.5px rgba(255,255,255,0.5);color:rgba(128,0,160,0.8);" id="a2" type="submit" value="删除学生信息">
</td></tr>
</table>
</form>

<form action="updateStu.jsp">
<table id="t3">
<tr><td>&nbsp;</td></tr>
<tr align="center"><td><input id="a2" type="submit" value="修改学生信息"></td></tr>
</table>
</form>

<form action="select.jsp">
<table id="t3">
<tr><td>&nbsp;</td></tr>
<tr align="center"><td><input id="a2" type="submit" value="学生信息查询"></td></tr>
</table>
</form>
</div>

<div id="d2"></div>

<div style="height:50px;"></div>

<form action="delete.do" method="post" name="form1" id="f2" autocomplete="off">
<table id="t3">
<tr><td id="z1">请输入要删除学生的学号：</td><td align="left"><input name="id" type="text" size="10"></td></tr>
</table>

<div style="height:50px;"></div>

<table id="t3">
<tr><td>
<input id="a3" type="submit" value="删除" onClick="return check(form1)">
</td></tr>
</table>
</form>
</div>

</body>
</html>