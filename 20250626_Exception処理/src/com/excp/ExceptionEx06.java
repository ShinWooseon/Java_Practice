package com.excp;

public class ExceptionEx06 {
	public static void main(String[] args) throws Exception {
		method1();
	}
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();
	}
	
	/* 1. 예외가 발생 했을 때, 모두 3개의 메소드가 호출 스택에 있으며,
	 * 2. 예외가 발생한 곳은 제일 윗줄에 있는 method2라는 것과
	 * 3. main 메소드가 method1()을, 그리고 method1()은 method2()를
	 *    호출 
	*/
}
