package com.switchex;


/*
 * 문제)
 * 월을 입력하여 계절을 출력하시오
*/
import java.util.*;


public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, m2 ;
		char weather = ' ';
		
		System.out.print("월을 입력하시오. : ");
		m = sc.nextInt();
				
		
		switch (m) {
		case 12 :
			System.out.println("겨울 입니다.");
			break;
		case 1 :
			System.out.println("겨울 입니다.");
			break;
		case 2 :
			System.out.println("겨울 입니다.");
			break;
		case 3 :
			System.out.println("봄 입니다.");
			break;
		case 4 :
			System.out.println("봄 입니다.");
			break;
		case 5 :
			System.out.println("봄 입니다.");
			break;
		case 6 :
			System.out.println("여름 입니다.");
			break;
		case 7 :
			System.out.println("여름 입니다.");
			break;
		case 8 :
			System.out.println("여름 입니다.");
			break;
		case 9 :
			System.out.println("가을 입니다.");
			break;
		case 10 :
			System.out.println("가을 입니다.");
			break;
		case 11 :
			break;
		default :
			System.out.println("입력 오류 입니다.");
			break;
		}
	}

}
