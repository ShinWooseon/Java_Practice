package com.trmScore;

import java.util.*;

public class ScoreImpl implements Score {

	// HashMap : 키값으로 정렬되지 않음
	private Map<String, ScoreVO> map = new HashMap<>();
	// TreeMap : 키값으로 정렬 됨

	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("\n 자료 추가 .....");

		String hak;
		System.out.print("학번 : ");
		hak = sc.next();

		// Map을 사용할 경우 아래 구문이 필요가 없다
		// ScoreVO temp = readScore(hak);

		// null이 아니면(학번이 이미 존재한다면) data를 추가하면 안된다
		// if (temp != null) {
		// System.out.println("이미 등록된 학번입니다. \n");
		// return; }
		if (map.containsKey(hak)) {
			System.out.println("이미 등록된 학번입니다. \n");
			return;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수 : ");
		vo.setMat(sc.nextInt());
//		vlist.add(vo);

		map.put(hak, vo);
		System.out.println("데이터 입력 완료");

	}

	@Override
	public void update() {
		System.out.println("\n 자료 수정....");
		String hak;
		hak = sc.next();

//		ScoreVO vo = readScore(hak);
		if (!map.containsKey(hak)) {
//		if (vo == null) {
			System.out.println("등록된 학번이 존재하지 않습니다.");
			return;
		}
		ScoreVO vo = map.get(hak);

		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수 : ");
		vo.setMat(sc.nextInt());
		System.out.println();
		System.out.print("데이터 수정 완료");

	}

	@Override
	public void delete() {
		System.out.println("\n 자료 삭제....");
		String hak;
		hak = sc.next();

//		ScoreVO vo = readScore(hak);
		if (!map.containsKey(hak)) {
			System.out.println("등록된 학번이 존재하지 않습니다.");
			return;
		}
		
		map.remove(hak);
//		vlist.remove(vo);
		System.out.println("데이터 삭제가 완료 되었습니다.....\n");

	}

	@Override
	public void listAll() {
		System.out.println("\n 전체 출력 .......");
		
		Iterator<String> it = map.keySet().iterator();
//		Iterator<ScoreVO> it = vlist.iterator();
//
//		while (it.hasNext()) {
//			ScoreVO vo = it.next();
//			System.out.println(vo);
//		}
//		System.out.println();
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			System.out.println(vo);
		}
		System.out.println();
	}

	@Override
	public void searchHak() {
		System.out.println("\n 학번 검색........");
		String hak;
		System.out.print("검색할 학번 : ");
		hak = sc.next();

//		ScoreVO vo = readScore(hak);
		
		
		if (!map.containsKey(hak)) {
			System.out.println("등록된 학번이 존재하지 않습니다.");
			return;
		}
		ScoreVO vo = map.get(hak);
		System.out.println(vo);
		
//		if (vo != null) {
//			System.out.println(vo);
//		}

	}

	@Override
	public void searchName() {
		System.out.println("\n 이름 검색........");
		String name;
		System.out.print("검색할 이름 : ");
		name = sc.next();
		
		
		
//		for (ScoreVO vo : vlist) {
//			if (vo.getName().startsWith(name)) {
//				System.out.println(vo);
//			}
//		}
//		System.out.println();
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}

//	public ScoreVO readScore(String hak) {
//		ScoreVO vo = null;
//		for (ScoreVO temp : vlist) {
//			if (temp.getHak().equals(hak)) {
//				vo = temp;
//				break;
//			}
//		}
//		return vo;
//	}

}
