package com.exam;

/*
 * 문제)
 * 
 * 사용자로부터 임의의 정수를 입력 받아 1부터 입력 받은 수까지의
 * 전체의 합계, 짝수의 합계, 홀수의 합계를 각각 출력하는 프로그램을 구현하시오.
 * 
 * 단, 10단위 출력 하시오.
 * 
 * 출력
 * 정수 입력 : 59
 * 1 ~ 10 까지의 합계 :
 * 1 ~ 10 까지의 짝수의 합계 :
 * 1 ~ 10 까지의 홀수의 합계 :
 * 
 * 1 ~ 20 까지의 합계 :
 * 1 ~ 20 까지의 짝수의 합계 :
 * 1 ~ 20 까지의 홀수d의 합계 :
 * 
*/

import java.util.*;

public class ForEx02An {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, sum = 0, evensum = 0, oddsum = 0;
		int i, num10, num1;

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		for (i = 1; i <= num; i++) {
			sum += i;
			num10 = i / 10;
			num1 = i % 10;
			if (i % 2 == 0) {
				evensum += i;
			} else if (i % 2 != 0) {
				oddsum += i;
			}
			if (i % 10 == 0) {
				System.out.println("1 ~ " + i + " 까지의 합계 " + sum);
				System.out.println("1 ~ " + i + " 까지의 짝수의 합계 " + evensum);
				System.out.println("1 ~ " + i + " 까지의 홀수의 합계 " + oddsum);
			} else if (i == num) {
				System.out.println("1 ~ " + i + " 까지의 합계 " + sum);
				System.out.println("1 ~ " + i + " 까지의 짝수의 합계 " + evensum);
				System.out.println("1 ~ " + i + " 까지의 홀수의 합계 " + oddsum);
			}
		}
	}
}
