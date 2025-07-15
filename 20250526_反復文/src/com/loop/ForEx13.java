package com.loop;

import java.util.*;

public class ForEx13 {

	public static void main(String[] args) {
		int wid, hei, a, b;

		Scanner sc = new Scanner(System.in);

		System.out.print("넓이 입력 : ");
		wid = sc.nextInt();

		System.out.print("높이 입력 : ");
		hei = sc.nextInt();

		for (a = 0; a <= hei - 1; a++) {
			for (b = 0; b <= wid - 1; b++) {
				if ((a == 0 || a == (hei-1)) || (b == 0 || b == (wid - 1)) ) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
