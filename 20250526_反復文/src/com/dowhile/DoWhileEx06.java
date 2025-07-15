package com.dowhile;

/* 
 * 문제)
 * 숫자 1부터 계속 더해 나가서 몇까지 더 하면 합이 100을 넘는지를 알아보는
 * 프로그램을 구현 하시오
 * 
*/

public class DoWhileEx06 {

	public static void main(String[] args) {

		int i = 0, sum = 0, cnt = 0;

		while (true) {
			if (sum > 100) {
				break;
			} else {
				sum += i;
				System.out.println(i+"=>"+sum);
				i++;
			}
		}
		System.out.println("i는 "+(i-1)+", sum은 "+sum);
	}
}
