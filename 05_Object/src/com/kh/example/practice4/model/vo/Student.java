package com.kh.example.practice4.model.vo;

public class Student {
    //필드부
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 0;
	    classroom = 0;
	    name = "dd";
	    height = 0.0;
	    gender = 'a';
	}
	
	
	//생성자부
	public Student() {
		
	}
	
	//메서드부
	public void setGrade() {
		this.grade = grade;
	}
	public void setClassroom() {
		this.classroom = classroom;
	}
	public void setName() {
		this.name = name;
	}
	public void setHeight() {
		this.height = height;
	}
	public void setGender() {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}

	public char getChar() {
		return gender;
	}









}
