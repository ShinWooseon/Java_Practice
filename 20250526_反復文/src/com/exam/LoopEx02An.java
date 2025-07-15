package com.exam;

import java.util.Scanner;

public class LoopEx02An {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 1; // 메뉴선택
		String str = " "; // 메뉴 -> 콜라, 사이다, 마운틴, 초코송이, 에이스, 웨하스

//		for(; n != 0 ;) {
//			System.out.print("1콜라, 2사이다, 3마운틴, 4초코송이, 5에이스, 6웨하스, 0:종료  => 메뉴를 선택 하시오");
//			n = sc.nextInt();
//			
//			switch (n) {
//			case 0:
//				str = "프로그램 종료";
//				break;
//			case 1:
//				str = "콜라";
//				break;
//			case 2:
//				str = "사이다";
//				break;
//			case 3:
//				str = "마운틴";
//				break;
//			case 4:
//				str = "초코송이";
//				break;
//			case 5:
//				str = "에이스";
//				break;
//			case 6:
//				str = "웨하스";
//				break;
//			default:
//				str = "선택하신 제품이 없습니다.";
//				;
//				break;
//			}
//			System.out.println(str);
//
//		} 
		
//		do {
//			System.out.print("1콜라, 2사이다, 3마운틴, 4초코송이, 5에이스, 6웨하스, 0:종료  => 메뉴를 선택 하시오");
//			n = sc.nextInt();
//			
//			switch (n) {
//			case 0:
//				str = "프로그램 종료";
//				break;
//			case 1:
//				str = "콜라";
//				break;
//			case 2:
//				str = "사이다";
//				break;
//			case 3:
//				str = "마운틴";
//				break;
//			case 4:
//				str = "초코송이";
//				break;
//			case 5:
//				str = "에이스";
//				break;
//			case 6:
//				str = "웨하스";
//				break;
//			default:
//				str = "선택한 제품이 없습니다.";
//				break;
//			}
//			System.out.println(str);
//			
//		} while (n != 0);
		
		
//		while (n != 0) {
//			System.out.print("1콜라, 2사이다, 3마운틴, 4초코송이, 5에이스, 6웨하스, 0:종료  => 메뉴를 선택 하시오");
//			n = sc.nextInt();
//			
//			switch (n) {
//			case 0:
//				str = "프로그램 종료";
//				break;
//			case 1:
//				str = "콜라";
//				break;
//			case 2:
//				str = "사이다";
//				break;
//			case 3:
//				str = "마운틴";
//				break;
//			case 4:
//				str = "초코송이";
//				break;
//			case 5:
//				str = "에이스";
//				break;
//			case 6:
//				str = "웨하스";
//				break;
//			default:
//				str = "선택한 제품이 없습니다.";
//				break;
//			}
//			System.out.println(str);
//			
//		}

//		for (;;) {
//
//			System.out.println("메뉴를 입력하시오 : ");
//			System.out.println("콜라-1, 사이다-2, 마운틴-3, 초코송이-4, 에이스-5, 웨하스-6(0 종료)");
//			menu = sc.nextInt();
//
//			switch (menu) {
//			case 1:
//				System.out.println("콜라");
//				break;
//			case 2:
//				System.out.println("사이다");
//				break;
//			case 3:
//				System.out.println("마운틴");
//				break;
//			case 4:
//				System.out.println("초코송이");
//				break;
//			case 5:
//				System.out.println("에이스");
//				break;
//			case 6:
//				System.out.println("웨하스");
//				break;
//			case 0:
//				System.out.println("프로그램 종료");
//				return;
//			default:
//				System.out.println("선택하신 상품이 없습니다.");
//				break;
//			}

//			while (true) {
//				
//				System.out.println("메뉴를 입력하시오 : ");
//				System.out.println("콜라-1, 사이다-2, 마운틴-3, 초코송이-4, 에이스-5, 웨하스-6(0 종료)");
//				menu = sc.nextInt();
//				
//				switch (menu) {
//				case 1:
//					System.out.println("콜라");
//					break;
//				case 2:
//					System.out.println("사이다");
//					break;
//				case 3:
//					System.out.println("마운틴");
//					break;
//				case 4:
//					System.out.println("초코송이");
//					break;
//				case 5:
//					System.out.println("에이스");
//					break;
//				case 6:
//					System.out.println("웨하스");
//					break;
//				case 0:
//					System.out.println("프로그램 종료");
//					return;
//				default:
//					System.out.println("선택하신 상품이 없습니다.");
//					break;
//				}
//				

//		do {
//
//			System.out.println("메뉴를 입력하시오 : ");
//			System.out.println("콜라-1, 사이다-2, 마운틴-3, 초코송이-4, 에이스-5, 웨하스-6(0 종료)");
//			menu = sc.nextInt();
//
//			switch (menu) {
//			case 1:
//				System.out.println("콜라");
//				break;
//			case 2:
//				System.out.println("사이다");
//				break;
//			case 3:
//				System.out.println("마운틴");
//				break;
//			case 4:
//				System.out.println("초코송이");
//				break;
//			case 5:
//				System.out.println("에이스");
//				break;
//			case 6:
//				System.out.println("웨하스");
//				break;
//			case 0:
//				System.out.println("프로그램 종료");
//				return;
//			default:
//				System.out.println("선택하신 상품이 없습니다.");
//				break;
//
//			}
//		} while (true);

}}
