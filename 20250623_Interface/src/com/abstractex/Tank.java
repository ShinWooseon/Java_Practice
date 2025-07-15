package com.abstractex;

public class Tank extends Unit {
//	int x;
//	int y;
//	void move(int x, int y) {}
//	void stop() {}
	void changeMode() {}
	
	@Override
		void move(int x, int y) {
			System.out.println("X : "+x+", Y : "+y);
		}
	
	@Override
		void stop() {
		}
	
}
