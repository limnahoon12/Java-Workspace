package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class C_DimensionalArray {

	
	//2차원 배열 : 일차원배열을 여러개를 하나로 묶은것
	
	public void method1() {
		
		//1차원 배열 선언
		int [] arr1;
		int arr2[];
		
		//2차원 배열 선언
		int[][] arr3;
		int arr4[][];
		int [] arr5 [];
		
		//2차원 배열선언과 동시에 할당
		int [][] arr = new int [3][5];
		
		System.out.println(arr); //[[I@7637f2
		System.out.println(Arrays.toString(arr[0]));//{I@3830f1c0
		System.out.println(arr[0][0]);
		
		System.out.println("행의 길이 : "+ arr.length);
		
		//각 행별 열의 길이
		System.out.println("0번 열의 길이 : "+ arr[0].length);
		System.out.println("1번 열의 길이 : "+ arr[1].length);
		System.out.println("2번 열의 길이 : "+ arr[2].length);
		
		/*
		 * 출력(arr[0][0]) -> 1행 1열
		 * 출력(arr[1][1]) -> 1행 2열
		 * ....
		 * 출력(arr[0][4]) -> 1행 5열
		 * 
		 * 출력(arr[2][4]) -> 3행 5열
		 */
		 /* 바깥쪽 for문 => 행에 대해 지정(0행~2행) == (0행 ~ 행의 크기-1) == (0행 ~ arr.length-1)
		  * 안쪽 for문 => 열에 대해 지정(0열 ~ 4열) == (0열 ~ 각 행별 열의 크기-1)
		  * == ( 0열 ~ arr[행의 인덱스].length -1)
		  *  
		  */
		 
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	public void method2() {
		// 순서대로 1, 2, 3, 4...15 값을 넣어보기
		int[][] arr = new int[3][5];// arr[0][0] -> 1. arr[0][1] -> 2, arr[2][4] -> 15
		
		//값을 대입, 출력
		int value = 1;
		for(int i = 0; i <= arr.length-1; i++) {//0, 1, 2
			for(int j = 0; j <= arr[i].length-1; j++) {// 0, 1, 2, 3, 4
				//arr[i][j] 00, 01, 02, 03, 04
				arr[i][j] =value++;
				
				//System.out.print(arr[i][j] + " ")
				System.out.printf("%-3d", arr[i][j]);
				//value++;
			}
			System.out.println();
		}
		
		
	}
	public void method3() {
		//1차원 배열 선언 및 할당과 동시에 초기화
		int [] arr = {1, 2, 3, 4, 5};
		
		//2차원 배열 선언 및 할당과 동시에 초기화
		int [][] arr2 = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} }; // [3][5]
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
			System.out.print(arr2[i][j]+ "\t");// \t 문자간 거리벌리기
		}	
	  System.out.println();
	}

}
	public void method4() {
		
		/*
		 * 가변 배열
		 * 행의크기는 정해져있으나, 각각의 행별로 열의 갯수가 정해져있 않은 상태
		 * 2차원배열 == 일차원 배열을 어려개 묶은 형태
		 * 즉, 묶여있는 1차원 배열의 길이가 꼭 같은 필요는 없다.
		 * 
		 * 단, 행 크기는 생략이 불가하고, 반드시 지정을 해줘야함.
		 * 열 크기는 생략이 가능하다. 각 행의 열의 길이가 변경 가능함.
		 * 
		 */
	int [][] arr = new int[3][];// 가변 배열( 행의 크기는 3행)
	
	System.out.println(arr);
	System.out.println(arr[0]);
	System.out.println(arr.length);
	//System.out.println(arr[0].length);
	// 아직 각 행별로 열의 크기가 지정되지 않았으므로 null값이 대입된 상태에서
	// 특정 인덱스로 접근하려했기때문에 NullPointerException
	
	arr[0] = new int[2]; //0 0
	arr[1] = new int[ ] {5, 6, 8};
	arr[2] = new int[4];
	/*
	 * 0 0
	 * 5 6 8 
	 * 0 0 0 0
	 * 
	 */
	int value = 1;
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++ ) {
			arr[i][j] = value++;
		}
	}

	for(int i=0; i < arr.length; i++) {
		System.out.println(Arrays.toString(arr[i]));
	 }
	
	}
  public void method5() {
	  //char[][] 가변 배열 생성
	  char[][] arr = new char[3][];
	  /*
	   * a b c
	   * d e
	   * f g h i j k
	   */
	
	arr[0] = new char [3];
	arr[1] = new char [2];
	arr[2] = new char [6];
	
	char value = 'a';
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++ ) {
			arr[i][j] = value;
			
			value = (char)(value+ 1);
			System.out.print(arr[i][j]+ " \t");
			
		}
		System.out.println();
	}
	
}

  public void method6() {
	  //3행 3열짜리 String[][] 배열 생성 후
	  //중첩 반복문을 이용해 현재 행, 열의 순번(인덱스)를 출력
	  //(0, 0)
	 String [][] arr = new String[3][3];
	 
	 for(int i = 0; i < arr.length; i++ ) {
		 for(int j = 0; j < arr[i].length; j++) {
			//방법1. System.out.print("("+i+", "+j+")");
			//방법2.
			 System.out.printf("(%d, %d)", i, j);
			 
		 }System.out.println();
	 }
  
  }
  public void method7() {
	  // int형 2차원 배열을 만들어
	  //0번행 국어점수 3개를 입력받고
	  //1번 행에는 영어점수를 3개 입력받은 후
	  //각각 반복문을 활용해서 출력
	  //입력예시 : xx점수를 입력하세요 :
	  //출력예시 : xx점수 : xx xx xx
	  
	  Scanner sc = new Scanner(System.in); 
	  int [][] arr = new int [2][3];
	  
	  for(int i =0; i<arr.length; i++) {
	         for(int j=0; j<arr[i].length; j++) {
//	            if (i == 0) {
//	               System.out.print("국어점수를 입력하세요 : ");
//	               int kor = sc.nextInt();
//	               arr[i][j] = kor;
//	            } else {
//	               System.out.print("영어점수를 입력하세요 : ");
//	               int eng = sc.nextInt();
//	               arr[i][j] = eng;
//	            }
	            System.out.printf("%s 점수를 입력하세요 : ", i==0 ? "국어" : "영어");
	            arr[i][j] = sc.nextInt();
	         }
	      }
	      System.out.printf("국어점수 : %d, %d, %d", arr[0][0], arr[0][1], arr[0][2]);
	      System.out.printf("\n영어점수 : %d, %d, %d", arr[1][0], arr[1][1], arr[1][2]);
	   }
	 
	  
	  
  }



