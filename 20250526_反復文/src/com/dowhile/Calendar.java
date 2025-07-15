package com.dowhile;

import java.util.*;

public class Calendar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j, year, month, date = 0;
		int totalDate = 0;
		int cnt = 0;

		System.out.print("년을 입력하시오 : "); // 윤년 366 평년 365
		year = sc.nextInt();

		System.out.print("월을 입력하시오 : ");
		month = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			totalDate = 366;
		} else {
			totalDate = 355;
		}

		switch (month) {
		case 1: {
			date = 31;
			break;
		}
		case 2: { // 윤달 평달 조건
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				date = 29;
				System.out.println("윤년");
			} else {
				date = 28;
				System.out.println("평년");
			}
			break;
		}
		case 3: {
			date = 31;
			break;
		}
		case 4: {
			date = 30;
			break;
		}
		case 5: {
			date = 31;
			break;
		}
		case 6: {
			date = 30;
			break;
		}
		case 7: {
			date = 31;
			break;
		}
		case 8: {
			date = 31;
			break;
		}
		case 9: {
			date = 30;
			break;
		}
		case 10: {
			date = 31;
			break;
		}
		case 11: {
			date = 30;
			break;
		}
		case 12: {
			date = 31;
			break;
		}
		default: {
			System.out.println("1~12 사이에서 입력 해 주십시오.");
			;
			break;
		}
		}

		System.out.println("월\t화\t수\t목\t금\t토\t일");
		// 월에 맞는 시작 지점 변경 필요
		for (i = 0; i <= 4; i++) {
			for (j = 1 + i * 7 ; j <= 7 + i * 7 - cnt && j <= date; j++) {
				if (year == 2025 && month == 1) {
					if ((j == 1 && i == 0) || (j == 2 && i == 0)) {
					System.out.print("\t");
					cnt++;
				}
					cnt = 0;
					System.out.printf("%2d\t", j);
				}
			}
			System.out.println();
		}
	}
}
