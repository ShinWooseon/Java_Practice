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

import java.util.*;
//import java.io.*;

public class ArrayEx04Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int num2;

		System.out.print("입력 처리할 학생수 : ");
		num = sc.nextInt();
		sc.nextLine(); // 다음 입력문이 반복문 안에 있을 경우 개행 입력값 제거 필요

		String[][] students = new String[num][2]; // 2차원 배열 사용

		for (int i = 0; i < num; i++) {
			System.out.print("이름 전화번호 입력(" + (i + 1) + ")[공백구분] : ");
			String input = sc.nextLine();
			String[] splitInput = input.split(" "); // 공백 기준으로 나누기

			students[i][0] = splitInput[0]; // 이름
			students[i][1] = splitInput[1]; // 전화번호
		}

		System.out.println("\n전체 학생 수 : " + num + "명");
		System.out.println("이름\t전화번호");

		for (String[] student : students) {
			System.out.println(student[0] + "\t" + student[1]);
		}

		sc.close();
	}
}
