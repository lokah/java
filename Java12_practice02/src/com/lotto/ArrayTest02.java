package com.lotto;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[5];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
			cnt++;
		}

	}

}
