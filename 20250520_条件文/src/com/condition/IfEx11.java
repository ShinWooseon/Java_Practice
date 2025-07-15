package com.condition;

/*
 * 문제)
 * 사용자로부터 세개의 정수를 입력받아,
 * 작은 수부터 큰 수를 순선대로 출력하는 프로그램을 구현하시오.
 * 
 * 실행결과
 * 첫번째 : 16
 * 두번째 : 8
 * 세번째 : 21
 * 
 * 출력 결과 : 8 16 21
 * 
 * 
*/

import java.util.*;

public class IfEx11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, temp ;
		
		System.out.print("첫번째 : ");
		a = sc.nextInt();
		
		System.out.print("두번째 : ");
		b = sc.nextInt();
		
		System.out.print("세번째 : ");
		c = sc.nextInt();
		
		System.out.print("네번째 : ");
		d = sc.nextInt();
		
		
		// 첫번째가 두번째 보다 크다면 두 정수의 자리를 바꾼다
		// 첫번째가 세번째 보다 크다면 두 정수의 자리를 바꾼다
		// 두번째가 세번째 보다 크다면 두 정수의 자리를 바꾼다
		
		if ( a > b) {
				
		temp = a;
		a = b;
		b = temp;
		}
		
		if( a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if( a > d) {
			temp = a;
			a = d;
			d = temp;
		}
		 
		if ( b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		if ( b > d) {
			temp = b;
			b = d;
			d = temp;
		}
		
		if ( c > d) {
			temp = c;
			c = d;
			d = temp;
		}
		
		System.out.printf("출력 결과 : %d %d %d %d", a, b, c, d);
	}
}


