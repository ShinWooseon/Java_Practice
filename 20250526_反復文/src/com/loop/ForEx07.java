package com.loop;

public class ForEx07 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					System.out.printf("[%d, %d]", i, j);
				} else {
					System.out.print("[    ]");
				}
			}
			System.out.println();
		}
	}
}
