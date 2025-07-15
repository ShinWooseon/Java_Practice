package com.exam;

/*
 * 문제)
 *	임의의 정수를 입력 받아 입력 받은 수만큼의
 *	팩토리얼 계산하는 프로그램을 구현하시오.
 *
 * 	정수 입력 : 7
 * 7의 팩토리얼은 5040입니다.
 * 
*/

import java.util.*;

public class ForEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, n;
		int total = 1;

		System.out.print("정수 입력 : ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			total *= i;
//			System.out.println(i + "의 팩토리얼은 " + total + "입니다.");
		}
		System.out.println(n + "의 팩토리얼은 " + total + "입니다.");
	}
}
