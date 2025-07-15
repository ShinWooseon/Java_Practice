package com.objectex;

class CardExam {

	public static void main(String[] args) {

		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);

		/*
		 * 클래스 변수는 객체 생성없이 클래스이름. 변수로 직접 사용 가능하다.
		*/
		// 객체 생성 전에는 출력 불가
//		System.out.println(Card.kind);
//		System.out.println(Card.number);

		Card c1 = new Card(); // heart
		c1.kind = "heart";
		c1.number = 7; // 인스턴스 변수 값 설정

		Card c2 = new Card(); // spade
		c2.kind = "spade";
		c2.number = 4; // 인스턴스 변수 값 설정

//		Card c3 = new Card(); // diamond
//		c3.kind = "diamond";
//		c3.number = 7;
//
//		Card c4 = new Card(); // clover
//		c4.kind = "clover";
//		c4.number = 7;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, "
				+ "크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, "
				+ "크기는 ("+c2.width+", "+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경 하시오.");
		
		c1.width = 50;
		c1.height = 80;
		
		c2.width = 150;
		c2.height = 300;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, "
				+ "크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, "
				+ "크기는 ("+c2.width+", "+c2.height+")");
		
		/* 인스턴스 변수는 인스턴스(객체)가 생성 될 때 마다, 생성되므로
		 * 인스턴스 마다 각기 다른 값을 유지할 수 있지만,
		 * 클래스 변수는 모든 인스턴스가 하나의 저장 공간을 공유하므로
		 * 항상 공통된 값을 갖는다.
		 *
		*/		
	}

}
