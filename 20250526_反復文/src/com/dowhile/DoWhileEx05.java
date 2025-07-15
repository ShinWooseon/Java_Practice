package com.dowhile;

/* do while 문
  *****
  ****
  ***
  **
  *
  *****
  ****
  ***
  **
  *
  */

public class DoWhileEx05 {
	public static void main(String[] args) {
		int i = 1, j = 5;
		do {
			do {
				System.out.print("*");
				i++;
			} while (i <= j);
			System.out.println();
			j--;
			i = 1;

		} while (j >= 1);
		
		i = 1;
		j = 5;
		do {
			do {
				System.out.print("*");
				i++;
			} while (i <= j);
			System.out.println();
			j--;
			i = 1;

		} while (j >= 1);
	}

}
