package com.arraytwo;

/*
 * 문제)
 * 과목별 점수를 입력 받아 총점과 평균
 * 배열로
*/

import java.io.*;

public class ArrayEx05 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어점수", "영어점수", "수학점수" };
		int i, j;
		int num;
		
		System.out.print("학생 수를 입력 하시오 : ");
		num = Integer.parseInt(br.readLine());
		
		int sub[][] = new int[num][subname.length + 1];
		// sub[0] : 국어점수, sub[1] : 영어점수, sub[2] : 수학점수, sub[3] : 총점 ;
		// 0 : 첫번째 사람, 1 : 두번째 사람, 2 : 세번째 사람
		float[] avg = new float [num];
		
		
		for (i = 0; i < sub.length ; i++) {
		for (j = 0; j < sub[i].length - 1; j++) {
			do {
				System.out.print((i+1)+"번째 학생의 "+subname[j] + " : ");
				sub[i][j] = Integer.parseInt(br.readLine());
				// 각 과목별 점수 입력
			} while (sub[i][j] < 0 || sub[i][j] > 100);
			// 입력 받은 과목의 총점을 구함
			sub[i][sub[i].length - 1] += sub[i][j];
		} // end for(j)
		avg[i] = sub[i][sub[i].length-1] / (float)subname.length;
	} // end for(i)
	
	for (int k = 0 ; k < sub.length ; k++) {
		System.out.print((k+1)+"번째 총점 : "+sub[k][sub[k].length-1]+" 입니다.\t");
		System.out.println((k+1)+"번째 평균은 : "+avg[k]+" 입니다.");
		
	}
	}
}


