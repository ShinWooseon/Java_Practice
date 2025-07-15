package com.excp;


public class ExceptionEx05 {
	public static void main(String[] args) throws Exception {
//		throw new Exception("고의로 예외를 발생 시켰음");

		try {
			throw new RuntimeException("eedg");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
