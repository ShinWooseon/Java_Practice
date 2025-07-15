package com.test;

public class Exam03 {
	public static void main(String[] args) {

		A: for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break A;
			}
		}

	}
}
