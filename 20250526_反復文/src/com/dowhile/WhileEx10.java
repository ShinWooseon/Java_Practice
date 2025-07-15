package com.dowhile;

/*
 * 문제)
 * 메뉴를 누르지 않으면 재반복
 * 0을 누르면 벗어남
 * 
*/

import java.util.*;

public class WhileEx10 {

	public static void main(String[] args) {

		int menu = 0, num = 0; // while 문으로 while 밖에 초기화

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println(" 1 : 아메리카노 ");
			System.out.println(" 2 : 카페라떼 ");
			System.out.println(" 3 : 믹스커피");

			System.out.print("메뉴를 골라 주시오 (1~3) (종료:0) => ");
			menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("프로그램을 종료 합니다.");
				return;
			} else if (!(menu >= 1 && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
		}
	}
}
