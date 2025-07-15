package com.abstractex;

public class Marine extends Unit{
//	int x;
//	int y;
//	void move(int x, int y) {}
//	void stop() {}
	void stimPack() {}

	@Override
		void move(int x, int y) {
		System.out.println("X : "+x+", Y : "+y);
		}

	@Override
		void stop() {
		}
	
}
