package com.condition;

/*
 * 문제)
 * 사용자로부터 두 정수와 연산자를 입력 받아서,
 * 해당 연산을 처리하는 프로그램을 구현 하시오.
 * 
 * 출력결과
 * 첫번째 정수입력 : 10
 * 연산자 입력 : [+ - * /] : +
 * 두번째 정수입력 : 14
 * 
 * 
 */

import java.util.*;

public class IfEx06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		char oper; // 문자 하나를 받기 위해 next().charAt(0)를 사용할 경우 String은 쓸 수 없다.
		
		System.out.println("첫번째 정수 입력 :");
		a = sc.nextInt();

		System.out.println("연산자 입력 [+ - * /] :");
		oper = sc.next().charAt(0);

		System.out.println("두번째 정수 입력 :");
		b = sc.nextInt();

		
		
		if (oper == '+') 
			System.out.printf("%d %c %d = %d", a, oper, b, a + b);
//			System.out.printf("%d + %d = %d", a, b, a + b);
		else if (oper == '-') 
			System.out.printf("%d %c %d = %d", a, oper, b, a - b);
		else if (oper == '*')
			System.out.printf("%d %c %d = %d", a, oper, b, a * b);
		else if (oper == '/')
			System.out.printf("%d %c %d = %d", a, oper, b, a / b);
		else
			System.out.println("연산자를 [+ - * /] 중에 다시 입력 해 주십시오.");
		
		sc.close();
	}
}
