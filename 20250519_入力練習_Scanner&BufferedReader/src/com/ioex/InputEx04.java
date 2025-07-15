package com.ioex;

// 문자 하나 이상을 문자열로 처리
/*
 * 
 * InputStreamReader is = new InputStreamReader(System.in);
 * BufferedReader br = new BuferredReader(is);
 * 			   String name = br.readLine();
 * 
*/

import java.io.*;

public class InputEx04 {
	// 문자열 입출력

	public static void main(String[] args) throws IOException {
	
		// 이름, 나이, 주소, 전화번호 입력
		String name;
		String age;
		String addr;
		String tel;
		
		// 객체생성
		/*
		 * InputStreamReader is = new InputStreamReader(System.in);
		 * BufferedReader br = new BufferedReader(is);
		 */	
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		// 위와 동일한 의미
			
		
		
		// 입력처리
		System.out.println("이름 입력:");
		name = br.readLine();
		System.out.println("나이 입력:");
		age = br.readLine();
		System.out.println("주소 입력:");
		addr = br.readLine();
		System.out.println("전화번호 입력:");
		tel = br.readLine();
		
		// 입력할 때 마다 값이 바뀌는 것은 동적
		// 값이 바뀌지 않는 것이 정적
		
		// 출력처리
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(addr);
//		System.out.println(tel);
		
		System.out.println("나의 이름은 "+name+ "이고, 나이는 "+age+ "세, 주소는 "+addr+ "이고, 전화번호는 "+tel+"이다.");
		
	}
}
