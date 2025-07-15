package com.listex;

import java.util.*;

public class VectorEx02 {
	private static final String colors[] = { "검정", "노랑", "녹색", "파랑", "주황색", "연두색" };

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		for (String str : colors) {
			v.add(str);
		}

		System.out.println(v);
		System.out.println();

		// 위치 지정에 대해 찾아서 출력하는 방법
		System.out.println("첫번째 요소 : " + v.firstElement());
		System.out.println("네번째 요소 : " + v.get(3));
		System.out.println("마지막 요소 : " + v.lastElement());

		System.out.println();
		// 첫번째 요소 변경
		v.set(0, "흰색");
		System.out.println("첫번째 요소 : " + v.firstElement());
		System.out.println("요소 개수 : " + v.size());
		System.out.println(v);

		System.out.println();
		// 요소 추가
		v.insertElementAt("빨강", 0);
		System.out.println("첫번째 요소 : " + v.firstElement());
		System.out.println("요소 개수 : " + v.size());
		System.out.println(v);

		System.out.println();
		// 요소 추가
		v.add(0, "빨강색");
		System.out.println("첫번째 요소 : " + v.firstElement());
		System.out.println("요소 개수 : " + v.size());
		System.out.println(v);

		// 전체 출력
		System.out.println("\n전체 출력");
		for (String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();

		// 오름차순 정렬
		Collections.sort(v);
		System.out.println("\n 오름차순 정렬후 출력");
		for (String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();

		// 검색 : 오름차순 정렬된 자료에서만 검색을 할 수 있음
		// 이진 검색 ( A , B ) A : 검색 범위, B : 검색 대상
		int index = Collections.binarySearch(v, "파랑");
		System.out.println("\n 파랑 : " + index + "에 위치");

		// 검색 대상이 자료에 없을 경우, 실행 결과는 음수값으로 출력
		int index1 = Collections.binarySearch(v, "보라");
		System.out.println("\n 보라 : " + index1 + "에 위치");

		// 내림차순 검색
		Collections.binarySearch(v, "파랑", Collections.reverseOrder());

		int index3 = Collections.binarySearch(v, "파랑");
		System.out.println("\n 파랑 : " + index3 + "에 위치");

		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("\n 내림차순 정렬후 출력");
		for (String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(v);
		
		System.out.println();
		
		// 오름차순 정렬이 안되어 있어 자료 없음으로 나옴
		int index4 = Collections.binarySearch(v, "파랑"); 
		System.out.println("파랑 : " + index4 + "에 위치");
		System.out.println();
		// 내림차순 검색
		int index5 =Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.println("파랑 : " + index5 + "에 위치");

		System.out.println();

		// 검색
		String s = "노랑";
		if (v.contains(s)) {
			int i = v.indexOf(s) + 1;
			System.out.println(s + "-->" + i);
		}

		// 삭제
		v.remove(0);
		v.remove("주황색");
		System.out.println(v);

	}
}
