package com.functionex;

/* 문제1)
 * 1번을 누르면 두 수를 입력 받아 그 중 큰 수를 출력하는 기능
 * 2번을 누르면 두 수를 입력 받아 두 수 사이의 합계를 구하는 기능
 * 3번을 누르면 세 개의 정수를 입력 받아 큰 순서 대로 나열하는 프로그램 구현
 * 4번을 누르면 종료
 * 
*/

import java.io.*;

public class FuncExam01 {

	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 수 입력 :");
		int a = Integer.parseInt(br.readLine());

		System.out.print("두번째 수 입력 :");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 수 입력 :");
		int a = Integer.parseInt(br.readLine());

		System.out.print("두번째 수 입력 :");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		int sum = 0;
		int i = 0;
		int c = a;
		
		for (i = a ; a <= b; a++) {
			sum += a;
		}
		System.out.println(c + " ~ " + b + " 사이의 합계 : " + sum);

	}

	public static String ccc(int x, int y, int z) {
		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}
		if (x < z) {
			int temp = x;
			x = z;
			z = temp;
		}
		if (y < z) {
			int temp = y;
			y = z;
			z = temp;
		}
//		if (y >= x && y >= z) {
//			int temp = x;
//			x = y;
//			y = temp;
//		} else if (z >= x && z >= y) {
//			int temp = x;
//			x = z;
//			z = temp;
//		}
//		if (z >= y) {
//			int temp = y;
//			z = y;
//			y = temp;
//		}
		String abc = x + ">=" + y + ">=" + z;
		return abc;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;

		do {
			System.out.print("숫자 입력(1~4) : ");
			x = Integer.parseInt(br.readLine());

			switch (x) {
			case 1: {
				System.out.println("둘중 최대수는 " + aaa() + "입니다.");
				break;
			}
			case 2: {
				bbb();
				break;
			}
			case 3: {
				System.out.print("첫번째 수 : ");
				int firstSu = Integer.parseInt(br.readLine());

				System.out.print("두번째 수 : ");
				int secondSu = Integer.parseInt(br.readLine());

				System.out.print("세번째 수 : ");
				int thirdSu = Integer.parseInt(br.readLine());

				String str = ccc(firstSu, secondSu, thirdSu);
				System.out.println("큰 순으로 나열은" + str);
				break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				break;
			}
			default: {
				System.out.println("1~3사이의 숫자를 입력하시오");
				break;
			}
			}
		} while (x != 4);
	}
}
