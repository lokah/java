package com.test.array02;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++) {
			
			
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("..............");
		
		for(int i=0; i<arr.length;i++) {
			
			int j = (int)(Math.random()*45);
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
		}
		for(int i=0;i<7;i++) {
		System.out.print(arr[i] + " ");
		
	}

}
}
