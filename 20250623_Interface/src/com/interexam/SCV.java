package com.interexam;

public class SCV extends GroupUnit implements Repairable {

	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	
	// 다형성 생성
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint !=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
		
		
	}
	
}
