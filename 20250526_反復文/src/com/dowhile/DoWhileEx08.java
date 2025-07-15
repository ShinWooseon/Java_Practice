package com.dowhile;

/*
 *  문제)
 *  국어, 영어 ,수학 점수를 입력받아 총점과 평균을 구하고,
 *  학점을 판정하는 프로그램을 구현하시오.
 * 
 *  단, do ~ while 문 사용
 *  점수의 범위는 100점을 벗어나지 못함 (벗어나는 경우 재입력 필요)
 *  평균은 소수점 이하 세자리까지 표시하시오.
 * 	
*/

import java.util.*;

public class DoWhileEx08 {

	public static void main(String[] args) {

		int math = 0, eng = 0, kor = 0;
		int sum = 0;
		double avg = 0.0;
		int grade = 0;
		char gr = ' ';

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("수학 점수를 입력하시오. (0~100) : ");
			math = sc.nextInt();

		} while (!(math >= 0 && math <= 100));

		do {

			System.out.print("영어 점수를 입력하시오. (0~100) : ");
			eng = sc.nextInt();

		} while (!(eng >= 0 && eng <= 100));
		do {

			System.out.print("국어 점수를 입력하시오. (0~100) : ");
			kor = sc.nextInt();

		} while (!(kor >= 0 && kor <= 100));

		sum = math + eng + kor;
		avg = (double) sum / 3;

		System.out.print("총점은 " + sum);
		System.out.printf(", 평균은 %.3f", avg);

		grade = (int)(avg / 10);
		
		switch (grade) {
		case 10:
			gr = 'A';
			break;
		case 9:
			gr = 'A';
			break;
		case 8:
			gr = 'B';
			break;
		case 7:
			gr = 'C';
			break;
		case 6:
			gr = 'D';
			break;
		default:
			gr = 'F';
			break;
		}
		System.out.print(", 학점은 "+gr+"입니다.");
		
	}

}
