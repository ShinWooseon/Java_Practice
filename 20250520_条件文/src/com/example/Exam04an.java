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


public class Exam04an {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, temp ;
		
		
		System.out.print("정수 3개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if ( num1 == num2 && num2 == num3) {
			System.out.println("세 값은 모두 같습니다.");
			return;
		}
		
		if ( num1 > num2) {
		temp = num1;
		num1 = num2;
		num2 = temp;
		}
		
		if( num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		 
		if ( num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("중간 값 : "+num2);
	}
}
