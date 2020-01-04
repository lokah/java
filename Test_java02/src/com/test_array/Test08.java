package com.test_array;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] res = new int[7];
		
		
		

		for (int i = 0; i < 7; i++) {
			int n = (int) (Math.random() * 45);
			res[i]= n;
			System.out.print(res[i] + " ");

		}

		//for (int i = 0; i < 7; i++) {
			//System.out.print(res[i] + " ");
		}
	}
