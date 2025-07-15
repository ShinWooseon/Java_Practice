package com.loop;

import java.util.*;

public class Ex06_05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i; 
		int sum = 0;
		int num1, num2, num3;

		System.out.print(" 초깃값 : ");
		num1 = sc.nextInt();
		System.out.print(" 몇까지 합산 할 것인가 : ");
		num2 = sc.nextInt();
		System.out.print(" 증가값 : ");
		num3 = sc.nextInt();
		
		for (i = num1; i<=num2 ; i+=num3) {
			sum += i;
		}
		System.out.println(sum);
	}

}
