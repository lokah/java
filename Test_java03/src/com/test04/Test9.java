package com.test04;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				
				{100,100, 100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				
				sum += arr[i][j];
				System.out.print(arr[i][j] +" ");
			}
			
			System.out.println();
			System.out.println(sum);
		}
		
		

		
	}

}
