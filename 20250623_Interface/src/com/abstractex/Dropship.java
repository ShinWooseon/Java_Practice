package com.abstractex;

public class Dropship extends Unit {
//	int x;
//	int y;
//	void move(int x, int y) {}
//	void stop() {}
	void load() {}
	void unload() {}
	
	@Override
		void move(int x, int y) {
		System.out.println("X : "+x+", Y : "+y);
		}
	@Override
		void stop() {
		
		}
	
}
