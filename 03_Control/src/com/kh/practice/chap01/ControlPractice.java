package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1.입력");
		System.out.print("2.수정");
		System.out.print("3.조회");
		System.out.print("4.삭제");
		System.out.print("7.종료");
		System.out.print("메뉴번호를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.print("입력 메뉴입니다.");
		}else if(num==2) {
			System.out.println("수정 메뉴입니다.");
		}else if(num==3 ) {
			System.out.println("조회 메뉴입니다.");
		}else if(num==4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(num==7) {
			System.out.println("프로그램이 종료됩니다.");
			
			
				
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		

}
	}


