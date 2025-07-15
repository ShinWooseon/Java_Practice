package com.excp;

public class ExceptionEx03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 예외 조건 발생
			System.out.println(4); // 미실행

//		} catch (Exception e) {
//		} catch (ArithmeticException ae) {
//			if (ae instanceof ArithmeticException) {
//				System.out.println("true");
//			}
//			System.out.println(5);

		} catch(Exception e) {
//			e.printStackTrace();
			/*  
			 * printStackTrace();
			 * - 예외 발생 당시의 호출 스택에 있었던 메소드의 정보와
			 * 예외 메시지를 화면에 출력함
			 * 
			 * getMessage();
			 * - 발생한 예외 클래스의 인스턴스에 저장된 메시지를 가져온다.
			*/
			
			System.out.println(e.getMessage());
//			System.out.println(5);
		}
		System.out.println(6);

	}

}
