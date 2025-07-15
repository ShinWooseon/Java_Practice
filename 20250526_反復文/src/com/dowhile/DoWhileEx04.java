package com.dowhile;

public class DoWhileEx04 {

	public static void main(String[] args) {

		char al = 'a';
		
		do {
			System.out.print(al);
			al = (char)(al+1);
			
		} while ( al <= 'z');
			
		}

}
