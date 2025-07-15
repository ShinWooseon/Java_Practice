package com.switchex;


/*
 * 문제)
 * 주민등록번호 7번째 자리를 입력 받아 년도와 성별을 출력하는 프로그램을 구현하시오
 * 중첩 switch~case 문 활용
 * 
 * 7번째 자리 :
 * 90 -> 1800년대
 * 12 -> 1900년대
 * 34 -> 2000년대
 * 
*/
import java.util.*;


public class SwitchEx04DouSwi {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하시오 : ");
		char ID7th = sc.next().charAt(7);
		ID7th -= 48;
		
		int year = 0;
		String gender = " ";
				
		switch (ID7th) {
		case 1 : case 3 : // 남성
			switch(ID7th) {
			case 1 :
				year = 1900;
				break;
			case 3 :
				year = 2000;
				break;
			}
			break;
		case 2 : case 4 : // 여성
			switch(ID7th) {
			case 2 :
				year = 1900;
				break;
			case 4 :
				year = 2000;
				break;
			}
			break;
		default :
			System.out.println("입력 오류 입니다.");
			System.exit(-1); // break, return;
		}
		
		gender = ( ID7th % 2 == 0 ) ? "여성" : "남성";
		
		System.out.println("당신은 "+year+"년대 "+gender+"입니다.");
	
	}

}
