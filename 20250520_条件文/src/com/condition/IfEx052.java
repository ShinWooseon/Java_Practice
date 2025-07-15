package com.condition;

/*
 * 문제]
 *  사용자로부터 임의의 년도를 입력받아
 *  입력받은 년도가 윤년인지 평년인지 판정하는 프로그램을 구현하시오.
 *  
 *  윤년의 판정 조건
 *  년도가 4의 배수 이면서 100배수가 아니거나, 400의 배수이면 윤년
 * 	그렇지 않은면 평년
 * 
*/

import java.util.*;

public class IfEx052 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		String check;
		
		System.out.println("년도 입력 :");
		a = sc.nextInt();
		
		check = a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ? "윤년" : "평년" ;
		
		
		System.out.println(check);
		
		
		
		
		
		
	}
	
}
