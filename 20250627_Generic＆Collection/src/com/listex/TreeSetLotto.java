package com.listex;
import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {
		// HashSet은 정렬 안함, TreeSet 정렬함
		Set set = new TreeSet();
		
		for(int i = 0 ; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);
		
	}

}
