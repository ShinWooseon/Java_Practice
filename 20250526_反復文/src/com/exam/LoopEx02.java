package com.exam;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu;

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

		do {

			System.out.println("메뉴를 입력하시오 : ");
			System.out.println("콜라-1, 사이다-2, 마운틴-3, 초코송이-4, 에이스-5, 웨하스-6(0 종료)");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("콜라");
				break;
			case 2:
				System.out.println("사이다");
				break;
			case 3:
				System.out.println("마운틴");
				break;
			case 4:
				System.out.println("초코송이");
				break;
			case 5:
				System.out.println("에이스");
				break;
			case 6:
				System.out.println("웨하스");
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택하신 상품이 없습니다.");
				break;

			}
		} while (true);

	}
}
