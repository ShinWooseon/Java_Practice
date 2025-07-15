package com.arraytwo;

/*
 * 2차원 배열 - 다차원 배열
 * 
 * 배열선언 
 * 자료형[][] 배열명;
 * 자료형 배열명[][];
 * 자료형[] 배열명[];
 * 
 * 배열 초기화
 * 배열명 = new 자료형[행][열];
 * 배열명 = new 자료형[행][]; → 가변 배열, 레기드 배열, 비정형 배열
 * 배열명[][] = { {1,2,3,4},  {5,6,7,8}  }
 * 
*/

public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열 선언

		// 배열 선언 및 초기화 값 저장
		int score[][] = {{10,10,10},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}};

		int sum = 0;
		int  j, k;
		
		for (j = 0; j < score.length; j++) {
			for (k = 0; k < score[j].length; k++) {
				System.out.print("test[" + j + "][" + k + "] : " + score[j][k] + "\t");
			}
			System.out.println();
		}
		
		for (int temp[] : score) { // score의 각 요소를 1차원 배열인 temp에 저장
			for (int i : temp) { // 1차원 배열을 가리키는 참조변수
				 sum += i;
			}
		}
		System.out.print(sum+"\t");
	}

}
