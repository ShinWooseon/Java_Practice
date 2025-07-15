package com.listscore;

import java.util.*;

public class ScoreImpl implements Score {

	private List<ScoreVO> vlist = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("\n 자료 추가 .....");

		String hak;
		System.out.print("학번 : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);

		// null이 아니면(학번이 이미 존재한다면) data를 추가하면 안된다
		if (temp != null) {
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
		System.out.println("데이터 입력 완료");
		vlist.add(vo);

	}

	@Override
	public void update() {
		System.out.println("\n 자료 수정....");
		String hak;
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 학번이 존재하지 않습니다.");
			return;
		}
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

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 학번이 존재하지 않습니다.");
			return;
		}
		vlist.remove(vo);
		System.out.println("데이터 삭제가 완료 되었습니다.....\n");

	}

	@Override
	public void listAll() {
		System.out.println("\n 전체 출력 .......");

		Iterator<ScoreVO> it = vlist.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
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

		ScoreVO vo = readScore(hak);

		if (vo != null) {
			System.out.println(vo);
//			System.out.print(vo.getHak()+"\t");
//			System.out.print(vo.getName()+"\t");
//			System.out.print(vo.getBirth()+"\t");
//			System.out.print(vo.getKor()+"\t");
//			System.out.print(vo.getEng()+"\t");
//			System.out.print(vo.getMat()+"\t");
//			System.out.print(vo.getTot()+"\t");
//			System.out.println(vo.getTot()/3);
		}

	}

	@Override
	public void searchName() {
		System.out.println("\n 이름 검색........");
		String name;
		System.out.print("검색할 이름 : ");
		name = sc.next();

		for (ScoreVO vo : vlist) {
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}

	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for (ScoreVO temp : vlist) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}

}
