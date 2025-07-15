package com.inher;

public class Deck {
	
	final int CARD_NUM = 52;
	
	Card cardArr[] = new Card[CARD_NUM];

	public Deck() {
		int i = 0;
		
		for (int k = Card.KIND_MAX ; k > 0; k--) {
			for(int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1);
			}
			
		}
		
	}
	
	// 지정된 위치(index)에 있는 카드를 하나 꺼내서 반환함
	Card pick(int index) {
		return cardArr[index];
	}
	
	// Deck에서 카드 하나를 선택함
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM );
		return pick(index);
	}
	
	// 카드의 순서를 섞는다.
	public void shuffle() {
		for (int i= 0 ; i < cardArr.length ; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
					
		}
	}
	
	
	
	
	
	
}
