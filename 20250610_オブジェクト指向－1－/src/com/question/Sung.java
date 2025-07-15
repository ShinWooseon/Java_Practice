package com.question;

/*Sung -> 인원수 입력 받는 기능
 * 성적을 처리하는 기능
 * 출력을 처리하는 기능
 * 
 * 속성 : 인원수, Record배열 (객체 배열)
 * 기능 : 인원수 입력 받는 기능
 * 		 이름, 과목 데이터 입력
 * 		 성적을 처리하는 기능
 * 		 결과 출력을 처리하는 기능
 * 
*/

import java.util.*;

public class Sung {

	int stuN;
	Record[] re; // Record 배열(객체배열) 사용
	Scanner sc = new Scanner(System.in);

	// 기능 (메소드)
	// 1. 인원수 입력
	public void set() { // 인원수 제약 ~100명까지
		do {
			System.out.print("인원 수 입력(~100) : ");
			stuN = sc.nextInt();
		} while (stuN < 1 || stuN > 100);

		// Record 클래스의 배열 변수를 인원수stuN 만큼 생성한 것이다.
		// 그러나, 인스턴스를 생성한 것은 아니다.
		re = new Record[stuN]; // 배열의 크기만 선언

	}

	public void input() {
		String[] title = { "국어점수", "영어점수", "수학점수" };
		for (int i = 0; i < stuN; i++) {
			re[i] = new Record(); //
			System.out.print((i + 1) + "번째 이름 : ");
			re[i].name = sc.next();

			for (int j = 0; j < title.length; j++) {
				// 안내 메시지 출력
				System.out.print(title[j] + " : ");
				re[i].score[j] = sc.nextInt();
				re[i].sum += re[i].score[j];
			}
			System.out.println();
			re[i].avg = re[i].sum / title.length;
		}
	}

	// 3. 석차 계산
	public void ranking() {
		int i, j;
		// 석차 초기화
		for (i = 0; i < stuN; i++) {
			re[i].rank = 1;
		}

//		for ( i = 0 ; i < stuN-1 ; i++) {
//			for (j = 0 ; j < re[i].length ; j++) {
//				if ( re[i].sum < re[j].sum){
//					re[j].rank++;
//		}
//			}
//		}
		for (i = 0; i < stuN - 1; i++)

		{
			for (j = i + 1; j < stuN; j++) {
				if (re[i].sum > re[j].sum) {
					re[j].rank++;
				} else if (re[i].sum < re[j].sum) {
					re[i].rank++;
				}
			}
		}

	}

	// 4. 결과출력 (석차를 포함한 결과)
	public void print() {
		for (int i = 0; i < stuN; i++) {
			System.out.println(re[i].name + "성적은 : " + re[i].rank);
		}

	}

}
