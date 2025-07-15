package com.objectex;

public class TvExam {

	public static void main(String[] args) {
		// Tv 인스턴스를 참조하기 위한 참조변수 t를 선언함
		Tv t;
		// Tv 인스턴스 생성
		t = new Tv();
		// Tv 인스턴스의 멤버변수 Channel의 값을 7로 설정한다.
		t.setChannel(7) ;
		// Tv 인스턴스의 메소드 channelUp
		t.channelUp();
		
		System.out.println(t.getChannel());
		
	}

}
