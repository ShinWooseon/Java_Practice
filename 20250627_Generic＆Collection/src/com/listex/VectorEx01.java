package com.listex;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		// 용량이 5인 Vector 생성
		
		v.add("1");
		v.add("2");
		v.add("3");

		print(v);
		System.out.println();
		
		// null 공간 삭제
		v.trimToSize();
		print(v);
		System.out.println();
		
		// Vector의 사이즈를 다시 확보 가능
		v.ensureCapacity(6);
		print(v);
		
		v.setSize(7);
		System.out.println();
		print(v);
		
		v.clear();
		System.out.println();
		print(v);
		
		
	}
	
	public static void print(Vector v) {

		System.out.println(v);
		System.out.println("size : " +v.size());
		System.out.println("capacity : "+v.capacity());
		
	}

}
