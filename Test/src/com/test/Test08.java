package com.test;

public class Test08 {
	
	
	public static void main(String[] args) {
		
		int n01 = 0;
		int n02 = 1;
		
		
		boolean res = ((n01+=10) >= 10 && (n02+=10) <10);
		
		
		System.out.println(res);
		System.out.println(n01 + " " + n02);
		
		n01 += 10;
		res = ((n01+=10) <10 || (n02 +=10) > 10);
		
		System.out.println(res);
		System.out.println(n01 + " " + n02); 
		
		
	}

}
