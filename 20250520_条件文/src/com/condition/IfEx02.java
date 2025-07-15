package com.condition;

/*
 * 문제
 * 사용자로부터 임의의 정수를 입력 받아
 * 입력받은 정수가 짝수인지 홀수인지를 판정하는 프로그램을 구현하시오
 * 
*/

import java.io.*;

public class IfEx02 {
	public static void main(String[] args) throws IOException {
		
		// 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수를 선언
		int a; // 사용자로부터 입력 받은 정수르 저장할 변수
		String str; // 홀수인지 짝수인지 대한 판결에 대한 결과를 저장하는 변수
		
		// 연산 및 처리
		// 1. 안내 메시지 출력
		
		System.out.println("정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		// 판정
		// 홀수인지 짝수인지를 판정
		
		if (a % 2 == 0){
			//	System.out.println("a는 짝수 입니다.");
			str = "짝수";
		} 
		else {
			//	System.out.println("a는 홀수 입니다.");
			str = "홀수";
		}
		System.out.println(a +"는 ==> "+ str +"입니다.");
	}
}
