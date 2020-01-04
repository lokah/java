package com.test03;

public class SunX {
	/*
	 * 1 2 3 4 5 
	 * 6 7 8 9 10 
	 * 11 12 13 14 15 
	 * 16 17 18 19 20 
	 * 21 22 23 24 25 
	 * x의 총합 x의 평균
	 */
	public static void main(String[] args) {
		
		
		cal();
   
	}

	public static void cal() {
		int sum = 0 ;
		int avg = 0 ;
		int sum1 = 0 ;
		int sum2 = 0;
		
		for (int i = 1; i < 26; i+=6) {
			sum += i;
			
		}
		//System.out.println("총합은 : " + sum + ", 평균은 : " + avg);
		
		for (int j = 5 ; j <22 ; j+=4 ) {
			
			sum1 += j ;
			
		}
		sum2 = sum + sum1 ;
		avg = sum2/9 ;//가운데 숫자가 중복됨으로. 9개
		System.out.println("총합은 : " + sum2 + ", 평균은 : " + avg);
		
	
}
}


		
		
		
		
		
		
		

 



