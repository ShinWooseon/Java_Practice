package com.innerex;

public class InnerEx01 {
	// 내부
	class InstanceInner{
		int iv =100;
		// 클래스가 static이지 않기 때문에, 변수에 static 선언시 에러 발생
		int cv = 100;
		// 상수의 경우 클래스의 static 유무와 상관없이 static 변수 사용 가능
		final static int CONST = 100;
		
	}
	// 정적
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
		
	}
	
	// 로컬 내부
	void myMethod() {
		class LocalInner{
			int iv = 300;
			int cv = 300;
			final static int CONST = 300;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
