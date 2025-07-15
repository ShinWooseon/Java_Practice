package com.ioex;

import java.io.*;

public class InputEx02 {

	// 문자 한개 입출력
	
	public static void main(String[] args) throws IOException {
//		public static void main(String[] args)  {
		System.out.printf("문자 입력:");
		char ch = (char)System.in.read(); // 아스키코드 값 제공
		// 우변 (char) 강제 형변환
		// throws 메소드 사용
		// 문자 하나를 입력받아 출력
		System.out.println(ch);
		
	}
}
