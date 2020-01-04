package com.lotto;

public class MTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int [45];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (1 + i);
			int v = (int) (Math.random() * 45) + 1;
			
			arr1[i] = v;
		}
		
		
		
		prn02(arr1);
	}

	public static void prn02(int[] arr) {

		int cnt = 1;
		for (int i = arr.length; i > 0; i--) {

			System.out.print(arr[i - 1] + " ");
			if (cnt % 7 == 0) {
				System.out.println();
			}

			cnt++;
		}
	}

}
