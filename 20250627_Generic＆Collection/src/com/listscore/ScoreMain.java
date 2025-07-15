package com.listscore;

import java.io.*;

public class ScoreMain {

	public static void main(String[] args) throws IOException {
		char ch;

		// 인터페이스 다형성
		Score score = new ScoreImpl();

		while (true) {

			do {
				// 메뉴
				System.out.print("1. 추가 2. 수정 3. 삭제 4. 전체출력 5. 학번 검색 6. 이름 검색 7. 종료 ");
				ch = (char) System.in.read();
				System.in.skip(2);

			} while (ch < '1' || ch > '7');

			switch (ch) {
			case '1':
				score.insert();
				break;
			case '2':
				score.update();
				break;
			case '3':
				score.delete();
				break;
			case '4':
				score.listAll();
				break;
			case '5':
				score.searchHak();
				break;
			case '6':
				score.searchName();
				break;
			case '7':
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			}
		}
	}

}
