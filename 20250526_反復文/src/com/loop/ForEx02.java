package com.loop;

/*
 * 문제)
 * 1부터 100까지의 수 중 전체 합계, 홀수의 합, 짝수의 합을 구하는 프로그램을 구현하시오.
 * 
*/

public class ForEx02 {
	public static void main(String[] args) {
		
		int i, sum = 0;
		// 혹은 각 홀수 짝수 합계 별로 변수 선언
		int even = 0, odd = 0;
		
		
		for ( i =1; i <=100 ; i++) {
			sum +=i;
			if ( i % 2 == 0) {
				even += i;
			} else {
				odd +=i ;
			}
		}
		
//		sum = 0;
//		for ( i =1; i <=100 ; i++) {
//			if( i % 2 == 0 ) {
////					sum +=i;
//				even +=i;
//			}
		
//		sum = 0;
//		for ( i =1; i <=100 ; i++) {
//			if( i % 2 !=0 ) {
////				sum +=i;
//				odd +=i;
//			}
//		}
		System.out.println("1 부터 "+i+"까지의 합계 : "+sum);
		System.out.println("1 부터 "+i+"까지의 짝수 합계 : "+even);
		System.out.println("1 부터 "+i+"까지의 홀수 합계 : "+odd);
		
	}

}
