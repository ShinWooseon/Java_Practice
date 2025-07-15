package com.inher;
import java.io.IOException;
import java.sql.SQLException;
/*
 * 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속됨
 * 자손 클래스의 멤버 개수는 조상 클래스 보다 항상 같거나 많다
*/

public class Child extends Parent {
	int x = 10;
	
	@Override
	void parentMethod() throws IOException {
		System.out.println("여기는 자식 클래스 입니다.");
	}
	
	void parentMethod(int i) throws IOException {
		System.out.println("여기는 자식 클래스 입니다.");
	}
	
	void play() {
		System.out.println("놀자~~~~");
	}
	
	void method() {
		System.out.println("x : "+x);
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+super.x);
	}
	
	public static void main(String[] args) {

	}

}
