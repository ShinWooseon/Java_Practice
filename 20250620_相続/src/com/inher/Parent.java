package com.inher;

import java.io.IOException;
import java.sql.SQLException;

/* 상속
 * - 기존 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
 * 
 * 	새로 작성하고자 하는 클래스의 이름 뒤에 상속 받고자하는
 * 	클래스의 이름을 키워드 'extends' 와 함께 작성해 주면 됨
 * 
 *  상속 관계에서의 두 클래스의 용어
 *  
 *  조상 클래스 : 부모 클래스(parent), 상위 클래스(Super), 기반 클래스(base)
 *  자손 클래스 : 자식 클래스(child), 하위 클래스(Sub), 파생된 클래스(derived)
 * 
 * 
*/


public class Parent {
	int x =20;
	
	int age;
	
	void parentMethod() throws IOException, SQLException{
		
	}
	
	
	 void play() {
		System.out.println("안 놀아 ~~");
	}
	
	
}



