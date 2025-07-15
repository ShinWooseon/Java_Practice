package com.array;

/*
 * 문제)
 * 입력 받은 인원수 만큼 학생 이름과 전화 번호를 입력 받고,
 * 입력 받은 내용을 전체 출력하는 프로그램을 구현 하시오.
 * 
 *  단, 배열로 작성 하시오.
 *  
 *  입력 처리할 학생수 : 3
 *  이름 전화번호 입력(1)[공백구분] : 가길동 010-1111-1111 
 *  이름 전화번호 입력(2)[공백구분] : 나길동 010-2222-2222 
 *  이름 전화번호 입력(3)[공백구분] : 다길동 010-3333-3333 
 * 
 *  전체 학생 수 : 3
 *  이름  전화번호
 *  가길동 010-1111-1111
 * 
*/

//import java.util.*;
import java.io.*;

public class ArrayEx04 {

	public static void main(String[] args) throws IOException {
//	public static void main(String[] args)  {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String inStu;

		System.out.print("입력 처리할 학생수 : ");
//		num = sc.nextInt();
		num = Integer.parseInt(br.readLine());

		String[] arr = new String[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 전화번호 입력(" + (i + 1) + ")[공백구분] : \n");
			arr[i] = br.readLine();
//			arr[i] = sc.next();

		}
		System.out.println("전체 학생 수 : " + num);
		System.out.println("이름\t 전화번호");

		for (String temp : arr) {
			System.out.println(temp);
		}

	}

}
