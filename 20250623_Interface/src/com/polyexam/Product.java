package com.polyexam;

public class Product {  // 제품 클래스
	
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스
	
	public Product() {
		price = 0;
		bonusPoint = 0;
		
	}
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 포인트 10% 제공 
	}
}


