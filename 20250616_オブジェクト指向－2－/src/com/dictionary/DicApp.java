package com.dictionary;

import java.util.*;
public class DicApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		
		System.out.println("한영 단어 검색 프로그램 입니다");
		System.out.print("한글단어 : ");
		String kor = sc.next();
		
		if(kor.equals("그만")) {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
		if(Dictionary.kor2Eng(kor) != null) {
			
		String eng = Dictionary.kor2Eng(kor);
		
		System.out.print(kor+"은 "+eng+"\n");
		
		}else {
			System.out.println(kor+"는 저의 사전에 없습니다.");
		}
		}
		
		/* 
		 * 한영 단어 검색 프로그램 입니다.
		 * 한글단어 : 희망
		 * 희망은 hope
		 * 한글단어 : 아가
		 * 아가는 저의 사전에 없습니다.
		 * 한글단어 : 아기
		 * 
		*/
		
	}

}
