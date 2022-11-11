package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 :");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :"+(num2/num));
		System.out.println("남은 사탕 개수 : "+(num2 % num));
		
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) :");
		int num = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char num4 = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double num5 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다"  );
		
	
		}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = //////////// 
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		int num = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		System.out.println("합계 : " + (num+num2+num3));
		
		System.out.println("평균 : "+ (num+num2+num3)/3);
		
		
		
		
		
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		String resNo = sc.nextLine();//901225-1234567
		char gender = resNo.charAt(7);// '1', '2', '3', '4'
		
		String result = gender ==  '1' || gender == '3' ? "남자" : "여자";
		// '1' == 1 -> 49 == 1, '2' == 1 -> 50 ==1
		System.out.println(result);
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
		
		System.out.println(result);
	

		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수3 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num1 == num2 && num1 == num3 && num2==num3) ? true : false);
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
	}
	
	
}
