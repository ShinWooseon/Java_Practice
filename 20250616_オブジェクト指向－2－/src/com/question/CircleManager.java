package com.question;

import java.util.*;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;

	}

	public void show() {
		// 출력문 작성
		System.out.printf("(%.1f, %.1f)%d\n", x, y, radius);
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Cricle c 배열 크기 설정
		Circle c[] = new Circle[3]; // 대괄호 [] 중괄호 {}
		for (int i = 0; i < c.length; i++) {
//				x 값 입력
//				y 값 입력
//				반지름 입력
//				c[i] = //Circle 객체 생성
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
//			c[i] = new Circle(x, y, radius); // 객체 생성시 인자 정보 입력
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}
	}

}
