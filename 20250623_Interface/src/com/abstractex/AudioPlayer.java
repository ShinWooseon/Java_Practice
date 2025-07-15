package com.abstractex;


// 부모클래스가 추상클래스일 경우, 자식 클래스 안에서 추상 메소드를 반드시 재정의 해야 한다.
public class AudioPlayer extends Player{
	// 구체화 : 상속을 통해 클래스를 구현한다. 또는 확장하는 작업을 의미함
	
	
	@Override
	void play(int pos) {
		System.out.println("놀자아 노래를 틀어봐~~~");
		
	}
	
	
	@Override
	void stop(int pos) {
		System.out.println("멈춰라 ~~~");
		
	}

}
