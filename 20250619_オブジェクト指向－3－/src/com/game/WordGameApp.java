package com.game;
import java.util.*;
public class WordGameApp {

	private Scanner sc; // 키보드 입력
	private String startWord = "아버지"; // 시작 단어
	private Player[] p; // 게임 참가자들
	
	public WordGameApp() {
		sc = new Scanner(System.in);	
	}

	
	// 게임을 진행하는 메소드
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		
		System.out.print("게임에 참가하는 인원 : ");
		int nPlayers = sc.nextInt();
		p = new Player[nPlayers]; // Player [] 레퍼런스 배열 생성
		
		// 각 참여자의 이름을 입력받아 Player 객체 생성
		for(int i=0; i<nPlayers; i++) {
			System.out.print("참가자의 이름 : ");
			String name = sc.next();
			p[i] = new Player(name);
		}		
		
		String lastWord = startWord; // startWord에서 부터 시작한다.

		System.out.println("시작 단어는 "+lastWord+ "입니다");
		int next =  0; // 참가자들의 순서대로 증가
		
		// 게임이 끝날 때까지 루프
		while(true) {
			String newWord = p[next].getWordFromUser(); // next 참가자가 단어를 말하도록 한다.
			if(!p[next].checkSuccess(lastWord)) { // next 참가자가 성공하였는지 검사.
				System.out.print(p[next].getName() + "이 졌습니다.");
				break; // 게임을 종료한다.
			}
			next++; // 다음 참가자
			next %= p.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다.
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WordGameApp wgame = new WordGameApp();
		wgame.run();
	}
}