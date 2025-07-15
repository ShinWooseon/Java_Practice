package com.loop;

/*
 * 문제)
 * 임의의 정수 2개를 입력 받아,
 * 두 수 사이의 합계를 구하는 프로그램을 구현하시오.
 * 
 * 첫번째 정수 : 10
 * 두번째 정수 : 1
 * 
 * 두 수 사이의 합계 : 55
 * 
*/

import java.util.*;

public class ForEx12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int begin, end;
		int sum = 0;

		System.out.print("첫번째 정수 : ");
		begin = sc.nextInt();

		System.out.print("두번째 정수 : ");
		end = sc.nextInt();

//		System.out.println(begin);
//		System.out.println(end);
		
		if ( begin > end) {
			begin = begin^end;
			end = end^begin;
			begin = begin^end;
		}
			for(int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.printf("두 수 사이의 합계 : %d", sum);
	}

}
