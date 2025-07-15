package com.loop;

import java.util.*;

public class Ex06_04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int begin, end, temp, i;
		int total = 0;

		System.out.print("시작 값 : ");
		begin = sc.nextInt();

		System.out.print(" 끝 값 : ");
		end = sc.nextInt();

		if (begin > end) {
			temp = begin;
			begin = end;
			end = temp;
		}

		for (i = begin ; i <= end; i++) {
			total += i;

		}
		System.out.println(total);
	}

	
}
