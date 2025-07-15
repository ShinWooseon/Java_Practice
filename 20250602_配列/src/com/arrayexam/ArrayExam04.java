package com.arrayexam;
/* 문제)
 * 가변 배열을 이용하여 학생마다 과목명을 다르게 하여 성적 처리하는 프로그램을 구현하시오.
*/

import java.io.*;

public class ArrayExam04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 수를 입력 하시오 : ");
		int human = Integer.parseInt(br.readLine()); // 사람수

		String[] name = new String[human]; // 이름을 저장할 공간
		String[][] subject = new String[human][]; // 과목명 2차원 레기드 배열

		// 정수와 총점 처리 배열을 선언
		int[][] score = new int[human][];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

		// 과목명을 subject 배열에 저장
		for (int i = 0; i < human; i++) {
			System.out.print((i + 1) + "번째 학생 이름을 입력하시오 : ");
			name[i] = br.readLine();
			System.out.print(name[i] + " 학생의 과목 수를 입력 하시오 : ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];
			score[i] = new int[imsi + 1];
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print((j + 1) + "번 째 과목 명을 입력 하시오 : ");
				subject[i][j] = br.readLine();
			}
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + " 점수를 입력 하시오 : ");
				score[i][j] = Integer.parseInt(br.readLine());
				score[i][score[i].length - 1] += score[i][j];
			}
		}

////		 subject 배열 확인
//		for (int i = 0; i < subject.length; i++) {
//			System.out.println(subject[i]);
//		}

		// 사람 수 만큼 학생 이름 입력 받고, 학생별 점수 입력 받고, 학생별 총점을 구한다.
//		
//		for (int i = 0; i < human; i++) {
//		for (int j = 0; j < subject.length; j++) {
//			System.out.print(score[i][j]);
//		}
//		System.out.print(score[i][score[i].length-1]);
//	}

		for (int i = 0; i < human; i++) {
			avg[i] = score[i][score[i].length - 1] / (float) (subject[i].length);
//			avg[i] = score[i][score[i].length - 1] / (subject.length);
//			avg[i] = (int) ((avg[i] + 0.05f) * 10) / 10.f;
		}

		for (int i = 0; i < human; i++) {
			switch ((int) (avg[i] / 10)) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
				break;
			}
		}

		for (int i = 0; i < human; i++) {
			rank[i] = 1;
			for (int j = 0; j < human; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}

		// 여기까지가 이름 입력 받고, 과목별 점수 입력 받고, 총정 구하고, 평균 구하고
		// 학점구하고, 석차깢 ㅣ께산 완료

		// 모든 결과 출력
		for (int i = 0; i < human; i++) {
			System.out.println("\t----" + name[i] + " 학생 성적표 출력 ----------");
			System.out.print("이 름\t");
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");
			}
			System.out.print("총점\t평균\t학점\t석차\n");
			System.out.print(name[i] + "\t");
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(score[i][score[i].length - 1] + "\t");
			System.out.printf("%.1f\t", avg[i]);
//			System.out.print(avg[i] + "\t");
			System.out.print(grade[i] + "\t");
			System.out.println(rank[i]);
		}
	}
}
