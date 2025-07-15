package com.dowhile;

/*
 *
 *	문제)
 *
 *	do ~ while 문을 이용하여 1 에서 10까지 덧셈을 표시하고 합계를
 *  구하는 프로그램을 구현하시오. 
 *  
 * 	1+2+3+4+5+6+7+8+9+10==55
 * 
*/

import java.util.*; // Scanner, Math.random

public class DoWhileEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 1;
		int sum = 0;

		do {

			if (i <= 9) {
				System.out.print(i + "+");
			} else if (i == 10) {
				System.out.print(i);
			}
			sum += i;
			i++;

		} while (i <= 10);
		System.out.print("=" + sum);
	}
}
