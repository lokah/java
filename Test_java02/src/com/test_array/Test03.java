package com.test_array;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[5];
		
		int[] tmp = new int[num.length*2];
		for(int i=0 ; i<num.length; i++) {
			
			tmp[i] = num[i];
		}
		System.out.println(Arrays.toString(tmp));
		
	}

}
