package com.empty;

//  if 문
//  if 참일 경우 실행 문장 else 거짓일 경우 실행 문장
import java.util.*;

public class Practice01 {
	public static void main(String[] args)  {
		
		int a = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		a = sc.nextInt();
		
		if (a < 100)
			System.out.println("100보다 작다");
			else
			System.out.println("100보다 크다");
		
		sc.close();
	}

}
