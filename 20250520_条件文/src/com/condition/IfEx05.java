package com.condition;

/*
 * 문제)
 * 사용자로부터 임의의 정수를 입력받아,
 * 입력받은 정수가, 2의 배수인지, 3의 배수인지, 2와 3의 배수인지, 2와 3의 배수가 아닌지를
 * 판정하는 프로그램을 구현하시오.
 * 
 * if문 활용, Scanner 입력
 * 
*/

import java.util.*;

public class IfEx05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		
		System.out.println("정수를 입력하시오 : ");
		a = sc.nextInt();
		
		if ( a % 2 == 0 && a % 3 == 0)
			System.out.println("a는 2와 3의 배수입니다.");
		else if (a % 2 == 0) 
			System.out.println("a는 2의 배수입니다.");
		else if (a % 3 == 0) 
			System.out.println("a는 3의 배수입니다.");
		else 
			System.out.println("a는 2와 3의 배수가 아닙니다.");
		}
	}
