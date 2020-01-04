package com.test01;

import java.util.Arrays;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = new String("abc def");
		String str1 = "gsgetse";
		String str2 = "12345 56";
		char ch = 'a';
		String [] str3 = {"abc", "fwf","ffew"};
		char [] ch1 = {'d', 'e','a'};
		
		System.out.printf("%s",str1);
		System.out.println(str3);
		System.out.println(ch1);
		System.out.println(Arrays.toString(str3));
		
		for (int i = 0; i < str3.length; i++) {
			System.out.print(str3[i]);
			
		}
	
	}

}
