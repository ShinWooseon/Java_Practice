package com.polyexam;

public class PolyExam03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv tv =new Tv();
		Computer com = new Computer();
		Audio a = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(a);
		
		b.summary();
		System.out.println();
		
		b.refund(a);
		b.summary();
		
		
	}

}
