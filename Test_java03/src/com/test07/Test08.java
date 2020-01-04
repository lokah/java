package com.test07;

import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = new int [] {10,20,30};
		
		
		int[] ar = new int[arr.length];
		
		System.arraycopy(arr, 0, ar, 0, arr.length);
		
		
		
		
		
		
		System.out.println(Arrays.toString(ar));
	}

}
