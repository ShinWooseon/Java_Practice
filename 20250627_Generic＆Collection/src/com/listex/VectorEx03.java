package com.listex;

import java.util.*;
public class VectorEx03 {

	public static void main(String[] args) {
		Vector<MyData> v = new Vector<>();
		v.add(new MyData("가길동",23));
		v.add(new MyData("나길동",17));
		v.add(new MyData("다길동",20));
		
		for (MyData m : v) {
			System.out.printf("이름 : %s 나이는 : %d\n", m.name, m.age);
		}

	}

}
