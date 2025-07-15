package com.listex;

import java.util.*;

public class hashSetEX02 {
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A : " + setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B : " + setB);

		// 합집합
		Iterator<String> list1 = setA.iterator();
		while (list1.hasNext()) {
			setHab.add(list1.next());
		}

		list1 = setB.iterator();
		while (list1.hasNext()) {
			setHab.add(list1.next());
		}
		System.out.println(setHab);

		// 교집합
//		Iterator<String> list2 = setB.iterator();
//		while(list2.hasNext()) {
//			Object tmp = list2.next();
//			if(setA.contains(tmp))
//				setKyo.add(tmp);
//		
//		System.out.println(setKyo);

		Iterator<String> list2 = setA.iterator();
		while (list2.hasNext()) {
			Object tmp = list2.next();
			if (setB.contains(tmp))
				setKyo.add(tmp);
		}
		System.out.println(setKyo);
		
		
		// 차집합
		Iterator<String> list3 = setA.iterator();
		while (list3.hasNext()) {
			Object tmp = list3.next();
			if (!setB.contains(tmp))
				setCha.add(tmp);
		}
		System.out.println(setCha);
		
		
	}
}
