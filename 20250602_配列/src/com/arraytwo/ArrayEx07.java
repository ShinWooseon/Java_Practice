package com.arraytwo;

/*
 * 영단어를 보여주고 단어의 뜻을 알아 맞추는 게임
 *
 * 출력
 * chair 의 뜻은 ? 바꾸다
 * 틀렸습니다. 정답은 의자 입니다.
 * 
 * computer 의 뜻은 ? 컴퓨터
 * 정답 입니다.
 * 
 * 단, 2차원 배열을 활용하여 
 * 
*/

import java.util.*;

public class ArrayEx07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" }, { "love", "사랑" },
				{ "happy", "행복" }, };
		String ans;

		for (int i = 0; i < words.length; i++) {
			System.out.print("문제" + (i + 1) + " " + words[i][0] + " 의 뜻은 ?");
			ans = sc.nextLine();
			if (ans.equals(words[i][1])) { // 변수명.equals(비교값)
				System.out.println("정답 입니다.");
//				System.out.println("틀렸습니다. 정답은 " + words[i][1] + " 입니다.");
			} else{
				for (;;) {
					System.out.println("틀렸습니다.");
					System.out.print("문제" + (i + 1) + " " + words[i][0] + " 의 뜻을 재입력하시오 ? ");
					String ansRe = sc.nextLine();
					if (ansRe.equals(words[i][1])) { // 변수명.equals(비교값)
						System.out.println("정답 입니다.");
						break;
					}
				}
			}
		}

	}

}
