package com.test01;

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"kim", "ohn", "dahm"};
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("arr[" + i + "] : " + arr[i]+ " ");
		}
			System.out.println();
			String tmp = arr[2];
			
			System.out.println(tmp);
			arr[0] = "ann";
			System.out.println(Arrays.toString(arr));
			for (String str : arr) {
				System.out.println(str);
				
			}
					
		}
		
	}


