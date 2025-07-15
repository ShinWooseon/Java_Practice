package com.dictionary;

/* 
 * 
 * Dictionary 클래스의 kor2Eng() 메소드와 DicApp(main) 클래스를 완성하여 아래와 같이 구현하시오. 
 * 
 * 결과
 * 한영 단어 검색 프로그램 입니다.
 * 한글단어 : 희망
 * 희망은 hope
 * 한글단어 : 아가
 * 아가는 저의 사전에 없습니다.
 * 한글단어 : 아기
 * 
*/
import java.util.*;

class Dictionary {
//	private static DicApp[] p;
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {

		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return eng[i];
		}
		return null;
//		for (int i = 0; i < kor.length; i++) {
//			if (p[i].getKor().equals(word))
//				return p[i].getEng();
//		}
//		return null;

	}

}
