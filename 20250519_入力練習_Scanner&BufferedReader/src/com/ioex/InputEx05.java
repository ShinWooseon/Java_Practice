package com.ioex;

/*
 * 숫자열(두자리이상) 입력받기
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 
 * String imsi = br.readLine(); --> 문자열로 입력
 * -> 문자열을 숫자열로 바꾸어주는 메소드
 *    Integer.parseInt(imsi);
 *    integer -> Wrapper 클래스 (자료형별로 존재)
 *    
 *    
 *    * 숫자를 문자로 바꾸려면, String.valueOf(imsi); 
 * 
 *    ** Wrapper 클래스 종류
 *    String str = br.readLine();
 *    
 *    byte b = Byte.parseByte(str);
 *    short s = Short.parseShort(str);
 *    int i = Integer.parseInt(str);
 *    long l = Long.parseLong(str);
 *    float f = Float.parseFloat(str);
 *    double d = Double.parseDouble(str);
 * 
*/

import java.io.*;


// 각 과목의 점수를 입력 받으시오. (국어, 영어, 수학)
public class InputEx05 {
	

	public static void main(String[] args) throws IOException {
		int kor, eng, mat;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("국어 점수:");
		kor = Integer.parseInt(br.readLine()); // br.readLine() 자체는 문자열
		
		System.out.println("영어 점수:");
		eng = Integer.parseInt(br.readLine()); 
		
		System.out.println("수학 점수:");
		mat = Integer.parseInt(br.readLine()); 
		
		int sum = kor + eng + mat;
//		float avg = sum/3.0f;
		float avg = sum/(float)3.0;
		
		System.out.println("국어 점수: "+kor);
		System.out.println("영어 점수: "+eng);
		System.out.println("수학 점수: "+mat);
		System.out.println("총점은 : "+sum);
		System.out.println("평균은 : "+avg);
		System.out.printf("평균은 : %.2f", avg);
		System.out.println();
		
		float f;
		System.out.print("실수 입력:");
		f = Float.parseFloat(br.readLine());
		
		
		
	}
}
