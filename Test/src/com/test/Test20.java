package com.test;

public class Test20 {
	
	public static void main(String[] args) {
		
		
		
		
		int j = 2;
		
		while(j<10) {
			int i = 1;//메소드 내에서는 위에서부터 아래로 순차적으로 
		// 진행되기 때문에 변수 i는 다음 while의 중첩문 내에서 
		// 선언되어야 한다. 
			
			while(i<10) {
				
				System.out.println(j + "*" + i + "=" + j*i);
				
				i++;			
			}
			j++;
			
		}
		
		
	}
	
	

}
