package com.test_array;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] code = {2, 5,-5,4,9,3};
		
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length;i++) {
			
			int tmp = (int)(Math.random()*code.length);
			arr[i]= code[tmp];
			System.out.print(arr[i]+ " ");
			
		}
		
		
	}

}
