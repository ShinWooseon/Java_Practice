package com.question;

public class TV {

	private String brand;
	private int year;
	private int size;
//	String brand;
//	int year;
//	int size;

	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;

	}

	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");

	}

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2025, 32);
		myTV.show();
	
	}

}
