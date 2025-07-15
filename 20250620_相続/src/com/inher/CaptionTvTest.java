package com.inher;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv(); // ctv 인스턴스 생성
		ctv.channel = 10; // 부모 클래스로부터 상속 받은 멤버 필드
		ctv.channelUP(); // 부모 클래스로부터 상속 받은 멤버 메소드
		
		System.out.println(ctv.channel);
		
		ctv.displayCaption("사랑합니다. 여러분 !!!");
		ctv.caption = true;
		ctv.displayCaption("사랑합니다. 여러분 !!!");
		
		/*　자손 클래스의 인스턴스를 생성하면 조상클래스의 멤버와 자손클래스의 멤버가
		 * 하나로 합쳐진 인스턴스로 생성된다.
		*/
		
		
	}

}
