package com.whileex;

// while 문을 이용하여 구구단 출력


import java.util.*;

public class WhileEx07 {

	public static void main(String[] args) {

		int i = 1, j = 0;
		
		while ( i++ < 9) {
			while ( j++ <9 ) {
				System.out.printf("%d * %d = %2d \n", i, j, i*j);
			}
			j = 0;
		}
	}
}
