package com.abstractex;

public class CDPlayer extends Player {

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub

	}

	@Override
	void stop() {
	}

	int currectTrack;

	void nextTrack() {
		currectTrack++;

	}

	void preTrack() {
		if (currectTrack > 1) {
			currectTrack--;
		}

	}

	@Override
	void stop(int pos) {
		// TODO Auto-generated method stub
		
	}

}
