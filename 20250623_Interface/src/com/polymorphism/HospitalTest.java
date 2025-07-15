package com.polymorphism;

public class HospitalTest {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		h.inject(dog);
		h.inject(cat);
		h.inject(tiger);
		
	}

}
