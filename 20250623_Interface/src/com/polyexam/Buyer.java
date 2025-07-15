package com.polyexam;

import java.util.Vector;

public class Buyer { // 고객 : 물건을 사는 사람

	int money = 1000;
	int bonusPoint = 0;

	// 구입한 제품을 저장하기 위한 배열 선언
//	 Product[] item = new Product[10];
//	 int i;

	// 구입한 제품을 저장하기 위해 사용할 Vector 객체를 선언
	Vector<Object> item = new Vector<>(); // 객체만 저장 가능
//	Vector<Product> item = new Vector<>();
//	Vector item = new Vector();

	// 매개변수로 다형성 사용

	public void buy(Product p) { // 매개변수의 다형성

		if (money < p.price) {
			System.out.println("잔액이 너무나 부족하여 물건을 구매할 수 없ㅅ브니다.");
			return;
		}

		// 가지고 있는 돈이 제품 가격보다 많은 경우
		// 제품을 구매하고 소유하 돈은 차감된다.
		// 가지고 있는 돈에서 제품 가격을 뺀다.
		money -= p.price;

		// 제품 보너스 포인트를 추가한다.
		bonusPoint += p.bonusPoint;

//		item[i++] = p;
		item.add(p); // Vector 컬렉션 사용시 .add(), 구매한 제품을 Vector에 저장함

		System.out.println(p + "을/를 구입하셨습니다.");
	}

	// 구매한 제품이 불량 또는 마음에 안든 경우
	public void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p + "을/를 반품 하셨습니다.");

		} else { // 제품 환불
			System.out.println("구매한 제품중 해당 제품이 존재하지 않습니다.");
		}

	}

	// 구매한 제품에 대한 정보를 요약해 줌
	public void summary() {
		// 구입한 물품의 가격 합계
		int sum = 0;
		// 구입한 물품의 목록
		String itemList = "";

		if(item.isEmpty()) {
			System.out.println("구매한 제품이 존재하지 않습니다.");
		}
		
		/*
		 * for (int i = 0; i < item.length; i++) { if (item[i] == null) break; sum +=
		 * item[i].price; // itemList += item[i] + ", "; itemList += (i == 0) ? "" +
		 * item[i] : ", " + item[i];
		 * 
		 * }
		 */
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
			
		}

		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 목록 " + itemList + "입니다.");
	}

}
