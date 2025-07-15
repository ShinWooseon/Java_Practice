package com.concertBooking;

import java.util.*;

public class Group {
	// 'S', 'A', 'B' 석을 나타내는 문자
	private char type;
	// 현재 등급의 자석 객체 배열 서언
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);

	public Group(char type, int num) {
		this.type = type;
		seats = new Seat[num];

		for (int i = 0; i < seats.length; i++) {
			seats[i] = new Seat();
		}
	}

	// 현재 등급의 좌석 예약
	public boolean reserve() {
		int no;
		String name;
		show();
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("좌석 번호 : ");
		no = sc.nextInt();

		if (no < 1 || no >= seats.length) {
			System.out.println("잘못된 좌석 번호 입니다.");
			return false;
		}

		// 이미 좌석이 예약되어 있으면
		if (seats[no - 1].isOccupied()) {
			System.out.println("이미 예약되어 있는 좌석 입니다.");
			return false;
		}

		seats[no - 1].reserve(name);
		return true;
	}

	// 현재 등급의 좌석 예약 취소
	public boolean cancel() {
		show();

		System.out.print("취소자 이름 : ");
		String name = sc.next();

		if (name != null) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약자의 이름을 찾을 수 없습니다.");
		}
		return false;

	}

	// 현재 등급의 좌석 출력
	public void show() {

		System.out.print(type + " >> ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			} else {
				System.out.print("---");
			}
		}
		System.out.println();
	}

}
