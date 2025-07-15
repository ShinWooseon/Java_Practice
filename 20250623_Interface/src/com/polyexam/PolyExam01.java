package com.polyexam;

public class PolyExam01 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
		System.out.println("현재 남은 돈은 "+b.bonusPoint+"점 입니다.");
		
	}

}
