package com.listex;

import java.util.*;

public class HashMapEx02 {
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("myID", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

//		System.out.println(map);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id와 pw를 입력해 주십시오.");
			System.out.print("id : ");
			String id = sc.nextLine();
			System.out.print("password : ");
			String password = sc.nextLine();

			System.out.println();
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			if (!map.get(id).equals(password)) {
				System.out.println(" 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 password가 일치 합니다.");
			}

		}
	}

}
