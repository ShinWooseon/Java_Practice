package com.objectex;

public class ReferenceParamEx02 {
	public void increase(int[] n) {
		for (int i = 0 ; i < n.length ; i++) {
			n[i]++;
		}
		
	}

	public static void main(String[] args) {
		int[] ref = {100, 800, 1000};
		ReferenceParamEx02 rp = new ReferenceParamEx02();
		System.out.println("ref["+0+"]"+ref[0]);
		System.out.println("ref["+1+"]"+ref[1]);
		System.out.println("ref["+2+"]"+ref[2]);
		rp.increase(ref);

		for(int i=0; i <ref.length ; i++) {
			System.out.println("ref["+i+"]"+ref[i]);
		}
		
	}
}

