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

public class Exam031 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int n50000 = n10000 = n5000 = n1000 = n500 = n100 = n50 = n10 = n1 = 0; // 한번에 초기화 할시 왜 오류가 발생 하지?
		
		int amount;
		int n50000 = 0; 
		int n10000 = 0;
		int n5000 = 0;
		int n1000 = 0;
		int n500 = 0;
		int n100 = 0; 
		int n50 = 0; 
		int n10 = 0;
		int n1 = 0;
		int result;
		
		System.out.print("금액 입력 : ");
		amount = sc.nextInt();
		
		
		if(amount>=50000){
			n50000 = amount / 50000;
			amount -= n50000 * 50000;
		}
		if(amount>=10000){
			n10000 = amount / 10000;
			amount -= n10000 * 10000;
		}
		if(amount>=5000) {
			n5000 = amount / 5000;
			amount -= n5000 * 5000;
		}
		if(amount>=1000) {
			n1000 = amount / 1000;
			amount -= n1000 * 1000;
		}
		if(amount>=500) {
			n500 = amount / 500;
			amount -= n500 * 500;
		}
		if(amount>=100) {
			n100 = amount / 100;
			amount -= n100 * 100;
		}
		if(amount>=50) {
			n50 = amount / 50;
			amount -= n50 * 50;
		}
		if(amount>=10) {
			n10 = amount / 10;
			amount -= n10 * 10;
			n1 = amount;
		}
		
		result = 50000 * n50000 + 10000 * n10000 + 5000 * n5000 + 1000 * n1000
				+ 500 * n500 + 100 * n100 + 50 * n50 + 10 * n10 + 1 * n1 ; 
		
		System.out.println("오만원권은 "+n50000+"매입니다.");
		System.out.println("만원권은 "+n10000+"매입니다.");
		System.out.println("오천원권은 "+n5000+"매입니다.");
		System.out.println("천원권은 "+n1000+"매입니다.");
		System.out.println("오백원 동전은 "+n500+"개입니다.");
		System.out.println("백원 동전 "+n100+"개입니다.");
		System.out.println("오십원 동전 "+n50+"개입니다.");
		System.out.println("십원 동전은 "+n10+"개입니다.");
		System.out.println("1원 동전은 "+n1+"개입니다.");
		System.out.println("검산 : "+result);
		
	}
}
