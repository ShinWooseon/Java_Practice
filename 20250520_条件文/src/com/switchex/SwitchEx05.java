package com.switchex;

/*
 * 
 * 난수 추출 
 * 
 * 
 * 문제)
 * 컴퓨터와 사용자가 가위바위보를 하는 게임
 * 사용자로부터 가위 1, 바위 2, 보 3 중 하나를 입력 받고
 * 컴퓨터는 1, 2, 3 중에서 하나를 임의의 수를 선택하면 된다.
 * 
 * 임의의 수(난수) 메소드를 사용하기 위해 Math.random() API를 사용해서 추출함
 * 
 * random() 값의 범위는 0.0 ~ 1.0 사이의 실수를 반환한다.
 * 0.0 <= Math.random() < 1.0
 * 1.0은 포함하지 않는다.
 * 
 * 1과 3 사이의 정수를 구한다면
 * 양측에 3을 곱하여 구한다
 * 
 *  1. 0.0 * 3 <= Math.random() * 3 < 1.0 * 3
 *  
 *  2. (int) 0.0 <= (int) Math.random() * 3 < (int) 3.0
 *  
 *  3. 0 <= (int) Math.random() * 3 < 3
 *  
 *  4. 0 + 1 <= (int) Math.random() * 3 + 1 < (int) 3 + 1
 *  
 *  5. 1 ~ 3 까지 값을 랜덤으로 추출
 *  
 * 
*/

import java.util.*;

public class SwitchEx05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위 (1) 바위 (2) 보 (3) 중 입력 : ");
		int user = sc.nextInt();
		int com = (int)((Math.random() * 3) + 1 );
		
		System.out.println(user);
		System.out.println(com);
		
		switch (user-com) {
		case -1 : case 2 :
			System.out.println("컴퓨터가 승리");
			break;
		case 1 : case -2 :
			System.out.println("사용자가 승리");
			break;
		case 0 :
			System.out.println("무승부");
			break;
			
			
			
		}
		
		
		
				
		
	}

}
