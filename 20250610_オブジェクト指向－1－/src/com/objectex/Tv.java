package com.objectex;

public class Tv {
	// 속성, 멤버변수, 필드
	private String color; // 색상
	private boolean power; // 전원(on, off)
	int channel = 0; // 채널

	
	// private 사용시 외부에서 접근 불가
	// getter setter
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	// 메소드, 메서드, 함수 : 행위와 동작을 의미함
	public void power() { // 전원
		power = !power;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}
	
}
