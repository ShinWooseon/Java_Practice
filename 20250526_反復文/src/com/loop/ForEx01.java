package com.loop;

/*
 * 문제)
 * 1부터 10까지의 합계를 구현하는 프로그램을 구현하시오.
 * 
*/

public class ForEx01 {
	public static void main(String[] args) {
		int i;
		int sum = 1;

//		for (i = 0; i < 100; i++) {
//			System.out.println("I can do it " + (i + 1));
//		}
//		
//		System.out.println();
//		for(i=10 ; i>0; i--)
//			System.out.print(i+"\t");
//		
//		System.out.println();
//		for(i=1 ; i<=10; i+=2)
//			System.out.print(i+"\t");
//		
//		System.out.println();
//		for(i=1 ; i<=10; i+=3)
//			System.out.print(i+"\t");
//		
		System.out.println();
		for(i=1 ; i<=7; i++) {
			sum = sum * i;
			System.out.print(sum+"\t");
			
		}
		
		
	}

}
