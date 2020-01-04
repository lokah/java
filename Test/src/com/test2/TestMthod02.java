package com.test2;

public class TestMthod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = circle(3, 5) ;
		double result2 = squre(12.4);
		
		System.out.println("너의 크기는 " + result) ;
		System.out.printf("너의 키는 " + "%.2f \n", result2);
		
		
	}
	
	public static int circle(int num01, int num02) {
		
		int res = num01 * num02;
		return res;
		
	}
	
	public static double squre(double num03) {
		
		
		double res2 = num03*num03;
		return res2;
	}

}
