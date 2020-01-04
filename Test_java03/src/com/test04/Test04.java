package com.test04;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"beatles", "pink floyd", "new trolls"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		System.out.println(Arrays.deepToString(str));
		System.out.println(str.toString());
		
		//String str1 = str.toUpperCase();
		
		//System.out.println(str.replace('e', 'U'));
		
		//String str2 = "eminem" + str.substring(7);
		//System.out.println(str2);
		
		//StringBuffer str3 = new StringBuffer(str);
		
	   // str3.setCharAt(0, 'B');
	    //String str4 = str3.toString();
	    
	
		//System.out.println(str3.toString());
		
		
	}

	
	
	
}
