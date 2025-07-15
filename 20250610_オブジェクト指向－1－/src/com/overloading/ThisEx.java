package com.overloading;

class Rect {

	private int w, h; // 초깃값은 0

	public int area() {
		return w * h;
	}

	public void write(int result) {
		System.out.println("결과 : " + result);
	}

	public void setData(int w, int h) {
		this.w = w; // this를 안붙일 경우 지역변수로, w의 값은 그대로 0이다
		this.h = h;
	}
}

public class ThisEx {

	public static void main(String[] args) {
		Rect r1 = new Rect();
//		int b = r1.setData(4, 5);
		r1.setData(4, 5);

		int a = r1.area();
		r1.write(a);

	}

}
