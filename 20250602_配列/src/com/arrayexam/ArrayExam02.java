package com.arrayexam;
/*
 * 문제)
 * 한명의 학생에 대해서, 성적처리 프로그램을 구현하시오.
 * 과목명1~~~~~~~~ 과목명n과 같이 함. (모르는 수)
 * 
*/

import java.io.*;

public class ArrayExam02 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (args.length == 0) {
			System.out.println("배열에 저장된 값이 없습니다.");
			System.exit(0);
		} // args.

		String[] name = new String[3];
		String[][] subject = new String[name.length][args.length+1];
		int[][] score = new int[name.length][args.length+1];

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 : ");
			name[i] = br.readLine();

			for (int j = 0; j < args.length; j++) {
				subject[i][j] = args[j];
			}
			
			for (int k = 0 ; k < subject.length ; k++) {
				System.out.print(name[i]+" 학생의 "+subject[i][k]+"점수를 입력 하시오 : ");
				score[i][k] = Integer.parseInt(br.readLine());
			}

		}

		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < subject[i].length-1; j++) {
				System.out.println(score[i][j]);
			}
		}
	}
}

//		int [] score = new int[subject.length+1]; //배열의 크기 +1
//		// 0 : 국어, 1: 영어, 2: 수학, 3: 총점
//		
//		for (int i = 0 ; i < score.length-1 ; i++) {
//			System.out.print(subject[i] + "의 점수를 입력하시오.");
//			score[i] = Integer.parseInt(br.readLine());
//			score[score.length-1] += score[i];
//		}
//		float avg = score[score.length-1] / (float)subject.length;
////		avg = (int) ((avg+0.005f)*100)/100.f; // 반올림 처리 식 분자 분모의 자릿수를 전체 변경함에 따라 반올림 처리
////		avg = (int) ((avg+0.0005)*1000)/1000.f; // 반올림 처리 식 분자 분모의 자릿수를 전체 변경함에 따라 반올림 처리
////		avg = (int) ((avg+0.005)*100)/100.f; // 반올림 처리 식
//		
//		System.out.println(name+"의 총점은 "+score[score.length-1]+"입니다.");
//		System.out.printf("%s의 평균은 %.3f 입니다.", name, avg);
////		System.out.println(avg);
//		
//		
