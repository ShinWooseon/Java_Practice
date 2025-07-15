package com.polyexam;

// 부모 class에 기본 생성자가 없을 때 클래스 명 부분에 에러 발생

public class Audio extends Product {
	

	public Audio() {
		// 부모 클래스의 생성자를 호출 한 것
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}

}
