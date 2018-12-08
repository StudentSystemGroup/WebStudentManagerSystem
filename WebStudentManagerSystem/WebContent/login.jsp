<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css" />
<meta charset="utf-8">
<title>登录|学生信息管理系统</title>
<script>
function check(form)
{
	if(form.name.value=="")
	{
		alert("用户名不能为空！");
		form.name.focus();
		return false;
	}
	else if(form.pass.value=="")
	{
		alert("密码不能为空！");
		form.pass.focus();
		return false;
	}
}
</script>
</head>
<body onLoad="form1.name.focus()">
<form action="login.do" method="post" name="form1" autocomplete="off">
<table id="t3">
<tr><td>&nbsp;</td></tr>
<tr align="center"><td><h1 id="z2">&nbsp;学生信息管理系统</h1></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
</table>
<div id="d5">
<table id="t3">
<tr>
<td id="z1" align="right">用户名：</td>
<td>&nbsp;<input name="name" type="text" size="15"></td>
</tr>
<tr>
<td id="z1" align="right">密　码：</td>
<td>&nbsp;<input name="pass" type="password" size="15"></td>
</tr>
</table>

<div style="height:23px;"></div>

<table id="t3">
<tr><td>
<input id="a1" type="submit" value="登&nbsp;&nbsp;&nbsp;录" onClick="return check(form1)">
</td></tr>
</table></div>
</form>
</body>
</html>