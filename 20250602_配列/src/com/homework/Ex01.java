package com.homework;
/*
 * 2차원배열을 이용하여 다음과 같이 출력하시오.
 * 반복문을 이용하여 배열에 값을 저장한 후 
 * 아래와 같이 출력되도록 프로그램을 구현하시오.
 * 단 , 1번과 5번은 레기드 배열로 처리하시오.
 * 
 * 문 1] 
 *  
 *   1
 *   2  3
 *   4  5  6
 *   7  8  9  10  모양을 출력하세요.
 *   
*/

public class Ex01 {

	public static void main(String[] args) {

		// 레기드 2차원 배열 선언
		int[][] arr = new int[4][];
		int n = 1 ;
		
		// 이중 for문 초깃값 변수 선언
		int i = 0, j = 0;
//		int i = 0, j = 0, k = 0;
		
//		// 데이터 입력 반복문
//		for (i = 0; i < arr.length; i++) {
//			arr[i] = new int[i + 1];
//			for (j = k, l = 0; j < arr[i].length + k; j++, l++) {
//				arr[i][l] = j+1;
//			}
//			k = j;
//		}
		// 데이터 입력 반복문
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = n++;
			}
		}

		// 출력 반복문
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
