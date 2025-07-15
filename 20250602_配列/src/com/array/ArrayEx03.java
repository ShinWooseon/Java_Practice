package com.array;

/*
 * 문제)
 * Char 자료형의 배열에 알파벳 대문자를 저장하고
 * 저장된 배열의 전체 요소를 출력하는 프로그램을 작성하시오.
 * 
*/

public class ArrayEx03 {

	public static void main(String[] args) {

		int arr[] = new int[26];

//		for (int i = 0; i <= 25; i++) {
//			arr[i] = al + i;
//		}
		
//		for (int i = 0, b = 'A'; i < arr.length ; i++, b++) {
////			arr[i] = (char)b; // b 초깃값이 A의 아스키코드 숫자 65일 경우 char 형변환 필요
//			arr[i] = b; // 
//		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = (char)('A'+i);  
		}
		
		for (int temp : arr) {
			System.out.print((char)temp + " ");
		}
		
	}

}
