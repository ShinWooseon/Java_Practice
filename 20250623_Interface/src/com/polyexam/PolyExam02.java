package com.polyexam;

public class PolyExam02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
		
		b.refund(new Audio()); // 객체 사용이 안됨??
		b.summary();
	}

}
