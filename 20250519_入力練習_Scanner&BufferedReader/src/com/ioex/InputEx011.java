package com.ioex;

import java.io.*;

// import는 만들어 놓은 외부 기능을 가져오는 것
// input outpu io
// java.io.IOException; 어떤 종류의 I/O 예외가 발생했음을 나타냄
// import java.io.*; .*; 입출력 관련 모든 class를 사용

public class InputEx011 {

	public static void main(String[] args) throws IOException {
//		public static void main(String[] args) {
		// 예외 전가 : 실행할 때 메소드가 알아서 처리, 호출한 메서드에서 문제 해결
		// 경우 1) throws -> 예외 전가 방법, main 뒤에 작성 예) throws IOException
		// 경우 2) 객체지향 사용시 : throws 대신 try { } catch (IOException e) {

			// 아스키 코드 값 입력
			System.out.print("문자 입력:");
//			int i = System.in.read()-48;
			int i = System.in.read();
			
			System.in.read();
			System.in.read();
			
			
			System.out.print("문자 입력:");
			int d = System.in.read();
			
			System.out.println("ASCII 코드 값:"+i);
			System.out.println("ASCII 코드 값:"+d);


	}
}
