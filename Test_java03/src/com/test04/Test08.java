package com.test04;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr = "beatles";
		
		for (int i = 0; i < arr.length(); i++) {
			
			char ch = arr.charAt(i);
			System.out.println(ch);
			
		}
		
		char[] ch = arr.toCharArray();
		
		char[] ch1 = {'a','b'};
		String str = new String(ch1);
		System.out.println(str);
		System.out.println(ch);
	}

}
