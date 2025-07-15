package com.loop;

/*
 * 문제)
 * 1부터 100까지의 수 중 전체 합계, 홀수의 합, 짝수의 합을 구하는 프로그램을 구현하시오.
 * 
*/

public class ForEx05 {
	public static void main(String[] args) {
		
//		for (i=1, j=10 ; i<=10 ; i++, j--) {
//			System.out.printf("%3d  => %3d\n", i, j);
//		}
//		for (i=1, j=1 ; i<=10 ; i++, j--) {
//			System.out.printf("%3d * %3d = %d\n", i, j, i*j);
//		}
		
		System.out.println("i\t 2*i\t 2*i-1\t i*i\t 11-i\t i%3\t i/3");
		System.out.println("--------------------------------------------------");
		
		for (int i = 1; i<=10 ; i++) {
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
		
		
	}
}
