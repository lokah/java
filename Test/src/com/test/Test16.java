package com.test;

public class Test16 {
	
	
	public static void main(String[] args) {
		
		int num = 10;
		//6과 14의 공배수 모두 찾기
		while(num++<100) {
			
			if(num%5!=0 || num%15!=0) {
				
				
				continue ;
				
			}
			
			
			
			System.out.println(num);
			
		}
		
		
		
	}

}
