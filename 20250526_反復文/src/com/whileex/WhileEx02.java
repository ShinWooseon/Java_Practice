package com.whileex;

/*
 * 문제)
 *  -1 이 입력될때 까지 정수를 계속 입력받아 합계를 구하고,
 *  평균을 구하여 출력하시오.
 * 
 * 1 정수 입력 변수
 * 2 합계 저장할 변수
 * 3 입력된 정수값을 개수를 저장할 변수
 * 4 합계를 이용하여 평균을 구할 개수
 * 
*/

import java.util.*;

public class WhileEx02 {
	public static void main(String[] args) {

		int num1 = 0, sum = 0, cou = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);

		while (num1 != -1) {

			System.out.print("정수 입력 : ");
			num1 = sc.nextInt();
			if(num1 == -1) {
				break;
			}else {
				
			cou++;

			sum += num1;
			}
		}
		avg = (double)sum / (cou);
		System.out.printf("sum : %d \n", sum);
		System.out.printf("avg : %f \n", avg);
	}
}
