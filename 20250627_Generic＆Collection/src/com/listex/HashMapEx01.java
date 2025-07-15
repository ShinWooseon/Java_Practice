package com.listex;
import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("만화", "으라차차");
		map.put("호러", "스크림");
		map.put("영화", "황혼~새벽");
		
		// 순서
		System.out.println(map);
		System.out.println(map);
		System.out.println(map);
		
		String key;
		Set set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		System.out.println();
		
		map.put("영화", "부산행");
		System.out.println(map);
		
		
	}
}
