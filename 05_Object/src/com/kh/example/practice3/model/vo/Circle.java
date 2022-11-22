package com.kh.example.practice3.model.vo;

public class Circle {
	//필드부
	private  static final double PI = 3.14;
	private int radius = 1;
	
	{
		radius =5;// 값 초기화 하는 방법
	}
	
	
	//생성자부
	public Circle () {
//		getAreaOfCircle(); // 출력문을 짧게하기위해 생성자나 1증가하는 메서드 내부에 추가 후 출력
//	    getSizeOfCircle();
	}
	
	//메서드부	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	 //반지름 1증가 
	 public void incrementRadius() {
	      radius++;
	      getAreaOfCircle();
	      getSizeOfCircle();
	      //radius +=1;
	   }
	 //원의 둘레  ( 2*반지름*원주율)
	 public void getAreaOfCircle() {
	      System.out.println(PI*radius*2);
	   }
	 //원의 넓이 ( 반지름*반지름*원주율)  
	 public void getSizeOfCircle() {
	      System.out.println(radius * radius * PI);
	   }





}
	

