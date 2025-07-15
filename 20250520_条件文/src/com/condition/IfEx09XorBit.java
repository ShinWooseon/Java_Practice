package com.condition;

import java.util.*;


public class IfEx09XorBit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// bit 연산 사용시 temp 변수 사용 없이 메모리 절약 가능
		
		int a, b ; 
		
		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();
		
		if ( a > b) {
			System.out.printf("%d %d", a, b);
		}
			else if ( b > a) {
				// 현관문 도어락 프로그램시 사용
				// a는 10, b는 7일때, 10진수를 전부 2진수로 변경하면 
				// a는 1010, b는 0111
				// ^ xor 비트 연산
				a = a ^ b; // ^ 연산 한 값이 a에 대입, 1101 -> 13
				b = b ^ a; // ^ 연산 한 값을 b에 대입, 0111 ^ 1101 -> 1010 -> 10 
				a = a ^ b; // ^ 연산 한 값을 a에 대입, 1101 ^ 1010 -> 0111 -> 7
				// 변수 추가 없이(메모리 공간 늘림 없이), 정수 정렬 처리 가능
				System.out.printf("%d %d", a, b);
			}
			else 
				System.out.println("a 와 b 는 같습니다.");
		sc.close();
	}

}

