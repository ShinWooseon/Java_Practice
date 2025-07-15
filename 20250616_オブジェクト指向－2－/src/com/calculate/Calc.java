package com.calculate;

import java.util.*;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		char c;

		do {
			System.out.print("두 정수와 연산자 입력 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.next().charAt(0);

			Add add = new Add();
			Div div = new Div();
			Mul mul = new Mul();
			Sub sub = new Sub();

			switch (c) {
			case '+': {
				add.setValue(a, b);
				System.out.println("계산 결과 : " + add.calculate());
				break;
			}
			case '-': {
				sub.setValue(a, b);
				System.out.println("계산 결과 : " + sub.calculate());
				break;
			}
			case '*': {
				mul.setValue(a, b);
				System.out.println("계산 결과 : " + mul.calculate());
				break;
			}
			case '/': {
				div.setValue(a, b);
				System.out.println("계산 결과 : " + div.calculate());
				break;
			}
			default :{
				System.out.println("잘못된 연산자 입니다.");
				break;
			}
			}
			System.out.println();
		} while (c != '0');
		System.out.println("프로그램 종료");
	}
}
