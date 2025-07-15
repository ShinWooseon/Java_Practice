package com.loop;

import java.util.*;

public class HomeWorkEx03 {

	public static void main(String[] args) {

		int a, b; // 구구단 변수
		int i; //
		int div; // 정수 입력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		div = sc.nextInt();

		if(div < 2 || div > 9)
			System.out.println("입력 오류");
		else {
		
		for (i = 1; i <= 9 / div + 1 ; i++) {
			for (a = 1; a <= 9; a++) {
				for (b = 2 + div * (i - 1); b <= 2 + div * i - 1 && b <= 9; b++) {
					System.out.printf("%2d * %2d = %2d  ", b, a, a * b);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
}