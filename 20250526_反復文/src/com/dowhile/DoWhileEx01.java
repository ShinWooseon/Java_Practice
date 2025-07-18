package com.dowhile;

/*
 * 난수를 이용하여 1과 100 사이의 임의의 수를 변수에 저장하고,
 * 이 값을 맞출 때 까지 반복하는 프로그램을 구현하시오. 
 * 
 * 사용자가 입력한 값을 변수 input,
 * 난수는 answer 변수에 저장
 * 
 * 두 값을 비교해서 같으면 반복문을 종료
 * 
 * 
*/

import java.util.*; // Scanner, Math.random

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = 0, answer = 0;
//		int cnt = 0;
		// 1과 100 사이의 정수를 추출

		answer = (int) (Math.random() * 100) + 1;
		
//		System.out.print(" 1과 100 사이에 정수 입력 : ");
//		input = sc.nextInt();

		do {
//			answer = (int) (Math.random() * 100) + 1;
//			cnt++;
//			System.out.println(cnt);
			
			System.out.print(" 1과 100 사이에 정수 입력 : ");
			input = sc.nextInt();
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");

			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}

		} while (input != answer);
		System.out.println(input + "값과 " + answer + "값이 같습니다");
		System.out.println("정답입니다");

	}
}
