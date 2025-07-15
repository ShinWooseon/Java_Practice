package com.overloading;

/* 생성자
 * 인스턴스가 생성될 때 호출 되는 인스턴스 초기화 메소드다.
 * 인스턴스 변수의 초기화, 객체를 생성할 때 실행됨
 * 
 * 인스턴스 초기화 : 인스턴스 변수들을 초기화 한다는 의미
 * 
 * 생성자의 조건
 * 1. 생성자의 이름은 클래스 이름과 같아야한다.
 * 2. 생성자는 리턴 값이 없다.
 * 
 * 생성자도 메소드 이기 때문에 리턴값이 없다는 의미의
 * void를 붙여야 하지만, 모든 생성자가 리턴 값이 없으므로
 * void를 생략할 수 있게 한 것이다.
 * 
*/

class Data1 {
	int value;

	Data1() {
		System.out.println("tod");
	}
}

class Data2 {
	int value;

	Data2(int x) { // 매개 변수가 있는 생성자
		value = x;
		System.out.println(x);
	}
	Data2() { 
		System.out.println("2개");
	}
}

public class ConstructorEx01 {

	private int n;
	public ConstructorEx01() {
		n = 10;
	}
	public ConstructorEx01(int n) {
		this.n = n;
	}
	public ConstructorEx01(long n) {
		this.n = (int)n;
//		this.n = 10;
	}
	public ConstructorEx01(short s) {
		this.n = s;
	}
	public void write() {
		System.out.println("n : "+n);
	}
	
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(4);
		
		/*
		 * 기본 생성자가 컴파일러에 의해서 추가되는 경우는 
		 * 클래스에 정의된 생성자가 하나도 없을 때뿐임
		 */
		
		ConstructorEx01 c = new ConstructorEx01();
		c.n = 20;
		c.write();
	}

}
