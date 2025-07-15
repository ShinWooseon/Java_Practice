package com.loop;

public class ForEx08 {

	public static void main(String[] args) {
		
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
		}
			System.out.println();
		for(int i = 65 ; i <= 90 ; i++ )
			System.out.printf("%c", i);
		
		System.out.println();
		
		for (char ch = 'A' ; ch <='Z' ; ch++) {
			for (char br = ch ; br <='Z' ; br++ ) {
				System.out.print(br);
			}
			System.out.println();
		}
		
		
	}

}
