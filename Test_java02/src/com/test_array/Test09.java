package com.test_array;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] = (int)(Math.random()*45);
			System.out.print(arr[i] + " ");
		}
		
	}

}
