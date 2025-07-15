package com.listex;

import java.util.*;

public class ArrayListEx02 {

	public static void main(String[] args) {

		final int LIMIT = 10;
		int[] arr = { 1, 2, 3, 4, 5 };
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		System.out.println(length);
		
		// length()는 String 클래스의 메서드로, 문자열의 길이를 반환
//		int len1 = source.length();
		// length는 배열의 길이(크기)를 나타내는 프로퍼티
//		int len2 = arr.length;

		// 초기 용량 설정
		List list = new ArrayList(length / LIMIT + 10);
		System.out.println(length / LIMIT + 10);
		// List 사이즈 출력
		System.out.println(list.size());

		// LIMIT만큼 증가 이유?
		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length) {
				// 추출하여 추가
//				list.add(source.substring(i));
				list.add(source.substring(i, i + LIMIT));
			} else {
				// i 번째 부터 전부 추출
				list.add(source.substring(i));
			}

		}
		
		for(int i= 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.size());
		
		
		// vector 단점
		// 한번 늘어난 크기는 줄어 들지 않는다.
		// 낭비 공간이 발생할 수 있다.
		

	}

}
