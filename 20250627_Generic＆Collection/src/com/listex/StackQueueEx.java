package com.listex;

/* 브라우저 앞으로가기 / 뒤로가기 기능도 stack으로 구현 가능
*/

import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		Queue<String> q = new LinkedList<>();

		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("== stack ==");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println();
		
		System.out.println("== queue ==");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

}
