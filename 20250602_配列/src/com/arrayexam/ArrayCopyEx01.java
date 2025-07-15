package com.arrayexam;

/*
 * 배열 복사
 * 	배열은 한번 생성된 후 배열에 크기는 변경할 수 없다.
 * 	따라서, 더 큰 배열을 만들기 위해 기존배열을 복사 한다.
 * 
 * 
*/

public class ArrayCopyEx01 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		System.out.println("변경전 배열 크기 " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println("arr["+i+"] -> "+arr[i]);

		}

		int temp[] = new int[arr.length * 2];
		// arr 배열에 저장된 값들을 배열 temp에 복사함
		System.out.println("temp.length " + temp.length);

		for (int i = 0; i < arr.length; i++) {
			temp[i] = i+4;
			System.out.println("temp["+i+"] -> "+temp[i]);
		}
		
		// temp에 저장된 값을 arr에 저장함
		arr = temp; // 배열은 참조변수를 통해서만 접근이 가능하기 때문
		
		System.out.println("[변경후]");
		System.out.println("arr.length : "+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] -> "+arr[i]);
			
		}
		
		
		

	}
}
