package com.arrayexam;

/*
 * 배열 복사
 * 	배열은 한번 생성된 후 배열에 크기는 변경할 수 없다.
 * 	따라서, 더 큰 배열을 만들기 위해 기존배열을 복사 한다.
 * 
 * 	크기를 변경하고자 할 때는 같은 자료형의 배열을 원하는 크기로 다시 생성한다.
 *  기존의 배열을 복하면 복사가 완료된다.
 *  
 * 	API 메소드 사용
 *  System.arraycopy()
 *   public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length){} {
 * 
 * src 원본 배열을 의미
 * srcPos 원본 배열의 복사 위치
 * dest 복사될 배열
 * destPos 복사 시작 위치
 * length 복사되는 배열의 index 수
 * 
*/

public class ArrayCopyEx02 {

	public static void main(String[] args) {
		
		String[] src = {"Java", "DataBase", "Jsp", "Xml"};
		String[] dest = new String[6];;
		dest[0] = "Spring";
		dest[1] = "Python";
		
		System.arraycopy(src, 0, dest, 2, 4);
		for (String temp : dest) {
			System.out.println(temp);
		}
		
	
	}
}
