package com.listex;

import java.util.*;

class Sung {
	private String name;
	private int kor, eng, mat, tot;

	private Sung() {

	}

	public Sung(String name, int kor, int eng, int mat) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.mat = mat;
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return eng + kor + mat;
	}

}

public class TreeMapEx02 {
	public static void main(String[] args) {
		TreeMap<String, Sung> map = new TreeMap<String, Sung>();
		map.put("3333", new Sung("김말자", 80, 80, 70));
		map.put("2222", new Sung("이순신", 100, 100, 100));
		map.put("1111", new Sung("후후후", 90, 80, 80));
		map.put("4444", new Sung("히히히", 90, 90, 90));
		map.put("5555", new Sung("하하하", 70, 80, 70));

		// Sung의 입력값은 주소값으로 나옴
		// System.out.println(map);

		String key;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			key = it.next();
			Sung data = map.get(key);
			System.out.printf("%7s %10s %5d %5d %5d %5d", key, data.getName(), data.getKor(), data.getEng(),
					data.getMat(), data.getTot());
			System.out.println();
		}

	}
}
