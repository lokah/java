package com.test01;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
	
	int[] numArr = new int[10] ;
	int[] counter = new int[10];
	
	for(int i=0; i<numArr.length;i++) {
		
		numArr[i] = (int) (Math.random()*10);
	System.out.print(numArr[i]+ " ");	
	}
	
	System.out.println();
	
	
		
		
		for(int j = 0; j<counter.length; j++) {
			
			counter[numArr[j]]++;
			
		}
		 for(int j = 0; j<numArr.length;j++) {
	
			 System.out.println(j + "의 개수 :" + counter[j]);
		 }
		
	}
}
