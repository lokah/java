package com.test01;

public class MTest03 {

	// 1. a~z의 값을 일차원 배열에 저장하고
	// 다음과 같이 출력하자
	/*
	 * 
	 * a b c d e f g h i j k l n m o p q r s t u v w x y z
	 * 
	 * 2. 위에서 만든 배열을 거꾸로 출력하자 z y x w v u t s...
	 * 
	 * 3. 1번에서 만든 배열을 대문자로 바꿔서 출력하자
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] c = { { 'a', 'b', 'c', 'd', 'e', 'f' }, { 'g', 'h', 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p', 'q', 'r' }, { 's', 't', 'u', 'v', 'w', 'x' }, { 'y', 'z' } };

	

		test(c) ;
	}

	public static void test(char[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

	}
	
	public static void test02(char[] arr) {
		
		
	}

}
