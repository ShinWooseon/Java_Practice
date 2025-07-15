package com.question;

class ArrayUtil {


	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i = 0;
		int j = 0;
		for (i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (j = 0; j < b.length; j++) {
			c[i + j] = b[j];
		}
//		System.arraycopy(a, 0, b, 0, 0);
		
		
		return c;
	}

	public static void print(int[] a) {

		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(" ] ");
	}
}
