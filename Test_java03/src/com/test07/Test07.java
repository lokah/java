package com.test07;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20};
		int total = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			total+=i;
			
			System.out.println(arr[i]);
		}
		
		System.out.println(total);
		
		for(int j : arr) {
			
			total+=j;
			System.out.println(j);
			System.out.println(total);
		}
		
		
	}

}
