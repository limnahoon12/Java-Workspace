package com.kh.hw.employee.model.vo;

public class Employee {
	private int empNO;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
public  Employee() {
	
	}
public Employee(int empNo, String name, char gender, String phone) {
	this.empNO = empNo;
	this.name = name;
	this.gender = gender;
	this.phone = phone;
}
public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
	this.empNO = empNo;
	this.name = name;
	this.gender = gender;
	this.phone = phone;
	this.dept = dept;
	this.salary = salary;
	this.bonus = bonus;
}

public void setEmpNo(int empNo) {
	this.empNO = empNo;
}
 public void setName(String name) {
	 this.name = name;
 }
public void setGender(char gender) {
	this.gender = gender;
}
public void setPhone(String phone) {
	this.phone = phone;
}










}






















