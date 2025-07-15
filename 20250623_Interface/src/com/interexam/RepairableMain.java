package com.interexam;

public class RepairableMain {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); // scv가 탱크를 수리
		scv.repair(dropship);
		// scv.repair(marine); // 수리 불가 인터페이스를 상속 받지 않음
		
		System.out.println(tank.MAX_HP);
		System.out.println(dropship.MAX_HP);
		System.out.println(marine.MAX_HP);
		System.out.println(scv.MAX_HP);
		
		

	}

}
