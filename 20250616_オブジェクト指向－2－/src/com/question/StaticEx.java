package com.question;

public class StaticEx {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 7 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}
