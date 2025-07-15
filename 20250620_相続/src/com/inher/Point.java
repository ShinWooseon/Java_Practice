package com.inher;

public class Point {
	int x;
	int y;
	int z;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int x, int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point() {
		// 밑에 this의 인자 2개는 Point(int x, int y)의 매개변수를 가르킴
		this(0,0);
	}
	
	String getXY() {
		// x와 y의 값을 문자열로 리턴
		return "("+x+","+y+")";
	}
	
	String getLocation() {
		return "("+x+","+y+","+z+")";
		
	}
}
