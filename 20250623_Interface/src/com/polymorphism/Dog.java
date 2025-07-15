package com.polymorphism;

public class Dog extends Animal{
	
	private String name;
	
	public Dog() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		return "멍멍~깽깽";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
}
