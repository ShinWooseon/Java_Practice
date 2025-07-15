package com.abstractex;

public interface Attackable {

	default void attack(Unit u) {
		
	}
	default void move(int x, int y) {
		
	}
}
