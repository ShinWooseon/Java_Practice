package com.overloading;

class OverloadingEx{
	
	public void print() {
		System.out.println("인자가 없는 메소드....");
	}
	
	/* 매개변수 수가 없는 것으로 동일 함으로 안됨
	 * public int print() { 
	 * return; 
	 * }
	 */
	
	public void print(short val) {
		System.out.println("short ....");
	}
	public void print(int val) {
		System.out.println("int ....");
	}
	public void print(long val) {
		System.out.println("long ....");
	}
	public void write(int val) {
		System.out.println("int");
	}
	public void write(long val) {
		System.out.println("long");
	}
	public void write(Long val) {
		System.out.println("Long");
	}
	
}

//import java.lang.*;

public class OverloadingEX02 {

	public static void main(String[] args) {
		OverloadingEx ol = new OverloadingEx();
		short s = 10;
		Short ss = 10;
		int i = 10;
		long l = 10;
		Long ll = 10l;
		
		ol.print(s);
		ol.print(ss);
		ol.print(i);
		ol.print(l);
		ol.print(ll);
		ol.write(s);
		ol.write(ss);
		ol.write(i);
		ol.write(l);
		ol.write(ll);
		
		
	}

}
