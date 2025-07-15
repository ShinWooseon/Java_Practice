package com.arraytwo;

/*
 * 레기드 배열, 가변 배열, 비정형 배열
 * 상기 단어의 의미는 동일 
 * 
 * 전체 배열의 크기 중 마지막 차수의 길이를 지정하지 않고,
 * 다른 길이의 배열을 생성하는 것을 의미한다.
 * 
 * 즉, 고정형태가 아닌, 보다 유동적인 것을 가변 배열이라고 함
 * 
 * ex)
 * int[][] arr = new int[5][];
 * arr[0] = new int[4];
 * arr[1] = new int[2];
 * arr[2] = new int[3];
 * arr[3] = new int[5];
 * arr[4] = new int[3];
 * arr[x-1] = new int[열별 임의의 행의 크기 y];
 * 	
 * int[][] arr = new int[x][열별 임의의 행의 크기 y];
*/

public class ArrayEx06 {

	public static void main(String[] args) {
		int[][] arr = { 
				{100, 100, 100, 100},
				{70, 70},
				{100, 90, 90},
				{100, 80, 80, 100},
				{100, 60, 60}
		};
		int j, i;
		int sum = 0;
		double avg = 0.0;
		
		for ( i = 0 ; i < arr.length ; i++) {
//			sum = 0;
			for ( j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t"); 
				sum += arr[i][j];
			}
			System.out.println();
			avg =  sum / (double) j ;
			System.out.println("합계는 "+sum);
			System.out.printf("평균은 %.1f ",avg);
			sum = 0;
			System.out.println();
		}
		
		
	}
}
