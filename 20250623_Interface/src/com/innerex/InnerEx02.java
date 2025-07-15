package com.innerex;

public class InnerEx02 {
	class InstanceInner {
	}

	static class StaticInner {
	}

	// 인스턴스 멤버 간에는 서로 직접 접근이 가능함
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 직접 접근이 가능함
	static StaticInner cv = new StaticInner();

	static void staticMethod() {
		// static 멤버는 인스턴스 멤버에 직접 접근이 불가능함
//		StaticInner obj1 = new InstanceInner();

		// static 멤버 간에는 접근 가능
		StaticInner obj2 = new StaticInner();

		InnerEx02 outer = new InnerEx02();
		InstanceInner obj3 = outer.new InstanceInner();
		// 인스턴스 클래스는 외부 클래스먼저 생성해야 내부클래스에 접근이 가능함
//		InstanceInner obj4 = new InstanceInner();

	}

	void instanceMethod() {
		// 인스턴스 메소드에서는 인스턴스 멤버와 static 멤버 모두 접근이 가능함
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();

		// 메소드 내에 지역적으로 선언한 내부클래슨느 외부에서 접근할 수 없음
//			LocalInner iv = new LocalInner();

	}

	void myMethod() {
		class LocalInner {
			LocalInner iv = new LocalInner();

		}
	}

}
