package com.test_array;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] no = { 64, 40, 100, 89 };

		int max = no[0];
		int min = no[0];

		for (int i = 1; i < no.length; i++) {
			
			if(no[i]>max) {
				
				max = no[i];
			}else if(no[i]<min) {
				
				min = no[i];
			}
			

		}
		System.out.println("최대수는 :" + max + "최소수는 :" + min);

	}

}
