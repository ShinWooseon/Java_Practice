package com.inher;

public class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUP() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	
}
