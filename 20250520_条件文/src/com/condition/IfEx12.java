package com.condition;

/*
 * 문제)
 * 사용자로부터 알파벳 한 문자를 입력 받아,
 * 입력받은 알파벳이 모음일 경우만 출력하는 프로그램을 작성하시오.
 * 
 * 단, 대소문자 모두를 적용하도록 한다.
 * 또한, 알파벳 이외에 문자가 입력되면 입력 오류를 출력한다
 * 
 * a, e, i o, u
 * 
 * 문자입력 : A
 * 모음
 * 
 * 문자입력 : B
 * 
 * 문자입력 : 1
 * 입력 오류
 * 
*/

import java.util.*;

public class IfEx12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char al;

		System.out.print("문자 입력 : ");
		al = (char) sc.next().charAt(0);

//		if ( al == 'a' || al == 'A' || 
//			 al == 'e' || al == 'E' || 
//			 al == 'i' || al == 'I' || 
//			 al == 'o' || al == 'O' || 
//			 al == 'u' || al == 'U'){
//		System.out.println("모음");
//	
//		}
//		else if ( (al < 65 || al >90) && (al < 97 || al > 122))
//			System.out.println("입력 오류");

//		if ((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) {
//			if ((al == 'a' || al == 'A' || al == 'e' || al == 'E')) {
//				System.out.println("모음");
//			}
//			else if((al == 'i' || al == 'I' || al == 'o' || al == 'O' || al == 'u' || al == 'U')) {
//				System.out.println("모음");
//			} 
//			else {
//			return;
//			}
//		} 
//		else {
//			System.out.println("입력 오류");
//		}

		if ((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) {
			if ((al == 'a' || al == 'A' || al == 'e' || al == 'E' || al == 'i' || al == 'I' || al == 'o' || al == 'O'
					|| al == 'u' || al == 'U')) {
				System.out.println("모음");
			}
		} else {
			System.out.println("입력 오류");
		}

	}

}
