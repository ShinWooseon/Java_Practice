package com.loop;

/*
 * 문제)
 * 다음과 같이 중첩 for문을 이용하여,
 * 
 * 					0
 * 				   101
 *	 	          21012
 *               3210123
 * 					
 * 
 * 
*/

import java.util.*;

public class ForEx10 {

	public static void main(String[] args) {

		int a, b, c, d, e, n;
		char sp=' ';

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		n = sc.nextInt();

		for (a = 0; a <= n; a++) {
			for (b = 0; b <= n - a; b++) {
				System.out.printf("%2c",sp);
			}
			for (c = a; c >= 0 ; c--) {
				System.out.printf("%2d", c);
			}
			for (d = 1 ; d <= a ; d++) {
				System.out.printf("%2d", d);
			}
			System.out.println();
		}
		
	}
}
