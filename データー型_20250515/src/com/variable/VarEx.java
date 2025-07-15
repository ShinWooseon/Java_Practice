package com.variable;

/*
 * 変数と定数の概念
 * 
 * 変数 : 数字を貯蔵したり、保管する空間(メモリー)
 * 定数 : 一度宣言されると変更されることのない値
 * 
 * 変数名 : 変数に対する特定した名前
 * データー型 : 予め変数のサイズや特性を約束したもの
 * 
 * 基本データー型と参照データー型
 * 
 * 	基本データー型
 * 		Java Compilerによる解釈されるデーター型
 *		基本データー型 : 8個(byte, short, int, long, float, double, boolean, char)
 * 		
 * 		1byte, 2byte (boolean, char)
 * 		整数	
 * 		1byte, 2byte, 4byte, 8byte(byte, short, int, long)
 * 		実数
 * 		4byte, 8btye		
 * 
 * 		参照データー型 (reference data type)
 * 		 - Java API (Application Programming Interface)
 * 		   プログラマにより、作られたクラスをデーター型とし、宣言する場合(配列, クラス)
 * 
 */

class AA { // 参照データー型
	int value;
}

public class VarEx {
	
	public static void main(String[] args) {
		
		AA a; // クラス
		a = new AA();
		a.value=10;
		
		int[] aa = new int[3]; // 配列
		aa[0] = 10;
		aa[1] = 10;
		aa[2] = 10;
		
		for(int i = 0; i < aa.length ;i++) {
			System.out.println(aa[i]);
		}
	}
}