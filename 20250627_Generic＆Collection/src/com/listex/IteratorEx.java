package com.listex;

import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// 대괄호 포함 출력
		System.out.println(list);
		
		// 대괄호에서 값을 빼서 나올 수 있음
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		// 역순 출력 // listIterator의 인덱스는 0부터 시작하기 때문에 역순을 시작하고 싶은 index 위치를 인자로 입력 해주어야 함
		ListIterator<String> itRev = list.listIterator(list.size());
		while(itRev.hasPrevious()) {
			System.out.print(itRev.previous()+" ");
		}
		

	}

}
