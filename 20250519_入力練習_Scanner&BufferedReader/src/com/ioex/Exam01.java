package com.ioex;

/*
 * 問題
 * Scannerクラスで名前、都市、年齢、体重、独身かどうかを入力してもらい、出力してください
 * 文字列:名前、都市
 * 定数:年齢
 * 実数 : 体重
 * 論理(boolean):独身であるかどうか
 * 
 */

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, city;
		int age;
		float weight;
		boolean married;
		
		System.out.print("氏名 :");
		name = sc.next();
		
		
		System.out.print("住所 :");
		sc. nextLine(); // sc.next()による改行除去
		city = sc.nextLine(); // 空白込みの文字列を入力したい場合にはnextLineを使用
				
		System.out.print("年齢 :");
		age = sc.nextInt();
		
		System.out.print("体重 :");
		weight = sc.nextFloat();
		
		System.out.print("結婚有無(true/false) :");
		married = sc.nextBoolean();
		
		System.out.println();
		
		System.out.print("私の名前は "+name+"で, ");
		System.out.print("都市は "+city+",　");
		System.out.print("年齢は "+age+"歳, ");
		System.out.print("体重は "+weight+"kg, ");
		String answer1 = married ? "既婚者です." : "未婚者です.";
		System.out.print(" "+answer1);
		
		sc.close();
		
	}
}
