package com.exam;

/*
 * 문제)
 * 양의 정수만 입력받아 입력받은 정수의 합계와 평균을 구하시오.
 * 단, 음수가 입력되면 합계와 평균을 출력하시오.
 * 
 * 결과
 * 1
 * 2
 * 3
 * 4
 * -5
 * 
 * 지금까지의 합계와 평균은 2.2 얼마입니다.
 * 
*/

import java.util.*;

public class ForEx01 {

	public static void main(String[] args) {

		int a = 0, sum = 0, cnt = 0;
		double avg = 0.0;

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("정수 입력 : ");
			a = sc.nextInt();

			if (a >= 0) {
				sum += a;
				cnt++;
			} else if (a < 0) {
				System.out.println("프로그램이 종료 됩니다.");
//				return;
				break;
			}
			avg = (double) sum / cnt;
//			System.out.printf("지금까지의 합계는 %d, 평균은 %.1f 입니다. \n", sum, avg);
		}
		System.out.printf("지금까지의 합계는 %d, 평균은 %.1f 입니다. \n", sum, avg);
	}
}
