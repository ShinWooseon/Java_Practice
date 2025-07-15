package com.ioex;

import java.io.IOException;

//import java.io.*;

// import는 만들어 놓은 외부 기능을 가져오는 것
// input outpu io
// java.io.IOException; 어떤 종류의 I/O 예외가 발생했음을 나타냄
// import java.io.*; .*; 입출력 관련 모든 class를 사용

public class InputEx01 {
	// 아스키코드로 변환 출력

	public static void main(String[] args) { //throws IOException 제거 원할 시 {
		// 예외 전가 : 실행할 때 메소드가 알아서 처리, 호출한 메서드에서 문제 해결
		// 경우 1) throws -> 예외 전가 방법, main 뒤에 작성 예) throws IOException
		// 경우 2) 객체지향 사용시 : throws 대신 try { } catch (IOException e) {

		try {
			System.out.print("문자 입력:");
			int i = System.in.read(); // 메서드는 int 값을 반환하며, 입력된 문자의 ASCII 코드 값을 제공합니다
			System.out.println(i);

		} catch (IOException e) {
			// catch (IOException e)는 Java에서 IOException이 발생했을 때 이를 처리하는 예외 처리 코드

		}

	}
}
