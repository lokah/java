package com.test01;

public class NTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prn01();
		prn02();
	}

	public static void prn01() {

// FOR (초기값 ; 조건식 ; 증감식) { 명렬}

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
		}
	}

	public static void prn02() {

		/*
		 * for(int i=1; i>0; i=i-2) { System.out.println(i) ;
		 * 
		 * }
		 * 
		 * }
		 * 
		 */
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i -= 2;

		}

	}
	
	//for( ; ;) { 
	//System.out.println("hi") ;} 이런 식으로 무한 루프
}
