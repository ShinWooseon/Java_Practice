package com.objectex;

public class TvExam02 {

	public static void main(String[] args) {
		// class 내 private 접근자가를 사용하는 변수는 class 밖에서 직접 부를수 없다.
//		System.out.println(Tv.channel); 
		Tv t1 = new Tv(); // 위 2개의 문장을 한 문장으로 작성
		Tv t2 = new Tv();
		System.out.println("t1의 채널 값은 "+t1.getChannel());
		System.out.println("t2의 채널 값은 "+t2.getChannel());
		
		t1 = t2; // t2이 저장하고 있는 주소값을 t1에 저장
		t1.setChannel(7);
		
		System.out.println("t1의 채널 값은 "+t1.getChannel()+"로 변경 되었습니다.");
		System.out.println("t2의 채널 값은 "+t2.getChannel()+"로 변경 되었습니다.");
		
	}

}
