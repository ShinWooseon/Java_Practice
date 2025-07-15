package com.loop;

/*
 * 문제 
 * A~Z
 * 행마다 역 피라미드 양측 삭제
 * 
*/
public class ForEx11 {

	public static void main(String[] args) {

		char end = 'Z';
		char ch1, ch2;
		int i = 0;

		for	(char a = 'A' ; a <= 'Z' ; a++ ) {
			for ( int c  = 0 ; c <= a-65 ; c++) {
				System.out.print(" ");
			}	
			for (int b = a ; b <= 'Z'-(a-65) ; b++) {
				System.out.print((char)b);
				}
			System.out.println();
			}
	}
}
