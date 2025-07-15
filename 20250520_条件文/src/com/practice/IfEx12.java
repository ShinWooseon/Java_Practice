package com.practice;

/*
 * 문제
 * 사용자로부터 알파벳 한문자를 입력받아
 * 소문자를 입력 받았을 경우 대문자로 바꾸시고,
 * 대문자를 입력 받았을 경우 소문자로 바꾸는 프로그램을 작성하시오.
 * 
 * 단, 입력은 System.in.read() 메소드로 처리하시오.
 * 
*/

import java.io.*;

public class IfEx12 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// new 빼먹지 말기

		char a;
		int n;

		System.out.print("알파벳 입력 : ");
		a = (char) System.in.read();

//		n = System.in.read();
//		System.out.println((char) (n - 32));

		// 한개 입력시 \r \n "enter값" 제거 불필요

//		if (a >= 97 && a<= 122) {
//			System.out.printf("%c", a-32);
//		}
//		else {
//			System.out.printf("%c", a+32);

		if (a >= 65 && a <= 90 ) {
			System.out.printf("%c", a + 32);
		} else if( a>=97 && a<= 122){
			System.out.printf("%c", a - 32);
			System.out.println((char)(a - 32));
		} else
			System.out.printf("입력 오류 입니다.");
			
			
//		if (n >= 65 && n <= 90) {
//			n += 32;
//			System.out.println((char)n);
//		} else if (n >= 97 && n <= 122) {
//			n -= 32;
//			System.out.println((char)n);
//		}
//		else {
//			System.out.println("입력 오류 입니다.");
//		}
		}
	}