package com.listex;

import java.util.*;

public class QueueEx01 {

	// Queue 인터페이스이기 때문에 LinkedList를 사용
	// Stack은 클래스
	static Queue q = new LinkedList<>();
	static final int MAX_SIZE = 5;


	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		while (true) {
			System.out.print(" >> ");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				save(input);
				if ("".equals(input)) {
					continue;
				}
				
				if (input.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여 줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료 합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여 줍니다");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					LinkedList temp = (LinkedList) q;
					ListIterator it = temp.listIterator();
					while (it.hasNext()) {
						System.out.println(++i + ". " + it.next());
					}
				} else {
					System.out.println(" 입력 오류 입니다. !! ");
				}
			} catch (Exception e) {
				System.out.println(" 입력 오류 입니다. !! ");
			}

		}
	}
	public static void save(String input) {
		// 명령어가 있으면 큐에 저장
		if (!"".equals(input)) {
			q.offer(input);
		}
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}
