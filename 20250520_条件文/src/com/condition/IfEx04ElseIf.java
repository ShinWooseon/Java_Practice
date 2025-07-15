package com.condition;

/*
 * 문제]
 *  사용자로부터 임의의 정수를 입력 받아
 *  입력받은 정수가 양수인지, 음수인지, 0인지 판정하는 프로그램을 작성 구현하시오.
 * 
 * 	단, 입력은 Scanner class로, 조건 3항 연산자로 구현하시오.
 * 
*/

import java.util.*;

public class IfEx04ElseIf {
	public static void main(String[] args) {
		
		// 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 주요 변수를 선언
		int a; // 사용자로부터 입력 받은 정수를 저장할 변수
		
		// 연산 및 처리
		// 1. 안내 메시지 출력
		
		System.out.println("정수 입력 : ");
		a = sc.nextInt();
		
		// 판정
		
		if (a > 0 ){
			System.out.println("a는 양수 입니다.");
		} 
		else if ( a < 0) {
			System.out.println("a는 음수 입니다.");	
		}
		else  {
			System.out.println("a는 0입니다");
		}
	}
}



