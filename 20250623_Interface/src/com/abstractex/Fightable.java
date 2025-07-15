package com.abstractex;

public interface Fightable extends Movable, Attackable {
	default void attack(Unit u) {

	}

	default void move(int x, int y) {

	}

}
