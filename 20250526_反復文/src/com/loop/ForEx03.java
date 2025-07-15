package com.loop;


/*
 * 문제)
 * 1부터 100까지의 수 중 전체 합계, 홀수의 합, 짝수의 합을 구하는 프로그램을 구현하시오.
 * 
*/

public class ForEx03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0 ; i<=10; i++) {
			sum += i;
			System.out.println(i+" => "+sum);
		}
		
	}
}
