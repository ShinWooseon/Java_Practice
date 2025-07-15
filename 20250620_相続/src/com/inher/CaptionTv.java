package com.inher;

public class CaptionTv extends Tv {

	boolean caption; // 캡션 상태(on/off)
	
	void displayCaption(String text) {
		// 캡션 상태가 on이라면 text를 출력해준다.
		if(caption) { 
			System.out.println(text);
		}
		
	}
	
	
}
