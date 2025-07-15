package com.ioex;

// Scanner 문자열 입출력시

import java.util.*;

public class ScannerEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name; // 문자열
		char c ; // 문자 1개
		
		System.out.println("이름 입력: "); 
		name = sc.next(); // 문자열 입력값은 배열로 이해
		
		System.out.println("혈액형 :");
		c = sc.next().charAt(0); // 문자 한개에 대한 인덱스 값 입력
		
		
		
		System.out.println(name);
		System.out.println(c);
		
	}
}
