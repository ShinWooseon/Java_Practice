package com.whileex;

/*
 * 문제)
 * I can do it 5번 출력
 * i의 값이 0이 아닌동안 출력
 * 
 * 5 4 3 2 1 0
 * 
 * 
*/

import java.util.*;

public class WhileEx03 {
public static void main(String[] args) throws InterruptedException {
	
	Scanner sc = new Scanner(System.in);
	
	int i = 11;
	
	while ( i-- !=0 ) {
		
//		System.out.println(i +" I can do it");
		System.out.println(i);
//		i--;
		Thread.sleep(1000);
//			try {
//				Thread.sleep(1000);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
		}
		if ( i == 0) {
			System.out.println("Game Over~~~");
		}
	}
	}
