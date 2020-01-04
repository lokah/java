package com.test_array;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[100];
		
		for(int i=0; i<num.length; i++) {
			
			num[i] = i*2;
			
			
			
		}
		System.out.println(Arrays.toString(num));
	}

}
