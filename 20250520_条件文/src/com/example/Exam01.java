package com.example;

/*
 * 문제)
 * 원화를 입력받아 달럴로 바꾸는 프로그램을 구현하시오.
 * 1$ = 1400
 * 
 * 원화 입력 : 2800
 * 2800원은 2.0$입니다.
 * 
*/

import java.util.*;

public class Exam01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Won;
		double rate;
		double USA$ = 0.0; // 변수 초기화시 이후 해당 변수에 대한 자릿값을 전체 지정하는 방법은 ?

		// rate = 1400.0f;
//		 rate = 1400.0; 
//		 final을 사용하는 이점은?

		System.out.print("원화 입력 : ");
		Won = sc.nextInt();
//
		System.out.print("환율 입력 : ");
		rate = sc.nextFloat();

		USA$ =  Won / rate;

		System.out.printf("%d원은 $%.1f 입니다.\n", Won, USA$);
		System.out.printf("%d원은 $%.2f 입니다.\n", Won, USA$);
		System.out.printf("%d원은 $%f 입니다.\n", Won, USA$);
		System.out.println(Won + "원은 $" + USA$ + "입니다.");
		
	}

}
