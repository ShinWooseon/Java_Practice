package com.loop;


public class HomeWorkEx03AnrRe {

	public static void main(String[] args) {
		
		int i, j, k;
		
		
		for (i = 1 ; i< 9 ; i+=4) {
			for( j =1 ; j <= 9 ; j++) {
				for ( k = 1; k<= 4 ; k++) {
//					if( i+k <= 9)
					System.out.printf("%d * %d = %2d\t", i+k, j, (i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
