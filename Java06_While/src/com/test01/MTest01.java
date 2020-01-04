package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * a b c d e
		 * f g h i j
		 * k l m n o
		 * p q r s t
		 * u v w x y
		 * z
		 * 
		 * 
		 * 
		 * 
		 */
		int count = 0 ;
		char c = 'a' ;
		boolean stop = false ;
		
		while(!stop) {
			
			while(true) {
				
				System.out.printf("%2c", c);
				c++ ;
				count ++ ;
				if(count%5==0) {
					break ;
					
				}
				if(count == 26) {
					
					stop = true ;
					break ;
				}
			}
			System.out.println();
		}
		
	}
	
	
	

}
