package com.objectex;
/* 메소드
 * - 특정 작업을 수행하는 일련의 문장을 하나로 묶은 것을 의미함
 * 기본적으로 수학의 함수와 유사하다.
 * 
 * Math.sqrt() -> 제곱근 
 * 
 * 메소드를 사용하는 이유
 * 1. 높은 재사용성
 * 2. 중복 코드를 제거
 * 3. 프로그램을 구조화
 * 
 * 메소드 구성요소
 * 1. 선언부 (메소드 초기 작성)
 * 2. 구현부 (Block 안 구문)
 * 
*/

public class MethodClass {

	static void PrintArr(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}

	static void intiArr(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[11];
		intiArr(arr);
		PrintArr(arr);
		PrintArr(arr);
		PrintArr(arr);

	}
}
