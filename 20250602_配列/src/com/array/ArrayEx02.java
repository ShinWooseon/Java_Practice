package com.array;

/*
 * 問題）
 * 任意・随意の数字が入っている配列の数のデーターの中、
 * 짝수인 요소만 골라서 출력하고, 3의 배수인 요소를 출력하는 프로그램을 출력하시오.
 * 
 * 임의의 숫자 : 4 7 9 1 3 2 5 6 8
 * 
 * 출력 결과
 * 배열 전체 요소 출력
 * 4 7 9 1 3 2 5 6 8
 * 
 * 짝수 출력
 * 4 2 6 8
 * 
 * 3의 배수 출력
 * 9 3 6
 * 
*/
public class ArrayEx02 {

	public static void main(String[] args) {

//		int[] ar = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
//		int ar[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		int ar[] = new int[] { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		int i;

		System.out.println("배열 전체 요소 출력");
		for (int temp : ar) {
			System.out.print(temp + " ");
		}

		System.out.println("\n짝수 출력");
		for (i = 0; i < 9; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}

		System.out.println("\n3의 배수 출력");
		for (i = 0; i < 9; i++) {
			if (ar[i] % 3 == 0) {
				System.out.print(ar[i] + " ");
			}
		}

	}
}
