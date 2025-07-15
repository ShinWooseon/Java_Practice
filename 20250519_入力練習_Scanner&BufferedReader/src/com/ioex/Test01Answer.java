package com.ioex;

//
import java.io.*;

public class Test01Answer {
public static void main(String[] args) throws IOException {
	
	int gender = 0;
	
	System.out.println("성별 입력 (1 : 남성, 2 : 여성): ");
	gender = System.in.read()-48;
	
//	System.out.println("당신은 "+(gender == 1 ? "남성" : "여성")+ "입니다.");
	System.out.println("당신은 "+(gender == 1 ? "남성 입니다" : gender == 2 ? "여성 입니다" : "1과 2중에 입력해 주세요"));
	
	
	
	}
	
	
}
