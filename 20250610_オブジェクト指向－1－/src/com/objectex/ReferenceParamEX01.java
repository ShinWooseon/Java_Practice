package com.objectex;

class Data { // Data D;
	int x;
}

public class ReferenceParamEX01 {
	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x => " + d.x);
	}

	public static void main(String[] args) {
		Data y = new Data();
		y.x = 10;
		System.out.println("main() : x = > "+ y.x);
		// change() 메소드가 호출 되면서 y.x가 change 메소드의 매개변수 x에 복사됨
		
		change(y); // change 메소드에 x 의 값을 1000으로 변경
		
		
		System.out.println("main() : x = > "+ y.x);
		// change 메소드가 종료되면서 매개변수 x는 종료하게 됨.
	}
}
	// a 3 c 1 e 2 b 5 d 7 f 4
