package com.stu.bean;

public class Admin {
   private String name;
   private String passwd;
public Admin(String name, String passwd) {
	this.name = name;
	this.passwd = passwd;
}
public Admin() {
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPasswd() {
	return passwd;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}
   
}
