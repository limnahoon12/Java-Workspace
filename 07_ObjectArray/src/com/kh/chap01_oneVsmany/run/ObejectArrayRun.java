package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObejectArrayRun {
	
	public static void main(String [] args) {
		
		Book[] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서정보를 입력받은 후 각 객체배열에 인덱스에 해당객체를 생성하기.
		
		for(int i =0; i < arr.length; i ++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
			
		}
			//전체 도서정보를 출력
		for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].information());
			}
		
		//사용자에게 검색할 도서 제목을 이볅받아 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메소드
		
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) { //i에 담긴 주소값 먼저 검사 후 
				System.out.println(arr[i].getPrice());
			}
		}
		
		
		
		
	}
}
