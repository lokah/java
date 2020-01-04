package com.test05;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = new char[26];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('a'+i);
			System.out.print(ch[i]+ " ");
			if(ch[i]%6==0) {
				
				System.out.println();
			}
			
		}
		
		System.out.println((char)('a'+1));
		
	}

}
