package com.stu.bean;

public class Student {
   private String id;
   private String name;
   private String sex;
   private String cls;
public Student(String id, String name, String sex, String cls) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.cls = cls;
}
public Student() {
    
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCls() {
	return cls;
}
public void setCls(String cls) {
	this.cls = cls;
}
   
}
