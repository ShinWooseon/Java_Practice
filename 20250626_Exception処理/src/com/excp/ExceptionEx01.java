package com.excp;

/* 예외 처리
 *  정의 : 프로그램 실행 시 발생 할 수 있는 예외에 대비한 코드를 작성하는 것
 *  목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행 상태를 유지하는 것
 *  
 *  예외를 처리하기 위한 try ~ catch 문
 *  
 *  // 다중 catch 문
 *  
 *  try {
 *   // 예외가 발생 할 가능성이 있는 코드를 작성
 *  }catch(Exception e1){
 *   // Excetption e1이 발생 했을 경우 이를 처리하기 위한 코드를 작성하는 곳
 *  }
 *  }catch(Exception e2){
 *   // Excetption e2이 발생 했을 경우 이를 처리하기 위한 코드를 작성하는 곳
 *  }
 *  }catch(Exception e3){
 *   // Excetption e3이 발생 했을 경우 이를 처리하기 위한 코드를 작성하는 곳
 *  }
 * 
*/

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		
		try {
			try {} catch(Exception e) {}
		} catch (Exception e) {
			// 변수 e는 중첩선언 되면 안된다 (참조변수는 중첩 불가)
			try {} catch(Exception e1) {}
			
		}

		// 다른 try 블럭일 경우 동일 변수명을 사용 할 수 있다.
		try {
			try {} catch(Exception e) {}
		} catch (Exception e) {
			try {} catch(Exception e1) {}
			
		}
		

	}

}
