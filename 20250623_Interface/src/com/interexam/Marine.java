package com.interexam;

public class Marine extends GroupUnit{
	
	public Marine() { // 125
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
	
}
