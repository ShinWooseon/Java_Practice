package com.abstractex;

public interface PlayingCard {
	
	// 인터페이스의 경우 별도로 public static final 지정하지 않아도 상수화 시킬 수 있다.
	
	public static final int SPADE = 4;
	final int DIAMOND =3 ;
	static int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber();
	String getCardKind(); // 자동으로 추상으로 인식 public abstract String 없이,
	
}
