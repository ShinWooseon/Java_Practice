package com.loop;

/*
 * 문제)
 * 알파벳 한 문자를 입력 받아,
 * 입력 받은 문자부터 A까지 감소 시켜 출력하라.
 * 
 * 알파벳 입력 : e
 * 
 * abcde
 * abcd
 * abc
 * ab
 * a
 * 
*/

import java.util.*;

public class ForEx09an {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	char begin;
	int num;
	int c,d;
	
	System.out.print("알파벳 입력 : ");
	begin = sc.next().charAt(0);
	
//	System.out.print("숫자 입력 : ");
//	num = sc.nextInt();
//	
//	for ( char ch = 'a'  ; ch <= begin ; ch++) {
//		for ( char j = ch ; j <= begin ; j++) {
//			System.out.printf("%c", j);
//		}
//		System.out.println();
//	}
//	System.out.println();
	
	
	for ( char a = 'a'  ; a <= begin ; a++) {
		for ( char b = 'a' ; b <= begin-(a-97) ; b++) {
			System.out.print(b);
		}
		System.out.println();
	}
	
//	for ( c = 1  ; c <= num ; c++) {
//		for ( d = 1 ; d <= num-c+1 ; d++) {
//			System.out.print(d);
//		}
//		System.out.println();
//	}
//	
}
}
