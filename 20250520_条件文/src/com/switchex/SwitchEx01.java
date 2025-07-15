package com.switchex;

/*
 * 문제)
 * 사용자로부터 두 정수와 연산자를 입력 받아서,
 * 해당 연산을 처리하는 프로그램을 구현 하시오.
 * 
 * 출력결과
 * 첫번째 정수입력 : 10
 * 연산자 입력 : [+ - * /] : +
 * 두번째 정수입력 : 14
 * 
 * 
 */
import java.util.*;

public class SwitchEx01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int eng, mat, kor, total = 0;
        float avg =0.0f; // 초기값 6.3f 제거
        char grade = ' ';
            
        System.out.print("영어 점수 : ");
        eng = sc.nextInt();
        
        System.out.print("수학 점수 : ");
        mat = sc.nextInt();
        
        System.out.print("국어 점수 : ");
        kor = sc.nextInt();
        
        total = eng + mat + kor;
        avg = (float)total / 3; // 실수 나눗셈을 위해 total을 float으로 캐스팅
        
        System.out.println("총점 " + total);
        System.out.printf("평균 %.3f\n", avg); // 소수점 3자리까지 출력
        System.out.println("평균 " + avg);
        
        switch ((int)avg/10){
		case 10 :
			grade = 'A';
			break;
		case 9 :
			grade = 'B';
			break;
		case 8 :
			grade = 'C';
			break;
		case 7 :
			grade = 'D';
			break;
		case 6 :
			grade = 'E';
			break;
		default :
			grade = 'F';
						
		}
        System.out.println("당신의 등급은 "+grade+"입니다.");
        
    }
}