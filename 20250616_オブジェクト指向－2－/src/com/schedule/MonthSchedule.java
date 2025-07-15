package com.schedule;

import java.util.*;

class Day {

	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {

	private int nDays;
	private Day[] days;
	private Scanner sc;

	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);

	}

	public void input() {
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이 입력) : ");
		String work = sc.next();
		day--;

		if (day < 0 || day > nDays) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		days[day].set(work);

	}

	public void view() {
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
//		System.out.print("할일(빈칸없이 입력) : ");
//		String work = sc.next();
		day--;

		if (day < 0 || day > nDays) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		System.out.print((day + 1) + "일의 할일은 : ");
		days[day].show();

	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램");

		while (true) {
			System.out.print("할일 (입력 : 1, 보기 :2, 종료:3 ) >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("메뉴에 없습니다.");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MonthSchedule ms = new MonthSchedule(30);
		ms.run();

	}

}
