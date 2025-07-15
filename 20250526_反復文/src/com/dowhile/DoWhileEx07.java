package com.dowhile;

/* 
 * continue 문은 반복이 진행 되는 도중에 continue문을 만나면 반복문을 끝으로
 * 이동하여 다음 반복을 계속 진행함
 * 
 * 문제)
 * 1과 10 사이의 숫자를 출력하되, 3의 배수인 것은 제외로 한다.
 * 
*/

public class DoWhileEx07 {

	public static void main(String[] args) {

		int i = 1, sum = 0;

		for (i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);

	}

}
