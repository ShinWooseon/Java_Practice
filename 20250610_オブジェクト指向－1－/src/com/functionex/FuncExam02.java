package com.functionex;

/* 문제]
 * 계산기 프로그램에서 +, -, *, /, % 등의 연산을 메소드를 이용하여
 * 프로그램을 구현하시오.
 * 
 * plus(+), minus(-), multi(*), divi(/), per(%)
 * disp(출력) 
 * 
 * 첫번째 수 : 
 * 연산자 (+, -, *, /, %) : -> 연산자가 아닌 경우 다시 받도록 한다.
 * 두번째 수 :
 * 
 * do while, switch case
*/
import java.io.*;

public class FuncExam02 {

	public static int plus(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static int divi(int a, int b) {
		return a / b;
	}

	public static int per(int a, int b) {
		return a % b;
	}

	public static void disp(int a, char b, int c, double res) {
		if (b == '!') {
			return;
		} else {
			System.out.println();
			System.out.println(a + " " + b + " " + c + " " + res);
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char operater;
		double res = 0;

		do {
			System.out.print("첫번째 수 입력 : ");
			int firstNum = Integer.parseInt(br.readLine());

			System.out.print("연산자 (+, -, *, /, %) : ");
			operater = br.readLine().charAt(0);

			System.out.print("두번째 수 입력 : ");
			int secondNum = Integer.parseInt(br.readLine());

			switch (operater) {
			case '+':
				res = plus(firstNum, secondNum);
				break;
			case '-':
				res = minus(firstNum, secondNum);
				break;
			case '*':
				res = multi(firstNum, secondNum);
				break;
			case '/':
				res = divi(firstNum, secondNum);
				break;
			case '%':
				res = per(firstNum, secondNum);
				break;
			case '!':
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("연산자 (+, -, *, /, %) 중에서 다시 입력 하시오");
				break;
			}
			disp(firstNum, operater, secondNum, res);
			// 출력 메소드 호출

		} while (operater != '!');

	}
}
