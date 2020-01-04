package com.test_array;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] arr = new char[26] ;
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i] = (char) ('A'+i);
			System.out.println(arr[i]+" ");
		}
			
		
		//if(arr[i]%6==0 ) {
			//System.out.println();
		}
	}


