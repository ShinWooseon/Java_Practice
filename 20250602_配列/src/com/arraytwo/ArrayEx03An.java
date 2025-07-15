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

import java.util.*;

public class ArrayEx03An {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[][];
		array = new int[5][3]; // [] [] 개수 입력

		int i, j;
		int sum = 0;
		int subsum = 0;
		double avg = 0.0;

		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.print((i + 1) + "번째 학생의 국어, 영어, 수학 점수를 차례대로 입력하시오 : ");
				array[i][j] = sc.nextInt();
			}
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("번호		국어		영어		수학		총점		평균    ");
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		for (i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "\t\t");
			for (j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				System.out.print(array[i][j] + "\t\t");
//			System.out.print(
//					array[i][0] + "\t\t" + array[i][1] + "\t\t" + array[i][2] + "\t\t" + sum + "\t\t" + avg + "\n");
			}
			avg =  sum / j;
			System.out.printf("%d\t\t%.1f\t\t\n", sum, avg);
//			System.out.print(sum+"\t\t");
//			System.out.print(avg+"\t\t");
//			System.out.println();
			sum = 0;
		}

		System.out.print("총점\t\t");
		for (j = 0; j < 3; j++) {
			for (i = 0; i < 4; i++) {
				subsum += array[i][j];
			}
			System.out.print(subsum + "\t\t");
			subsum = 0;
		}
		
		
//		for (int temp[] : array) {
//			for (int k : temp) {
//				
//			}
		
	}
}
