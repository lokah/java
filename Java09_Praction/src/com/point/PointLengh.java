package com.point;

import java.util.Scanner;

public class PointLengh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(0.0) ~ (x,y) 의 거리를 구하자.
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//이곳에서 java.lang - math 에서 함수의 두 변수의 거리를 구하는 것을 참조하란다.
	    // api에서 Math.pow(x,y) 와 Math.hypot(x,y)를 이용한다.
		// 즉, Math.hypot() == Math.sqrt(Math.pow(x,y) + Math.pow(x,y))와 같다.
		// x와 y는 Scanner를 통해 입력받자.
 
		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("y : ");
		int y = sc.nextInt();
		prn01(x,y) ;
		prn02(x,y) ;
		
	}

	public static void prn02(int x, int y) {
		System.out.printf("(0.0) 에서 (%d,%d) 까지의 거리는 %.2f입니다.",x,y,Math.hypot(x,y));
		
	}
	
	public static void prn01(int x, int y) {
		//z = root(x^2 + y^2) 
		double z = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		
		
		System.out.printf("(0.0) 에서 (%d,%d) 까지의 거리는 %.2f입니다.",x,y,z);
		
		
	}
}
