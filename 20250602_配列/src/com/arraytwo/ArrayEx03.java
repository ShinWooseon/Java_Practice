package com.arraytwo;

/*
 * 문제)
 * 다차원 배열을 활용하여 아래와 같이 출력되도록 프로그래밍 하시오.
 * 
 * -----------------------------------------------
 * 번호		국어		영어		수학		총점		평균
 * -----------------------------------------------
 * 1		100		100		100		300		100.0
 * 2		20		20		20		60		20.0
 * 3		30		30		30		90		30.0
 * 4		40		40		40		120		40.0
 * 5		50		50		50		150		50.0
 *총점		240		240		240		 
*/

public class ArrayEx03 {

	public static void main(String[] args) {

		int score[][] = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };

		int i, j;
		int sum = 0;
		int korTot = 0, engTot = 0, mathTot = 0;
		double avg = 0.0;

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("번호		국어		영어		수학		총점		평균    ");
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		for (i = 0; i < score.length; i++) {
			korTot += score[i][0];
			engTot += score[i][1];
			mathTot += score[i][2];
			System.out.print((i + 1) + "\t\t");
			for (j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t\t");
			}
			avg = sum / (double)score[i].length;
			System.out.printf("%d\t\t%.1f\t\t\n", sum, avg);
			sum = 0;
		}
		System.out.printf("총점\t\t %d\t\t%d\t\t%d", korTot, engTot, mathTot);

	}
}
