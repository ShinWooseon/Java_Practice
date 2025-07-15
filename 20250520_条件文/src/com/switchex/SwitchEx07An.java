package com.switchex;

/*
 * 문제)
 * switch~case문을 사용해서 커피 메뉴의 가격을 알려주는 프로그램을 작성하시오.
 * 
 * 커피 종류 : 
 * 에스프레소, 카푸치노, 카페라떼 -> 3500원
 * 아메리카노 -> 2000원
 * 커피의 종류가 아닌 경우는 -> "메뉴에 없습니다." 를 출력하시오.
 * 
 * 
 * 출력 결과
 * 무슨 커피 : 에스프레소
 * 에스프레소는 3500원 입니다.
 * 
*/

import java.util.*;

public class SwitchEx07An {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String menu1, menu2;
		int price;
		
		System.out.print("메뉴 입력 : ");
		menu1 = sc.nextLine();
				
//		menu2 = menu1 == "에스프레소" ?  : menu1 == "카푸치노" ? "1" : menu1 == "카페라떼" ? "1" : 
//				menu1 == "아메리카노" ? "2" : "3" ;
		menu2 = menu1.equals("에스프레소") || menu1.equals("카푸치노") || menu1.equals("카페라떼") ? "1" : 
				menu1.equals("아메리카노") ? "2" : "3" ;

		
		switch(menu2) {
		case "1" :
			price = 3500;
			break;
		case "2" :
			price = 2000;
			break;
		default :
			System.out.println("메뉴에 없습니다.");
			return;
		}

		System.out.println(menu1+"는 "+price+"원 입니다.");
		
	}
}
