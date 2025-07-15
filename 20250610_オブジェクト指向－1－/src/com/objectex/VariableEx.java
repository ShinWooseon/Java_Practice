package com.objectex;

public class VariableEx {

						// ... 자바 내에서만 사용
	public void argsTest(String ...n){ // 향상된 가변 배열
		// 내부적으로 배열화 작업을 자동으로 해줌
		for(int i = 0 ; i < n.length; i++) { 
			System.out.println("n["+i+"] : "+n[i]);
		}
		System.out.println("===============");
	}

	public static void main(String[] args) {
		VariableEx ar = new VariableEx();
		// class VariableEx 안 argsTest 함수의 매개변수 ... 을 통해 
		// 아래 값을 자동으로 배열내 입력
		ar.argsTest("java", "DataBase");
		ar.argsTest("100", "200", "300", "400");
		ar.argsTest("100", "200", "300", "400","100", "200", "300", "400");
	}
}
/*
 * 40	50	
 * 
 * 
 * 
 */