package com.question;

import java.util.*;

public class PhoneBook {

	private Phone[] p;
	private Scanner sc;

	public void input() {
		sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int stuN = sc.nextInt();

		this.p = new Phone[stuN];

		for (int i = 0; i < p.length; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈칸없이 입력) : ");
			String name = sc.next();
			String tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장 되었습니다.");
	}

	public String search(String name) {

		
		for (int i = 0; i < p.length; i++) {
			// phone 클래스에 저장된 이름과 내가 검색하고자 하는 이름이 같으면
			if(p[i].getName().equals(name)){
				// 이름으로 검색한 전화번호를 반환
				return p[i].getTel();
				}
			}
		return null;

	}
	
	public void run() {
		input();
		
		while(true) {
			System.out.print("검색 이름 : ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name+"이 없습니다.");
			}else {
				System.out.println(name+"의 전화번호는 "+tel+"입니다.");
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.run();

	}

}
