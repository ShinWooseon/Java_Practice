package com.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		// a = (Ambulane) f;
		// f = (FireEngine) a;
		// 에러 : 상속 관계가 아닌 클래스간의 형변환은 불가능함
		
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe; // 업캐스팅(형변환 생략) car = (car)fe
		// car = fe = new FireEngine(); 와 동일
		
		fe2 = (FireEngine)car; // 다운캐스팅(형변환 생략 불가)
		
		fe.water();
//		car.water(); // 컴파일 에러 : Car 클래스에 참조 변수로 water() 메소드를 호출 할 수 없다.
		fe2.water();
		
		System.out.println("--------------------");
		Car c = new Car(); 
//		Car c = new FireEngine();
		Car c2 = new Car(); 
//		Car c2 = null;
		FireEngine fee = null;
		
		c.drive();
		c2 = (FireEngine)c;
		fee = (FireEngine)c;
		// 컴파일은 에러 없음, 하지만 실행시 에러 발생
		// 형변환 오류 발생
		// 컴파일 할 때는 참보 변수간에 타입만 체크하기 때문에 실행시
		// 생성 될 인스턴스 타입에 대해서는 전혀 알지 못한다.
		// 그래서 컴파일 시에는 문제가 없지만 실행시에는 에러가 발생하여
		// 비 정상적인 종료를 한다

		fee.drive();
		c2 = fee;
		c2.drive();
		
	}
}
