package com.objectex;
/*
 * 객체 배열
 * - 수 많은 객체를 다뤄야 할 때 배열로 처리하는 방식
 * 객체 배열 안에 객체가 저장되는 것은 아니고, 객체의 주소가 저장된다.
 * 객체 배열은 참조 변수들을 하나로 묶은 참조변수의 배열이다.
 * 
 * Tv t1, t2, t3; // 객체 선언 -> 참조변수 선언
 * 
 * 객체 배열
 * Tv[] tvArr = new Tv[3];
 * -> 길이가 3인 객체열을 생성했다.
 * 
 *  // 객체를 생성해서 배열의 각 요소에 저장
 *  tvArr[0] - new Tv();
 *  tvArr[1] - new Tv();
 *  tvArr[2] - new Tv();
 * 
 * 	//
 *  Tv[] tvArr = { new Tv(),new Tv(),new Tv()}:
 *  
 *  Tv[] tvArr = new Tv[100];
 *  for (int i = 0 ; i < tvArr.length ; i++){
 *  	tvArr[i] = new Tv();
 *  
 *  
 *  }
*/

public class TvExam03 {

	public static void main(String[] args) {
		// 길이가 3인 Tv 객체 배열을 생성
		Tv[] tvArr = new Tv[3];

		// Tv 객체를 생성해서 배열에 값을 저장함
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("tvArr[" + i + "] : " + tvArr[i].channel);

		}
	}
}