package com.test;

public class Test04 {
	
	
	public static void main(String[] args) {
		
		int num01 = 2;
		int num02 = (int) 2.1;
		int sum = num01 + num02;
		
		long num03 = 2232151367363l;
		int num04 = (int) num03;
		
		double num05 = 2.9;
		int num06 = (int) num05;
		
		int num07 = 3;
		int num08 = 2;
		int sum01 = num07 /  num08;
		int sum02 = num07 / num08;
		
		System.out.println(sum);
		System.out.println(num04);
		System.out.println(num06);
		System.out.println("..............");
		System.out.println(sum01);
		
		System.out.println((double)sum02);
		System.out.println("...........");
		System.out.println(3/2 + " " + 3/2d);
	}

}
