package com.test_array;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] ch = new char[26];
		
		for(int i = 0; i<ch.length; i++) {
			
			
			ch[i] = (char) ('a'+i);
			
			System.out.print(ch[i] + " ");
			
			if((i+1)%6==0) {
				
				System.out.println();
			}
		}
		
		
		//for(int i=0; i<ch.length;i++) {
			
			
			
		}
		
		
	}


