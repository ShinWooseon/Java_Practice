package com.concertBooking;

import java.util.*;

public class Concert {
	private String hallName;
	private Scanner sc;
	private Group[] group = new Group[3];

	public Concert(String hallName) {
		sc = new Scanner(System.in);
		this.hallName = hallName;
		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}

	// 콘서트 예약
	// 좌석 정보가 필요

	public void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int type = sc.nextInt();
		if (type < 1 || type >= group.length) {
			System.out.println("잘못된 좌석 타입 입니다.");
			return;
		}
		group[type - 1].reserve();
	}

	public void search() {
		for (int i = 0; i < group.length; i++) {
			group[i].show();
		}
		System.out.println(" <<<<< 조회를 완료 하였습니다. >>>>>");
	}
	
	public void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int type = sc.nextInt();
		if (type < 1 || type >= group.length) {
			System.out.println("잘못된 좌석 타입 입니다.");
			return;
		}
		group[type - 1].cancel();
	}

	public void run() { // 콘서트 예약/취소/검색
		System.out.println(hallName + " 예약 시스템 입니다.");

		int menu = 0;

		while (menu != 4) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4  >> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				reserve();
				break;

			case 2:
				search();
				break;

			case 3:
				cancel();
				break;

			case 4:
				System.exit(0);
				break;
			}
		}
	}
}
