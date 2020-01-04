package com.test01;

import java.util.Arrays;

public class MTest01 {

	
	// Array : 같은 타입의 여러 개의 값을 효과적으로 관리하기 위한 객체
	// 같은 타입
	// 하나의 변수에 여러 개의 값을 담을 수 있다.
	// 배열은 초기의 크기가 고정된다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 배열을 만드는 방법 1.
		int [] a ;  // 변수 선언
		a = new int[5]; //정의
		a[0] = 1 ;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5; //초기화
	
		// 방법 2
		
		int [] b =new int[] {6,7,8,9,10};
		System.out.println(b[1]) ;
		// 방법 3 선언하고 바로 초기화
		
		int c [] = {11,12,13,14,15,16,17} ;
		System.out.println(a[1] + c[6]) ;
		
		System.out.println(c) ; // 해당 객체의 주소값이 출력되다.
		
		prn(c) ;
		System.out.println(Arrays.toString(c)) ;
		
		
		
		String[] s = new String[] {"have", "a", "nice", "day"};
		test(s) ;
		
		
	}
	
		
		public static void test(String[] arr) {
			
			//nice - good 으로 바꾸고
			//[have, a, good, day]로 출력하자
			// 단, Arrays 클래스를 사용하지 말 것.
			arr[2] = "good";
			
			System.out.println("[");
			for(int i = 0 ; i<arr.length ; i++) {
				
				System.out.print(arr[i]+ ",");
			}
			
			System.out.println("]");
		}
		
	public static void prn(int[] arr) {
		
			
			
		for(int i = 0 ; i<arr.length ; i++) {
			
			System.out.printf("%5d", arr[i]);
		}
		
	}

}
