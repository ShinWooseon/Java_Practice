package com.example;

/*
 * 문제)
 * 정수로 된 돈의 금액을 입력 받아,
 * 오만원권, 만원권, 오천원권, 천원권, 500원, 100원, 50원, 10원, 1원
 * 이 각각 몇 개인지를 변환하는 프로그램을 구현 하시오.
 *
 * 단, if문 만을 사용
 * 
 * 금액 입력 65376
 * 오만원권 1매
 * 만원권 1매
 * 오천원권 1매
 * 천원권 0매
 * 백원 3개
 * 오십원 1개
 * 십원 2개
 * 일원 6개
 * 
*/

import java.util.*;

public class Exam03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int amount;
//		int n50000, n10000, n5000, n1000, n500, n100, n50, n10, n1;
		int n50000 = 50000;
		int n10000 = 10000;
		int n5000 =  5000;
		int n1000 = 1000;
		int n500 = 500;
		int n100 = 100;
		int n50 = 50;
		int n10 = 10;
		int n1 = 1;
		int result;
		
		System.out.print("금액 입력 : ");
		amount = sc.nextInt();
		
//		n50000 = amount / 50000;
//		amount -= n50000 * 50000;
//		
//		n10000 = amount / 10000;
//		amount -= n10000 * 10000;
//		
//		n5000 = amount / 5000;
//		amount -= n5000 * 5000;
//		
//		n1000 = amount / 1000;
//		amount -= n1000 * 1000;
//		
//		n500 = amount / 500;
//		amount -= n500 * 500;
//		
//		n100 = amount / 100;
//		amount -= n100 * 100;
//		
//		n50 = amount / 50;
//		amount -= n50 * 50;
//		
//		n10 = amount / 10;
//		amount -= n10 * 10;
		
		result = amount / n50000;
		amount = amount % n50000;
		if(result > 0) {
			System.out.println("50000원권은 "+result+"매 입니다.");
		}
		result = amount / n10000;
		amount = amount % n10000;
		if(result > 0) {
			System.out.println("10000원권은 "+result+"매 입니다.");
		}
		result = amount / n5000;
		amount = amount % n5000;
		if(result > 0) {
			System.out.println("5000원권은 "+result+"매 입니다.");
		}
		result = amount / n1000;
		amount = amount % n1000;
		if(result > 0) {
			System.out.println("1000원권은 "+result+"매 입니다.");
		}
		result = amount / n500;
		amount = amount % n500;
		if(result > 0) {
			System.out.println("500원 동전은 "+result+"개 입니다.");
		}
		result = amount / n100;
		amount = amount % n100;
		if(result > 0) {
			System.out.println("100원 동전은 "+result+"개 입니다.");
		}
		result = amount / n10;
		amount = amount % n10;
		if(result > 0) {
			System.out.println("10원 동전은 "+result+"개 입니다.");
		}
		result = amount / n1;
		amount = amount % n1;
		if(result > 0) {
			System.out.println("1원 동전은 "+result+"개 입니다.");
		}
		
//		if(amount>=10000){
//			n10000 = amount / 10000;
//			amount -= n10000 * 10000;
//		}
//		if(amount>=5000) {
//			n5000 = amount / 5000;
//			amount -= n5000 * 5000;
//		}
//		if(amount>=1000) {
//			n1000 = amount / 1000;
//			amount -= n1000 * 1000;
//		}
//		if(amount>=500) {
//			n500 = amount / 500;
//			amount -= n500 * 500;
//		}
//		if(amount>=100) {
//			n100 = amount / 100;
//			amount -= n100 * 100;
//		}
//		if(amount>=50) {
//			n50 = amount / 50;
//			amount -= n50 * 50;
//		}
//		if(amount>=10) {
//			n10 = amount / 10;
//			amount -= n10 * 10;
//			n1 = amount;
//		}
		
	}
}
