package com.loop;

/*
 * 문제)
 * 다음과 같이 중첩 for문을 이용하여,
 * 
 * 					0
 * 				   101
 *	 	          21012
 *               3210123
 * 					
*/

//				Math.abs(i)

import java.util.*;

public class ForEx10an {

	public static void main(String[] args) {

		int i, j;
		final int num = 8;

		for (i = 0; i <= num; i++) {
			for (j = num; j >= -num; j--) {
				if (Math.abs(j) > i) // Math.abs가 위 아아래 둘다 들어가야 하는 이유 생각
//				if (j > i) // Math.abs가 위 아아래 둘다 들어가야 하는 이유 생각
					System.out.print(' ');
				else
					System.out.print(Math.abs(j));
//					System.out.print(j);
			}
			System.out.println();
		}
	}

}
