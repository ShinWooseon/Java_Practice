package com.empty;

//  if 문
//  if 참일 경우 실행 문장 else 거짓일 경우 실행 문장
import java.io.*;

public class Practice011 {
	public static void main(String[] args) throws IOException {
		
		int a = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("숫자 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		if (a < 100)
			System.out.println("100보다 작다");
			else
			System.out.println("100보다 크다");
		
	}

}
