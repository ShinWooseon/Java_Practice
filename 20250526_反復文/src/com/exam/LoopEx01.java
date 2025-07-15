package com.exam;

import java.util.Scanner;

public class LoopEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = -50; // 반복 실행 출력 초기값 변수 선언 및 초기화
//		int j = 0; // 행 이동 변수 선언 및 초기화
//
//		for (j = 0; j <= 20; j++) {
//			for (i = -50 + (j * 5); i <= -50 + 5 * (j + 1) ; i++) {
//				System.out.printf("%2d\t", i);
//				if (i == 1) {
//					return;
//				}
//			}
//			System.out.println();

//		while (j <= 20) {
//			while (i < -50 + 5 * (j + 1)) {
//
//				System.out.printf("%2d\t", i);
//				i++;
//				if (i == 2) {
//					return;
//				}
//			}
//			System.out.println();
//			j ++;

//		while (i <=1) {
//			System.out.printf("%2d\t", i);
//			i++;
//			if (i % 5 == 0) {
//				System.out.println();
//			}
//		}
		
		
//		do {
//			do {
//				System.out.printf("%2d\t", i);
//				i++;
//				if (i == 2) {
//					return;
//				}
//			} while (i < -50 + 5 * (j + 1));
//
//			System.out.println();
//			j++;
//		} while (j <= 20);
		
		do {
			System.out.printf("%2d\t",i);
			i++;
			if (i % 5 == 0) {
				System.out.println();
			}
		} while ( i <= 1 );
		
	}
}
