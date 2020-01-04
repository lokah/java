package com.test04;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10,23,45,67,78};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		
		for(int tmp : arr) {
			
			System.out.println(tmp);
		}
	}

}
