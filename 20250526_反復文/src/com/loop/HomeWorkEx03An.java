package com.loop;

import java.util.*;

public class HomeWorkEx03An {

	public static void main(String[] args) {
		
		int i, j, k;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("단 입력 : ");
		int n = sc.nextInt();
		
		for ( i = 1 ; i < 9; i+=n) {
			for ( j = 1 ; j <= 9 ; j++) {
				for ( k = 1 ; k <= n; k++) {
					if (i+k <=9 )
//					System.out.printf("%d * %d = %2d\t", j, i, (i*j));
					System.out.printf("%d * %d = %2d\t", i+k, j, (i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}