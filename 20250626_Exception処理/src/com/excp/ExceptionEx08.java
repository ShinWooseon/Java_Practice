package com.excp;

class InstallException extends Exception {
	public InstallException(String msg) {
		super(msg);
	}
}

// 예외처리 Exception 또한 상속을 받을 수 있다.
class SpaceException extends Exception {
	public SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	public MemoryException(String msg) {
		super(msg);
	}

}

public class ExceptionEx08 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
//			deleteTempFiles(); // finally 로 이동
		} catch (SpaceException se) {
			System.out.println("에러 메시지 : " + se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
//			deleteTempFiles();
		} catch (MemoryException me) {
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc(); // Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("메모리 공간을 확보한 후에 다시 설치하시기 바랍니다.");
//			deleteTempFiles();
			System.out.println("다시 설치해 주시기 바랍니다.");
		} finally {
			deleteTempFiles();
		}
	} // end main

	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();

		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(se); // 예외의 원인을 SpaceException(매개) 등록 하겠다.
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치중 메모리 관련 예외 발생");
			ie.initCause(me); // 예외의 원인을 SpaceException(매개) 등록 하겠다.
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) { // 설치할 공간이 없으면....
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if (!enoughMemory()) { // 메모리 공간이 없으면....
			throw new MemoryException("설치할 메모리 공간이 부족합니다.");
		}

	}

	static void copyFiles() {

	}

	static void deleteTempFiles() {

	}

	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지를 확인하는 곳

		return false;

	}

	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리 공간이 있는지를 확인하는 곳

		return false;

	}

}
