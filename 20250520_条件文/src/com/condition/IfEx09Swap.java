package com.condition;

import java.util.*;

public class IfEx09Swap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, temp;
		
		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();
		
		if ( a > b) {
			System.out.printf("%d %d", a, b);
		}
			else if ( b > a) {
				temp = a;
				a = b;
				b = temp;
				System.out.printf("%d %d", a, b);
			}
			else 
				System.out.println("a 와 b 는 같습니다.");
	}
	

}
