package com.ioex;

//
import java.io.*;

public class Test01 {
public static void main(String[] args) throws IOException {
	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("성별 입력 (1:남성, 2:여성) : ");
	
	// 변수 초기화
	int sex = System.in.read()-48; // -48이나 '0'을 넣어주면 밑에 란에서 49, 50이 아닌 1 과 2를 넣어도 된다
		
	// 밑에 구문을 밑에 system line 안에 넣어도 된다
	// change 변수를 별도 선언하지 않아도 가능함
	
//	String change = sex == 1 ? "남성" : sex == 2 ? "여성" : "에러" ;	
	
	
	//별도 구문 생성 없이 ( ) 안에 삼항 연산자를 바로 입력해도 된다
	System.out.println(sex == 1 ? "남성입니다" : sex == 2 ? "여성입니다" : "1과 2 중에 입력 해 주세요" );
	
	
}
	
	
}
