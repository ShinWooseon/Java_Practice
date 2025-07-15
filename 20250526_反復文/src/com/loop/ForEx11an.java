package com.loop;

/*
 * 문제 
 * A~Z
 * 행마다 역 피라미드 양측 삭제
 * 
*/
public class ForEx11an {

	public static void main(String[] args) {

		char end = 'Z';
		char ch1, ch2;
		int i = 0;

//		for	(char ch1 = 'A' ; ch1 <= end && i <= ('Z'-'A')/2 ; ch1++ , i++) {
//			for ( char ch2 = 'A' ; ch2 <= ch1 ; ch2++) {
//				System.out.print(' ');
//			}	
//			for (char ch2 = ch1 ; ch2 <= (end-ch1)+'A' ; ch2++) {
//				System.out.print(ch2);
//				}
//			System.out.println();
//			}
		for (ch1 = 'A'; ch1 <= end && i <= ('Z' - 'A') / 2; ch1++, i++) {
			for (ch2 = 'A'; ch2 <= (end - ch1) + 'A'; ch2++) {
				if (ch2 < ch1) {
					System.out.print(' ');
				} else {
					System.out.print(ch2);
				}
			}
			System.out.println();
		}
	}
}
