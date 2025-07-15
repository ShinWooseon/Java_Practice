package com.homework;
/*
 * 2차원배열을 이용하여 다음과 같이 출력하시오.
 * 반복문을 이용하여 배열에 값을 저장한 후 
 * 아래와 같이 출력되도록 프로그램을 구현하시오.
 * 단 , 1번과 5번은 레기드 배열로 처리하시오.
 * 
 * 문 4]
 * 1  5  9 13 17
 * 2  6 10 14 18
 * 3  7 11 15 19
 * 4  8 12 16 20  모양을 출력하세요.
 *   
*/

public class Ex04 {

	public static void main(String[] args) {

		// 2차원 배열 선언
		int[][] arr = new int[4][5];

		// 이중 for문 초깃값 변수 선언
		int i = 0, j = 0, k = 0;

		// 데이터 입력 반복문
		for (i = 0; i < arr.length; i++) {
			for (j = 1+i, k = 0; j <= 20; j += 4, k++) {
				arr[i][k] = j;
			}

		}

		// 출력 반복문
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}

	}
}
