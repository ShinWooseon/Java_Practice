package com.ioex;

// Scanner 사용시 throws IOException이 불필요해짐

import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		int kor, eng, mat;
		
		// 버퍼 객체 생성 불필요
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수는: ");
		kor = sc.nextInt();
		System.out.print("영어 점수는: ");
		eng = sc.nextInt();
		System.out.print("수학 점수는: ");
		mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		float avg = sum/(float)3.0;
		
		System.out.println("국어 점수: "+kor);
		System.out.println("영어 점수: "+eng);
		System.out.println("수학 점수: "+mat);
		System.out.println("총점은 : "+sum);
		System.out.println("평균은 : "+avg);
		
		
		
	}
}
