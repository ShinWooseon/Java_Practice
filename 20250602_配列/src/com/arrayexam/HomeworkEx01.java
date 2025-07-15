package com.arrayexam;

import java.util.*;

public class HomeworkEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int stuNum; // 학생 수
		int subNum; // 과목 수
		System.out.print("학생 수를 입력하시오 : ");
		stuNum = sc.nextInt();
		sc.nextLine();

		String[] name = new String[stuNum];
		String[][] subject = new String[stuNum][];

		for (int i = 0; i < subject.length ; i++) {
			System.out.print("학생 이름을 입력하시오 : ");
			name[i] = sc.nextLine();
			System.out.print(name[i] + "의 과목 수를 입력 하시오 : ");
			subNum = sc.nextInt();
			sc.nextLine();
			subject[i] = new String[subNum];
			for (int j = 0; j < subNum ; j++) {
				System.out.print(name[i] + " 학생의 " + (j + 1) + "번째 과목명을 입력하시오 : ");
				subject[i][j] = sc.nextLine();
			}
		}

		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < subject[i].length; j++) {
				System.out.println(subject[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
