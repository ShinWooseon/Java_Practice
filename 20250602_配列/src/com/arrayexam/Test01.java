package com.arrayexam;

public class Test01 {

	public static void main(String[] args) {

		float avg = 90.6461111f;
		
		System.out.println(avg);
		System.out.println(avg+0.005);
		System.out.println((avg+0.005)*100);
//		System.out.println(((avg+0.005)*100)/100.f);
		System.out.println((int)((avg+0.005)*100));
		System.out.println((int)((avg+0.005)*100)/100.f);
		
		
	}

}
