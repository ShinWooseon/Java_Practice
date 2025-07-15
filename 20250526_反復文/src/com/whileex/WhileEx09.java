package com.whileex;


import java.util.*;

public class WhileEx09 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		myLabel: for(;;) {
			for(i = 1; i <= 100; i++) {
				sum += i;
				if (sum > 100) {
					System.out.printf("%d\n", sum);
					sum = 0;
//					break ;
					break myLabel;
				}
			}
			System.out.println("반복");
		}
		
		
	}
}
