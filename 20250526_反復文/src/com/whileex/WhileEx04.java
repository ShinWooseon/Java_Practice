package com.whileex;

/*
 * 문제)
 * 1부터 몇까지 더하면 누적합계를 100을 넘지 않은지 n까지의 수와 합계를 출력하시오.
 * 
*/

import java.util.*;

public class WhileEx04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0; // 합계
		int cnt = 0; // 누적 수

		// (sum += ++cnt) <= 100
		while ( (sum += ++cnt) <= 100 ) {
//			System.out.println(sum);
//			System.out.println(cnt);
			System.out.printf("%2d => %2d \n", cnt, sum);
		}
	}
}
