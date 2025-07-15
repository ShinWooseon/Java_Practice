package com.array;

// 1차원 배열

public class ArrayEx01 {
	public static void main(String[] args) {
		
		// 배열 선언
		int[] arr;
		int[][] arrr;
		//자료형 [] 배열명
		
		// 메모리 할당
		arr = new int[10];
		arrr = new int[5][7];
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 배열 요소 사용 (접근)
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
		
//		for (int i = 0 ; i<10 ; i++) {
//			System.out.println(arr[i]);
//			System.out.println(ar[i]);
//		}
		
		// 배열에서 한번에 출력할 수 있는 조건 값
		// : arr 우변 값이 temp에 입력
		// 향상된 for 문
//		for(int temp : arr) {
//			System.out.println(temp);
//		}
		
		

		for (int[] a : arrr) {
			for (int temp : a) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}		

}
