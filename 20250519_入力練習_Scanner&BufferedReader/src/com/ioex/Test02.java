package com.ioex;

// 문자 하나를 입력받아 
// 산술연산자 : ('+', '-', '*', '/', '%')

import java.io.*;

public class Test02 {
	public static void main(String[] args) throws IOException {

		char yon;
		boolean bool = false;

		System.out.println("산술연산자 입력 ('+', '-', '*', '/', '%') : ");
		yon = (char) System.in.read();
				
//		bool = yon == '+' ? true : false;
//		bool = yon == '-' ? true : false;
//		bool = yon == '*' ? true : false;
//		bool = yon == '/' ? true : false;
//		bool = yon == '%' ? true : false;
//		bool = yon == '%' || yon == '+' || yon == '-' || yon == '/' || yon =='*'  ? true : false;
		
		if (yon == '%' || yon == '+' || yon == '-' || yon == '/' || yon =='*')
			bool = true;
		else
			bool = false;
		
		
		System.out.println(bool == true ? "산술연산자 입니다" : "산술연산자를 입력해주세요");
		System.out.printf("%c"+ (bool == true ? "는(은) 산술연산자 입니다" : "는(은) 산술연산자가 아닙니다"), yon);
		System.out.printf("\n%c"+"입니다", yon);

		
	}

}
