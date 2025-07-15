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

public class SwitchEx07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String menu1, menu2;
		int price=0;
		
		System.out.print("메뉴 입력 : ");
		menu1 = sc.nextLine();
				
		switch(menu1) {
		
		case "에스프레소" : case "카푸치노" : case "카페라떼" :
			price = 3500;
			break;
		case "아메리카노" :
			price = 2000;
			break;
		default :
			System.out.println("메뉴에 없습니다.");
			break; // break를 넣으면 default 값도 실행 됨
		}
		
		if(price!=0) 
			// if문 없을 시 default문을 break문으로 끝낼 시에 printfln이 실행됨
			// if문 x, default return 사용시 하기 문장 실행 되지 않음
		System.out.println(menu1+"는 "+price+"원 입니다.");
		
	}
}
