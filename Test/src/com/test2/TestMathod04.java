package com.test2;

public class TestMathod04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    
	    
		System.out.println(func(6));
		
	
	}

	// 재귀 매소드의 구현 일종의 팩토리얼 즉 6!=6*5*4*3*2=720 
	public static int func(int n) {
		if(n==1) {
			return 1;
		}
		else {
			
			return n*func(n-1);
					
		}
		
		
	}
}

