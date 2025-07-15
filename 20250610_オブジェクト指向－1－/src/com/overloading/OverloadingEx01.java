package com.overloading;

/* 오버로딩 (overloading)
 * 한 클래스 내에 같은 이름의 메소드를 정의하는 것을 의미
 * 하나의 메소드 이름으로 여러 기능을 구현하기 때문에 붙여진 이름
 * 
 * 오버로딩의 조건
 * 1. 메소드 이름이 같아야 한다.
 * 2. 매개변수의 개수 또는 자료형이 달라야 한다.
 * 
 * int add(int a, int b) {}
 * int add(int x, int y) {} - 작동 안됨
 * long add(int x, int y) {} - 작동 안됨
 * 
*/

class FunctionEx {
	int add(int x, int y) {
		System.out.println("int int int");
		return x + y;
	}

	int add(int[] x) {
		int res = 0;
		for (int i = 0; i < x.length; i++) {
			res += x[i];
		}
		return res;
	}

	long add(long x, int y) {
		System.out.println("long long int");
		return x + y;
	}

	long add(long x, long y) {
		System.out.println("long long long");
		return x + y;
	}

	long add(int x, long y) {
		System.out.println("long int long");
		return x + y;
	}

}

public class OverloadingEx01 {
	public static void main(String[] args) {
		FunctionEx fe = new FunctionEx();
		
		int[] t = new int[] { 1, 2, 3, 4 };
		int[] a = { 1, 2, 3, 4 };

		System.out.println(fe.add((long) 3, 3));
		System.out.println(fe.add(3l, 3));
		System.out.println(fe.add(3, (long)3));
		System.out.println(fe.add(3, 3l));
		System.out.println(fe.add(3, 3));
		System.out.println(fe.add(3, 3));
		System.out.println(fe.add(t));
	}
}
