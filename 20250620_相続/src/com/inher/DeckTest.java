package com.inher;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle(); // 카드 섞음
		c = d.pick(0);
		System.out.println(c);
		
		
		
	}

}
