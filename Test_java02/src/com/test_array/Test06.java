package com.test_array;

public class Test06 {

	
	 
	
	public static void main(String[] args) {
		int sum =0;
		 double avg  =0d;
		
		
		
		int[] score = {91, 45,92,65} ;
		for(int i=0; i<score.length;i++) {
		sum += score[i];
		
		}
		avg =  (double) sum/score.length;
		System.out.println("총점은 : "+ sum+ " 평균은 : "+ avg);

	}

}
