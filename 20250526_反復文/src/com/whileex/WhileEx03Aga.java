package com.whileex;

/*
 * 문제)
 * I can do it 5번 출력
 * i의 값이 0이 아닌동안 출력
 * 
 * 5 4 3 2 1 0
 * 
 * 
*/

import java.util.*;

public class WhileEx03Aga {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		int i = 11;
		char que = ' ';

		while (true) {
			i--;
			System.out.println(i);
			Thread.sleep(500);
			
			if (i == 0) {
				System.out.println("Game Over~~~");
				System.out.print("게임을 재시작 하시겠습니까(y/n) : ");
				que = sc.next().charAt(0);
				if (que == 'n') {
					break;
				} else {
					i = 11;
				}
			}
		}
	}
}
