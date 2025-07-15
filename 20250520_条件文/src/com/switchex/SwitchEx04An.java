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
import java.io.*;
import java.util.*;

public class SwitchEx04An {

	public static void main(String[] args) throws IOException{
		
		
//		System.out.print("주민등록번호 7번째를 입력하시오 : ");
//		int ID = System.in.read()-48;
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.print("주민등록번호 입력하시오 : ");
		char ID7th = sc.next().charAt(7);
		System.out.println(ID7th);
		
//		String ID = sc.nextLine();
//		
//		char ID7th = ID.charAt(7);
		ID7th -= 48;
//		System.out.println(ID7th);
		
		int year = 0;
		String gender;
		
		switch (ID7th) {
		case 9 : case 0 :  
			year = 1800;
			break;
		case 1 : case 2 :
			year = 1900 ;
			break;
		case 3 : case 4 :
			year = 2000 ;
			break;
		default :
			System.out.println("입력 오류 입니다.");
			System.exit(-1); // break, return;
		}
		
		gender = ( ID7th % 2 == 0 ) ? "여성" : "남성";
		
		System.out.println("당신은 "+year+"년대 "+gender+"입니다.");
		
//		
//		switch (Gender) {
//		case 9 : case 1 : case 3 : 
//			Gender = "남성";
//			break;
//		case 0 : case 2 : case 4 : 
//			Gender = "여성";
//			break;
//		default :
//			System.out.println("입력 오류 입니다.");
//			break;
//		}
		
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
