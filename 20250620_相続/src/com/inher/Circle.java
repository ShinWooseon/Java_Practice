package com.inher;

public class Circle extends Shape {
	
	Point center; // 원의 원점 좌표
	int r; // 반지름
	
	public Circle() {
		//	원의 원점 좌표, 반지름을 초기화
		this(new Point(0,0),100);
		
	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
		
	}	

	// 원의 정보를 출력
	@Override
	void draw() {
		System.out.printf("[center = (%d, %d), r= %d, color = %s]%n",
				center.x, center.y, r, color);
	
		
	}
	
	
	
	
}
