package com.arrayexam;
/*
 * 문제)
 * 한명의 학생에 대해서, 성적처리 프로그램을 구현하시오.
 * 과목명1~~~~~~~~ 과목명n과 같이 함. (모르는 수)
 * 
*/

import java.io.*;

public class ArrayExam01 {

	public static void main(String[] ar) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (ar.length == 0) {
			System.out.println("배열에 저장된 값이 없습니다.");
			System.exit(0);
		} // args.

//		String[] name = new String[3];
//		
//		for (int i = 0 ; i < name.length; i++) {
//		System.out.print("이름 : ");
//		name[i] = br.readLine();
//		}

		System.out.print("이름 : ");
		String name = br.readLine();

		String[] subject = new String[ar.length];

		for (int i = 0; i < ar.length; i++) {
			subject[i] = ar[i];
		}
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + "의 점수를 입력하시오.\n");
//		}

		int[] score = new int[subject.length + 1]; // 배열의 크기 +1
		// 0 : 국어, 1: 영어, 2: 수학, 3: 총점

		for (int i = 0; i < score.length - 1; i++) {
			System.out.print(subject[i] + "의 점수를 입력하시오 : ");
			score[i] = Integer.parseInt(br.readLine());
			score[score.length - 1] += score[i];
		}
		float avg = score[score.length - 1] / (float) subject.length;
//		avg = (int) ((avg+0.005f)*100)/100.f; // 반올림 처리 식 분자 분모의 자릿수를 전체 변경함에 따라 반올림 처리
//		avg = (int) ((avg+0.0005)*1000)/1000.f; // 반올림 처리 식 분자 분모의 자릿수를 전체 변경함에 따라 반올림 처리
//		avg = (int) ((avg+0.005)*100)/100.f; // 반올림 처리 식

//		System.out.println(name + "의 총점은 " + score[score.length - 1] + "입니다.");
//		System.out.printf("%s의 평균은 %.2f 입니다.\n", name, avg);
//		System.out.println(avg);

		char grade = 0;
		switch ((int) (avg / 10)) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println();
		System.out.println("********************** 성적서 ***********************");
		System.out.print("이름\t");
		
		for(int i = 0; i < subject.length ; i++) {
			System.out.print(subject[i]+"\t");
		}

		System.out.println("총점\t평균\t학점");
		System.out.print(name+"\t");
		
		for(int i = 0; i < subject.length ; i++) {
			System.out.print(score[i]+"\t");
		}
		
		System.out.print(score[score.length-1]+"\t"+avg+"\t"+grade);
	
		
	}

}
