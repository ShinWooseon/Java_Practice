package com.polymorphism;

public class Tiger extends Animal {
	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		return "그르르";
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	
}
