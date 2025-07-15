package com.test;

import java.util.Arrays;

public class Exan04 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		char[] arrc = new char[10];
		int[] tmp = new int[arr.length*2];
		
		for (int i= 0 ; i< arr.length ; i++) {
			arr[i] = i;
		}
		for (int i= 0 ; i< arr.length ; i++) {
			tmp[i] = arr[i];
		}
		for (int i= 0 ; i< arrc.length ; i++) {
			arrc[i] = (char)('a'+i);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
		arr = tmp;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(tmp));
		
		
		
		
		char[] arrch = { 'a', 'b', 'c', 'd'};
		System.out.println(arrch);
		System.out.println(Arrays.toString(arrch));
		System.out.println(Arrays.toString(arrc));
		
		
		char[] result = new char[arrch.length+arrc.length];
		System.arraycopy(arrch, 0, result, 0, arrch.length);
		System.arraycopy(arrc, 0, result, arrch.length, arrc.length);
		
		System.out.println(result);
		
	}

}
