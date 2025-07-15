package com.example;

/*
 * 문제)
 * 정수 3개를 입력 받고, 3개의 정수 중간 크기의 수를 출력하는 프로그램을
 * 작성 하시오.
 * 
 * 출력 
 * 정수 3개 입력 : 20 100 33
 * 중간 값 : 33
 * 
 * if문 사용
 * 
*/

import java.util.*;


public class Exam04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c ;
		
		System.out.print("정수 3개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int middle = a; // 초기화 중간값
		
		if (( a >= b && a <= c) || (a >= c && a <= b)){
			middle = a;
		}
		else if (( b >= a && b <= c) || (b >= c && b <= a)){
			middle = b;
		}
		else 
			middle = c;
		
//		if ( num1 == num2 && num2 == num3) {
//			System.out.println("세 값은 모두 같습니다.");
//			return;
//		
//		if ( num1 > num2) {
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
//		}
//		
//		if( num1 > num3) {
//			temp = num1;
//			num1 = num3;
//			num3 = temp;
//		}
//		 
//		if ( num2 > num3) {
//			temp = num2;
//			num2 = num3;
//			num3 = temp;
//		}
		System.out.println("중간 값 : "+middle);
	}
}
