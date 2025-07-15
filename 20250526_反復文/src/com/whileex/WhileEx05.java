package com.whileex;

/*
 * 문제)
 * 사용자로 부터 반복해서 숫자를 입력 받다가 0을 입력하면 끝마치고,
 * 합계를 출력하는 프로그램
 * 
 * 무한 반복
 * 
 * 단, braek 문을 사용하지 않고 멈추는 방법
 * 
*/

import java.util.*;

public class WhileEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, sum = 0;
		boolean flag = true;

		while (flag) {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();

			if (n != 0) {
				sum += n;
			} else if (n == 0) {
				flag = false; // break를 쓰지 않고 boolean flag 변수를 false로 변경하여 종료(sum += ++cnt) <= 100
			}
		}
		System.out.printf("합계 출력 : %d", sum);
	}
}
