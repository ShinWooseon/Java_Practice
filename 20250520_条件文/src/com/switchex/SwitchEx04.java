package com.switchex;


/*
 * 문제)
 * 주민등록번호 7번째 자리를 입력 받아 년도와 성별을 출력하는 프로그램을 구현하시오
 * switch~case 문 활용
 * 
 * 7번째 자리 :
 * 90 -> 1800년대
 * 12 -> 1900년대
 * 34 -> 2000년대
 * 
 * 
*/
import java.util.*;


public class SwitchEx04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하시오 : ");
		char ID = sc.next().charAt(7);
		ID -= 48;
		String gender = " ";
//		
//		System.out.print("주민등록번호를 입력하시오 : ");
//		ID = sc.nextInt();
				
		
		switch (ID) {
		case 9 : case 1 : case 3 : 
			gender = "남성";
			break;
		case 0 : case 2 : case 4 : 
			gender = "여성";
			break;
		default :
			System.out.println("입력 오류 입니다.");
			return;
		}
		
		System.out.println("당신은 "+ gender +"입니다");
	
		
		
//		switch (ID) {
//		case 9 : 
//			System.out.println("1800년대 남성입니다");
//			break;
//		case 0 : 
//			System.out.println("1800년대 여성입니다");
//			break;
//		case 1 : 
//			System.out.println("1900년대 남성입니다");
//			break;
//		case 2 : 
//			System.out.println("1900년대 여성입니다");
//			break;
//		case 3 : 
//			System.out.println("2000년대 남성입니다");
//			break;
//		case 4 : 
//			System.out.println("2000년대 여성입니다");
//			break;
//		default :
//			System.out.println("입력 오류 입니다.");
//			break;
//		}
	}

}
