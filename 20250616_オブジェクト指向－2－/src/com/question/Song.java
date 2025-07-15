package com.question;

/*문제2)

노래 한곡을 나타내는 Song 클래스를 작성하시오.
필드의 구성은 다음과 같다.

노래의 제목 title
가수 artist
노래가 발표된 년도 year
국적 country

또한 Song 클래스에 다음 생성자와 메소드를 작성하시오.
생성자 2개 : 기본생성자와 매개변수로 모든 필드를 초기화 하는 생성자

노래 정보를 출력하는 show() 메소드
main() 메소드에서는 1978년 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을 Song 객체로 생성하고
show() 메소드를 이용하여 노래의 정보를 다음과 같이 출력하시오.

출력
1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen
*/
public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;

	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
//		System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 "+title);
	}

	public Song() {
		
		return;
	}

	// show 메소드의 public 유무 차이
	public void show() { 
	System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 "+title);
	}

	public static void main(String[] args) {
		Song sg = new Song(1978, "스웨덴", "ABBA", "Dangcing Queen");
		sg.show();

	}

}
