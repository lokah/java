package com.test_array;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[45];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = i+1;
		}
		
		for(int i=0;i<7;i++) {
			
			int a = (int)(Math.random()*45);
			int t = arr[i];
			arr[i]= arr[a];
			arr[a] = t;
			
			
			
		}
		for(int i=0; i<7;i++) {
		System.out.print(arr[i]+ " ");
		
	
	}

}
}