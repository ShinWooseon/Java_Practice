package com.excp;

import java.io.*;

public class ExceptionEx07 {

	public static void main(String[] args) {
//		String ff = "";
//		File f = createFile(null);
//		System.out.println(f.getName() + " 파일이 성공적으로 생성 되었습니다.");

		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + " 파일이 성공적으로 생성 되었습니다.");

		} catch (Exception e) {
			System.out.println(e.getMessage() + " 파일이 성공적으로 생성 되었습니다.");
		}
	}

	// File은 java.io.*;에 명시되어 있음
	static File createFile(String fileName) {

		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다.");
			}
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
		} finally {
			File f = new File(fileName); // File 클래스를 개체로 만듬
			createNew(f); // 생성된 객체를 이용해서 파일을 생성함
			return f; // 만들어진 파일을 변환
		}
	}

	static void createNew(File f) {
		try {
			f.createNewFile(); // 파일을 생성함
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
