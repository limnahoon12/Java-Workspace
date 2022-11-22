package com.kh.chap03_class.model.vo;

public class Member {
	   private String memberId;
	   private String memberPw;
	   private String memberName;
	   private int age;
	   private char gender;
	   private String phone;
	   private String email;
	   
	   //+ changeName(name:String):void
	   public void changName(String name) {
		   memberName = name;
	   }
	   // + printName() : void
	   public void printName() {
		   System.out.println("이름은 : "+ memberName);
	   }
	   
	   public String getMemberId() {
		   return memberId;
	   }
	   public void setMemberId() {
		   this.memberId = memberId;
	   }
	   
	   public String getMemberPw() {
		   return memberPw;
	   }
	   
	   
	   public void setMemberPw() {
		   this.memberPw = memberPw;
	   }
	   
	   public String getMemberName() {
	      return memberName;
	   }
	   public void setMemberName(String memberName) {
	      this.memberName = memberName;
	   }
	   
	   
		   
	   
	   
	   
	  
	          

	}
	
	
	 
	
	

