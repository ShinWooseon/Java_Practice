package com.listex;

import java.util.*;

public class StackEx01 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {

		goURL("1. 구글");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");

		printStatus();

		System.out.println("=== 뒤로가기 버튼을 누른 후 ===");
		goBack();
		printStatus();
		
		System.out.println("=== 뒤로가기 버튼을 누른 후 ===");
		goBack();
		printStatus();

		System.out.println("=== 앞으로가기 버튼을 누른 후 ===");
		goForward();
		printStatus();

		System.out.println("=== 앞으로가기 버튼을 누른 후 ===");
		goForward();
		printStatus();
		
		
	}

	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}

	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}

	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}

	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);

		System.out.println("현재 화면은 " + back.peek() + " 입니다.");

	}

}
