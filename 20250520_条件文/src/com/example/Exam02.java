package com.example;

/*
 * 문제)
 * 2자리의 정수(0~99) 사이의 정수를 입력 받고,
 * 십의 자리와 일의 자리가 같은지를 판별하는 프로그램을 구현하시오.
 * 
 * 
 * 출력
 * 2자리 정수 입력(0~99) : 77
 * 십의 자리와 일의 자리가 같습니다.
 * 
 * 2자리 정수 입력(0~99) : 67
 * 십의 자리와 일의 자리가 같지 않습니다.
 * 
 *  
*/

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, num10, num1; // if 문 안에서 조건 설정 시, 변수 1개로 가능

		System.out.print("2자리 정수 입력(10~99) : ");
		num = sc.nextInt();
		
		num10 = num / 10;
		num1 = num % 10;
		
		if(num10 == num1) {
			System.out.println("십의 자리와 일의 자리가 같습니다.");
		}
		else
			System.out.println("십의 자리와 일의 자리가 같지 않습니다.");

//		if (num >= 10 && num <= 99) {
//			if (num / 10 == num % 10) {
//				System.out.println("십과 일의 자리가 같습니다.");
//			} else {
//				System.out.println("십과 일의 자리가 같지 않습니다");
//			}
//		} else {
//			System.out.println("입력값이 10~99를 벗어납니다.");
		
//		if (num < 10 || num > 99) {
//			System.out.println("입력값이 10~99를 벗어납니다.");
//			return;
//		}
//		else if (num / 10 == num % 10) {
//				System.out.println("십과 일의 자리가 같습니다.");
//			} else {
//				System.out.println("십과 일의 자리가 같지 않습니다");
//			}
		
//		if (num < 10 || num > 99) {
//			System.out.println("입력값이 10~99를 벗어납니다.");
//			return;
//		}
//		
//		if (num / 10 == num % 10) {
//				System.out.println("십과 일의 자리가 같습니다.");
//			} else {
//				System.out.println("십과 일의 자리가 같지 않습니다");
//			}
		}
	}

