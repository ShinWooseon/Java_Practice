package com.ioex;

import java.io.*;

public class InputEx03 {

	public static void main(String[] args) throws IOException {
		
		// 숫자 1개 입출력
		
		// 메뉴를 만들어서, 숫자 하나만 입력해서 받아야 할때, 숫자 하나 이상의 입력을 방지할 때 사용
		int num1, num2;
		System.out.print("첫번째 숫자:");
		num1 = System.in.read()-'0';
		//	num1 = System.in.read()-48; 위와 동일
//		System.in.read(); // \r
//		System.in.read(); // \n
		
		System.in.skip(2); // 위 System.in.read 2줄과 동일한 결과 
		
		
		// 입력 문자에서 개행 문자 \r 과 \n을 제거
		// 상기 2행 미입력시, **Enter(개행 문자)**  입력 스트립 5\r\n 잔존
		// \r \n이 입력값으로 처리 -> 입력 버퍼 문제 발생  
		// \r 13, \n 10
		
		// num1에 숫자 2개를 입력시 skip(2)를 전부 사용하여, /r 값 13에서 -48를 연산하여 -35가 나옴
		// num1에 숫자 2개를 입력해도 맨앞 숫자만 처리되지만 skip(3)으로 변경하면 그래도 연산은 가능하다
		
		System.out.print("두번째 숫자:");
		num2 = System.in.read()-48;
	
		System.out.println(num1); 
		System.out.println(num2); 
	}
}
