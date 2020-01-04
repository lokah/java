package com.test05;

import java.util.Arrays;

public class TestLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lotto();

	}

	public static void lotto() {

		int[] arr = new int[45];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
			// System.out.println(arr[i]);
		}

		int str;
		int tmp;

		for (int i = 0; i < 7; i++) {

			str = (int) (Math.random() * 45);
			tmp = arr[i];
			arr[i] = arr[str];
			arr[str] = tmp;

		}

		for (int i = 0; i < 7; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] arr1 = new int[7];
		for (int i = 0; i < 7; i++) {

			arr1[i] = arr[i];

			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 1; j < arr1.length; j++) {
				
				if(arr1[j]<arr1[j-1]) {
					
					int no = arr1[j];
					arr1[j] = arr[j-1];
					arr[j-1] = no;
					
					
				}
			}
			
			
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
