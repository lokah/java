package com.test_array;

public class TestLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[45];
				
		for(int i=0; i<lotto.length;i++) {
			
			lotto[i] = i+1;
			
			
		}
		
		
		
		for(int i=0; i<7; i++) {
			
			
			int n = (int) (Math.random()*45);
			int tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;
		}
		
		for(int i=0; i<7;i++) {
			
			System.out.print(lotto[i]+" ");
			
			
		}
	}

}
