package com.polymorphism;

class A {
	private int x = 100;
	private int y = 200;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println("x : " + x + ", y : " + y);
	}
}

class B extends A {
	private int y = 300;
	private int z = 400;

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void disp() {
		super.disp();
		System.out.println("y : " + y + ", z : " + z);
	}
}

public class ABTest {

	public static void main(String[] args) {
		A a = new B();
		a.disp();
		System.out.println();

		a.setX(1);
		a.disp();
		System.out.println();

		a.setY(2); // y 값은 A 클래스와 B클래스 모두 가지고 있기 때문에
					// 오버라이딩 규칙에 의거하여 자식클래스 메소드가 실행 된다
		a.disp();
		
//		a.setZ(3); // 업캐스팅으로 인해 Z는 a 인스턴스 변수를 통해 사용 할 수 없다
		
		System.out.println();
		B b = new B();
		b.setZ(3); // 업캐스팅으로 인해 Z는 a 인스턴스 변수를 통해 사용 할 수 없다
		b.disp();
		
	}

}
