package com.switchex;


/*
 * 문제)
 * 월을 입력하여 계절을 출력하시오
*/
import java.util.*;


public class SwitchEx031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m ;
		
		System.out.print("월을 입력하시오 : ");
		m = sc.nextInt();
				
		
		switch (m) {
		case 12 : case 1 : case 2 :  // 같은 결과물은 한줄로 작성 가능
			System.out.println("겨울 입니다.");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("봄 입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름 입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을 입니다.");
			break;
		default :
			System.out.println("입력 오류 입니다.");
			break;
		}
	}

}
