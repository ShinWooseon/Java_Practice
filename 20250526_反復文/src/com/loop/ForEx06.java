package com.loop;


import java.util.*;


public class ForEx06 {
	public static void main(String[] args) {

		int a, b, c, d;
		int n ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n 값을 입력 : ");
		n = sc.nextInt();
		
		
		for (a = 1; a <= n; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print("*");
			}
			for (c = 1; c <= 2*n - 2 * a; c++) {
				System.out.print("&");
			}
			for (d = 1; d <= a; d++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (a = 1; a <= n-1; a++) {
			for (b = n; b >= a + 1; b--) {
				System.out.print("*");
			}
			for (c = 2*n; c >= (2*n+1) - 2 * a; c--) {
				System.out.print("&");
			}
			for (d = n; d >= a + 1; d--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
