package com.listex;

/* ArrayList는 API를 불러와야 사용 가능
 * java.util.*; 에서 지원
 * 
 * import 복원
*/

import java.util.*;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// <E> 정수 객체형 -> Integer
		ArrayList<Integer> list1 = new ArrayList<>();

//		우변의 < > 안 객체형은 생략 가능, 좌변은 생략 불가
//		ArrayList<Integer> list1 = new ArrayList<Integer>();

		// .add ArrayList에 값 추가
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

//		System.out.println(list1);
//		System.out.println("list1 : "+list1);

		// sublist를 통해 부분 추출 가능 from index, to index(to index 값은 미포함 그 전까지)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
//		System.out.println(list2);

		// 출력 print 메소드 사용
		print(list1, list2);
		System.out.println();

		// 정렬
		Collections.sort(list1);
		Collections.sort(list2);

		print(list1, list2);

		System.out.println();
		// 포함 여부 확인
		System.out.println(list1.containsAll(list2));
		System.out.println(list2.containsAll(list1));

		System.out.println();
		// String 또한 객체이기에 입력할 수 있다.
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 위치 지정 가능
		print(list1, list2);
		
		System.out.println();
		// 값을 교체 입력
		list2.set(3, "AA"); 
		print(list1, list2);
		
		System.out.println();
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println(list1.retainAll(list2));
		print(list1, list2);
		
		
		System.out.println();
		//list2에서 list1에 포함된 객체들을 삭제함
		for(int i = list2.size()-1 ; i >= 0 ; i--) {
			// get(index)를 사용하여 값을 호출하여 contains을 통한 비교
			if(list1.contains(list2.get(i))) {
				// remove(index)를 통해 삭제
				list2.remove(i);
				
			}
		}
		
		print(list1, list2);

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}

}
