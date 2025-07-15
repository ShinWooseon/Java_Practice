package com.abstractex02;

// interface 클래스를 상속받는 클래스의 이름 접미에 관례적으로 Im을 붙임
public class DemoIm implements Demo {
	
	@Override
	public void print() {
		System.out.println("인터페이스 메소드 재정의 !~~~");
	}
	
	public void write() {
		System.out.println("클래스에 정의된 메소드~~~");
	}

}
