package com.variable;

/*
 * byte
 *  - 1byte データー型
 *    範囲 : 256 => -128 ~ 127
 *    
*/
public class ByteEx {

	public static void main(String[] args) {
		byte bb = 127;
		int a;
		
		a = bb + 1 ;
//		a = bb + 1 ;
//		a = bb++ ; // 結果 127, bb 127初期値に++後置演算を実行, その結果aは127, bbは-128 
//		a = ++bb ; // 結果 -128, bb 127初期値に++前置演算を実行byte型で-128がint aに記録
		System.out.println("byte a = "+a);
		
	}

}
