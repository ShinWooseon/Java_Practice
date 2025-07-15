package com.abstractex;


// 자식 클래스가 추상 클래스일 경우 부모클래스의 메소드를 꼭 재정의 할 필요는 없다.
public abstract class AbstractPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println(" 또 놀즈아 ~~");
	}
	
}
