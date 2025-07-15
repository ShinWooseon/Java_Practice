package com.overloading;

class Figure {

	public int area(int w, int h) {
		return w * h; // 사각형의 넓이
	}

	public double area(int r) {
		return r * r * 3.141592; // 원의 넓이
	}

	public void write(int result) {
		System.out.println("사각형의 넓이 : " + result);
	}

	public void write(double result) {
		System.out.println("원의 넓이 : " + result);
	}

}

public class OverloadingEx03 {

	public static void main(String[] args) {
		Figure f = new Figure();
		int res1 = f.area(4,5);
		double res2 = f.area(4);
		
		f.write(res2);
		f.write(res1);
	}
}
