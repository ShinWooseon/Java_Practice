package com.dowhile;

/*
 *
 *	문제)
 *	1 ~ 99까지의 정수르 입력 받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"
 * 두개가 있는 경우는 "박수짝짝"을 출력하는 프로그램을 구현하시오.
 * 
 * 	결과 1 ~ 99 사이의 정수를 입력 : 
 * 	박수짝
 * 
*/

import java.util.*; // Scanner, Math.random

public class DoWhileEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, temp = 0;
		
		
		for( i = 1 ; i<=99 ; i++) { 
			System.out.print("i="+i);
			temp = i;
			
		
		do {
			if( temp%10%3 == 0 && temp%10 != 0) {
				// temp %10 이 3배수 인지 확인 (0은 제외)
				// 97 temp%10 = 7, temp%10%3 == 1, 
				System.out.print("짝");
//			System.out.print("\t"+(temp /= 10));
			}
//			System.out.print("\t"+((temp /= 10) !=0));
			
		} while ((temp /= 10)!= 0);
		System.out.println();
		}
	}
}
