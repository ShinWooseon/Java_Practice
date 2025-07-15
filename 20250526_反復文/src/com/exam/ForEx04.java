package com.exam;

import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int div;

		System.out.print("정수 입력 (4의 배수): ");
		num = sc.nextInt();

		div = num / 4;

		for (int i = div; i >= 0; i--) {
			if (i == 0) {
				System.out.println("int");
			} else {
				System.out.print("long ");
			}
		}
		sc.close();
	}
}
