package com.test01;

public class Test07 {

	public void string1() {
		// TODO Auto-generated method stub

		String arr = "abcdefg";
				
			String [] arr1 = {"d","e","r","f","y"};
			char [] ch = {'g','e','s'};
			int[] de = {1,2,3,4,6};
			System.out.println(de);
			
			System.out.println(arr1);
			System.out.println(ch);
		
		for (int i = 0; i < arr.length(); i++) {
			
			char c = arr.charAt(i);
			
			System.out.print(c);
		}
		
		char [] c = arr.toCharArray();
		System.out.println(c);
	}

}
