package com.listex;

import java.util.*;

public class LinkedListEx01 {
	private static final String color1[] = { "검정", "노랑", "녹색", "파랑색", "주황", "연두" };
	private static final String color2[] = { "초록", "빨강", "흰색", "남색", "보라색"};

	public LinkedListEx01() {
		List<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();

		for (String color : color1) {
			list1.add(color);
		}
		for (String color : color2) {
			list2.add(color);
		}
		
		// list2의 정보를 list1에 전부 추가
		list1.addAll(list2);
		
		// 초기화
		list2 = null;
		
		printList(list1);
		
		System.out.println("\n elements 4 to 6");
		removeList(list1, 4, 7);
		printList(list1);
		
		printReversedList(list1);
		
	}

	// 출력 기능
	public void printList(List<String> list) {
		System.out.print("\n list : ");
		for (String color : list) {
			System.out.printf("%s ", color);
		}
		System.out.println();
	}

	// 제거 기능
	public static void removeList(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	// 역순 출력
	public static void printReversedList(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());
		System.out.print("\n Reversed List : ");
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}
	}

	public static void main(String[] args) {
		new LinkedListEx01();
		
	}

}
