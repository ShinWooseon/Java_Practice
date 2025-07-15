package com.exam;

/*
 * 문제)
 * -1^2+2^2-3^2+4^2~~~~~~~~~-99^2+100^2 의 합계를 구하는 프로그램을 구현하시오.
 * 
 * 단, while 문 사용
 * 
 * 결과 : 5050
 * 
*/
public class ForEx05 {

	public static void main(String[] args) {

		int i = 1;
		int plus = 1;
		int sum = 0;

//		for (i = 1; i <= 100; i++) {
//			for (j = 1; j <= 1; j++) {
//				jegob = buho * i * i;
//				sum += jegob;
//			}
//			if (buho == -1) {
//				buho = 1;
//			} else {
//				buho = -1;
//			}
//		}
//		System.out.println("결과 : " + sum);
		
		while (i <= 100) {
			plus = -plus;
			sum += plus*(i*i); 
//			if (i % 2 != 0) {
//				sum += -1*i*i;
//			} else {
//				sum += i*i;
			i++;
			}
		System.out.println("결과 : " + sum);
		}
	}

