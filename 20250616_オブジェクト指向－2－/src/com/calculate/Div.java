package com.calculate;

public class Div {
	private int a;
	private int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		int res = 0 ;
		
		try {
			res = a/ b;
			
		}catch (ArithmeticException a) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		return res;
//		if(b==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
		
//		return a / b;
	}
	
	
}
