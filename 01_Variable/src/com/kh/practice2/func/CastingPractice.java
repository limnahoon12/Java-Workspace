package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	public void Test() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double num1 = sc.nextDouble() ;
		
		System.out.print("영어 : ");
		double num2 = sc.nextDouble() ;
		
		System.out.print("수학 : ");
		double num3 = sc.nextDouble() ;
		
		int sum = (int)(num1+num2+num3);
		int avg = sum/3;
		
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %d \n", avg);
		
		
		
		
		
				
		
		
	}
}
