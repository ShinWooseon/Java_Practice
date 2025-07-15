package com.objectex;

class MyMath {
	
	long add (long x, long y) {
		long result = x + y;
		return result;
	}
	long sub (long x, long y) {
		long result = x - y;
		return result;
	}
	long mul (long x, long y) {
		long result = x * y;
		return result;
	}
	long div (long x, long y) {
		long result = x / y;
		return result;
	}
}

public class MyMathEx01 {

	public static void main(String[] args) {
		// 객체 선언
		MyMath mm =new MyMath();
		// 선언된 객체 안 함수 지정 및 인자값 입력
		long r1 = mm.add(6, 7); // method 호출
		// 강제 형변환 가능
		double r2 = (float)mm.sub(6, 7);
		long r3 = mm.mul(6, 7);
		long r4 = mm.div(6, 7);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println(mm.add(6, 7));
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()..");
	}
	
}
