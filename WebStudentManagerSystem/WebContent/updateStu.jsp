<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css" />
<meta charset="utf-8">
<title>修改学生信息|学生信息管理系统</title>
<script>
function check(form)
{
	if(form.id.value=="")
	{
		alert("学号不能为空！");
		form.id.focus();
		return false;
	}
	else if(form.name.value=="")
	{
		alert("姓名不能为空！");
		form.name.focus();
		return false;
	}
	else if(form.sex.value=="")
	{
		alert("性别不能为空！");
		form.sex.focus();
		return false;
	}
	else if(form.classes.value=="")
	{
		alert("班级不能为空！");
		form.classes.focus();
		return false;
	}
}
</script>
</head>
<body onLoad="form1.id.focus()">

<div id="d3">
<table style="height:100%;width:100%">
<tr><td id="z3">学生信息管理系统</td>
<td></td>
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
<tr align="center"><td><input id="a2" type="submit" value="删除学生信息"></td></tr>
</table>
</form>

<form action="updateStu.jsp">
<table id="t3">
<tr><td>&nbsp;</td></tr>
<tr align="center"><td>
<input style="box-shadow:0 0 1.5px 1.5px rgba(255,255,255,0.5);color:rgba(128,0,160,0.8);" id="a2" type="submit" value="修改学生信息">
</td></tr>
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

<div style="height:5px;"></div>

<form action="update.do" method="post" name="form1" id="f3" autocomplete="off">

<table id="t3">
<tr>
<td id="z1">请输入学号：</td>
<td><input name="id" type="text" size="10"></td>
</tr>
<tr><td height="3"></td></tr>
<tr><td id="z1">输入新信息：</td><td></td></tr>
</table>


<table id="t3">
<tr>
<td id="z1">姓　名：</td>
<td><input name="name" type="text" size="15"></td>
</tr>

<tr>
<td id="z1">性　别：</td>
<td id="z1"><input name="sex" type="radio" value="male">男&nbsp;&nbsp;
<input name="sex" type="radio" value="female">女</td>
</tr>

<tr>
<td id="z1">班　级：</td>
<td><input name="classes" type="text" size="15"></td>
</tr>
</table>

<div style="height:30px;"></div>

<table id="t3">
<tr><td>
<input id="a3" type="submit" value="确定" onClick="return check(form1)">　　
<input id="a3" type="reset" value="重置">
</td></tr>
</table>
</form>
</div>
</body>
</html>