package com.lotto;

public class Test00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'a';
		for(int i=1; i<27;i++) {
		if(i%2!=1) {
			System.out.print(Character.toUpperCase(a)+ " ");
			
		}else {
			System.out.print(a+" ");
			
		}
		
		if(i%6==0) {
			System.out.println();
			
		}
		a++;
	}
		
	}
}

