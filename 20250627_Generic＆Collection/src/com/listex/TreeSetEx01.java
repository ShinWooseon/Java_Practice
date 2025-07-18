package com.listex;

import java.util.*;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		
		// 부분 추출
		System.out.println(from + " to " + to);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to+"zzzz"));
		
		

	}

}
