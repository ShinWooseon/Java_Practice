package com.arraytwo;

/*
 * 문제)
 * 과목별 점수를 입력 받아 총점과 평균
 * 배열로
*/

import java.io.*;

public class ArrayEx04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어점수", "영어점수", "수학점수" };
		int num, j, i;
//		sub[0] : 국어점수, sub[1] : 영어점수, sub[2] : 수학점수, sub[3] : 총점 ;

		System.out.print("학생 수를 입력 하시오 : ");
		num = Integer.parseInt(br.readLine());

		int sub[][] = new int[num][subname.length + 1];
		float avg[] = new float[num];

		for (j = 0; j < sub.length; j++) {
			for (i = 0; i < sub[j].length - 1; i++) {
				do {
					System.out.print(subname[i] + " : ");
					sub[j][i] = Integer.parseInt(br.readLine());
					// 각 과목별 점수 입력
				} while (sub[j][i] < 0 || sub[j][i] > 100);
				// 입력 받은 과목의 총점을 구함
				sub[j][sub[j].length - 1] += sub[j][i];
			}
			avg[j] = sub[j][sub[j].length - 1] / (float) subname.length;
		}

		for (int k = 0; k < sub.length; k++) {
			System.out.print((k + 1) + "번째 총점 : " + sub[k][sub[k].length - 1] + " 입니다.\t");
			System.out.println((k + 1) + "번째 평균은 : " + avg[k] + " 입니다.");

		}
	}
}
