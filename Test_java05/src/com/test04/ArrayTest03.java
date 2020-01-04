package com.test04;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int [10][10];
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = i+j;
				
				System.out.print("(" + i + "+" + j + "=" + arr[i][j]+ ")");
			}
			
			System.out.println();
		}
		
	}

}
