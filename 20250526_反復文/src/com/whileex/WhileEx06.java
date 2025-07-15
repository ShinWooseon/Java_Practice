package com.whileex;

/*
 * 사용자로 부터 반복해서 숫자를 입력 받다가 0을 입력하면 끝마치고,
 * 합계를 출력하는 프로그램
 * 
 * 무한 반복
 * 
 * 단, braek 문을 사용하지 않고 멈추는 방법
 * 
*/

import java.util.*;

public class WhileEx06 {
//	public static void main(String[] args) throws IOException {
	public static void main(String[] args) {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("계속 진행 하시겠습니까? (y/n) : ");
			char ch = sc.next().charAt(0);

			if (ch == 'n' || ch == 'N') {
				System.out.println("프로그램을 종료 합니다.");
				break; // 종료의 종류 // 서버 측에서는 return 문을 자주 사용
//				return;
//				System.exit(0); 
			}
		}
	}
}
